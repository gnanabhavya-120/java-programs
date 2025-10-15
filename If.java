import java.util.Scanner;
public class If{
    public static void main(String[] args) {
        System.out.print("Enter the salary:");
        Scanner a=new Scanner(System.in);
        int salary=a.nextInt();
        if(salary>10000){
            salary=salary+2000;
        }
        else{
            salary+=3000;
        }
        System.out.println(salary);
    }
}