package conditional_statements;

public class demo {
    public static void main(String[] args) {
        int num =10;
        if (num > 0) {
            System.out.println("the num is postive");
        }
        //if-else
         if (num > 0) {
            System.out.println("the num is postive");
        }
        else{
            System.out.println("the number is negative");
        }
        //vote Eligibility check ->if-else
        int age=19;
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
        //vote eligibilty check ->ternary 
        //variable=condition ? value_if_true:value_if_false;
        String msg = (age >=18) ? "You can vote":"You cannot vote";
        System.out.println(msg);


        //else-if
        int avg_score=45;
        if(avg_score>=90){
            System.out.println("A Grade");
        }else if(avg_score>=75){
            System.out.println("B Grade");
        }else if(avg_score>=60){
            System.out.println("C Grade");
        }else if(avg_score>=50){
            System.out.println("D Grade");
        }else if(avg_score>=35){
            System.out.println("E Grade");
        }else{
            System.out.println("Failed");
        }


        //switch
        int choice=1;
        switch (choice) {
            case 1:
                System.out.println("A Selected");
                break;
            case 2:
                System.out.println("B Selected");
                break;
            case 3:
                System.out.println("C Selected");
                break;
            case 4:
                System.out.println("D Selected");
                break;
            default:
            System.out.println("Invalid choice");
                break;
        }

        //Switch-case---fall trough
        int day=6;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                 System.out.println("Weekday");
                 break;
            case 6:
            case 7:
                  System.out.println("Weekend");
                  break;
        
            default:
                  System.out.println("Invalid Day");
                break;
        }
    }
}
