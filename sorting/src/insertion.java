import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int a[] = {2, 7, 9, 3, 4, 5};
        insertion(a);
        System.out.println(Arrays.toString(a));  // This will now print the sorted array
    }
    static void insertion(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
                else{
                    break;
                }
            }
        }
    }
}
