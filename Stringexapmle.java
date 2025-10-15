public class Stringexapmle {
    public static void main(String[] args) {
        // String ans=greet();
        // System.out.println(ans);
        String mine=mygreet("Bhavya");
        System.out.println(mine);
        
    }
    static String mygreet(String name){
        String message="Hello" + " " +name;
        return message;

    }
    static String greet(){
        String greeting="how are you";
        return greeting;
    }
    
}
