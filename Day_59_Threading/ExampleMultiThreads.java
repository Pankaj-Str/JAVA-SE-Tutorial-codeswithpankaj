class thread1 extends Thread{

    public void run(){

        try{
            for (int i = 0; i <= 10; i++) {
            
                System.out.println("Welcome to Thread 1 --- No. "+i);
                Thread.sleep(1000);
    
            }
        }catch(Exception e){
            System.err.println(e);
        }

    }

}

class thread2 extends Thread{

    public void run(){

        try{
            for (int i = 0; i <= 10; i++) {
            
                System.out.println("Welcome to Thread 2 ****** No. "+i);
                Thread.sleep(1000);
    
            }
        }catch(Exception e){
            System.err.println(e);
        }

    }

}


public class ExampleMultiThreads {
    public static void main(String[] args) {

        //Thread th = new Thread();
        //th.start();
        
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th1.start();
        th2.start();
    }
}
