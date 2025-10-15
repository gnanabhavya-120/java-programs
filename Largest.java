import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the max:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("the maxium value is:" +max);
        System.out.println(Math.min(10,9));
    }
    
}
