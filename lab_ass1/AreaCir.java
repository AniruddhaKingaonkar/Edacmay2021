import java.util.Scanner;
public class AreaCir
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("radius:");        
	float a=sc.nextFloat();
	float b=3.14F;
	System.out.println("Permeter is:"+(2*b*a));
	System.out.println("Area is:"+(b*a*a));
	}
}
	
	