public class NewArrayWithoutDuplicates {

    static int[] removeDuplicates(int[] arr) {

        int count = 0;

        // Find number of unique elements
        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                count++;
            }
        }

        int[] newArr = new int[count];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int[] result = removeDuplicates(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
