import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
    //  int ans = sum2(); 
    //  System.out.println(ans);  
    int ans=sum3(10,20);
    System.err.println(ans);
    }
     static int sum3(int a,int b){
        int sum=a+b;
        return sum;
     }

     static void sum(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the num1:");
        int num1=in.nextInt();
        System.out.print("Enter the num2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is:"+ sum);
    }
    static int sum2(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the num1:");
        int num1=in.nextInt();
        System.out.print("Enter the num2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }

    
}
