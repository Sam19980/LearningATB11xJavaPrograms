package ex_03_Literals;
//4, 5, 7, 11, 9, 13, 8, 12} is an array and 20
public class Practice {
    public static void main(String[] args) {
        System.out.println("Wipro Interview");
        printName();
        printName("Roopesh");
        int[] input={4, 5, 7, 11, 9, 13, 8, 12};
        int targetSum=20;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(targetSum==input[i]+input[j]){
                    System.out.println("The pair is: "+input[i]+", "+input[j]);
                }
            }
        }
    }

    static void printName(){
        System.out.println("Sarthak");
    }

    static void printName(String name){
        System.out.println(name);
    }
}
