import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            
            System.out.print("\nEnter a text : ");
            String inputsen = scanner.nextLine();
            if(inputsen.equals("")){
                System.out.println("Text can't be empty!!!!");continue;
            }
            else{
                char[] mychar  = inputsen.toCharArray();
                int[] spaces = new int[mychar.length-inputsen.replace(" ", "").length()];
                int j = 0;
                if(spaces.length==0){
                    System.out.print(inputsen);continue;
                }
                for(int i =0;i<mychar.length;i++){
                    if(mychar[i] == ' '){
                        spaces[j] = i;
                        j++;
                    }      
                }
                for(int i =0;i<j;i++){

                    if(i==0)System.out.print(inputsen.substring(spaces[j-i-1]+1));
                    if (i==j-1)System.out.print(" "+inputsen.substring(0, spaces[j-i-1]) );
                    else System.out.print(inputsen.substring(spaces[j-i-2], spaces[j-i-1]) );
                }
            }


        }while(true);
        
    }
}
