public class linsearchstr {
    public static void main(String[] args) {
        String s = "lol";
        char target = 'l';

        System.out.println(search(s,target));
    }
    static boolean search(String s,char target){
        if(s.length()==0){
            return false;
        }
        /*for(int i =0;i<s.length();i++){
            if(target==s.charAt(i)){
                return true;
            }
        }*/
        for(char ele :s.toCharArray()){
            if(ele==target){
                return true;
            }
        }
        return false;
    }
}
