public class prime {
    public static boolean isPrime(int n){
        if(n<0){
            return false;
        }
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
                }
        }
        return true;
    }
}
