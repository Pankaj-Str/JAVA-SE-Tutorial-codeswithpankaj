class multiArrayStr{

    public static void main(String[] args) {
      
        String data[][] = new String[3][3];

        data[0][0] = "JAVA";
        data[1][0] = "JSP";
        data[2][0] = "GO";

        data[0][1] = "JSF";
        data[1][1] = "RUBY";
        data[2][1] = "C";

        data[0][2] = "C++";
        data[1][2] = "PYTHON";
        data[2][2] = "R";

        //System.out.println(data[0][2]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
        
        
    }

}