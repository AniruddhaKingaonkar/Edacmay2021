/*
    E
   D E
  C D E
 B C D E
A B C D E


*/


class AssPtr10
{
  public static void main(String args[])
    {
	  int a=65;
	  for(int i=4;i>=0;i--)
      
        {
		    for(int j=0;j<=4;j++)
		  
           {
		     if(i>j)
			 { 
		      System.out.print(" ");
			 }
			  else
			  {
			  
			     System.out.print((char)(a+j)+" ");
			  }
		   }
		   
			System.out.println();
		}	
    }
}



