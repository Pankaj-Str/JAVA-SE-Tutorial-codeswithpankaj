package Day_09;

public class LoopUsingBreak {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            
            if(i < 5){
                System.out.println("Done ... "+i);
                continue;
            }else{
                System.out.println("************ "+i);
            }

        }

    }

}
