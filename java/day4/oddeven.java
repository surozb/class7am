class oddeven{
    public static void main(String[] args){
        int ranNumber = Integer.parseInt(args[0]);
        if(ranNumber%2==0){
            System.out.println("You have entered even number"+ ranNumber);
        }
        else{
            System.out.println("You have entered odd number"+ ranNumber);
        }
    }
}