import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int a[]={1,3,5,6,7};
        rev(a);
        System.out.println(Arrays.toString(a));

    }
    static void rev(int a []){
        int start=0;
        int end = a.length-1;
        if(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;

    }
}
