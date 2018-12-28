import java.util.Scanner;
class nameprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id:");
        int id = sc.nextInt();
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        System.out.println("Enter the adderss:");
        String location = sc.nextLine();
        System.out.println(name);
        System.out.println(location);
    }
}