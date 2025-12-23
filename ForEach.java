class ForEach{
    public static void main(String[] args){
        //traverse array
        int[] arr = {1,2,3,4,5};
        System.out.print("array elements are : ");
        for (int val : arr){
            System.out.print(val+" ");
        }

        //sum
        int sum = 0;
        for (int val : arr){
            sum+=val;
        }
        System.out.println("sum of array elements : "+sum);

        //find maximum
        int max = arr[0];
        for (int val : arr){
            if (val>max){
                max = val;
            }
        }
        System.out.println("max num : "+max);

        //print 2d array (matrix)
        int[][] arr2d = {{1,2,3}, {4,5,6}};
        for (int[] row : arr2d){
            for (int val : row){
                System.out.println(val);
            }
        }
    }
}