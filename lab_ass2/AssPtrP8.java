/*

*
**
***
****
***
**
*

*/

class AssPtrP8
{
  public static void main(String args[])
  {
    for (int i=1; i<5; i++) //row
	{
		for (int j=1; j<=i;j++) //col
		{
			System.out.print("*");
		}
		System.out.println( );
	}
	for (int i=1; i<=5; i++) //row
	{
		for (int j=3; j>=i;j--) //space
		{
			System.out.print("*");
		}
		
		System.out.println( );
	}
     
  }
}