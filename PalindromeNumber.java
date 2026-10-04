public class PalindromeNumber {
    public static void main(String args[]){
        int num=121;
        int orginal=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(reverse==orginal){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Palindrome number");
        }
    }
}
