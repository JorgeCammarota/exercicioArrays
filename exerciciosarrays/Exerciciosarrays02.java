package exerciciosarrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Exerciciosarrays02 {
            public static void main (String[]args)
        {
            List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Brown", "Purple"));
            String color = "Yellow";

            colors.add(0, color);
            System.out.println(colors);
        }
    }