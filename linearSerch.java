public class linearSerch {
    public static int linearSerch1(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // print pattern
    /*
     * 
     * *
     * * *
     * * * *
     */

    public static void printPattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // area of a triangle

    public static float areaOfTriangle(float r) {
        float pi = 3.14f;
        float area = pi * r * r;
        return area;
    }

    // print number in range
    public static void range(int cout, int n) {
        while (cout <= n) {
            System.out.println(cout);
            cout++;

        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 5, 6, 7, 8, 9, 6, 5, 46, 2 };
        int key = 9;
        // System.out.println(linearSerch1(arr, key));
        // printPattern(6);
        float r = 10.0f;
        // System.out.println(areaOfTriangle(r));
        range(1, 100);
    }
}