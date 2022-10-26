import java.security.KeyStore;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Main {
    private static Map<String, List<Integer>> task=new HashMap<>();
    private static Map<String, Integer> task1=new HashMap<>();

    private static Random random=new Random();
    private static String summa;

    public static void main(String[] args) {
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

        task.put("string1", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string2", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string3", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string4", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        task.put("string5", Arrays.asList(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));

        printOldtMap(task);
        transformate(task);
        printNewtMap(task1);



    }

    private static void transformate(Map <String,List<Integer>> map) {
        List<Integer> list;

        for(Map.Entry<String,List<Integer>> entry: map.entrySet()) {
            int s=0;
            String key = entry.getKey();
            // get value
            list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                s=s+list.get(i);

            }

            task1.put(key+"—>", s);
        }

    }

    private static void printNewtMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.println(String.format(pair.getKey()+pair.getValue()));
        }

    }
    private static void printOldtMap(Map<String, List<Integer>> map) {
        for (Map.Entry<String, List<Integer>> pair: map.entrySet()) {
            System.out.println(String.format(pair.getKey()+"->"+pair.getValue()));
        }

    }
    }

