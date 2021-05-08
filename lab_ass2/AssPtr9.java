/*

    A
   A B
  A B C
 A B C D
A B C D E


*/
class AssPtr9
{
  public static void main(String args[])
  {
	int alpha=64;
    for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
	    {
		 System.out.print(" ");
	    }
		for(int k=1;k<=i;k++)
	    {
		 System.out.print((char)(alpha+k)+" ");
		 //System.out.print(k+" ");
	    }
		
		System.out.println();
	}
     
  }
}