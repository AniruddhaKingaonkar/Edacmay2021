import java.util.*;
public class Q18 
{
 public static void main(String[] args)
 {
  long b1, b2, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Input the first binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input the second binary number: ");
  binary2 = in.nextLong();
  while (binary2 != 0)
  {
   digit = (int)(binary2 % 10);
   if (digit == 1) 
   {
    b1 = b1 * factor;
    multiply = binaryproduct((int) b1, (int) multiply);
   } 
   else
   {
    b1 = b1 * factor;
   }
   b2 = b2 / 10;
   factor = 10;
  }
  System.out.print("Product of two binary numbers: " + multiply+"\n");
 }
 static int binaryproduct(int b1, int b2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (b1 % 10 + b2 % 10 + remainder) % 2;
   remainder = (b1 % 10 + b2 % 10 + remainder) / 2;
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }