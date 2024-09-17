import java.util.*;

public class swap {
    public static void main(String[] args) {
        int a[]={1,3,5,6,7};
        swap(a,0,1);
        System.out.println(Arrays.toString(a));

    }
    static void swap(int a[],int i,int j){
        int t=a[i];   
        a[i]=a[j];
        a[j]=t;

    }
}