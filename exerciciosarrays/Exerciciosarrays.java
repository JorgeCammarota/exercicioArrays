//exercicio 01
package exerciciosarrays;
import java.util.Arrays;
public class Exerciciosarrays {

        public static String[] removeElement(String[] arr, String item) {
            return Arrays.stream(arr)
                    .filter(s -> !s.equals(item))
                    .toArray(String[]::new);
        }

        public static void main(String[] args) {

            String[] arr = {"A", "C", "B", "C", "D"};
            String item = "C";

            arr = removeElement(arr, item);
            System.out.println(Arrays.toString(arr));
        }
    }


