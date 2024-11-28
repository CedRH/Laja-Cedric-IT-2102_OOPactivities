public class MultiplicationTable {
    public static void main(String[] args) {
        int maxNumber = 10; 

        
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 0; j <= maxNumber; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println(); 
        }
    }
}
