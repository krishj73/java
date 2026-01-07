public class TwoDMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{1,2}, {3,4}};
        int arr2[][] = {{5,6}, {7,8}};
        
        int row = 2, col = 2;
        int arrsum [][] = new int[row][col];

        //add 2 matrices
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                arrsum[i][j] = arr1[i][j] + arr2[i][j];
            } 
        }
        //display matrix
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print(arrsum[i][j]+" ");
            }
            System.out.println();
        }
    }
}