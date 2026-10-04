public class RemoveElement {
    static int[] remove(int[] arr, int value) {

        int index = -1;

        // Find the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] result = remove(arr, 30);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
