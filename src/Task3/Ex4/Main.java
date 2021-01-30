package Task3.Ex4;

//В массиве из 10 чисел подсчитать количество отрицательных элементов массива.
public class Main {

    public static void main(String[] args) {
        int nums [] = {-14, 22, 12, 7, -4, -5, 11, 3, 99};

        int count = 0;
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] < 0 ) count++;
        }
        System.out.println("Количество отрицательных элементов равно " + count);
    }
}