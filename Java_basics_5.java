public class Java_basics_5 {
    int n=100; //Global Variable
    void display(){
        int n=10;   ///Local Varible
        System.out.println(n);
        System.out.println(this.n);
    }
    public static void main(String args[]){
        Java_basics_5 obj=new Java_basics_5();
        obj.display();
    }
}
