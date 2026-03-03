## Zbiór małych projektów w Pythonie / Collection of small Python projects

### Opis / Description

**PL:**  
To repozytorium zbiorcze zawiera kilka niewielkich projektów w Pythonie: od prostych programów konsolowych, przez menedżer użytkowników z SQLite i `bcrypt`, aż po aplikacje z interfejsem graficznym `tkinter` generujące pliki PDF (listy obecności).  
Każdy projekt jest samodzielny, ma własny `README` oraz (jeśli potrzeba) osobny `requirements.txt`.

**EN:**  
This repository is a collection of small Python projects: from simple console programs, through a user manager using SQLite and `bcrypt`, to `tkinter` GUI apps that generate PDF attendance sheets.  
Each project is self‑contained, with its own `README` and, when needed, a dedicated `requirements.txt`.

---

### Projekty / Projects

- **Menedżer użytkowników (SQLite + bcrypt)** – prosty konsolowy menedżer użytkowników w Pythonie, korzystający z bazy SQLite (`users.db`) i biblioteki **bcrypt** do bezpiecznego haszowania haseł.  
  Funkcje: logowanie (3 próby), dodawanie, edycja, blokowanie/odblokowywanie i usuwanie użytkowników, filtrowanie aktywnych kont.  
  Kod źródłowy: [`User-menager` na GitHubie](https://github.com/MichalTul/User-menager).

- **Generator listy obecności (offline)** – aplikacja `tkinter`, która z listy osób wpisanych w oknie tworzy plik PDF z tabelą (Lp, Imię, Nazwisko, Podpis). Działa całkowicie offline.  
  Kod źródłowy: [`Lista-obecnosci` na GitHubie](https://github.com/MichalTul/Lista-obecnosci).

- **Generator miesięcznych list obecności (GUI, PDF)** – aplikacja `tkinter`, która generuje miesięczne listy obecności w PDF; dla każdego pracownika powstaje osobna strona z tabelą na każdy dzień miesiąca, kolumnami godzin pracy, podpisem oraz legendą skrótów nieobecności.  
  Kod źródłowy: [`Pracownicze-listy-obecnosci` na GitHubie](https://github.com/MichalTul/Pracownicze-listy-obecnosci).

- **Proste programy konsolowe** – zestaw czterech skryptów terminalowych w Pythonie: kalkulator, dwie wersje listy zadań (w pamięci i w pliku `ToDo.txt`) oraz gra „Zgadnij liczbę”. Wszystko oparte wyłącznie na standardowej bibliotece.  
  Kod źródłowy: [`Male-projekty` na GitHubie](https://github.com/MichalTul/Male-projekty).

---

### Wymagania ogólne / General requirements

**PL:**  
- Python **3.8+** (rekomendowane; część projektów wymaga 3.10+ z powodu `match` / `case`),  
- System z terminalem/konsolą (Windows / Linux / macOS),  
- Dla aplikacji `tkinter` – system z obsługą `tkinter`,  
- Dla projektów z PDF – zainstalowane pakiety z odpowiednich plików `requirements.txt` (m.in. `defusedxml`, `fonttools`, `fpdf2`, `pillow`),  
- Dla menedżera użytkowników – pakiet **bcrypt**.

**EN:**  
- Python **3.8+** (some projects require 3.10+ because of `match` / `case`),  
- An OS with a terminal/console (Windows / Linux / macOS),  
- For `tkinter` apps – a system with `tkinter` support,  
- For PDF‑related projects – dependencies from each project’s `requirements.txt` (including `defusedxml`, `fonttools`, `fpdf2`, `pillow`),  
- For the user manager – the **bcrypt** package.

---

### Instalacja / Installation

**PL:**  
1. Sklonuj lub skopiuj to repozytorium w wybranej lokalizacji (np. na pulpicie).  
2. Wejdź do katalogu wybranego projektu.  
3. Jeśli projekt posiada `requirements.txt`, zainstaluj zależności (w wirtualnym środowisku lub globalnie):

   ```bash
   pip install -r requirements.txt
   ```

   W razie wielu wersji Pythona możesz użyć:

   ```bash
   python -m pip install -r requirements.txt
   # lub
   python3 -m pip install -r requirements.txt
   ```

**EN:**  
1. Clone or copy this repository to any location (e.g. your Desktop).  
2. Enter the directory of the project you want to run.  
3. If the project has a `requirements.txt` file, install its dependencies (preferably in a virtual environment):

   ```bash
   pip install -r requirements.txt
   ```

   If you have multiple Python versions, you may need:

   ```bash
   python -m pip install -r requirements.txt
   # or
   python3 -m pip install -r requirements.txt
   ```

---

### Uruchamianie projektów (skrót) / Running the projects (quick guide)

**PL (ogólnie):**
- Projekty konsolowe uruchamiasz z katalogu projektu, np.:

  ```bash
  python "Kalkulator.py"
  python "To-Do List w pamięci.py"
  python "To-Do List w pliku.py"
  python "Zgadywanie liczb.py"
  python user_manager.py
  ```

- Aplikacje `tkinter` z generowaniem PDF uruchamiasz podobnie, upewniając się, że w tym samym katalogu jest plik `DejaVuSans.ttf`:

  ```bash
  python "Lista obecnosci.py"
  python "Listy obecnosci.py"
  ```

Szczegółowe instrukcje (w języku polskim i angielskim) znajdziesz w `README.md` każdego projektu:
- [`User-menager`](https://github.com/MichalTul/User-menager) – menedżer użytkowników (SQLite + bcrypt),  
- [`Lista-obecnosci`](https://github.com/MichalTul/Lista-obecnosci) – generator pojedynczej listy obecności (offline, PDF),  
- [`Male-projekty`](https://github.com/MichalTul/Male-projekty) – zestaw prostych programów konsolowych,  
- [`Pracownicze-listy-obecnosci`](https://github.com/MichalTul/Pracownicze-listy-obecnosci) – miesięczne listy obecności (GUI, PDF).

**EN (general):**
- Run console programs from the project directory, for example:

  ```bash
  python "Kalkulator.py"
  python "To-Do List w pamięci.py"
  python "To-Do List w pliku.py"
  python "Zgadywanie liczb.py"
  python user_manager.py
  ```

- Run `tkinter` + PDF apps similarly, making sure `DejaVuSans.ttf` is in the same directory:

  ```bash
  python "Lista obecnosci.py"
  python "Listy obecnosci.py"
  ```

For detailed Polish/English instructions, see each project’s `README.md`:
- [`User-menager`](https://github.com/MichalTul/User-menager) – user manager (SQLite + bcrypt),  
- [`Lista-obecnosci`](https://github.com/MichalTul/Lista-obecnosci) – offline attendance list generator (PDF),  
- [`Male-projekty`](https://github.com/MichalTul/Male-projekty) – simple console programs collection,  
- [`Pracownicze-listy-obecnosci`](https://github.com/MichalTul/Pracownicze-listy-obecnosci) – monthly attendance list generator (GUI, PDF).

---

## Menedżer użytkowników (SQLite + bcrypt) / User manager (SQLite + bcrypt)

### Opis / Description

**PL:**  
Prosty konsolowy menedżer użytkowników napisany w Pythonie.  
Używa bazy danych SQLite (`users.db`) oraz biblioteki **bcrypt** do bezpiecznego przechowywania haseł (hashowanie).  
Skrypt umożliwia:
- **logowanie użytkownika** (z maksymalnie 3 próbami),
- **dodawanie nowych użytkowników**,
- **wyświetlanie wszystkich użytkowników**,
- **wyświetlanie tylko aktywnych użytkowników** (funkcja pomocnicza),
- **edycję danych użytkownika** (imię, e‑mail, hasło),
- **blokowanie i odblokowywanie konta**,
- **usuwanie użytkownika**.

**EN:**  
Simple console user management script written in Python.  
It uses an SQLite database (`users.db`) and the **bcrypt** library for secure password storage (hashing).  
The script allows you to:
- **log in a user** (with up to 3 attempts),
- **add new users**,
- **list all users**,
- **list only active users** (helper function),
- **edit user data** (name, e‑mail, password),
- **block and unblock accounts**,
- **delete users**.

---

### Wymagania / Requirements

**PL:**
- Python 3.10 lub nowszy (ze względu na użycie `match` / `case`),
- Zewnętrzny pakiet: **bcrypt**,
- Moduły standardowej biblioteki: `sqlite3`, `time`, `random`.

**EN:**
- Python 3.10 or newer (because of `match` / `case`),
- External package: **bcrypt**,
- Standard library modules: `sqlite3`, `time`, `random`.

---

### Instalacja / Installation

**PL:**
1. Sklonuj lub skopiuj repozytorium do wybranego katalogu.
2. Zainstaluj wymagane pakiety (wirtualne środowisko jest zalecane):

```bash
pip install -r requirements.txt
```

**EN:**
1. Clone or copy this repository to your machine.
2. Install required packages (virtual environment recommended):

```bash
pip install -r requirements.txt
```

---

### Uruchomienie / Running the script

**PL:**
1. Upewnij się, że masz zainstalowane zależności (`bcrypt`).
2. Uruchom skrypt (załóżmy nazwę pliku `main.py`; jeśli plik ma inną nazwę, użyj jej zamiast `main.py`):

```bash
python user_manager.py
```

Przy pierwszym uruchomieniu automatycznie utworzy się baza `users.db` z tabelą `users`.  
Najpierw zostaniesz poproszony o **logowanie** (użytkownik musi już istnieć w bazie).  
Aby dodać pierwszego użytkownika, możesz tymczasowo:
- albo dopisać użytkownika ręcznie do bazy SQLite (np. przez narzędzie `sqlite3`),
- albo zmodyfikować kod tak, by tworzył konto startowe (np. administratora).

**EN:**
1. Make sure you have installed the dependencies (`bcrypt`).
2. Run the script (assuming the file is named `main.py`; if it has a different name, use that instead):

```bash
python user_manager.py
```

On the first run, the script creates the `users.db` database with the `users` table.  
You will first be asked to **log in** (the user must already exist in the database).  
To add the very first user you can either:
- insert a user manually into the SQLite database (e.g. using the `sqlite3` tool),
- or temporarily modify the code to create an initial account (e.g. administrator).

---

### Struktura bazy danych / Database structure

Tabela `users`:

- `id` – klucz główny, auto‑increment (INTEGER),
- `name` – imię użytkownika (TEXT, NOT NULL),
- `email` – adres e‑mail (TEXT, NOT NULL, UNIQUE),
- `password_hash` – zaszyfrowane hasło (`BLOB`, hash bcrypt),
- `active` – flaga aktywności konta (`INTEGER`, 1 = aktywny, 0 = zablokowany).

Tabela jest tworzona automatycznie przez funkcję `create_table()` przy starcie programu.

---

### Uwierzytelnianie / Authentication

**PL:**
- Hasła są **nigdy nie przechowywane w postaci jawnej** – zamiast tego zapisywany jest hash bcrypt.
- Logowanie (`logowanie()`) pozwala na maksymalnie 3 próby, z losowym opóźnieniem między błędnymi próbami, aby utrudnić ataki typu brute‑force.
- Zablokowane konto (`active = 0`) nie może się zalogować.

**EN:**
- Passwords are **never stored in plain text** – only bcrypt hashes are saved.
- The `logowanie()` function allows up to 3 login attempts, with a random delay between failed attempts to slow down brute‑force attacks.
- Blocked accounts (`active = 0`) cannot log in.

---

### Znane ograniczenia / Known limitations

**PL:**
- Brak rozróżnienia ról (np. administrator / zwykły użytkownik).
- Proste sprawdzanie poprawności e‑maila (jedynie obecność `@` i `. `).
- Brak testów automatycznych i interfejsu graficznego – aplikacja działa wyłącznie w konsoli.

**EN:**
- No roles (e.g. admin / regular user) implemented.
- Very basic e‑mail validation (only checks for `@` and `. `).
- No automated tests and no graphical interface – console only.

