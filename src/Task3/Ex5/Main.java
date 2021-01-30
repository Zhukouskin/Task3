package Task3.Ex5;

//В массиве из 10 чисел вычислить произведение элементов массива до первого нуля.
public class Main {

    public static void main(String[] args) {

        int nums [] = new int[10];
        int a = 1 ;

        for (int i = 0 ; i < 10 ; i++) {
            nums [i] = (int) (Math.random() * 20 - 10);
        }

        for (int i = 0; i < 10 ; i++) {
            if (nums[i] == 0)
                break;
            a *= nums[i];
        }

        System.out.println("Произведение элементов массива до первого нуля равно " + a);
    }
}

