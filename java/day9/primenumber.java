class primenumber{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int flag = 0;
       if(n%2!=0){ //checking the number is odd or even
        for(int i=2;i<=n/2;i++) 
        {
            if(n%i==0);
            {
                flag=1;
            }
        }
       
        if(flag==0)
        {
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }}

        else{
            System.out.println(n+" is not prime number");
        }
    }
}