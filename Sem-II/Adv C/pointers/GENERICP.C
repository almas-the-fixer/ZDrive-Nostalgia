#include<stdio.h>
#include<conio.h>
void main()
{
	int a=10;
	float b=5.5;
	void *p;
	clrscr();
	p=&a;
	printf("\n%d",*(int*)p);
	p=&b;
	printf("\n%.2f",*(float*)p);
	getch();
}