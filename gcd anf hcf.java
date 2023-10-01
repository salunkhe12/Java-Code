public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int num1 = 12, num2 = 6, num3 = 14;
		int ans  = 1;
		for(int i = 1; i<= Math.min(num1, num2); i++){
		    if(num1 % i == 0 && num2 % i ==0){
		        ans = i;
		    }
		}
		System.out.println(ans);
		int h = Math.max(num1, num2);
		System.out.println(h);
	}
}
