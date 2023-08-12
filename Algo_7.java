import java.util.Scanner;

public class Algo_7 {    
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
                String largest = inputsen.substring(0, spaces[0]-1);
                String smallest = inputsen.substring(0, spaces[0]-1);
                for(int i =1;i<j-1;i++){

                    if(i==j-2){
                    largest = (largest.length()<(inputsen.substring(spaces[i]+1)).length())? (inputsen.substring(spaces[i]+1)): largest;
                    smallest = (smallest.length()>(inputsen.substring(spaces[i]+1)).length())? (inputsen.substring(spaces[i]+1)): smallest;
                    }
                    else{
                    largest = (largest.length()<(inputsen.substring(spaces[i-1]+1, spaces[i]-1)).length())? (inputsen.substring(spaces[i-1]+1, spaces[i])): largest;
                    smallest = (smallest.length()>(inputsen.substring(spaces[i-1]+1, spaces[i]-1)).length())? (inputsen.substring(spaces[i-1]+1, spaces[i])): smallest;
                    }
                   //if(i==0)System.out.print(inputsen.substring(spaces[j-i-1]+1));
                   // if (i==j-1)System.out.print(" "+inputsen.substring(0, spaces[j-i-1]) );
                    //else System.out.print(inputsen.substring(spaces[j-i-2], spaces[j-i-1]) );
                }
                System.out.println("Smallest word : "+ smallest);
                System.out.println("largest word : "+ largest);
            }


        }while(true);
        
    }
}
