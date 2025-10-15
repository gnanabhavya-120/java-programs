public class Methodoverloading {
    //when two or more functions having same method name and having the differnt arguments it will execute and called is called methodoverloading
    //and at compile time it will decide which function to run in overloading
    //or if have different number in passing the same type of arguments also it will also execute
    public static void main(String[] args){
         fun(67);
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
    
}
