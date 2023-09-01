class MainClientClass{

    public static void main(String[] args) {
        Clients cl = new Clients();
        cl.SetClientName("Mumtaz");
        cl.SetMobile(78945635045l);
        System.out.println(cl.getClientName());
        System.out.println(cl.getMobile());
    }
}