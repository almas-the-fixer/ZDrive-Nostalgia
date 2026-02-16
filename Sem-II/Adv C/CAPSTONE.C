#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct file
{
int label;
int room_no;
char block;
};
void display(struct file f1[],int n)
{
int i;
for(i=0;i<n;i++)
{
	printf("\n Label:%d \n room no:%d \n block:%c \n",f1[i].label,f1[i].room_no,f1[i].block);
}
}
void search(struct file f1[],int n)
{
int i,find;
printf("Enter Label You Want to Search: ");
scanf("%d",&find);

for(i=0;i<n;i++)
{
	if(find==f1[i].label)
	{
	printf("Found!");
	printf("\nLabel:%d\nRoom:%d\nBlock:%c\n",f1[i].label,f1[i].room_no,f1[i].block);
	break;
	}
	else
	{
	printf("Not Found!!");
	}
}
}
void append(struct file f1[],int *p)
{
int i,a,n1;
pri

for(i=*p-1;i<=a;i++)
{
printf("Enter Label:");
scanf("%d",&f1[i].label);
printf("Enter Room:");
scanf("%d",&f1[i].room_no);
printf("Enter Block:");
fflush(stdin);
scanf("%c",&f1[i].block);
}

}
void main(){
struct file f1[10];
FILE *fp;
int i,n;
clrscr();
printf("\nEnter no of Entries: ");
scanf("%d",&n);
fp=fopen("ab.txt","wt");
if(fp==NULL)
{
printf("File Not Found");
}
else
{
for(i=0;i<n;i++)
{
printf("\nEnter the label: ");
scanf("%d",&f1[i].label);
printf("\nEnter the room: ");
scanf("%d",&f1[i].room_no);
fflush(stdin);
printf("\nEnter the Block:  ");
scanf("%c",&f1[i].block);
fprintf(fp,"Label:%d \n||Room:%d \n||Block:%c\n\n",f1[i].label,f1[i].room_no,f1[i].block);
}
}
fclose(fp);
display(f1,n);
search(f1,n);
append(f1,&n);
display(f1,);
getch();
}