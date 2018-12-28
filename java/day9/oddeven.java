import java.util.Scanner;
class oddeven{
    public static void main(String[] args){
        Scanner oe = new Scanner(System.in);
        System.out.println("Enter your desire number:");
        int input = oe.nextInt();
        System.out.println("Do you want to know odd or even about this number"+input);
        String chose = oe.next();
        //while(chose.equals("yes"))
        while(chose.toLowerCase().equals("yes"))
        {
           /* if(input%2==0){
            System.out.println(input+"even");
            }
            else{
                System.out.println(input+"odd");
            }*/
            System.out.println(input%2==0?input+"even":input+"odd");
            System.out.println("Do you want to check again?");
            chose=oe.next();
            System.out.println("Enter your desire number:");
            input =oe.nextInt();
            
            }
    }
}