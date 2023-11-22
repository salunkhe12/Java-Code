import java.util.Scanner;
class rangeOfPrime 
{
 public static void main(String args [])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Starting range no");
  int startingNo = sc.nextInt();
  System.out.println("Enter Ending Range no");
  int endingNo = sc.nextInt();
  
  
  for(int n = startingNo; n <= endingNo; n++){                               {
  int count = 0;
  
  
  
   for(int i = 1; i <= n; i++){
      
       if(n % i == 0)
       {
        count++;
       }
      
   }
       if(count == 2)
       {
        System.out.println(n);
       } 
    
   }
  }
 }
}