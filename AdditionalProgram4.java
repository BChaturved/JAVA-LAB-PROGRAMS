import java.util.Scanner;
class QueueTest
{

int front=0,rear=0, n=1000;
Scanner sc=new Scanner(System.in);
int queue[]=new int[n];


void enqueue()
{
System.out.println("enter how many elements you want to enqueue");
int k= sc.nextInt();
System.out.println("enter the elemnts");

for (int i=0;i<k;i++)
{
if(isFull())
{
System.out.println("Stack is full");


}
else {
int e[]=new int[k];
e[i]=sc.nextInt();
queue[rear++]=e[i];
}

}

}
int dequeue()
{
if(isEmpty())
{
System.out.println("Stack is empty");
return 0;

}
else {
return queue[front++];
}
}
boolean isFull()
{
return ((rear==n)?true:false);
}
boolean isEmpty() {
return ((rear==front)?true:false);
}
void display()
{
if(isEmpty())
{
System.out.println("there is no content");
return ;
}
System.out.println("contents are");
for(int j=front;j<rear;j++)
{
System.out.println(queue[j]);
}
}

}
public class AdditionalProgram4 {
public static void main(String[] args) {
// TODO Auto-generated method stub
QueueTest k=new QueueTest();

Scanner p=new Scanner(System.in);

first:while(true)
{
System.out.println("*MENU*");
System.out.println("1.enqueue\n"+"2.dequeue\n"+"3.viewqueue\n"+"4.exit");
System.out.println("enter choice");
int x=p.nextInt();
switch(x)
{
case 1:
k.enqueue();
break;
case 2:
System.out.println("the dequeued element is"+k.dequeue());
break;
case 3:
k.display();
break;
case 4:
System.out.println("Have a nice day");

break first;


}
}
}
}
