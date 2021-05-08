/*

   *
  **
 ***
****
 ***
  **
   *
   
*/
class AssPtrP9
{
  public static void main(String args[])
  {
    for (int i=1; i<5; i++) //row
	{
		for (int j=3; j>=i;j--) //space
		{
			System.out.print(" ");
		}
		for (int k=1; k<=i; k++)//col
		{
			System.out.print("*");
		}
		System.out.println( );
	}
	for (int i=1; i<=5; i++) //row
	{
		for (int j=0; j<i;j++) //space
		{
			System.out.print(" ");
		}
		for (int k=3; k>=i; k--)//cols
		{
			System.out.print("*");
		}
		System.out.println( );
	}
     
  }
}