public class TestPad {
    public static void main(String[] args) {

        int[][] myMatrix = {{1,2,3,4,5},{0,6,7,8,1},{9,10,11,0,1}, {13,14,15,16,1}, {1,2,3,4,5}};
        boolean[] rows = new boolean[myMatrix.length];
        boolean[] columns = new boolean[myMatrix.length];

        for (int i = 0; i < myMatrix.length; i++) {
            rows[i] = true;
            columns[i] = true;
        }


        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (myMatrix[i][j] == 0) {
                    rows[i] = false;
                    columns[j] = false;
                }

            }

        }
        TestPad test = new TestPad();

        test.pretty(myMatrix);
        System.out.println();

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (rows[i] == false || columns[j] == false) {

                    myMatrix[i][j] = 0;
                }


            }

        }

        
        test.pretty(myMatrix);




    }

    public void pretty(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
