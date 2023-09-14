class Students{
    String Name;
    void GetInfo(String Name){
        this.Name = Name;
        System.out.println("My Name is : "+Name);
    }

    void GetBooks(String Book){
        System.out.println("The Books Name is : "+Book);
        System.out.println("Student Name : "+Name);
    }

    public static void main(String[] args) {
        Students st = new Students();

        st.GetInfo("Neha");
        st.GetBooks("JAVA SE");
    }

}

