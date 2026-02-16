#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main(int argc,char *argv[])
{
char ch;
FILE *fp;
int flag=0;
clrscr();
printf("%s is passed VIA CLA\n",argv[1]);
printf("%d no of arguments passed!\n",argc);
fp=fopen(argv[1],"r");
ch=fgetc(fp);
while(ch!=EOF)
{
	if(ch<'A'|| ch>'Z')
	{
	printf("\nFILE CONTAINS ONE OR MORE LOWER CASE LETTERS!!");
	flag=1;
	break;
	}
	ch=fgetc(fp);
}
fclose(fp);
if(flag==0)
{
printf("\nFile is in UPPERCASE!");
}
getch();
}