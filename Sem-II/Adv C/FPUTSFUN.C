#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp1,*fp2;
char str[100];
clrscr();
fp1=fopen("abc.txt","w");
if(fp1==NULL)
{
     printf("File Not Opened!!");
}
fputs("abcd",fp1);
fclose(fp1);
fp1=fopen("abc.txt","r");
fgets(str,20,fp1);
puts(str);
fclose(fp1);
getch();
}