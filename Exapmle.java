import java.util.Scanner;
public class Exapmle {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the valid fruit");
        String fruit=in.next();
        
        switch (fruit){
            case "Mango":
            System.out.println("King of the fruit");
            break;
            case "Apple":
            System.out.println("sweet fruit");
            break;
            case "orange":
            System.out.println("round fruit");
            break;
            case "grapes":
            System.out.println("small fruit");
            break;// if break is not given it will continue all the below ones
            default:
            System.out.println("please enter a valid fruit");
        }
    
    
    }
    
}
