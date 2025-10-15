import java.util.Arrays;
public class Varargs {//vararguments means not knowing how many of inputs we are giving as the input length is not comsatnt
    public static void main(String[] args) {
        //fun(2,4,5,6,6,7,8,9);
        multiple(2,3,"bhavya","poojitha");
        fun(2,3,4,5);
    }
    static void multiple(int a ,int b, String...v){
            System.out.println(Arrays.toString(v));
    }
    static void fun(int...v){ //it will take array of integers ir array of the strings
       System.out.println(Arrays.toString(v));
    }
}
