import tkinter as tk
from tkinter import messagebox, filedialog
from fpdf import FPDF
import calendar
from datetime import date


DAYS_PL = [
    "Poniedziałek", "Wtorek", "Środa",
    "Czwartek", "Piątek", "Sobota", "Niedziela"
]


class AttendancePDF(FPDF):
    def header(self):
        self.set_font("DejaVu", "B", 13)
        self.cell(0, 8, self.title_text, new_x="LMARGIN", new_y="NEXT", align="C")
        self.ln(3)


def generate_monthly_pdf(workers, year, month, file_path):
    pdf = AttendancePDF()
    pdf.set_auto_page_break(auto=False)

    pdf.add_font("DejaVu", "", "DejaVuSans.ttf", uni=True)
    pdf.add_font("DejaVu", "B", "DejaVuSans.ttf", uni=True)

    days_in_month = calendar.monthrange(year, month)[1]

    for first, last in workers:
        pdf.title_text = f"Lista obecności – {first} {last} – {month:02}.{year}"
        pdf.add_page()

        # ===== TABELA =====
        pdf.set_font("DejaVu", "B", 8)
        row_h = 6

        pdf.cell(20, row_h, "Data", 1)
        pdf.cell(28, row_h, "Dzień", 1)
        pdf.cell(32, row_h, "Start", 1)
        pdf.cell(32, row_h, "Koniec", 1)
        pdf.cell(60, row_h, "Podpis", 1)
        pdf.ln()

        pdf.set_font("DejaVu", "", 8)

        for day in range(1, days_in_month + 1):
            d = date(year, month, day)
            weekday = DAYS_PL[d.weekday()]

            pdf.cell(20, row_h, d.strftime("%d.%m"), 1)
            pdf.cell(28, row_h, weekday, 1)
            pdf.cell(32, row_h, "", 1)
            pdf.cell(32, row_h, "", 1)
            pdf.cell(60, row_h, "", 1)
            pdf.ln()

        # ===== LEGENDA =====
        pdf.ln(4)
        pdf.set_font("DejaVu", "", 8)
        pdf.cell(0, 5, "Legenda:", ln=True)
        pdf.multi_cell(
            0,
            4,
            "C  – Choroba\n"
            "Cs – Zwolnienie ambulatoryjne\n"
            "W  – Urlop wypoczynkowy\n"
            "U  – Urlop bezpłatny\n"
            "N  – Nieobecność nieusprawiedliwiona"
        )

        # ===== PODPIS KIEROWNIKA =====
        pdf.ln(6)
        pdf.set_x(130)
        pdf.cell(60, 6, "..............................", align="C")
        pdf.ln(4)
        pdf.set_x(130)
        pdf.cell(60, 6, "Podpis kierownika", align="C")

    pdf.output(file_path)

def on_generate():
    raw_text = text_input.get("1.0", tk.END).strip()
    if not raw_text:
        messagebox.showerror("Błąd", "Wpisz pracowników.")
        return

    try:
        year = int(year_entry.get())
        month = int(month_entry.get())
        if not (1 <= month <= 12):
            raise ValueError
    except ValueError:
        messagebox.showerror("Błąd", "Podaj poprawny rok i miesiąc.")
        return

    workers = []
    for line in raw_text.splitlines():
        parts = line.strip().split()
        if len(parts) < 2:
            messagebox.showerror("Błąd", f"Błędna linia: {line}")
            return
        workers.append((parts[0], " ".join(parts[1:])))

    file_path = filedialog.asksaveasfilename(
        defaultextension=".pdf",
        filetypes=[("PDF files", "*.pdf")],
        title="Zapisz listy obecności – miesiąc"
    )

    if file_path:
        generate_monthly_pdf(workers, year, month, file_path)
        messagebox.showinfo(
            "Sukces",
            "Listy obecności dla wszystkich pracowników zostały wygenerowane."
        )


# ===== GUI =====

root = tk.Tk()
root.title("Listy obecności – miesięczne (1 osoba = 1 strona)")
root.geometry("550x520")
root.resizable(False, False)

tk.Label(root, text="Rok:").pack()
year_entry = tk.Entry(root)
year_entry.insert(0, "2025")
year_entry.pack()

tk.Label(root, text="Miesiąc (1–12):").pack()
month_entry = tk.Entry(root)
month_entry.insert(0, "1")
month_entry.pack()

tk.Label(
    root,
    text="Pracownicy (jedna osoba na linię):",
    font=("Arial", 10)
).pack(pady=10)

text_input = tk.Text(root, height=15, width=60)
text_input.pack()

tk.Button(
    root,
    text="Generuj PDF (1 osoba = 1 strona)",
    font=("Arial", 11, "bold"),
    command=on_generate
).pack(pady=15)

root.mainloop()
