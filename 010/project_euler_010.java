/*
    The following is rated S for slow. It can take multiple minutes to solve.
    Possible improvements: multithreaded calculations?
    Use preexisting, pro, highly optimized classes that get the next prime for you.
*/

public class project_euler_010{

    public static void main(String[] args) {
        int maxPrime = 2000000;
        int currentPrime = 1;
        // double previousSum = 0;
        double sum = 0;
        // int count = 0;
        // int previousPrime;

        //loop
        mainLoop: while(true){
            //get next prime
            currentPrime = getNextPrimeNumber(currentPrime);

            if (currentPrime >=maxPrime){
                break mainLoop;
            }
            
            //add to total
            // previousSum = sum;
            sum += currentPrime;
            // if(sum < previousSum){
            //     System.out.println("Max double reached, breaking loop!!");
            //     break mainLoop;
            // }
            
            // To see current prime number uncomment the following:
            // count++;
            // if(count % 10000 == 0) {
            //     System.out.printf("currentPrime: %d \n", currentPrime);
            // }
        }

        System.out.println("proj eul 10");
        System.out.printf("sum below %d is: %f \n", maxPrime, sum);
    }

    private static int getNextPrimeNumber(int currentPrime){
        int newPrime = 0;
        int primeCandidate = ++currentPrime;

        while(!isPrime(primeCandidate))
        {
            primeCandidate++;
        }
        newPrime = primeCandidate;
        
        // System.out.printf("Prime found: %d.\n", primeCandidate);
        return newPrime;
    }

    private static boolean isPrime(int primeCandidate){
        for(int k = 2; k < primeCandidate; k++){
            if(primeCandidate % k == 0){
                return false;
            }
        }
        return true;
    }

}

