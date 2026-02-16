#include<stdio.h>
#include<conio.h>
struct node{
int data;
struct node *next; 
};
struct node *head = NULL;
void create(int n)
{
int i,j,ele;
struct node *p,*q;
printf("Enter number of nodes in your linked list: ",n);
	for(i=0;i<n;i++)
	{
	if(head == NULL)
	{
		head=(struct node *)malloc(sizeof(struct node));
		printf("Enter element: \n");
		scanf("%d",&head->data);
		head->next = NULL;
		p=head;
	}
	else
	{
		q=(struct node *)malloc(sizeof(struct node));
		printf("Enter element for %d node: \n",i+1);
		scanf("%d",&q->data);
		q->next=NULL;
		p->next=q;
		p=q;
	}
	}
}
void display()
{
	struct node *p;
	p=head;
	while(p!=NULL)
	{
		printf("%d \t",p->data);
		p=p->next;
	}
}
int main()
{
	int n;
	clrscr();
	printf("Enter no of nodes in linked list: ");
	scanf("%d",&n);
	create(n);
	display();
	getch();
}