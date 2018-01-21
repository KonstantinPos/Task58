public class Main {
    public static void main(String[] args) {

        int count = 0;
        int count2 = 0;

        while (count <= fib(15)) {
            count2++;
            count = count + fib(4);
        }
        System.out.println(count2);
    }

    static int fib(int n) {
        int arr[] = new int[n];
        for (int i = 3; i < arr.length; i++) {
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = arr[0] + arr[1];
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];
    }
}
