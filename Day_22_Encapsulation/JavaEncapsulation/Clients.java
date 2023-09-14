class Clients{

        String name;
        int age;
        Clients(String name, int age){
            this.name = name;
            this.age = age;
        }   

        void setname(String name){
            this.name = name;
        }
        void setage(int age){
            this.age = age;
        }

        String getname(){
            return name;
        }

        int getage(){
            return age;
        }

}