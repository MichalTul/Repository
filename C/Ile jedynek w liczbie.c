#include <stdio.h>

unsigned int jedynki(unsigned int n)
{
    int wynik = 0;
    while (n != 0)
    {
        if (n % 10 == 1)    wynik++;
        n=n/10;
    }
    return wynik;
}

int main()
{
    int x,y;
    printf("Podaj liczbe: ");
    scanf("%d", &x);
    printf("Liczba jedynek liczby %d to ", x);
    y = jedynki(x);
    printf("%d",y);
    return 0;
}
