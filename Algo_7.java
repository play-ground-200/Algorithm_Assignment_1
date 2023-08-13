import java.util.Scanner;

public class Algo_7 {    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            
            System.out.print("\nEnter a text : ");
            String[] inputsen = scanner.nextLine().split(" ");
            if(inputsen.length==0){
                System.out.println("Text can't be empty!!!!");continue;
            }
            else{
                String smallest = inputsen[0];
                String largest = inputsen[0];
        
                for(int i =0;i<inputsen.length;i++)
                {
                    smallest = (inputsen[i].length()< smallest.length())? inputsen[i]: smallest;
                    largest = (inputsen[i].length()>largest.length())? inputsen[i]: largest;
        
                }
                System.out.printf("Smallest number : %s\nLargest number : %s\n",smallest,largest);
            }


        }while(true);
        
    }
}
