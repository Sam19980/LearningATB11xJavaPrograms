package ex_04_TypeCasting;

public class Lab_038_TypeCasting0 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; // valid syntax smaller data into bigger data type implicit widening

        byte x = 20;
        int c = (int)x;// explicit widening not required as we are trying to change the values from bigger to smaller data types




        System.out.println(c);
    }
}
