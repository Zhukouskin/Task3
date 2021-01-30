package Task3.Ex3;

//В массиве из 15 чисел найти наименьший элемент и его индекс в массиве.
public class Main {

    public static void main(String[] args) {
        int[] mass = {11 ,48 ,3 ,-7 ,14 ,33 ,40 ,6 ,-3 ,98 ,5 ,2 ,16 ,61 ,1 };

        int index = 0;
        int mini = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mini > mass[i])
                mini = mass[i];
            if (mass[i] == mini)
                index = i + 1;
        }
        System.out.println("Наименьший элемент = " + mini + " и имеет индекс " + index  );
    }
}
