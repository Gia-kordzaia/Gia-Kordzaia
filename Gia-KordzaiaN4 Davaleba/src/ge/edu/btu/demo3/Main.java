package ge.edu.btu.demo3;

public class Main {
    public static void main(String[] args) {

    }

    static <SP extends Smartphone> void printSmartphone(SP sp) {
        System.out.println(sp);
    }

    static <SB extends Simbian> void printSimbian(SB sb) {
        System.out.println(sb);
    }
}
