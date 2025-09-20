package number1;

public class Array {

    static int[][] matrix = {
            {1,2,3},
            {4,5,6,7},
            {8,9}
    };

    public static void main(String[] main){
        //1. Print the Length of the number1.Array: Write code to print the length of the main array (matrix).
        int lengthArray = (matrix.length);
        System.out.println(lengthArray);

        //2.Print the Lengths of Sub-Arrays: Write code to print the length of each sub-array within
        //the main array.
        for(int i = 0; i<matrix.length; i++){
            System.out.println("Length of sub-array " + i + ": " + matrix[i].length);
        }

        //3. Loop through the array and Print each element
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
