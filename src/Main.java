import java.util.*;

import static java.lang.Math.random;

public class Main {
    private static Map<String, List<Integer>> task=new HashMap<>();
    private static Random random=new Random();
    public static void main(String[] args) {


        task.put("string1", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string2", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string3", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string4", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string5", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));

        System.out.println(task);

//        Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение,
//        а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
//        Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
//        а число — сумма чисел списка. Выведите результат в консоль.
//        Пример:
//        "string1" —> [1, 6, 12]
//        "string2" —> [200, 150, 350]
//        Новая коллекция станет:
//        "string1" —> 19
//        "string2" —> 700

    }
}