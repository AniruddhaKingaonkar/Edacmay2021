import java.util.*;

class Q22
{
public static void main(String[]args)
{
int r,t;
int i=0;
int d=0;
System.out.println("Enter Binary Number");
Scanner sc= new Scanner(System.in);
t=sc.nextInt();
while(t>0)
{
r=t%10;
d=d+r *(int) Math.pow(2,i++);
t=t/10;
}
System.out.println(d);
}
}