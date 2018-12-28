public class swapvalue{
    public static void main(String args[]){
        int a=50;
        int b=60;
        System.out.println("before swpaing");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("after swpaing");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}