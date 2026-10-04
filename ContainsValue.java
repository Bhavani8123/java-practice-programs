public class ContainsValue {
    static boolean contains(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println(contains(arr, 30));
    }
}
