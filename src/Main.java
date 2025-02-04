import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [] arrayString = new String[] {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(sortRevers(arrayString)));

    }
    public static String[] sortRevers ( String[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }
}