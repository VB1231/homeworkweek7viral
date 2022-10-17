import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySpecialValue1 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArray = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));

        System.out.println(intList.contains(12));
        System.out.println(nameList.contains("John"));




            }
}
