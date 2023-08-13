public class Algo_8 {
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        
        String A_B  = "";
        String B_A  = "";
        String delta = "";
        String union = "";
        String Intersection = "";
        System.out.print("Intercextion : ");
       
        
        for(int i  = 0;i<numA.length;i++)
        {
            boolean flag = false;

             for(int j  = 0;j<numB.length;j++)
            {

                if(i==0){union = union + numB[j] + " "; }
                
                if(numA[i]==numB[j]){
                
                    if(flag==false){
                        boolean flag2 = false;
                        for(int k = 0 ;k<i;k++){
                            if(numA[i]==numA[k])flag2 = true;
                            if (k==i-1 && flag2==false){Intersection= Intersection +numA[i] + " ";}

                        }

                        flag = true;
                        

                    }
                }
                if(j==numB.length-1 && flag ==false){
                    union = union + numA[i] +" ";
                    A_B = A_B + numA[i] + " ";
                    delta = delta + numA[i]+" ";
                }

                
            
            }

               
        }
        String[] interarray = Intersection.split(" ");
        
        for(int i =0;i<numB.length;i++)
        {
            boolean flag3 = false;
            for(int j =0;j<interarray.length;j++)
        {
          if((numB[i]+"").equalsIgnoreCase(interarray[j])) flag3 = true;
          if(j==interarray.length-1 && !flag3){
            B_A = B_A + numB[i]+" ";
            delta = delta + numB[i]+ " ";

          }
        }
    System.out.println("\nIntercextion : "+Intersection+"\nUnion : "+union+"\nnumA / numB : "+A_B+"\nnumB / numA : "+B_A+"\nDelta : "+delta+"\n");
    
        }
    }
}
