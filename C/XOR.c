#include <stdio.h>
#include <string.h>

void szyfrXOR(char *tekst, const char *klucz) {
    int tekst_len = strlen(tekst);
    int klucz_len = strlen(klucz);

    for (int i = 0; i < tekst_len; i++) {
        tekst[i] = tekst[i] ^ klucz[i % klucz_len]; // Operacja XOR
    }
}

int main() {
    char tekst[256];
    char klucz[256];
    char tryb;

    printf("Podaj tekst do szyfrowania/odszyfrowania: ");
    fgets(tekst, sizeof(tekst), stdin);
    tekst[strcspn(tekst, "\n")] = 0; // Usuń nową linię

    printf("Podaj klucz: ");
    fgets(klucz, sizeof(klucz), stdin);
    klucz[strcspn(klucz, "\n")] = 0; // Usuń nową linię

    printf("Wybierz tryb (s = szyfrowanie, d = deszyfrowanie): ");
    scanf(" %c", &tryb);

    if (tryb == 's' || tryb == 'S') {
        // Szyfrujemy tekst
        szyfrXOR(tekst, klucz);
        printf("Zaszyfrowany tekst: %s\n", tekst);
    } else if (tryb == 'd' || tryb == 'D') {
        // Odszyfrujemy tekst (operacja XOR z tym samym kluczem przywraca oryginalny tekst)
        szyfrXOR(tekst, klucz);
        printf("Odszyfrowany tekst: %s\n", tekst);
    } else {
        printf("Nieprawidłowy wybór trybu.\n");
    }

    return 0;
}