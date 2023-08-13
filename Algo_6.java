import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            
            System.out.print("\nEnter a text : ");
            String[] inputsen = scanner.nextLine().split(" ");
            if(inputsen.length==0){
                System.out.println("Text can't be empty!!!!");continue;
            }
            else{
                String j = "";
                for(int i =0;i<inputsen.length/2;i++){
                    j = inputsen[inputsen.length-1-i];
                    inputsen[inputsen.length-1-i] = inputsen[i];
                    inputsen[i] = j;
        
                }
                for(int i =0;i<inputsen.length;i++)
                {
                    System.out.print(inputsen[i] + " ");
                }
            }


        }while(true);
        
    }
}
