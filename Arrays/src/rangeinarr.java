public class rangeinarr {
    public static void main(String[] args) {
        int a[]={0,4,5,8,9};
        int st=2;
        int end=4;
        int t=8;
        System.out.println(range(a,st,end,t));
    }
    static int range(int a[],int st,int end,int t){
        if(a.length==0){
            return -1;
        }
        for(int i=st;i<end;i++){
            if(t == a[i]){
                return i;
            }
        }
        return -1;
    }
}
