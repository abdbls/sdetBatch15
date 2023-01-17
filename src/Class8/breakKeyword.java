package Class8;

public class breakKeyword {
    public static void main(String[] args) {
        // Create below program without break keyword before 11:16 boolean summer=true;

        boolean Summer = true;
        int Temp = 75;
        while (Summer) {
            if (Temp <= 100) {
                System.out.println("I love the Summer because the temp is " + Temp);

            } else {
                System.out.println("IT'S too hot! breakKeyword"+Temp);
                Summer = false;
            }
            Temp += 5;


       /* int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("I love summer because Temperature is " + temp);
            } else {
                System.out.println("Its very hot " + temp);
                break;}
                temp += 5;

            }*/

        }
    }
}
