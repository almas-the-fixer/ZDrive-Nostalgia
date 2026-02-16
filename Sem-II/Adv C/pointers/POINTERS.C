//Program to Count string length using pointer
#include<stdio.h>
#include<conio.h>
void countstr(char []);
void main()
{
char str[20];
char *p;

clrscr();

gets(str);
countstr(str);
getch();
}
void countstr(char *p)
{
int count=0;
while (*p!='\0')
{
count++;
p++;
}
printf("%d",count);
}