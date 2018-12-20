// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class project_euler_005{
    static boolean gotInitialEvenNumber = false;
    public static void main(String[] args) {
        int smallestNumberDivisableFromNtoN = getSmallestNumberDivisableByNTo(20);
        
        if(smallestNumberDivisableFromNtoN == 0){
            System.out.print("Smallest number not found within our range.");
        } else {
            System.out.printf("We have a winner: %d.\n", smallestNumberDivisableFromNtoN);
        }
    }
    
    
    static int getSmallestNumberDivisableByNTo(int maxDivision){
        boolean divisable = false;
        int candidate = maxDivision;

        do{
            divisable = checkDivisableUntil(candidate,maxDivision);
            if(divisable){
                return candidate;
            }
            candidate = getNewCandidate(candidate);
            // To keep it safe and also avoid eternal loop I guess :p
            if(candidate > Integer.MAX_VALUE) {
                System.out.println("Max int value reached for this run.");
                break;
            }

        } while(!divisable);

        System.out.println(divisable);
        return 0;
    }
    static int getNewCandidate(int currentCandidate){
        currentCandidate = skipNumbersForPossiblePerformanceGains(currentCandidate);
        return ++currentCandidate;
    }
    
    static int skipNumbersForPossiblePerformanceGains(int candidate){
        if(gotInitialEvenNumber){
            candidate++;
        } else if (candidate % 2 == 0){
            // We want to make sure that we start increasing candidate extra on an even number, 
            // after that we can just increase candidate by 2 without rechecking it.
            candidate++;
            gotInitialEvenNumber = true;
        }
        return candidate;
    }

    static boolean checkDivisableUntil(int candidate, int maxDivision){
        for(int i = 1; i < maxDivision;i++){
            if(candidate % i != 0){
                return false;
            }
        }
        return true;
    }
}