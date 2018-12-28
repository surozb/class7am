class fourdigit{
    public static void main(String args[]){
        int a = 110;
       /* String b = String.valueOf(a);
        if(b.length()<4){
            System.out.println("you must enter 4 digit number");
        }
        else
        {
            System.out.println("you enterd 4 digit number");
        }*/
        if(String.valueOf(a).length()<4)
        {
            System.out.println("Enter 4 didgit number");

        }
        else{
            System.out.println("processing the entered number");
        }
    }
}