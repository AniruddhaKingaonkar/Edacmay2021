public class Pattern6
{
  public static void main(String args[])
    {
	int c=0;
       for(int i=1;i<=3;i++)
         {
		   for(int j=1;j<=i;j++)
           {
		      System.out.print(j);
			  c=c+j;
			}
			System.out.print(" "+c);
			c=0;
			System.out.println();
		}	
     }
}