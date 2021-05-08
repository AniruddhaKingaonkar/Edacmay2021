/*

     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/



class AssPtr_H1
{
	public static void main(String args[])
	{
		for(int row=1; row<=6;row++)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int col=1; col<2*row; col++)
			{  
		      if(((row==6)&&(col%2==1))||col==2*row-1|| col==1)
			  {  
				System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
			}
			System.out.println( );
		}
	}
}
