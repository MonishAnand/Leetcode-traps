import java.util.ArrayList;
import java.util.Scanner;

public class arrlist {
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<>(10);
        /*l.add(10);

        System.out.println(l.contains(10));
        l.set(0,99);
        System.out.println(l);
        l.add(80);
        l.remove(1);
        System.out.println(l);*/
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++){
            l.add(in.nextInt());
            System.out.println(l.get(i));

        }
        System.out.println(l);
    }
}
