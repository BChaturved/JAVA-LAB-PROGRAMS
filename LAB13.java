import java.util.*;
class FirstThread extends Thread{
Thread t;
FirstThread(){
super("FirstThread");
}
public void run()
{
Random rn=new Random();
try{ int n;
for(int i=0;i<5;i++) {
n=1+rn.nextInt(1000);
System.out.println(n);
if(n%2==0) {
SecondThread t1=new SecondThread(n);
t1.start();
}
else {
ThirdThread t2=new ThirdThread(n);
t2.start();
}
Thread.sleep(1000);
}
}
catch(InterruptedException e) {
System.out.println("Halt!!");
}

}
}
class SecondThread extends Thread{
Thread t;
int n;
SecondThread(int n){
super("SecondThread");
this.n=n;
}
public void run()
{
System.out.println("Sqaure of the number:"+(n*n));
}
}
class ThirdThread extends Thread{
Thread t;
int n;
ThirdThread(int n){
super("ThirdThread");
this.n=n;
}
public void run()
{
System.out.println("Cube of the number:"+(n*n*n));
}
}
public class LabProgram13 {

public static void main(String[] args) {
// TODO Auto-generated method stub
FirstThread f=new FirstThread();
f.start();

}

}
