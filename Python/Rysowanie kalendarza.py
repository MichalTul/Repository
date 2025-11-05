dni = int(input("Podaj liczbe dni w miesiacu: "))
poczatek = int(input("Podaj poczatkowy dzień miesiaca (1-Nie , 7-Sob ): "))

for i in range(poczatek - 1):
    print("\t", end="")

# Wydrukuj dni miesiąca
for dzien in range(1, dni + 1):
    print(dzien, end="\t")
    # Nowa linia po wydrukowaniu soboty (dzień 7, 14, 21, ...)
    if (poczatek + dzien - 1) % 7 == 0:
        print()