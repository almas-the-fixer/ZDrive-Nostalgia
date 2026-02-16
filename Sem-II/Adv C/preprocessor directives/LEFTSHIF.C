#include<stdio.h>
#include<conio.h>
void main()
{
int n=2,i;
clrscr();
for(i=0;i<10;i++)
{
printf("%d\t",n);
n=n<<1;
}
getch();
}