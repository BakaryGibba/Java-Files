public class Reverse_num {
    public static void main(String[] args) {
        //int num= 76459; The reverse can be apply to any oof the intialisation and beyond
        //int num= 98746028;
        int num= 398539981;
        int ans= 0;
        //int rem; You can intialise the remender here if you wish
        while(num > 0){
            int rem= num % 10;
            num/= 10;
            ans= ans * 10 + rem;
        }
        System.out.print(ans);
    }
}
