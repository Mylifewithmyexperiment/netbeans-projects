

import java.util.StringTokenizer;

public class StrToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("23/06/2016");
        
        int count = 0;
        while(st.hasMoreElements()){
            
            System.out.println(st.nextToken("/"));
            count = st.countTokens();
        }
        System.out.println("Tokens counted is : "+count);
       
    }
    
}
