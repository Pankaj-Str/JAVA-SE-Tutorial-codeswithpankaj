package OneDimensionalArrays;
public class OneDimensionalArrayExample{
    public static void main(String[] args) {
        // Declare an array of integers
        // dataType[] arrayName = new dataType[arrayLength];
        int[] numbers = new int[5]; 
        // int[5] = create an array of size 5

        // Initialize the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // access and print array elements
        // System.out.println(numbers[1]); // output 20

        System.out.println("--------- Array elements -------- ");

        for(int i = 0 ; i < numbers.length ; i++){
            //print elements 
            System.out.println("Elements at index " + i + " : " + numbers[i]);
        }

    }
}