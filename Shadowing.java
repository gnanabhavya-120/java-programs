public class Shadowing {
    static int x=90;//this will be shadowdded at line 8 instance variable
    public static void main(String[] args){
        System.out.println(x);
        int x; //inner variable
       // System.out.println(x); it cant give result because it should be intialised first
         x=40;//the class varaiable at line 4 is shadowed by the 
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }

    
}
