#include<stdio.h>
#include<conio.h>
#include<string.h>
struct join
{
	int d;
	int m;
	int y;
};
struct faculty
{
int id;
char name[20];
float salary;
struct join jd;
};
void read(struct faculty f[10],int n)
{
int i;
char temp[20];
printf("Enter Faculty id & salary: ");
for(i=0;i<n;i++)
{
	printf("Enter Id: ");
	scanf("%d",&f[i].id);
	printf("Enter Salary: ");
	scanf("%f",&f[i].salary);
	printf("Enter Name: ");
	scanf("%s",&temp);
	strcpy(f[i].name,temp);
	printf("Enter Join Date in dd mm yy:");
	scanf("%d %d %d",&f[i].jd.d,&f[i].jd.m,&f[i].jd.y);
}
}
void print(struct faculty f[10],int n)
{
int i;
printf("Below is Data\n");
for(i=0;i<n;i++)
{
	printf("ID== %d\n Salary== %f\n",f[i].id,f[i].salary);
	printf("Name==%s\n",f[i].name);
	printf("Join Date is: %d / %d / %d\n",f[i].jd.d,f[i].jd.m,f[i].jd.y);
}
}
void find(struct faculty f[10],int n,char search[20])
{
int i;
char temp[20];
for(i=0;i<n;i++)
{
	if(strcmp(search,f[i].name)==0)
	{
	printf("Data Matched:%d %s %f\n",f[i].id,f[i].name,f[i].salary);

	printf("\nEnter New Data:\n");

	printf("Enter Id: ");
	scanf("%d",&f[i].id);
	printf("Enter Salary: ");
	scanf("%f",&f[i].salary);
	printf("Enter Name: ");
	scanf("%s",f[i].name);
       //	strcpy(f[i].name,temp);
	break;

	}
}
}
void main()
{
struct faculty f[10];
int n;
char search[20];
clrscr();
printf("Enter no of Entries:\n");
scanf("%d",&n);
read(f,n);
print(f,n);
printf("Enter name to Search:\n");
scanf("%s",search);
find(f,n,search);
print(f,n);
getch();
}
void linkfloat(){
float a,*x;
x=&a;
a=*x;
}