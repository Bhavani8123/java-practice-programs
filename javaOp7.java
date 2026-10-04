public class javaOp7{
    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (b > a) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
