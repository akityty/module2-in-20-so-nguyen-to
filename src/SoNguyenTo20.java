public class SoNguyenTo20 {
    public static boolean isPrime(int  number){
        boolean check = false;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number%i==0){
                check = true;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int loop = 0;
        for (int i = 2; i<1000;i++) {
            boolean check = isPrime(i);
            if (!check && loop < 20) {
                System.out.println(i);
                loop++;
            }
        }
    }
}
