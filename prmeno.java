class primeno {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int n = 1;
        int m = n/2;
        int flag  = 0;
        if(n == 0 || n == 1){
            System.out.println(n + " is not prime no");
        }
        else{
            for(int i = 2; i <= m; i++){
                if(n%i == 0){
                    System.out.println(n + " is not prime no");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is prime numder");
            }
        }
     
     
    }
}