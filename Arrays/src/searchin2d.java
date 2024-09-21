import java.util.*;
public class searchin2d {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int t =0;
        int ans[]=search(a,t);

        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int a [][],int t){

        for(int i=0;i<a.length;i++){
            for (int j=0;j< a[i].length;j++){
                if(t==a[i][j]){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
