
class Customers{

    String name;
    int age;
    float height;

    public Customers(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void setname(String name){
        this.name = name;
    }

    void setage(int age){
        this.age = age;
    }

    void setheight(float height){
        this.height = height;
    }

    String getname(){
        return name;
    }
    
    int getage(){
        return age;
    }
    float getheight(){
        return height;
    }

}
