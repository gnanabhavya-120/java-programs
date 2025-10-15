public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b=30;
        //System.out.println(num);here we camt access the values of other method or scope in another block
        {
            a=79;//already intitialised outside the block in the same method hence you cannot use in again
            //if we use it without initialsing again then the original will changed
            System.out.println(a);
            int c=99;//values initialised inside the block remains in block only
        }
        //System.out.println(c);cannot use outside the block
        System.out.println(a);
    }
    static void main(int marks){
        int num=40;
        System.out.println(num);
        System.out.println(marks);
    }
}
