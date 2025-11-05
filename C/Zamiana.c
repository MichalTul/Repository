#include <stdio.h>

void zamiana(int *wsk1, int *wsk2)
{
    int temp;
    if (*wsk2 < *wsk1)
    {
        temp = *wsk1;
        *wsk1 = *wsk2;
        *wsk2 = temp;
    }
}

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    zamiana(&a, &b);
    printf("%d %d \n", a, b);
    return 0;
}