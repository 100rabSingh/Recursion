package main;

public class Recursion {
    static void countDown(int number){
    if(number <= 0){
        return;
    }
    System.out.println(number);
    --number;
    countDown(number);
    }
    static int sum(int number) {
        return number + sum(--number);
    }

    public static void main(String[] args) {
        countDown(4);
        sum(4);
    }
}
