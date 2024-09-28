import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int a[]={5,7,3,2,4,1};
        bubble(a);
        System.out.println(Arrays.toString(a));


    }
    static void bubble(int a []){
        boolean swapped;
        for(int i=0;i<a.length;i++){
            swapped=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}