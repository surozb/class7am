public class shift{
    public static void main (String[] args){
        int a=10,b=20;
        System.out.println("before shifting");
        System.out.println(a);
        System.out.println(b);
        a=a>>>1;
        b=b<<1;
        System.out.println("after shifting");
        System.out.println(a);
        System.out.println(b);
    }
}