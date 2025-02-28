class Marks{

    public int getmarks(int hindi, int english, int maths , int science){
        
       int total = hindi + english + maths + science;
            System.out.println("marks in hindi: "+hindi);
            System.out.println("marks in english: "+english);
            System.out.println("marks in maths: "+maths);
            System.out.println("marks in science: "+science);
            System.out.println("Total marks: "+total);
        return total;

    }

}

class Percentage extends Marks{

        int total = getmarks(90, 80, 70, 60);

   public float getPercentage(){
        
        
        float percentage = (total/400.0f)*100;
        System.out.println("Percentage: "+percentage);
        return percentage;

    }

}

class Result extends Percentage{

    float percentage;

    public Result() {
        percentage = getPercentage();

        if(percentage > 80 && percentage <= 100){
            System.out.println("Grade A");
        }
        else if(percentage > 60 && percentage <= 80){
            System.out.println("Grade B");
        }
        else if(percentage > 40 && percentage <= 60){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }

}

public class InheritanceExample {

    public static void main(String[] args) {
        
        Result r = new Result();
        r.getPercentage();

    }
    
}