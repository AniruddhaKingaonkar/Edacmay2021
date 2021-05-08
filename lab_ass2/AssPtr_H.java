/*

******
*   *
*  *
* *
**
*


*/

class AssPtr_H
{
	public static void main(String args[])
	{
		for(int row=1; row<=6;row++)
		{
			
			for(int col=1; col<=6-row+1; col++)
			{
				if(col==6-row+1 ||row==1 ||col==1)
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