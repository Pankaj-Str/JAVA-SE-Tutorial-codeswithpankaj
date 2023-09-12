package ArrayExample;

public class CharArray {
    public static void main(String[] args) {
        //Datatype ArrayName[] = new Datatype[size]

        char data[] = new char[4];

        // insert data into array 

        data[0] = 'j';
        data[1] = 'c';
        data[2] = 'c';
        data[3] = 'r';

        // access  data from array item

        //System.out.println(data[1]);

        // access all data 

        for (int i = 0; i < data.length; i++) {

            System.out.println((i+1)+" = "+data[i]);
            
        }
    }
}
