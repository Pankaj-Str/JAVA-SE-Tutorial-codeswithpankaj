package MultidimensionalArrays;
class MultiArray{

    public static void main(String[] args) {
        
        //Datatype[][] ArrayName = new DataType[size][size] 
        
        int[][] data = new int[3][3] ;

        data[0][0] = 21;
        data[0][1] = 22;
        data[0][2] = 23;

        data[1][0] = 24;
        data[1][1] = 25;
        data[1][2] = 26;

        data[2][0] = 27;
        data[2][1] = 28;
        data[2][2] = 29;

        //System.out.println(data[1][1]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }


    }


}