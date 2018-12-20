// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class project_euler_005{
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
        // Carefull, this could run forever, luckily there is Ctrl+c
        do{
            divisable = checkDivisableUntil(candidate,maxDivision);
            if(divisable){
                // System.out.printf("Returning: %d.\n", candidate);
                return candidate;
            }
            candidate = getNewCandidate(candidate);
        } while(!divisable);

        System.out.println(divisable);
        return 0;
    }
    static int getNewCandidate(int currentCandidate){
        currentCandidate++;

        // The following made the run kinda slower, so commenting it out. It's not dead code, it's resting. :)
        // currentCandidate = skipNumbersForPossiblePerformanceGains(currentCandidate);

        return currentCandidate;
    }
    static int skipNumbersForPossiblePerformanceGains(Integer candidate){

            String strRep = candidate.toString();    
            char lastNumber = strRep.charAt(strRep.length()-1);

            if( lastNumber == '1' || lastNumber == '3' || lastNumber == '5' || lastNumber == '7' || lastNumber == '9'){
                // Increase candidate to skip uneven numbers, because they cant be divided by 2 anyway
                candidate++;
            }
        return candidate;
    }


    static boolean checkDivisableUntil(int candidate, int maxDivision){
        for(int i = 1; i < maxDivision;i++){
            if(candidate % i != 0){
                // System.out.printf("%d-",candidate);
                return false;
            }
        }
        return true;
    }
}