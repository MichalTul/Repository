import tkinter as tk
from tkinter import messagebox, filedialog
from fpdf import FPDF


class AttendancePDF(FPDF):
    def header(self):
        self.set_font("DejaVu", "B", 14)
        self.cell(0, 10, "Lista obecności", new_x="LMARGIN", new_y="NEXT", align="C")
        self.ln(5)


def generate_pdf(data, file_path):
    pdf = AttendancePDF()
    pdf.set_auto_page_break(auto=True, margin=15)

    # REJESTRACJA CZCIONKI UNICODE
    pdf.add_font("DejaVu", "", "DejaVuSans.ttf", uni=True)
    pdf.add_font("DejaVu", "B", "DejaVuSans.ttf", uni=True)

    pdf.add_page()

    pdf.set_font("DejaVu", "B", 10)
    pdf.cell(10, 8, "Lp", 1)
    pdf.cell(40, 8, "Imię", 1)
    pdf.cell(50, 8, "Nazwisko", 1)
    pdf.cell(60, 8, "Podpis", 1)
    pdf.ln()

    pdf.set_font("DejaVu", "", 10)
    for i, (first, last) in enumerate(data, start=1):
        pdf.cell(10, 8, str(i), 1)
        pdf.cell(40, 8, first, 1)
        pdf.cell(50, 8, last, 1)
        pdf.cell(60, 8, "", 1)
        pdf.ln()

    pdf.output(file_path)


def on_generate():
    raw_text = text_input.get("1.0", tk.END).strip()
    if not raw_text:
        messagebox.showerror("Błąd", "Wpisz przynajmniej jedną osobę.")
        return

    people = []
    for line in raw_text.splitlines():
        parts = line.strip().split()
        if len(parts) < 2:
            messagebox.showerror(
                "Błąd",
                f"Nieprawidłowa linia: '{line}'\nUżyj formatu: Imię Nazwisko"
            )
            return
        people.append((parts[0], " ".join(parts[1:])))

    file_path = filedialog.asksaveasfilename(
        defaultextension=".pdf",
        filetypes=[("PDF files", "*.pdf")],
        title="Zapisz listę obecności"
    )

    if file_path:
        generate_pdf(people, file_path)
        messagebox.showinfo("Sukces", "PDF został wygenerowany.")


# ===== GUI =====

root = tk.Tk()
root.title("Generator listy obecności (offline)")
root.geometry("500x400")
root.resizable(False, False)

label = tk.Label(
    root,
    text="Wpisz imiona i nazwiska (jedna osoba na linię):",
    font=("Arial", 10)
)
label.pack(pady=10)

text_input = tk.Text(root, height=15, width=55)
text_input.pack()

generate_btn = tk.Button(
    root,
    text="Generuj PDF",
    font=("Arial", 11, "bold"),
    command=on_generate
)
generate_btn.pack(pady=15)

root.mainloop()
