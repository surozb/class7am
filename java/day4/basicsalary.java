class basicsalary{
    public static void main(String args[]){
        
        double mySalary = Double.parseDouble(args[0]);
        int myAge = Integer.parseInt(args[1]);
        if(myAge<=25){
           mySalary = mySalary-0.10*mySalary;
            System.out.println("Your salary="+mySalary);
        }
        
        else if(myAge>25 && myAge<=30)//elseif statemenT
        {
            mySalary = mySalary-0.5*mySalary;
            System.out.println("Your salary="+mySalary);
        }
        else{
           mySalary = mySalary-0.25*mySalary;
            System.out.println("Your salary="+mySalary);
        }
    }
}