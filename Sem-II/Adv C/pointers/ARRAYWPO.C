#include<stdio.h>
#include<conio.h>
void getarray(int a[],int n)
{
int i;
for(i=0;i<n;i++)
{
scanf("%d",i,&a[i]);
}
}
void printarray(int a[],int n)
{
int i;
for(i=0;i<n;i++)
{
printf("\n%d",a[i]);
}
}
void main()
{
	int a[5],n=5;
	int *p;
	clrscr();
	getarray(a,n);
	printarray(a,n);
	getch();
}