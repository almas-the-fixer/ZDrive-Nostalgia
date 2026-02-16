
#include<stdio.h>
#include<conio.h>
void catstr(char *p,char *q);
void main()
{
	char str[20],str1[20],str2[20];
	clrscr();

	printf("Enter 1st String:");
	gets(str);
	printf("Enter 2nd String:");
	gets(str1);
	catstr(str,str1);
	printf("Concatenated String:");
	puts(str);
	getch();
}
void catstr(char *p,char *q)
{
 while(*p!='\0')
 {
 p++;
 }
 while(*q!='\0')
 {
 *p=*q;
 q++;
 p++;
 }
 *p='\0';
}