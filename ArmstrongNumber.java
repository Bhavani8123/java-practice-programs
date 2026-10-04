public class ArmstrongNumber {
    public static void main(String args[]){
        int num=153;
        int n=num;
        int amstrong=0;
        while(num!=0){
            int digit=num%10;
            amstrong=amstrong+(digit*digit*digit);
            num=num/10;
        }
        if(n==amstrong){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
