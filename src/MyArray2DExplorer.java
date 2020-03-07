public class MyArray2DExplorer {

    public boolean evenRow(int[][] mat, int row) {
        for (int i = 0; i < mat[i].length; i++) {
            if(mat[row][i] % 2 == 0){
                return false;
            }
        }
        return true;

    }

    public boolean oddColSum(int[][] nums, int col) {
        int sum = 0;
        for (int i = 0; i < nums[col].length; i++) {
            sum += nums[col][i];
        }
        if (sum % 2 == 0) {
        
        return false;
    }else{
        return true;
        }
    }

    public int minRowPractice(int[][] nums, int row) {
        int currentLow = nums[row][0];
        for (int i = 0; i < nums[row].length; i++) {
            if(nums[row][i] < currentLow){
                currentLow = nums[row][i];
            }
        }
        return currentLow;
    
    }

    public int[] minRow(int [][] mat){
        int[] arr = new int[mat[0].length];

        int currentLowIndex = 0;
        int currentLow = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int a : mat[i]){
                if (a < currentLow){
                    currentLow = a;
                    currentLowIndex = i;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = mat[currentLowIndex][i];
        }

        return arr;
    }

    public int[] colMax(int[][] matrix){
            int[] ar = new int[matrix[0].length];
            for (int i = 0; i < matrix[0].length; i++) {
                int high = matrix[0][i];
                for (int j = 0; j < matrix.length ; j++) {
                    if(matrix[i][j] > high){
                        high = matrix[i][j];
                    }
                }
                ar[i] = high;
            }
            return ar; 
        }


    public int[] allRowSums(int[][] data){
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }




    public double[] averageCol(int[][] nums){
        double[] arr = new double[nums[0].length];
        for (int i = 0; i < nums[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j][i];
            }
            arr[i] = sum/nums.length;
        }
        return arr;
    }


    public int smallEven(int[][] matrix){
        int low = 100;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] < low && matrix[i][j] != 0){
                    low = matrix[i][j];
                }
            }
        }

        return low;
    }



    public int biggestRow(int[][] nums){
        int maxRow = 0;
        int currentSum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            currentSum += nums[0][i];
        }

        int compareSum;
        for (int i = 1; i < nums.length; i++) {
            compareSum = 0;
            for (int j = 0; j < nums[i].length ; j++) {
                compareSum += nums[i][j];
            }
            if (compareSum > currentSum){
                currentSum = compareSum;
                maxRow = i;
            }
        }

        return maxRow;
    }

}
