import java.util.ArrayList;
import java.util.Scanner;

public class muldarrlist {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i =0;i<3;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                l.get(i).add(c.nextInt());
            }
        }
        System.out.println(l);
    }
}
