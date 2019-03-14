#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int substring(char s1[],char s2[])
{
    int i,j,flag;
    for(i=0;i<=strlen(s1)-strlen(s2);i++)
    {

        for(j=0;j<strlen(s2);j++)
        {
            flag = 1;
        if(s2[j]!=s1[i+j])
        {
            flag = 0;
            break;
        }
        if(j==strlen(s2))
            flag = 1;
        }
        if (flag ==1)
            break;


    }
    return flag;

}
int main()
{
    char s1[100],s2[100];
    gets(s1);
    gets(s2);
    if (substring(s1,s1)==1)
    printf("%s is substring from %s",s2,s1);
    else
        printf("%s is not substring from %s",s2,s1);



    return 0;
}
