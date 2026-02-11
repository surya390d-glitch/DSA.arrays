import java.util.Scanner;
public class ArmPrime {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);

        System.out.println("Option 1 : Armstrong.");
        System.out.println("Option 2 : prime.");
        System.out.print("Enter Your Option: ");
        int Switch = in.nextInt();
        System.out.print("Enter the number: ");
        int num = in.nextInt();
//-----------------------------------------------------------------------------------------
        switch(Switch){
            case 1:
                boolean ans1 = arms(num);
                System.out.println(num +" is arms: "+ ans1);
                break;
            case 2:
                boolean ans2 = prime(num);
                System.out.println("prime: "+ ans2);
                break;
            default:
                System.out.println("invalid function.");
        }
//-----------------------------------------------------------------------------------------
//        boolean ans1 = arms(num);
//        System.out.println(num +" is arms: "+ ans1);
//-----------------------------------------------------------------------------------------
//        boolean ans2 = prime(num);
//        System.out.println("prime: "+ ans2);
//-----------------------------------------------------------------------------------------
//        for(int i = 0; i < 1000; i++){
//            if(arms(i)){
//                System.out.print(i+" ");
//            }
//        }

//---------------------------------------------------------------------------------------------

//        for(int i = 100; i < 200; i++){
//            if(prime(i)){
//                System.out.print(i+" ");
//            }
//        }
    }
//-----------------------------------------------------------------------------------------
    static boolean arms(int num){
        int org = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while(num > 0){
            int rem = num % 10;
            sum += (int)Math.pow(rem,digit);
            num /= 10;
        }
        return org == sum;
    }
//---------------------------------------------------------------------------------------------
    static boolean prime(int num) {
        if (num < 2) {
            return false;
        }
        int c = 2;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }
//-------------------------------------------------------------------------------------------------
}
