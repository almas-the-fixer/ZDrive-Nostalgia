#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main(int argc,char *argv[])
{
int no,max=0,i;
clrscr();
for(i=1;i<argc;i++)
{
no=atoi(argv[i]);
if(no>max)
{
max=no;
}
}
printf("Max: %d",max);
getch();
}