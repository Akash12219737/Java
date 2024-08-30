public class Get_and_set {
    static class Employee{ 
        private int id;
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
        public int getId(){
            return id;
        }
        public void setId(int i){
            id = i;
        }
        
    }
    public static void main(String[] args) {
     
        Employee akash = new Employee();
        akash.getName();
        System.out.println(akash.getName());
        akash.setName("akash is a worrior");
        System.out.println(akash.getName());
    }




}
