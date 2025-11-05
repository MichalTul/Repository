#include <stdio.h>

int mniejsza(int *wsk1, int *wsk2)
{
    int a = *wsk1, b = *wsk2;
    if (a < b) return a;
    else return b;
}

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    int c= mniejsza(&a, &b);
    printf("%d \n", c);
    return 0;
}