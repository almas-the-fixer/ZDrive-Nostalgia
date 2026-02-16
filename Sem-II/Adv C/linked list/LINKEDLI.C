#include<stdio.h>
#include<conio.h>
struct node
{
int data;
struct node *next;
};
struct node *head=NULL;
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
p=head;
}
else
{
q=(struct node *)malloc(sizeof(struct node));
printf("Enter Element: ");
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
head=beg;
}
void endins(int *ei)
{
struct node *end,*p;
p=head;
end=(struct node *)malloc(sizeof(struct node));
end->data=*ei;
end->next=NULL;
while(p->next!=0)
{
p=p->next;
}
p->next=end;
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
p->next=r;
}
void del_beg()
{
struct node *p;
p=head;
head=head->next;
free(p);
}
void del_end()
{
struct node *p,*q;
p=head;
while(p->next->next!=0)
{
p=p->next;
}
q=p->next;
p->next=NULL;
free(q);
}
void del_bet()
{
struct node *p,*q;
int i,pos;
p=head;
printf("\nEnter The position to delete: ");
scanf("%d",&pos);
for(i=1;i<pos-1;i++)
{
p=p->next;
}
q=p->next;
p->next=q->next;
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
display();
count();
sum();
max();
min();
search();
printf("\nEnter Data You Want To Append: ");
scanf("%d",&insb);
insertbeg(&insb);
display();
printf("\nEnter Another Data to Append at Last: ");
scanf("%d",&inse);
endins(&inse);
display();
insbet();
display();
del_beg();
printf("\n");
display();
del_end();
printf("\n");
display();
del_bet();
printf("\n");
display();
sortasc();
printf("\n");
display();
rev();
printf("\n The Reverse of This Linked List is:...");
display();
getch();
}