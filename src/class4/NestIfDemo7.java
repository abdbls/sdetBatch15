package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard = true;
        int salary = 120000;

        if (studyHard) {
            System.out.println("We Get The Job");

            if (salary > 100000) {

                System.out.println("lets buy tesla");
            } else {
                System.out.println("Buy toyota");
            }
        }else{

            System.out.println("It Might Take Longer for us to get the jobs");
        }
    }
}



