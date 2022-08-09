public class Exception {

    static void vote(){
        int age = 18;

        if(age>15){
            throw new ArithmeticException("You are not allowed to vote");
        }else{
            System.out.println("You are allowed to vote");
        }

    }
    public static void main(String[] args) {
        
        try{
            vote();
        }catch(ArithmeticException e){
            System.out.println("You are not allowed to vote");
        }
        
    }
    
}
