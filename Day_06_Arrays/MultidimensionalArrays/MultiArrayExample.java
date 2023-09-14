package MultidimensionalArrays;
class MultiArrayExample{
    public static void main(String[] args) {
        
        int[][] data = new int[3][3];

        data[0][0] = 21;
        data[1][0] = 22;
        data[2][0] = 23;

        data[0][1] = 24;
        data[1][1] = 25;
        data[2][1] = 26;

        data[0][2] = 27;
        data[1][2] = 28;
        data[2][2] = 29;

        for (int i = 0; i < data.length; i++) {
            
            for (int j = 0; j < data.length; j++) {
                
                System.out.print(" "+data[i][j]);

            }
            System.out.println();
        }

    }
}