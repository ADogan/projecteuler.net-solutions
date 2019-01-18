public class project_euler_011 {

    static String gridAsString = 
    "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08"+
    "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00"+
    "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65"+
    "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91"+
    "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80"+
    "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50"+
    "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70"+
    "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21"+
    "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72"+
    "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95"+
    "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92"+
    "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57"+
    "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58"+
    "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40"+
    "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66"+
    "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69"+
    "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36"+
    "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16"+
    "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54"+
    "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

    static int gridRowSize = 20;
    static int gridColumnSize = 20;

public static void main(String[] args) {
        int maxProduct = 0;
        // prepare grid
        int[][] grid = prepareGridAsInts();

        //search max product horizontally
        int maxProductHorizontally =  getMaxProductHorizontally(grid);
        System.out.println("max hor prod: " + maxProductHorizontally);
        
        //search max product vertically
        int maxProductVertically =  getMaxProductVertically(grid);
        System.out.println("max ver prod: " + maxProductVertically);
        maxProduct = Math.max(maxProductHorizontally, maxProductVertically);

        //search max product diagonally
        int maxProductDiagonally =  getMaxProductDiagonally(grid);
        System.out.println("max diag prod: " + maxProductDiagonally);
        maxProduct = Math.max(maxProduct, maxProductDiagonally);

        //output max product
        System.out.println(maxProduct);
    }

    static private int getMaxProductHorizontally(int[][] grid){
        int localMax = 0;
        
        //loop through all rows
        for(int rows = 0; rows < gridRowSize; rows++){
            for(int columnStartIndex = 0; columnStartIndex <= gridColumnSize - 4; columnStartIndex++){
                int product = grid[rows][columnStartIndex    ] * 
                              grid[rows][columnStartIndex + 1] * 
                              grid[rows][columnStartIndex + 2] * 
                              grid[rows][columnStartIndex + 3];
                localMax = Math.max(localMax, product);
            }
        }
        return localMax;
    }

    static private int getMaxProductVertically(int[][] grid){
        int localMax = 0;

        // loop through all columns
        for(int columns = 0; columns < gridColumnSize; columns++){
            for(int rowStartIndex = 0; rowStartIndex <= gridRowSize - 4; rowStartIndex++){
                int product = grid[rowStartIndex    ][columns] * 
                              grid[rowStartIndex + 1][columns] * 
                              grid[rowStartIndex + 2][columns] * 
                              grid[rowStartIndex + 3][columns];
                localMax = Math.max(localMax, product);
            }
        }
        return localMax;
    }

    static private int getMaxProductDiagonally(int[][] grid){
        int localMax = 0;

        // loop LeftUp (LU) to RightDown(RD)
        for(int row = 0; row <= gridColumnSize - 4; row++){
            for(int column = 0; column <= gridRowSize - 4; column++){
                int product = grid[row + 0][column + 0] * 
                              grid[row + 1][column + 1] * 
                              grid[row + 2][column + 2] * 
                              grid[row + 3][column + 3];
                localMax = Math.max(localMax, product);
            }
        }

        // loop LeftDown (LD) to RightUp (RU)
        for(int row = 19; row >= 3; row--){
            for(int column = 0; column <= gridRowSize - 4; column++){
                int product = grid[row - 0][column + 0] * 
                              grid[row - 1][column + 1] * 
                              grid[row - 2][column + 2] * 
                              grid[row - 3][column + 3];
                localMax = Math.max(localMax, product);
            }
        }

        return localMax;
    }

    static private int[][] prepareGridAsInts(){
        // System.out.println("Project euler problem 11");
        String gridlines[][] = new String[gridRowSize][gridColumnSize];
        int[][] grid = new int[gridRowSize][gridColumnSize];
        int lineposition = 0;

        for(int x = 0; x <= gridAsString.length()-1; x = x + gridAsString.length()/gridRowSize){
            gridlines[lineposition] = (gridAsString.substring(x, x + gridAsString.length()/gridRowSize)).split(" ");
            for(int y = 0; y < gridRowSize; y++){
                grid[lineposition][y] = Integer.parseInt(gridlines[lineposition][y]);
            }
            lineposition++;
        }

        return grid;
    }
}