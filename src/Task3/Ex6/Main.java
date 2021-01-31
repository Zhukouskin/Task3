package Task3.Ex6;
//В массиве из 10 чисел переставить все нули в конец массива, не меняя порядок ненулевых элементов.

public class Main {

    public static void main (String [] args)  {
    int nums [] = {11, 3, 0, 16, 22, 2, 0, 7, 4, 54};

    int a, b, c;
    int size = nums.length;

    System.out.print("Исходный массив : ");
    for (int i = 0; i < size ; i++)
        System.out.print(" " + nums[i]);
    System.out.println();

    for (a = 1; a < size; a++)
        for (b = size - 1; b >= a ; b--) {
            if (nums [b-1] == 0) {
                c = nums [b-1];
                nums[b-1] = nums[b];
                nums[b] = c;
            }
        }
    System.out.print("Отсортированный массив : ");
        for (int i = 0; i < size; i++)
        System.out.print(" " + nums[i]);
    }
}
