
public class project_euler_006{
    private static int difference, sumOfSquares, squareOfSums;
    private static int number_of_natural_numbers = 100;

    public static void main(String[] args) {
        sumOfSquares = getSumOfSquares();
        squareOfSums = getSquareOfSums();

        difference = squareOfSums - sumOfSquares;
        System.out.println(difference);
    }

    static int getSumOfSquares(){
        int sumOfSquares_counting = 0;

        for(int x=1; x <= number_of_natural_numbers; x++){
            int xSquare = x * x;
            sumOfSquares_counting += xSquare;
        }

        return sumOfSquares_counting;
    }

    static int getSquareOfSums(){
        int sum_counting = 0;

        for(int x=1; x <= number_of_natural_numbers; x++){
            sum_counting += x;
        }
        
        int squareOfSumsResult = sum_counting * sum_counting;
        return squareOfSumsResult;
    }
}