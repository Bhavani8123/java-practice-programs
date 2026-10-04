public class CheckElements {
    static boolean containsBoth(int[] arr) {

        boolean has12 = false;
        boolean has23 = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 12) {
                has12 = true;
            }

            if (arr[i] == 23) {
                has23 = true;
            }
        }

        return has12 && has23;
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 20, 23, 30};

        if (containsBoth(arr)) {
            System.out.println("Array contains 12 and 23");
        } else {
            System.out.println("Array does not contain both");
        }
    }
}
