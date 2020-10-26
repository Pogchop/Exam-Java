package Exam;

public class tesbank {
    public static void main(String[] args){
        Bank b1 = new Bank(1000, 10);
        System.out.println(b1);
        System.out.println("Balance: " + b1.getBalance());
        System.out.println("Rate: " + b1.getRate());
        System.out.println("Interest: " + b1.caculateInterest());
    }
}
