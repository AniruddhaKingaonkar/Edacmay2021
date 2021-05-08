import java.util.*;
class Calci
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter two no:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
int f=a/b;
int g=a%b;
System.out.println("125+24="+c);
System.out.println("125-24="+d);
System.out.println("125*24="+e);
System.out.println("125/24="+f);
System.out.println("125%24="+g);
}
}