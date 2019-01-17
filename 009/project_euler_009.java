/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

50


There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class project_euler_009{
    static int a = 1, b = 2, c;
    static int product;
    static int maxNumber = 1000;
    static int sumOfSet = 1000;
    public static void main(String[] args) {


        //start looping, increment b until a + b + c is above 1000
        mainLoop:
        while(a <= maxNumber){

            for(b = a; b < maxNumber; b++){
                double cAsDouble = getC(a,b);
                c = (int) cAsDouble;
                System.out.printf("a: %d, b: %d, c: %d\n",a,b,c);
                if(a >= maxNumber || b >= maxNumber || c >= maxNumber || ((cAsDouble % (int) cAsDouble) != 0)){
                    System.out.println("breaking");
                    break;
                }
                if(cAsDouble % (int) cAsDouble == 0){
                    System.out.println("C is a natural number here: " + cAsDouble);
                }
                // c = (int) cAsDouble;
                // System.out.printf("a: %d, b: %d, c: %d\n",a,b,c);
                if(a + b + c == sumOfSet){
                    // System.out.printf("got the %d, now calculating product\n", sumOfSet);
                    product = a * b * c;
                    // break mainLoop;
                }
            }
            a++;
        }
        System.out.println(product);
    }

    static double getC(int a, int b){
        int aSquare = a * a;
        int bSquare = b * b;
        int cSquare = aSquare + bSquare;

        return Math.sqrt(cSquare);
    }
}