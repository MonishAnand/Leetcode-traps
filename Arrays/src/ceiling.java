public class ceiling {
    public static void main(String[] args) {
        int []a ={2,3,5,9,14,16,18};
        int t =15;
        System.out.println(ceil(a,t));
    }
    static int ceil(int a[],int t){
        int s =a[0];
        int e = a.length-1;
        boolean isas = a[s]<a[e];
        while(s<=e){
            int m = s+(e-s)/2;
            if(a[m]==t){
                return a[m];
            }
            if(isas){
                if(t<a[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{
                if(t>a[m]){
                    e=m+1;
                }
                else{
                    s=m-1;
                }
            }
        }
        return a[s];
    }
}
