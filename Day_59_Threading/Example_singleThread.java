class Example_singleThread implements Runnable{


    public void run(){

        try{
            for (int i = 0; i <= 10; i++) {
            
                System.out.println("Welcome to Thread 1 --- No. "+i);
                Thread.sleep(2000);
    
            }
        }catch(Exception e){
            System.err.println(e);
        }

    }


    public static void main(String[] args) {
        
        Example_singleThread est = new Example_singleThread();
        est.run();


    }


}