class buyliquor{
    public static void main(String[] args){
        int age = 18;
        String gender ="male";
        if (age==18 || gender.equals("male")){
            System.out.println("You are allowed to drink");
        }
        else {
            System.out.println("You need to be 18+");
        }
    }
}