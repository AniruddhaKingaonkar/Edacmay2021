/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/


class AssPtrP14
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
	for(int row=2;row<=5;row++)
	{
		for(int space=4;space>=row; space--)
	    {
		 System.out.print(" ");
	    }
		for(int col=1;col<row;col++)
	    {
		 System.out.print("*");
	    }
		for(int l=1; l<=row; l++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
     
  }
}