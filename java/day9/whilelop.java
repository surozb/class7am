import java.util.Scanner;
public class whilelop{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number:");
     int input = sc.nextInt();
     while(input==0)
     {
         System.out.println("Hello world");
         System.out.println("Do you want to repeat?");
         input = sc.nextInt();
     }   
        
    }
}