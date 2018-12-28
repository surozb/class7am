class exam{
    public static void main (String args[]){
        int Per= Integer.parseInt(args[0]);
        if(Per>=80){
            System.out.println("Distinction"+Per+"%");
        }
        else if(Per<80 && Per>=60){
            System.out.println("You scored 1ST division"+Per+"%");
        }
        else if(Per<60 && Per>=50){
            System.out.println("You scored 2ND division"+Per+"%");
        }
        else if(Per<50 && Per>=40){
            System.out.println("You scored 3RD division"+Per+"%");
        }
        else{
            System.out.println("you failed!! TRY AGAIN NEXT TIME");
        }
    }
}