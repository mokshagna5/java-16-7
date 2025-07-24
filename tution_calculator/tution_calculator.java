package tution_calculator;

public class tution_calculator {
    public static void main(String[] args) {
        int Student_grade_Level = 11;
        double base_tuition_Fee = 100000.0;
        boolean Academic_Topper_status = true;

        double discountPercentage = 0.0;

        if (Student_grade_Level >= 9 && Student_grade_Level <= 12) {
            if (Academic_Topper_status) {
                discountPercentage = 20.0;
            } else {
                discountPercentage = 10.0;
            }
        } else if (Student_grade_Level >= 6 && Student_grade_Level <= 8) {
            discountPercentage = 5.0;
        } else {
            discountPercentage = 0.0;
        }

        if (Student_grade_Level == 10) {
            discountPercentage += 3.0;
        } else if (Student_grade_Level == 12) {
            discountPercentage += 5.0;
        }

        
        double finalFee = base_tuition_Fee - (base_tuition_Fee * discountPercentage / 100);

       
        System.out.println("Grade Level: " + Student_grade_Level);
        System.out.println("Base Tuition Fee: $" + base_tuition_Fee);
        System.out.println("Is Academic Topper: " + Academic_Topper_status);
        System.out.println("Total Discount: " + discountPercentage + "%");
        System.out.println("Final Tuition Fee: $" + finalFee);
    }
}
