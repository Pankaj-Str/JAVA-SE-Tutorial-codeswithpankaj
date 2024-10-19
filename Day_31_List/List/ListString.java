import java.util.*;
/**
 * ListString
 */
public class ListString {

    public static void main(String[] args) {
        
        List<String> data = new ArrayList<String>();

        // adding data into list
        data.add("java");
        data.add("C++");
        data.add("jsp");
        data.add("servlet");

        // get all data
        System.out.println("data : "+data);

        // access  data by index
        System.out.println("data at index 0 : "+data.get(1));

        // remove data by index
        data.remove(1);
        System.out.println("data after remove : "+data);


        // add all data
        List<String> data2 = new ArrayList<String>();
        data2.add("python");
        data2.add("java script");
        
        data.addAll(data2);
        System.out.println("data after add all : "+data);

        // iterator()
        Iterator<String> it = data.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // for each 

        for(String d  : data){
            System.out.println(d);
        }

        //using set()-- update  data
        
        data.set(2, "ruby");
        System.out.println("data after set : "+data);


    }

}