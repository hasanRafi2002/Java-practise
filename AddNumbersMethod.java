public class AddNumbersMethod {

    static int AddNumbers(int num1, int num2){
        return num1+num2;
    }


    public static void main(String[] args) {
        int sum = AddNumbers(20,40);
        System.out.println("Sum of two numbers: "+sum);
    }
}
