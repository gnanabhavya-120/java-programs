import java.util.Scanner;
public class Caluculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        //Take input from the user
        while(true){
            //take the operator
            System.out.print("Enter the operator");
            char op=in.next().trim().charAt(0);
            if(op=='*' ||op=='-' ||op=='+'||op=='%'||op=='/'){
                 System.out.print("Enter the two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                
            }   
          System.out.println(ans);
        }
       
    }
}
    

