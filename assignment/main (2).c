#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char* deblank(char* s1)
{
    int i,j;
    for (i=0;i<strlen(s1);i++)
    {
        if(s1[i]==' ')
        {
            for(j=i;j<strlen(s1);j++)
            {
                s1[j]=s1[j+1];
            }
        }
    }
return s1;
}
int main()
{
    char s1[40];
    gets(s1);
    deblank(&s1[0]);
    printf("%s",s1);


    return 0;
}
