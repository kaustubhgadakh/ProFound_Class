public class numbercount {
    
    public static void main(String[] args) {
        
        int num = 1114582222;

        int count = 0;

        while (num > 0) {
            
            int rem = num % 10;

            if (rem == 2) {
                count++;
            }

            num = num /10;

        }

        System.out.println(count);
    }
}   
