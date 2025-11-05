#include <stdio.h>

unsigned int dzielniki(unsigned int n)
{
    int wynik = 0;
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            wynik ++;
        }
    }
    return wynik;
}

int main()
{
    int x,y;
    printf("Podaj liczbe: ");
    scanf("%d", &x);
    printf("Liczba dzielnikow liczby %d to ", x);
    y = dzielniki(x);
    printf("%d",y);
    return 0;
}
