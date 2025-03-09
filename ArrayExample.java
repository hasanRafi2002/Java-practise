public class ArrayExample {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("First element: "+numbers[0]);
        System.out.println("Second element: "+numbers[1]);
    
        numbers[2] = 100;
        System.out.println("updated Third element: "+ numbers[2]);


        for (int i=0; i<numbers.length; i++){
            System.out.println("Element at index "+i+" is: "+numbers[i]);

        }
    
    }
}
