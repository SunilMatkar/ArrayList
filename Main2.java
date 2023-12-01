public class Main2 {

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void randomNum(int arr[]) {
        int n = arr.length;
        int random = Math.floorDiv(0, 9);
        for (int i = 0; i < n; i++) {
            if (arr[i] == random) {
                System.out.println(arr[i]);
            }

        }M

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int n = arr.length;
        printArr(arr);
        randomNum(arr);
    }
}
