// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

public class project_euler_003{

    public static void main(String[] args) {
        long numberToBeTested = 600851475143L;
        long result = getLargestPrimeFactor(numberToBeTested);
        System.out.println(result);
    }

    static long getLargestPrimeFactor(long number){
        long subTotal=1;
        long i = 2;

        while(i < number){
            i++;
            if(number % i == 0){
                subTotal = subTotal * i;
                if (subTotal == number){
                    return i;
                } else if (subTotal > number){
                    System.out.println("Something has gone wrong.");
                    System.out.println("SubTotal: " + subTotal);
                    System.out.println("Number: " + number);
                    return 0;
                }
            }
        }
        return 0;
    }
}