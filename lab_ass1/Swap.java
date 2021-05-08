import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter two no:");
int i=sc.nextInt();
int j=sc.nextInt();
int temp;
temp=i;
i=j;
j=temp;
System.out.println("Swapping");
System.out.println("i:"+i);
System.out.println("j:"+j);


}
}