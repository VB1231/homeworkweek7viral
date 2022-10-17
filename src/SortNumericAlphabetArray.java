import java.lang.reflect.Array;
import java.util.Arrays;

public class SortNumericAlphabetArray {
    public static void main(String[] args) {
        int num[]={10,20,50,40,60};
        String s[]={"Apple","Yankee","Zoo","Mango","Tree"};
        System.out.println("Print String array to sort:"+ Arrays.toString(s));
        System.out.println("Print Number array to sort:"+Arrays.toString(num));
        Arrays.sort(num);
        Arrays.sort(s);
        System.out.println("Sorted String :"+Arrays.toString(s));
        System.out.println("Sorted Numbers:"+Arrays.toString(num));
    }
}
