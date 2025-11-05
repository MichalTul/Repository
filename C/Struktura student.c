#include <stdio.h>

const int rozm = 10;

struct student
{
    char imie[15];
    char nazwisko[15];
    int rok;
    char kierunek[25];
    double oceny[3];
};

void wypelnij_student_rok(struct student k[], int rozm)
{
    for(int i = 0; i < rozm; i++)
    {
        printf("Podaj imie: ");
        scanf("%s", k[i].imie);
        printf("Podaj nazwisko: ");
        scanf("%s", k[i].nazwisko);
        printf("Podaj rok: ");
        scanf("%d", &k[i].rok);
        printf("Podaj kierunek: ");
        scanf("%s", k[i].kierunek);
        for(int j =0; j < 3; j++)
        {
            printf("Podaj ocene: ");
            scanf("%0.1f", &k[i].oceny[j]);
        }
    }
}

void wypisz_student_rok(struct student k[])
{
    int i;
    printf("ROK 1: \n");
    for(i = 0; i < rozm; i++)
    {
        if(k[i].rok == 1)   printf("%d. %s %s \n", i+1, k[i].nazwisko, k[i].imie);
    }
    printf("\n");

    printf("ROK 2: \n");
    for(i = 0; i < rozm; i++)
    {
        if(k[i].rok == 2)   printf("%d. %s %s \n", i+1, k[i].nazwisko, k[i].imie);
    }
    printf("\n");

    printf("ROK 3: \n");
    for(i = 0; i < rozm; i++)
    {
        if(k[i].rok == 3)   printf("%d. %s %s \n", i+1, k[i].nazwisko, k[i].imie);
    }
    printf("\n");

    printf("ROK 4: \n");
    for(i = 0; i < rozm; i++)
    {
        if(k[i].rok == 4)   printf("%d. %s %s \n", i+1, k[i].nazwisko, k[i].imie);
    }
    printf("\n");

    printf("ROK 5: \n");
    for(i = 0; i < rozm; i++)
    {
        if(k[i].rok == 5)   printf("%d. %s %s \n", i+1, k[i].nazwisko, k[i].imie);
    }
    printf("\n");
}

void srednia(struct student k[])
{
    double suma;
    for(int i = 0; i<rozm; i++)
    {
        suma = 0;
        for(int j = 0; j < 3; j++)
        {
            suma = suma + k[i].oceny[j];
        }
        printf("%d. %s %s - %0.2f \n", i+1, k[i].nazwisko, k[i].imie, suma/3);
    }

}

int main()
{
    struct student tab[10] = {
        {"imie","nazwisko",1,"cyber",{1,3.5,5}},
        {"imie","nazwisko",1,"infa",{2.5,3.5,4}},
        {"imie","nazwisko",2,"cyber",{3,4,5.5}},
        {"imie","nazwisko",2,"infa",{1,3.5,5}},
        {"imie","nazwisko",3,"cyber",{1,3.5,5.5}},
        {"imie","nazwisko",3,"infa",{1,3,5}},
        {"imie","nazwisko",4,"cyber",{1,3.5,5}},
        {"imie","nazwisko",4,"infa",{1,3.5,5}},
        {"imie","nazwisko",5,"cyber",{1,3.5,5}},
        {"imie","nazwisko",5,"infa",{1,3.5,5}}
    };
    //wypelnij_student_rok(tab, rozm);
    wypisz_student_rok(tab);
    srednia(tab);



    printf("\n");
    return 0;
}
