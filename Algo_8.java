public class Algo_8 {
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        
        String AdB  = "";
        String BdA  = "";
        String delta = "";
        String union = "";
        System.out.print("Intercextion : ");
       
        
        for(int i  = 0;i<numA.length;i++)
        {
            boolean flag = false;

             for(int j  = 0;j<numB.length;j++)
            {
                if(i==0){union = union + numB[j] + " "; }
                
                if(j==i){
                    int myint = (numA[i]*100/numB[i]);
                    AdB = AdB +(double) myint/100 + " ";
                     myint = (numB[i]*100/numA[i]);
                    BdA = BdA +(double) myint/100 + " ";
                    delta = delta + (numA[i] - numB[i]) + " ";

                }
                if(numA[i]==numB[j]){
                
                    if(flag==false){
                        boolean flag2 = false;
                        for(int k = 0 ;k<i;k++){
                            if(numA[i]==numA[k])flag2 = true;
                            if (k==i-1 && flag2==false){System.out.print(numA[i] + " ");}

                        }

                        flag = true;
                        

                    }
                }
                if(j==numB.length-1 && flag ==false){
                    union = union + numA[i] +" ";
                    
                }
                
            
            }
               
    }
    System.out.println("\n"+"Union : "+union+"\n"+"numA / numB : "+AdB+"\n"+"numB / numA : "+BdA+"\n"+"Delta : "+delta+"\n");
    
}
}
