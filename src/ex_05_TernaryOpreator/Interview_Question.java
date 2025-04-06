package ex_05_TernaryOpreator;

public class Interview_Question {

    public static void main(String[] args) {
        // Nested Ternary
        // result = condition ? expression 1 :(condition2 ? expression2 : expression 3)
        int number = 25;
        String result = (number > 20) ? (number > 20 ? "N>20" : "N<=20") : "B";

        System.out.println(result);
    }

}
