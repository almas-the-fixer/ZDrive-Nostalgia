#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp1,*fp2;
char ch;
clrscr();
fp1=fopen("abc.txt","r");
fp2=fopen("def.txt","w");
if(fp1==NULL || fp2==NULL)
{
printf("FILE NOT OPENED!!");
}
else
{
//ch=fgetc(fp1);
while(ch!=EOF)
{
ch=fgetc(fp1);
if((ch=fgetc(fp1))!=(ch=fgetc(fp2)))
{
printf("File Not Same");
}
else
{
printf("Files are same");
}
}
fclose(fp1);
fclose(fp2);

fp2=fopen("def.txt","r");
ch=fgetc(fp2);
while(ch!=EOF)
{
ch=fgetc(fp2);
printf("%c",ch);
}
}

fclose(fp2);
getch();
}