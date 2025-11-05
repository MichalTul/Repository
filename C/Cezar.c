#include <stdio.h>
#include <string.h>
#include <ctype.h>

void Cezar(char *tekst, int klucz, int szyfrowanie) {
    // Dostosowanie klucza do zakresu 0-25
    klucz = klucz % 26;
    if (!szyfrowanie) {
        klucz = 26 - klucz; // Dla deszyfrowania
    }

    for (int i = 0; tekst[i] != '\0'; i++) {
        char ch = tekst[i];
        if (isalpha(ch)) { // Sprawdź, czy znak jest literą
            char base = islower(ch) ? 'a' : 'A';
            tekst[i] = (ch - base + klucz) % 26 + base; // Szyfruj lub deszyfruj literę
        }
    }
}

int main() {
    char tekst[256];
    int klucz;
    char tryb;

    printf("Podaj tekst do szyfrowania/odszyfrowania: ");
    fgets(tekst, sizeof(tekst), stdin);
    tekst[strcspn(tekst, "\n")] = 0; // Usuń nową linię

    printf("Podaj klucz (liczba): ");
    scanf("%d", &klucz);
    printf("Wybierz tryb (s = szyfrowanie, d = deszyfrowanie): ");
    scanf(" %c", &tryb);

    int szyfrowanie = (tryb == 's' || tryb == 'S');

    Cezar(tekst, klucz, szyfrowanie);

    if (szyfrowanie) {
        printf("Zaszyfrowany tekst: %s\n", tekst);
    } else {
        printf("Odszyfrowany tekst: %s\n", tekst);
    }

    return 0;
}