package Task3.Ex2;

import java.awt.desktop.SystemSleepEvent;

//Создайте массив с 10-ю переменными типа int.
// Используя оператор "for" найдите и выведите на экран наименьшее и наибольшее значение в массиве.
//min value =  "значение которое у вас получилось".
//max value =  "значение которое у вас получилось".
public class Main {

    public static void main(String[] args) {
        int[] mass = { 22, 17, 13, 4, 8, 42, 1, 11, 14, 5};

//    	for (int i = 0; i < 10; i++)
//			System.out.println(mass[i]);

        int minval = mass [0];

        for (int z = 0; z < mass.length; z++){
            if (minval > mass[z])
                minval = mass[z];
        }
        System.out.println("min value = " + minval );

        int maxval = mass [0];

        for (int z = 0; z < mass.length; z++) {
            if (maxval < mass[z])
                maxval = mass[z];
        }
        System.out.println("max value = " + maxval );
    }
}

