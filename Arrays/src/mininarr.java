public class mininarr {
    public static void main(String[] args) {
        int a[]={0,9,8,5,3,2};
        System.out.println(min(a));
    }
    static  int min(int a[]){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<m){
                m=a[i];
            }
        }
        return m;
    }
}
