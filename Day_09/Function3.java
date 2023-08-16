package Date_16_8_2023;

public class Function3 {
    // without arg. and with return type

    // datatype functionname(){
    //      return value;
    // }

    String SetName(){
        return "joy";
    }
    int setprice(){
        return 300;
    }
    public static void main(String[] args) {
        Function3 obj = new Function3();
        String name = obj.SetName();
        System.out.println(name);
        System.out.println(obj.setprice());
    }
}

