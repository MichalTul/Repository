#include <stdio.h>

int licz(char *a) {
    int max = 0, temp = 0;
    int i = 0;

    while(a[i] != '\0') {
        if (a[i] == '(') temp++;
        if(a[i] == ')') temp--;
        if(temp > max)  max=temp;
        i++;
    }
    return max;
}

int main(void)
{
    char a[]="((0+3)+(12-(1-(1-1)+(2(2+3)))))";

    printf("%d\n", licz(a));
    return 0;
}
