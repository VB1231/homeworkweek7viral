import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        //System.out.println("Addition of arrays:"+ Arrays.toString(a));
        int total = 0;
        for(int i =0;i<a.length;i++){
            total=total+a[i];
        }
        System.out.println("Total of Array numbers:"+total);
    }

}
