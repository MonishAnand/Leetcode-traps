import java.util.Arrays;
import java.util.Scanner;

public class muldiarr {
    public static void main(String[] args) {
        int [][] arr =new int [2][2];
        Scanner c = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr [i] [j]= c.nextInt();
            }
        }
       /* for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(Arrays.toString(arr[i]));
            }
        }*/
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
