public class TestPad {
    public static void main(String[] args) {

        int[][] myMatrix = {{1,2,3,4,5},{5,6,7,8,1},{9,10,11,12,1}, {13,14,15,16,1}, {1,2,3,4,5x}};

        TestPad test = new TestPad();
        test.pretty(myMatrix);
        int length = myMatrix.length;

        int layer = 0;
        System.out.println(myMatrix.length /2);

        while (layer < (myMatrix.length /2) ) {


            for (int offset = 0; offset < myMatrix.length - 2*layer - 1; offset ++) {

                int ref1 = myMatrix[layer][offset + layer];
                int ref2 = myMatrix[layer + offset][length - 1 - layer];
                int ref3 = myMatrix[length - 1 - layer][length -1 - layer - offset];
                int ref4 = myMatrix[length - 1 - layer - offset][layer];

                System.out.println("The references are " + ref1 + " " + ref2 + " " + ref3 + " " + ref4);


                myMatrix[layer + offset][length - 1 - layer] = ref1;
                myMatrix[length - 1 - layer][length -1 - layer - offset] = ref2;
                myMatrix[length - 1 - layer - offset][layer] = ref3;
                myMatrix[layer][layer + offset] = ref4;


            }
            layer ++;
        }

        System.out.println();
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
