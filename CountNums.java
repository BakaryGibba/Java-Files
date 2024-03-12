public class CountNums {
    public static void main(String[] args) {
        int n= 455536;
        int count= 0;
        int rem;
        while (n > 0){
            rem= n % 10;
            if (rem== 5){
                count++;
            }
            n/= 10; //it's the same as the one below
           // n= n/10;
        }
        System.out.print(count);
    }
}
