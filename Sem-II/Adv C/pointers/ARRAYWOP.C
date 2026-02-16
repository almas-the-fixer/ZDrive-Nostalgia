#include<stdio.h>
#include<conio.h>
void getarray(int a[],int n)
{
int i;
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
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
	int n,a[10];
	int *p;
	clrscr();
	printf("Enter length of array up to 10:");
	scanf("%d",&n);
	getarray(a,n);
	printarray(a,n);
	getch();
}