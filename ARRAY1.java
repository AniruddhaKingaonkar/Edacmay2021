import java.util.Scanner;
class ARRAY1
{
	public static void main(String[] args)
	{
	  int a[][]= new int[2][2];
	  int b[][]= new int[2][2];
	  int c[][]= new int[2][2];
	  int x[][];
	  int y[][];
	 // int z[][]= new int[2][2];
	  Scanner sc= new Scanner(System.in);
	   System.out.println("ENTER THE ELEMENT FOR FIRST MATRIX");
		for(int x1[]:a)
		{
			  for(int y1:x1)
			  {
			   y1=sc.nextInt();
			   x[][]=new int[y1.length];
			  x[][]=y1;
			  }
			  System.out.println();
			 
		}
		System.out.println("ENTER THE ELEMENT FOR SECOND");
		for(int z[]:b)
		{
			for(int y2:z)
			{
				y2=sc.nextInt();
				
				y[2][2]=y2;
			}
			System.out.println();
			 
		}
		 
		
		 for(int p[]:c)
		 {
		 for(int y3:p)
			{
				  y3=x[2][2]+y[2][2];
				   System.out.println("Addition of matrix" +y3);
			}
		 }
		
		
		
	}
}
