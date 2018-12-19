
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.


public class project_euler_004{
    public static void main(String[] args) {
        int palindromeCandidate = 0;
        int largestPalindrome = 0;

        int counter1 = 999;
        while (counter1 > 0){

            int counter2 = 999;
            while (counter2 > 0){
                palindromeCandidate = counter1 * counter2;
                if(palindromeCandidate > largestPalindrome){
                    if(itIsAPalindrome(palindromeCandidate)){
                        largestPalindrome = palindromeCandidate;
                    }
                }
                counter2--;
            }
            counter1--;
        };
        System.out.printf("Largest palindrome is: %d.\n",largestPalindrome);
    }

    static boolean itIsAPalindrome(int input){
        boolean candidatePalindrome = true;

        String inputText=String.valueOf(input);
        int position = 0;

        while( position < inputText.length() / 2 ){
            candidatePalindrome = checkShell(inputText, position);
            if(!candidatePalindrome){
                return false;
            }
            position++;
        }
        // System.out.printf("We found a palindrome: %s.\n", inputText);
        return true;
    }

    static boolean checkShell(String input, int position){
        int firstPos = position;
        int lastPos = (input.length()-1) - position;
        
        char first = input.charAt(firstPos);
        char last = input.charAt(lastPos);
        
        if(first == last){
            // System.out.printf("They are the same: %c and %c.\n", first, last);
            return true;
        }
        return false;
    }
}
