#include <stdio.h>
#include <stdlib.h>

struct obj
{
    int a;
    int **wsk;
};

int main()
{
    struct obj **p1;
    int **p2;

    p1 = malloc(3*sizeof(struct obj*));
    p1[0] = malloc(sizeof(struct obj));
    p1[1] = NULL;
    p1[2] = malloc(sizeof(struct obj));

    p1[0]->wsk = malloc(2*sizeof(int*));
    p1[0]->a = 7;

    p1[0]->wsk[0] = NULL;
    p1[0]->wsk[1] = NULL;

    p1[2]->wsk = malloc(3*sizeof(int*));
    p1[2]->a = 4;

    p2=p1[2]->wsk;

    p1[2]->wsk[0] = NULL;
    p1[2]->wsk[1]=malloc(4*sizeof(int));
    p1[2]->wsk[2]=malloc(3*sizeof(int));

    for(int i=0;i<4;i++)
    {
        p1[2]->wsk[1][i] = i+1;
    }

    for(int j=0;j<3;j++)
    {
        p1[2]->wsk[2][j] = j+5;
    }

    printf("bu \n");
    return 0;
}
