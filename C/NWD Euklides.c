#include <stdio.h>

int main()
{
    int a,b,i=0;
    printf("Podaj a:");
    scanf("%d", &a);
    printf("Podaj b:");
    scanf("%d", &b);

    while(a!=b)
    {
        if(a>b)
        {
            a-=b;
            i++;
        }
        else b-=a;
    }
    printf("a = %d, i = %d\n", a, i);

    return 0;
}
