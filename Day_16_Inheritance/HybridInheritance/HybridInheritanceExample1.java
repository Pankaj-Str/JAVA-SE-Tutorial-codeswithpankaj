package Day_16_Inheritance.HybridInheritance;

//Animal0
//Swimmer0
//Dog0 
//Fish0

class Animal0{
    void eat() {
        System.out.println("The animal is eating.");
    }
}
interface Swimmer0{
    public void swim();
}
interface Run0{
    public void Runer();
}
class Dog0 extends Animal0 implements Run0{
  void bark() {
        System.out.println("The dog is barking.");
    }

   public void Runer() {
        
   }
}
class Fish0 extends Animal0 implements Swimmer0{
    public void swim(){

    }
}






public class HybridInheritanceExample1 {

    public static void main(String[] arg){

    }
    
}
