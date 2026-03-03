## Zbiór projektów w Pythonie i Web Development

To repozytorium pełni rolę **głównego indeksu projektów**, które realizuję w ramach nauki programowania, studiów oraz własnych inicjatyw.

Obejmuje ono projekty z obszarów:

- **Python** – aplikacje konsolowe, GUI, praca z SQLite, generowanie PDF  
- **HTML / CSS** – statyczne strony internetowe  
- **Bazy danych i bezpieczeństwo** – SQLite, bezpieczne przechowywanie haseł z użyciem `bcrypt`  
- **Generowanie dokumentów** – tworzenie plików PDF z poziomu Pythona  
- **Ćwiczenia programistyczne** – zadania utrwalające podstawy języka

Każdy projekt znajduje się w **osobnym repozytorium** i posiada własny plik `README`.

---

## Projekty Python

### 1. Beginner Python Exercises

Zestaw **początkowych zadań z języka Python**, obejmujących kluczowe elementy składni i podstawowe konstrukcje języka.

**Zakres:**

- zmienne i typy danych  
- funkcje  
- klasy i podstawy programowania obiektowego (OOP)  
- importy i moduły  
- praca z plikami  
- obsługa wyjątków  
- wybrane moduły standardowe (`math`, `random`, `datetime`)

**Repozytorium:**  
[`Nauka`](https://github.com/MichalTul/Nauka.git)

---

### 2. Proste programy konsolowe w Pythonie

Zbiór niewielkich aplikacji działających w terminalu, służących do ćwiczenia podstawowych konstrukcji języka.

**Zawarte programy:**

- kalkulator  
- lista zadań (wersja w pamięci)  
- lista zadań (z zapisem do pliku)  
- gra „Zgadywanie liczb”

**Zakres tematyczny:**

- pętle i instrukcje warunkowe  
- obsługa wyjątków  
- podstawy pracy z plikami  
- prosta walidacja danych wejściowych

**Repozytorium:**  
[`Male-projekty`](https://github.com/MichalTul/Male-projekty.git)

---

### 3. Generator listy obecności (GUI + PDF)

Offline’owa aplikacja z interfejsem graficznym (`tkinter`), służąca do generowania **pojedynczej listy obecności** w formacie PDF.

**Technologie:**

- Python  
- `tkinter`  
- `fpdf2`  
- czcionki Unicode (np. `DejaVuSans`)  
- generowanie tabel w PDF

**Funkcjonalność:**

- wprowadzanie listy osób w oknie aplikacji  
- generowanie pliku PDF z tabelą (Lp, imię, nazwisko, podpis)  
- obsługa błędów wejścia  
- pełna praca w trybie offline

**Repozytorium:**  
[`Lista-obecnosci`](https://github.com/MichalTul/Lista-obecnosci.git)

---

### 4. Generator miesięcznych list obecności

Aplikacja generująca **miesięczne listy obecności** dla wielu pracowników, w której każda osoba otrzymuje osobną stronę w pliku PDF.

**Funkcjonalność:**

- wybór roku i miesiąca  
- osobna strona PDF dla każdego pracownika  
- tabela z wierszem dla każdego dnia miesiąca  
- legenda skrótów nieobecności  
- miejsce na podpis kierownika

**Technologie:**

- Python  
- `tkinter`  
- `fpdf2`  
- praca z datami (moduły `calendar` / `datetime`)

**Repozytorium:**  
[`Pracownicze-listy-obecnosci`](https://github.com/MichalTul/Pracownicze-listy-obecnosci.git)

---

### 5. Menedżer użytkowników (SQLite + bcrypt)

Konsolowa aplikacja do **zarządzania użytkownikami** z wykorzystaniem bazy SQLite oraz bezpiecznym przechowywaniem haseł w postaci hashy `bcrypt`.

**Technologie:**

- Python 3.10+  
- SQLite  
- `bcrypt`  
- podstawowe mechanizmy walidacji danych

**Funkcjonalność:**

- logowanie użytkownika (maksymalnie 3 próby)  
- dodawanie nowych użytkowników  
- edycja danych (imię, e‑mail, hasło)  
- blokowanie i odblokowywanie kont  
- usuwanie użytkowników  
- wyświetlanie listy wszystkich oraz tylko aktywnych kont

Projekt koncentruje się na:

- podstawach bezpieczeństwa (hashowanie haseł)  
- prostych mechanizmach autoryzacji  
- operacjach CRUD w bazie SQLite

**Repozytorium:**  
[`User-menager`](https://github.com/MichalTul/User-menager.git)

---

## Web Development

### 6. Statyczna strona HTML/CSS (projekt zaliczeniowy)

Prosta, wielostronicowa, statyczna strona internetowa przygotowana jako projekt zaliczeniowy.

**Technologie:**

- HTML5  
- CSS3  
- podział arkuszy stylów na moduły (nagłówek, stopka, responsywność, treść)  
- struktura oparta na wielu plikach HTML

**Struktura serwisu:**

- strona główna  
- kontakt  
- aktualności  
- inicjatywy  
- informacje o opłatach  
- podstrona z odwołaniem do social media  
- strona błędu 404

Projekt pokazuje:

- organizację struktury katalogów (`strony/`, `css/`, `img/`)  
- separację stylów i modularne podejście do CSS  
- podstawy responsywności

**Repozytorium:**  
[`strona_internetowa`](https://github.com/MichalTul/strona_internetowa.git)

---

## Cel repozytorium

To repozytorium pełni funkcje:

- **portfolio projektów** – przegląd zrealizowanych aplikacji i ćwiczeń  
- **dokumentacji postępów w nauce** – uporządkowany zapis kolejnych etapów rozwoju  
- **bazy przykładów praktycznych** z zakresu Pythona i Web Developmentu  
- **wprowadzenia do bezpieczeństwa aplikacji** – hashowanie, podstawowa walidacja, logowanie użytkowników

---

## Plany rozwoju

W dalszej perspektywie planowane są m.in.:

- rozbudowa systemu użytkowników o role (np. administrator / użytkownik)  
- wersja webowa menedżera użytkowników  
- udostępnienie API (np. w oparciu o FastAPI lub Flask)  
- integracja z frontendem  
- dodanie testów jednostkowych  
- dockerizacja wybranych projektów

---

Możesz swobodnie korzystać z tych projektów jako punktu wyjścia, modyfikować je i rozwijać zgodnie z własnymi potrzebami.
