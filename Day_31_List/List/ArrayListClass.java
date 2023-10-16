import java.util.List;
import java.util.ArrayList;
// www.codeswithpankaj.com
class ArrayListClass{

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        // classname<type> object = new classname<type>();
        List<Integer> numbers = new ArrayList<Integer>();

        // Add elements to the list
        numbers.add(11);
        numbers.add(21);
        numbers.add(31);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}