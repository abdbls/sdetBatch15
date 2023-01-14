package class4;

public class IfDemo {
    public static void main(String[] args) {
        int money=15000;

        if (money>1000)
        {
            System.out.println("Let's also buy an iPhone");
            if (money>2000){
                System.out.println("Let's also buy a MacBook");
            }
            boolean mothersDay=true;
            if (mothersDay){
                System.out.println("Happy Mothers Day");
                String name="Sardar";
                if (name=="Sardar"){
                    System.out.println("I Love Football");
                }

            }

        }

    }
}
