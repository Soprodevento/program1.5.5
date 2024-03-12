public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17, 22};
        int[] centralPart = getArrayMiddle(numbers);

        System.out.print("[");
        for (int i = 0; i < centralPart.length; i++) {
            System.out.print(centralPart[i]);
            if (i < centralPart.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length <= 2) {
            return numbers;
        }

        int[] arr = new int[numbers.length % 2 == 0 ? 2 : 1];

        if (numbers.length % 2 == 0) {
            arr[0] = numbers[numbers.length / 2 - 1];
            arr[1] = numbers[numbers.length / 2];
        } else {
            arr[0] = numbers[numbers.length / 2];
        }

        return arr;
    }
}
