class MainClient{

    public static void main(String[] args) {
        Clients clients = new Clients("neha",21);
        clients.setname("Rohit");
        String name_m = clients.getname();
        int age_m = clients.getage();
        System.out.println("My Name is : "+name_m);
        System.out.println("My Age is : "+age_m);
    }

}