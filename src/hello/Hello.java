/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author SHASHI
 */
public class Hello extends AppCompatActivity{

    /**
     * @param savedInstanceState
     * @param args the command line arguments
     */
   
    
    //@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.SLASH);
	}
        
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to hello world");
        
        
        
        
        
        
        
        
        
    }

    private void setContentView(KeyCode keyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
