public class Main3 {

    public static void randomNum(int arr[]) {
        int random = Math.floorDiv(0, 8);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == random) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        randomNum(arr);
    }
}
