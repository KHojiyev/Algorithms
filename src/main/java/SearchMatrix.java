public class SearchMatrix {

    public static IntPair
    search_in_matrix(int matrix[][], int value) {
        //TODO: Write - Your - Code

        for (int i = 0; i < matrix.length; i++) {

            int low = 0;
            int high = matrix[i].length-1;

            while (low <= high) {

                int mid = (low + high) / 2;
                if (value == matrix[i][mid])
                    return new IntPair(i, mid);

                if (value > matrix[i][mid]) {
                    low = mid + 1;
                }
                if (value < matrix[i][mid]) {
                    high = mid - 1;
                }
            }
        }


        return new IntPair(-1, -1);

    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5, 6, 7},
                {},
                {34, 65, 76, 12, 65, 97, 234, 9, 3, 564},
                {9, 7, 6, 5, 4, 3, 2, 67, 43, 78},
                {90, 56, 53, 34, 1234, 4}
        };


        IntPair intPair = search_in_matrix(matrix,67);
        System.out.println(intPair.toString());



    }


    private static class IntPair {
        private int x;
        private int y;

        public IntPair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "IntPair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


}
