#include <stdio.h>

unsigned int silnia(unsigned int n)
{
    int wynik = 1;
    for (int i = 1; i <= n; i++)
    {
        wynik = wynik * i;
    }
    return wynik;
}

int main()
{
    int x,y;
    printf("Podaj liczbe: ");
    scanf("%d", &x);
    printf("Silnia od %d to ", x);
    y = silnia(x);
    printf("%d",y);
    return 0;
}
