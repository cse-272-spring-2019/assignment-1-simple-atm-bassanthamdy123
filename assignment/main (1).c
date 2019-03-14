#include <stdio.h>
#include <stdlib.h>
#include <math.h>
typedef struct
{
float real;
float img;
}complex;
complex add_complex(complex a, complex b)
{
    complex sum;
    sum.real = a.real + b.real;
    sum.img = a.img + b.img;
    return sum;
}
complex read_complex()
{
    complex num;
    printf("\nEnter imaginary number: \nReal part:\n");
    scanf("%f",&num.real);
    printf("Imaginary part:\n");
    scanf("%f",&num.img);
    return num;
}
void print_complex(complex a)
{
    printf("\n%.2f + %.2fi",a.real,a.img);

}
int compare_complex(complex a, complex b)
{
    if (mag(a)==mag(b))
    return 0;
    else if (mag(a)>mag(b))
        return 1;
    else return -1;

}
int mag(complex num)
{
    int magnitude = sqrt(pow(num.real,2)+pow(num.img,2));
    return magnitude;
}
int main()
{
    complex num1 = read_complex();
    complex num2 = read_complex();
    printf("The two imaginary numbers are:\n");
    print_complex(num1);
    print_complex(num2);
    complex sum = add_complex(num1,num2);
    printf("\nThe sum equals:\n");
    print_complex(sum);
    printf("\n%d",compare_complex(num1,num2));
    return 0;
}
