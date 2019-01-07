
package Assignment5;

public class PatAllahabad {
    
    public static void main(String[] args) {
        String s="ALLAHABAD";
        char c[]=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            
            for(int j=8-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(c[k]+" ");
            }
            System.out.println("");
        }
    }
    
}
