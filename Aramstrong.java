class aram
{
 public static void main(String args [])
 {
  /*
  int n = 153;
  int num = n
  int sum = 0;
  
  
  while(num != 0)
  {
   int x = num % 10;
       num = num / 10;
       sum = sum + (x*x*x);
  }
   if( sum == n)
     System.out.println(n +" is a aramstrong no");
   else
     System.out.println(n +" is not a aramstrong no");
   */


                            //  2nd way
   
    int n = 153;
    int num = n;
    int digit = 0;
    int count = 0;
    int sumofpower = 0;
    int temp = n;
    while(temp != 0)
    {
     count++;
     temp = temp / 10;
    }
    while(n != 0)
    {
     digit = n % 10;
     sumofpower += Math.pow(digit, count);
     n = n / 10;
    }
    if(num == sumofpower)
      System.out.println(num +" is a Aramstrong no");
    else
      System.out.println(num +" is not Aramstrong no");
 }
}