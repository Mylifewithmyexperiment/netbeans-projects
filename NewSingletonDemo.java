/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlrtonclassdemo4;

/**
 *
 * @author SHASHI
 */
public class NewSingletonDemo {
    
    private NewSingletonDemo() {
    }
    
    public static NewSingletonDemo getInstance() {
        return NewSingletonDemoHolder.INSTANCE;
    }
    
    private static class NewSingletonDemoHolder {

        private static final NewSingletonDemo INSTANCE = new NewSingletonDemo();
    }
}
