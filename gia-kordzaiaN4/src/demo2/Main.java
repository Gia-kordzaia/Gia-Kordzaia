package demo2;

public class Main {
    public static void main(String[] args) {
        sumable sum = (int x, int y) -> x + y;
        System.out.println(sum.sum(5, 8));
    }
}