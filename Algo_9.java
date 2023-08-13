import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do{
            System.out.print("\nEnter a word : ");
            String word = scanner.nextLine();
            String[] strarray = word.split(" ");
            if(strarray.length!=1){
                System.out.println("Multiple words are not allowed !!");
                continue;
            }
            else{
                
                char[] arrayword = word.toCharArray();
                for(int i =0;i<arrayword.length/2;i++){
                    if(arrayword[i]!=arrayword[arrayword.length-1-i]){
                        
                        System.out.println("Not a palindrome!");
                        break;
                    }
                    else if(i==(arrayword.length/2)-1)System.out.println("palindrome!!");
        
                } 

            }

        }while(true);
        
    }
    
}
