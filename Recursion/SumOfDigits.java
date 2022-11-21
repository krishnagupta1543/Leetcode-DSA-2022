 static int sum = 0;
    public static void sumOfDigits(int n){
        if(n == 0){
            return;
        }
        sum+=n%10;
        sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        sumOfDigits(n);
        System.out.println(sum);
    }
