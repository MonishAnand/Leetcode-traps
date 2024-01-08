
import java.util.*;
public class maximum {
    public static void main(String[] args) {
        int []a={3,26,13,47,9};

        System.out.println(max(a));
    }
    static int max(int[] a){
        int ml = a[0];
        for(int i=1;i< a.length;i++){
            if(a[i]>ml){
                ml=a[i];
            }
        }
        return ml;
    }
}
