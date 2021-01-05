package Day9;

public class GettersAndSetters {

        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }
//class Main{
//    public static void main(String[] args) {
//        GettersAndSetters gs = new GettersAndSetters();
//        gs.setName("Sidhant");
//        System.out.println(gs.getName());
//    }
//}