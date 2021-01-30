package Task3.Ex1;

public class Main {

    public static void main(String[] args) {

        float[] numbers = new float[10];

        int n = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = n;
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            }
            else {
                System.out.print(numbers[i] + " | ");
                n+=2;
            }
        }
        float sum = 0;
        for (float num : numbers) {
            sum = sum + num;
        }
        System.out.print("average value = " + sum);
    }
}

