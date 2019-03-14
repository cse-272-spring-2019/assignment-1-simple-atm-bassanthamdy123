#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char* create_string(char a, int x)
{
    int i;
    char* p = (char*)malloc(x*sizeof(char));
    for (i=0;i<x;i++)
    {
        p[i]= a;
    }
    p[x]='\0';
return p;
}
int main()
{
    int x;
    char a;
    char* y;
    printf("Enter number: \n");
    scanf("%d",&x);
    printf("Enter the letter: \n");
    scanf(" %c", &a);
    y = create_string(a,x);
    printf("%s",y);
    return 0;
}
