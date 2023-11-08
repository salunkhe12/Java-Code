

public class Main
{
    // 1st way to solve
    static int sum(int n1){
		    int x = n1;
		    int count = 0;
		    while(x != 0){
		        x = x/10;
		        count++;
		    }
		    return count;
		    
		}
	// 2nd way to solve	
	static int sum1(int n1){
	    String n2 = Integer.toString(n1);
	    int count = n2.length();
	    return count;
	}
	
	// 3rd way to solve
	
	static int sum2(int n1){
	    int digit = (int) Math.floor(Math.log10(n1) + 1);
	    
	    return digit;
	}
	
	
	public static void main(String[] args) {
	   
	   int n1 = 123456;
	   int result = sum2(n1);
	   System.out.println(result);
	}
}
