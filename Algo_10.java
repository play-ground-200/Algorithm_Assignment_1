import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            boolean flag = false;
            System.out.print("\nEnter your phone number :");
            char[] number = scanner.nextLine().toCharArray();
           
            if (number.length==11){
                if(number[0]!= '0' || number[3] != '-')flag=true;
                 for(int i = 0; i<number.length;i++){
                    if(i==3)i++;
                    if(!Character.isDigit(number[i]))flag=true;

                }
            }
            else if(number.length==14){

                if(!(number[0]+""+number[1]+""+number[2]+""+number[3]+"").equalsIgnoreCase("+94 ") || !(number[6]+"").equalsIgnoreCase(" "))flag=true;
                for(int i = 4; i<number.length;i++){
                    if(i==6)i++;
                    if(!Character.isDigit(number[i]))flag=true;
                }
            }
            else if (number.length !=14 && number.length !=11 )flag =true;

            String result = (flag)? "Invalid phone number!!": "Number is validated!!"; 
            System.out.println(result);
            

        }while(true);
        
    }
    
}
