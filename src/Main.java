import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] arrayString = new String[] {"a", "b", "c", "d"};
    //    System.out.println(Arrays.toString(reverse(arrayString)));
        System.out.println(Arrays.toString(reverse2(arrayString)));

    //Просто сортировка
    }
    public static String[] reverse ( String[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }
    // Перестановка
    public static String[] reverse2 (String[] array) {
        String[] arrayTmp = new String[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            arrayTmp[i] = array[--j];
        }
        return arrayTmp;
    }
}