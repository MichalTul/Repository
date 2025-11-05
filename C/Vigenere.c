#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Funkcja do szyfrowania lub deszyfrowania
void vigenere(char *tekst, const char *klucz, int szyfrowanie) {
    int tekst_len = strlen(tekst);  //Zliczanie długości podanego łańcucha znaków
    int klucz_len = strlen(klucz);  //Zliczanie długości łańcucha znaków klucza
    int j = 0; // Indeks klucza

    for (int i = 0; i < tekst_len; i++) {
        char ch = tekst[i];

        // Sprawdź, czy znak jest literą
        if (isalpha(ch)) {
            char base = islower(ch) ? 'a' : 'A'; //ustalanie czy litera jest mała czy duża
            char klucz_char = tolower(klucz[j % klucz_len]) - 'a'; // Przekształcanie klucza na wartość numeryczną

            if (szyfrowanie) {
                // Szyfrowanie
                tekst[i] = (ch - base + klucz_char) % 26 + base;
            } else {
                // Deszyfrowanie
                tekst[i] = (ch - base - klucz_char + 26) % 26 + base;
            }
            j++; // Zwiększ indeks klucza tylko dla liter
        }
    }
}

int main() {
    char tekst[256];
    char klucz[256];
    char tryb;

    printf("Podaj tekst do szyfrowania/odszyfrowania: ");
    fgets(tekst, sizeof(tekst), stdin);  //Pobranie tekstu do zaszyfrowania
    tekst[strcspn(tekst, "\n")] = 0; // Usuń nową linię

    printf("Podaj klucz: ");
    fgets(klucz, sizeof(klucz), stdin);  //pobranie klucza
    klucz[strcspn(klucz, "\n")] = 0; // Usuń nową linię

    printf("Wybierz tryb (s = szyfrowanie, d = deszyfrowanie): ");
    scanf(" %c", &tryb);  //Wybieramy czy szyfrujemy czy deszyfrujemy

    int szyfrowanie = (tryb == 's' || tryb == 'S');  //Flagujemy zmienną by określić czy chcemy szyfrować czy deszyfrować

    vigenere(tekst, klucz, szyfrowanie);  //Podajemy funcji tekst, klucz i flagę

    if (szyfrowanie) {
        printf("Zaszyfrowany tekst: %s\n", tekst);
    } else {
        printf("Odszyfrowany tekst: %s\n", tekst);
    }

    return 0;
}