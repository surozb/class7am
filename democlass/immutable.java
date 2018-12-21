class immutable{
    public static void main(String[] args){
        String S1 = "Hello world";
        String S2 = "Hello world";
        String s = new String ("hello world");
       
        System.out.println(S1==S2); //== checks the refrence point of string
        System.out.println(S1==s);
        System.out.println(S1.equals(S2)); // equals compare the input strings
        System.out.println(S1.equals(s));
    }
}