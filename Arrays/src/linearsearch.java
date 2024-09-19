public class linearsearch {
    public static void main(String[] args) {
        int a []={2,3,5,7,10 };
        int target = 10;
        System.out.println(ls(a,target));
    }
    static int ls(int a[],int t){
        if(a.length==0){
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                return a[i];
            }
        }
        return -1;
    }
}
