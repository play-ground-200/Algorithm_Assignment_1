import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do{
            
            System.out.print("\nEnter a text : ");
            String inputtext = scanner.nextLine();
            if(inputtext.equals("")){
                System.out.println("Text can't be empty!!!!");continue;
            }
            else{
                char[] mychar  = inputtext.toCharArray();
                char  j = ' ';
                for(int i =0;i<mychar.length/2;i++){
                    j = mychar[mychar.length-1-i];
                    mychar[mychar.length-1-i] = mychar[i];
                    mychar[i] = j;
                
                }
                for(int i =0;i<mychar.length;i++){
                    System.out.print(mychar[i]);
                }
            }


        }while(true);
        
    }
    
}
