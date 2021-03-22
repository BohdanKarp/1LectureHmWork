import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer numbers[] = new Integer[]{2, -3, 1, 7, -11};
        int sum = 0;
        double average = 0;

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.print("Масив відсортований за спаданням:( ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println(");");
        for (int i : numbers) {
            if (i > 0)
                sum += i;
        }
        System.out.println("Сума всіх додатніх чисел = " + sum + ";");


        for (int i : numbers) {
            average += i;

        }

        System.out.println("Середнє арифметичне всіх чисел масиву= " + average / numbers.length + "; ");
    }
}