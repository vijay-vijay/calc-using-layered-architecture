import java.util.*;
class Calc
{
void add(int n1,int n2)
{
System.out.print("result is:"+" "+(n1+n2));
}
void sub(int n1,int n2)
{
System.out.print("result is:"+" "+(n1-n2));
}
void mul(int n1,int n2)
{
System.out.print("result is:"+" "+(n1*n2));
}
void div(int n1,int n2)
{
System.out.print("result is:"+" "+(n1/n2));
}
void mod(int n1,int n2)
{
System.out.print("result is:"+" "+(n1%n2));
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
String op=sc.next();
Calc c=new Calc();
switch(op)
{
case "add":c.add(n1,n2);
           break;

case "sub":c.sub(n1,n2);
           break;

case "mul":c.mul(n1,n2);
           break;

case "div":c.div(n1,n2);
           break;

case "mod":c.mod(n1,n2);
           break;

default:System.out.print("invalid operator");
}
}
}