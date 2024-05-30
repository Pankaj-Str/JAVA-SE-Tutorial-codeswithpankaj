package p4n;
import java.util.ArrayList;
public class Array_List01 {

    public static void main(String[] args) {

        // create a object
        ArrayList<String> data = new ArrayList<String>();

        // insert data in list
        // add()
        data.add("Java");
        data.add("C++");
        data.add("C#");
        data.add("Servlet");
        data.add("JSP");
        data.add("Python");

        System.out.println(data);
        // print data from array
//        for(String item : data){
//            System.out.println(item);
//        }

        // insert element at position 2

        data.add(2,"Pandas");

        System.out.println(data);

        // get the element from the arraylist

        System.out.println("Element from index 1 : "+data.get(1));

        // change the element of the array list
        data.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + data);

        // remove element from index 3
        String str = data.remove(3);
        System.out.println("Updated ArrayList: " + data);
        System.out.println("Removed Element: " + str);

        // iterate using for-each loop
        System.out.println("Accessing individual Course :  ");

        for (String language : data ) {
            System.out.println(language);

        }



    }

}
