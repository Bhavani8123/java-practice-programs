public class EvenOddSwitch {
    public static void main(String[] args) {

        int number = 15;

        switch (number % 2) {
            case 0:
                System.out.println("Even Number");
                break;
            case 1:
                System.out.println("Odd Number");
                break;
        }
    }

}
