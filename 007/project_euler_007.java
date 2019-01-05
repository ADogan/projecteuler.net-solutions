
public class project_euler_007 {
    static int primeNumberTarget = 10001;

    public static void main(String[] args) {
        int currentPrime = 1;
        for(int i=0; i < primeNumberTarget; i++) {
            currentPrime = getNextPrimeNumber(currentPrime);
        }

        System.out.println(currentPrime);
    }
    
    static int getNextPrimeNumber(int currentPrime){
        int newPrime = 0;
        int primeCandidate = ++currentPrime;
        while(!isPrime(primeCandidate))
        {
            primeCandidate++;
        }
        newPrime = primeCandidate;
        
        System.out.printf("Prime found: %d.\n", primeCandidate);
        return newPrime;
    }

    static boolean isPrime(int primeCandidate){
        for(int k = 2; k < primeCandidate; k++){
            if(primeCandidate % k == 0){
                return false;
            }
        }
        return true;
    }
}