import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        // Integer type list
        List<Integer> data = new ArrayList<Integer>();
        // String type List
        //List<String> data1 = new ArrayList<String>();

        // add data into list
        data.add(123);
        data.add(124);
        data.add(125);
        data.add(126);
        data.add(127);

        // get all data
        System.out.println(data);

        // Access element from the list get()
        System.out.println("item From List : "+data.get(2));

        // remove item from list

        System.out.println("Before Remove = "+data);
        data.remove(3);
        System.out.println("after Remove Data = "+data);

        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(12);
        Numbers.add(13);
        Numbers.add(14);
        Numbers.add(15);

        data.addAll(Numbers);
        // show new list with update data
        System.out.println("update List "+data);

        // iterator()
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()) {
            int  update_data = iterator.next();
            System.out.println(update_data);
        }

        // for loop
        for (int num:data) {
            System.out.println(num);
        }

        System.out.println("data = "+data);
        //using set():
        data.set(3,999);
        System.out.println("after update data = "+data);

        System.out.println("size of array list = "+data.size());

    }
}
