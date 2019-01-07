/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author sj
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n=1000;
        int count;
        for (int i  = 2; i <= n; i++) 
        {count=0;
            for (int j =2; j <i; j++)
            {
                
                if(i%j==0)
                    {count++;
                  
                    }
                
                
                
            }
           
            
            
            if (count==0)
                System.out.println(i);
            
        }
    }
    
}
