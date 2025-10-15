import java.util.Arrays;
public class Swap {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=90; //here we are modyfing the array object not the reference variable as both references are 
                    //pointing to the same object so if we chabge the object it will change in bothbreferences and 
                    //strings are not chaged beacause they are immutable for personal reasons
    }

    // static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp; in a primtive types do only pass by value only in this scope of code not in main block
    // }            we cant acces the values in the outside of the method or scope
    
}
