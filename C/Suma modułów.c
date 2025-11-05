#include <stdio.h>

float suma_modulow(float *wsk1, float *wsk2)
{
    float a = *wsk1, b = *wsk2;
    if (a < 0) a = a * (-1);
    if (b < 0) b = b * (-1);

    return a + b;
}

int main()
{
    float a, b;
    scanf("%f %f", &a, &b);
    float c = suma_modulow(&a, &b);
    printf("%.2f \n", c);
    return 0;
}