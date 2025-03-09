public class OverLoadingMethod {


    static int multiply(int num1, int num2){
        return num1*num2;
    }

    static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        System.out.println("Multiplication oof two integer is: "+ multiply(30,40));
        System.out.println("Multiplication of two double is: "+ multiply(5.8,70.4));
    }
}
