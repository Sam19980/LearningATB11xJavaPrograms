package ex_05_TernaryOpreator;

public class THREE_MAX {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
// Nested Ternary opreator
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3)? n2 : n3);
        System.out.println(max);
    }
}
