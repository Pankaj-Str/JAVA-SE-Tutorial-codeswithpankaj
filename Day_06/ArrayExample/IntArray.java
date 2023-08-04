package ArrayExample;

class IntArray{

        public static void main(String[] args) {
            

            //Datatype ArrayName[] = new Datatype[size]

            int data[] = new int[4];

            // insert data into array 

            data[0] = 11;
            data[1] = 12;
            data[2] = 13;
            data[3] = 14;

            // access  data from array item

            //System.out.println(data[1]);

            // access all data 

            for (int i = 0; i < data.length; i++) {

                System.out.println(data[i]);
                
            }





        }

}