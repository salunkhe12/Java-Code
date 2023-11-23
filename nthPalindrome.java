import java.util.*;
class nthPalindrome
{
 public static void main(String args [])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 int nth = sc.nextInt();
 int count = 0;
 for(int i = 1; i > 0; i++)
 {
  int n = i;
  int num = n;
  int rev = 0;
  while(n > 0)
  {
   int rem = n % 10;
   rev = rev*10 + rem;
   n = n/10;
  } 
  if(rev == num)
  {
   count++;
   if(count == nth)
   {
    System.out.println(rev); 
    break;
   }
  }
 
 }
 } 
}