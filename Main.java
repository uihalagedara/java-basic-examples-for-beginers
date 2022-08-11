public class Main {
    public static void main(String[] args) {

        boolean result = true;
        int age = 24;
        String x = "sample string \n";
        String Name;
        String gender="male";
        

        Vehicle v = new Vehicle();
        v.greet("Sample name");
        System.out.println(v.sum(5, 2));

        System.out.print(x);
        System.out.println("Sample text");

        x="Example \n";
        System.out.print(x);

        if((age == 24) || (gender=="female")){
            System.out.println(" 24");
        }else{
            System.out.println("greater than 24");
        }
    }
}