public class Main {
    public static void main(String[] args) {
        System.out.print("[");
        int[] numbers = {1,2,3,6};
        int[] centralPart = getArrayMiddle(numbers);
        for (int num:centralPart){
            System.out.print(num);
        }
        System.out.print("]");


    }
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length <= 2)
            return numbers;
        if (numbers.length % 2 == 0) {
            int[] arr = new int[2];
            arr[0] = numbers[numbers.length / 2 - 1];
            arr[1] = numbers[numbers.length / 2];
            return arr;
        } else {
            int[] arr = new int[1];
            arr[0] = numbers[numbers.length / 2];
            return arr;
        }
    }
}