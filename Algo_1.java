
import java.util.Scanner;

public class Algo_1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        do{
            
            System.out.print("Enter a number : ");
            
            long number = scanner.nextInt();
            if(number<=0)
            {
                System.out.println("number cannot be negative!!!!!!");
                continue;
            }
            else{
                System.out.print("fibbonaci frequency upto "+ number + ":- 0");
                long firstnum = 0;
                long secnum = 1;
           


               
                do{
                
                    System.out.print(" " + secnum);
                    long i = firstnum+secnum;
                    firstnum = secnum;
                    secnum = i;
                


                 }while(secnum<=number);


                System.out.println("");
            }

        }while(true);
        
    }
    
}
