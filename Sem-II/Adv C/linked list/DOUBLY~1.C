#include<stdio.h>
#include<conio.h>
struct node
{
int data;
struct node *next;
struct node *prev;
};
struct node *head=NULL;
struct node *tail=NULL;
void create()
{
int i,n;
struct node *p,*q;
printf("Enter No of Nodes: ");
scanf("%d",&n);
for(i=0;i<n;i++)
{
if(head==NULL)
{
head=(struct node *)malloc(sizeof(struct node));
printf("Enter Element : ");
scanf("%d",&head->data);
head->next=NULL;
head->prev=NULL;
tail=head;
}
else
{
q=(struct node *)malloc(sizeof(struct node));
printf("Enter Element: ");
scanf("%d",&q->data);
q->next=NULL;
tail->next=q;
q->prev=tail;
tail=q;
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
void dis_rev()
{
struct node *p;
p=tail;
while(p!=NULL)
{
printf("%d \t",p->data);
p=p->prev;
}
}
void count()
{
struct node *c;
int count=0;
c=head;
while(c!=NULL)
{
count++;
c=c->next;
}
printf("\nNo of elements: %d",count);
}
void sum()
{
struct node *s;
int sum=0;
s=head;
while(s!=NULL)
{
sum=s->data+sum;
s=s->next;
}
printf("\nSum of all Elements is : %d",sum);
}
void max()
{
struct node *m;
int max=0;
m=head;
while(m!=NULL)
{
if((m->data)>max)
{
max=m->data;
}
m=m->next;
}
printf("\nmax : %d",max);
}
void min()
{
struct node *small;
int mini;
mini=head->data;
small=head;
while(small!=NULL)
{
if((small->data)<mini)
{
mini=small->data;
}
small=small->next;
}
printf("\nMinimum: %d",mini);
}
void search()
{
struct node *search;
int find,count=0;
search=head;
printf("\nEnter The Element you want to search: ");
scanf("%d",&find);
while(search!=NULL)
{
count++;
if(find==search->data)
{
printf("\nElement found @: %d",count);
return;
}
search=search->next;
}
printf("\nElement Not Found");
}
void insertbeg(int *ip)
{
struct node *beg;
beg=head;
beg=(struct node *)malloc(sizeof(struct node));
beg->data=*ip;
beg->next=head;
beg->prev=NULL;
head=beg;
}
void endins(int *ei)
{
struct node *q;
q=head;
q=(struct node *)malloc(sizeof(struct node));
q->data=*ei;
q->next=NULL;
tail->next=q;
q->prev=tail;
tail=q;
}
void insbet()
{
int ele,pos,i;
struct node *p,*q,*r;
p=(struct node *)malloc(sizeof(struct node));
q=head;
printf("\nEnter The Element You Want To Insert: ");
scanf("%d",&ele);
printf("\nEnter The Position Where You Want To Insert: ");
scanf("%d",&pos);
p->data=ele;
for(i=1;i<pos-1;i++)
{
q=q->next;
}
r=q->next;
q->next=p;
p->prev=q;
p->next=r;
r->prev=p;
}
void del_beg()
{
struct node *p;
p=head;
head=head->next;
head->prev=NULL;
free(p);
}
void del_end()
{
struct node *p;
p=tail;
tail=tail->prev;
tail->next=NULL;
free(p);
}
void del_bet()
{
struct node *p,*q,*r;
int i,pos;
p=head;
printf("\nEnter The position to delete: ");
scanf("%d",&pos);
for(i=1;i<pos-1;i++)
{
p=p->next;
}
q=p->next;
r=q->next;
p->next=r;
r->prev=p;
free(q);
}
void sortasc()
{
int temp;
struct node *p,*q;
for(p=head;p!=NULL;p=p->next)
{
for(q=head;q!=NULL;q=q->next)
{
if(p->data<q->data)
{
temp=p->data;
p->data=q->data;
q->data=temp;
}
}
}
printf("\nAscending Order:\n");
}
void rev()
{
struct node *p,*q,*r;
p=NULL;
q=head;
r=q->next;
while(q!=NULL)
{
q->next=p;
p=q;
q=r;
if(r!=NULL)
{
r=r->next;
}
}
head=p;
}
void main()
{
int insb,inse;
int *ip,*ei;

clrscr();
create();
printf("\nDisplaying List: ");
display();
printf("\n");
printf("\nDisplaying List Rev: ");
dis_rev();
/*count();
sum();
max();
min();
search();
*/
/*printf("\nEnter Data You Want To Append: ");
scanf("%d",&insb);
insertbeg(&insb);
display();
printf("\n");
dis_rev();
printf("\nEnter Another Data to Append at Last: ");
scanf("%d",&inse);
endins(&inse);
display();
printf("\n");
dis_rev();

insbet();
display();
printf("\n");
dis_rev();
*/
printf("\nDeleted Beginning of The List:");
del_beg();
printf("\n");
display();
printf("\nDeleted End of The List:");
del_end();
printf("\n");
display();

del_bet();
printf("Result:");
printf("\n");
display();
/*
sortasc();
printf("\n");
display();
rev();
printf("\n The Reverse of This Linked List is:...\n");
display();*/
getch();
}