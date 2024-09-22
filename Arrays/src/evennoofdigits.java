public class evennoofdigits {
    public static void main(String[] args) {
        int a[]={23,45,678,90};
        System.out.println(noevdi(a));
    }
    static int noevdi(int a[]){
        int count =0;
        for(int i=0;i<a.length;i++){

            if(even(a[i])==true){
                count++;
            }
        }
        return count;
    }
    static  boolean even(int i){
        int eve= digits(i);
        return eve % 2 ==0;

    }
    static int digits(int n){
        int count =0;
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;
        }
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
