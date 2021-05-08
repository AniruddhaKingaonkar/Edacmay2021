/*

*********
 *******
  *****
   ***
    *
	
*/
class AssPtrP6
{
  public static void main(String args[])
  {
    for(int row=5;row>=1;row--)
	{
		for(int space=4;space>=row; space--)
	    {
		 System.out.print(" ");
	    }
		for(int col=1;col<=(row*2-1);col++)
	    {
		 System.out.print("*");
	    }
		
		System.out.println();
	}
     
  }
}