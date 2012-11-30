package uk.ac.tees.L1087591.gold.factorymethod;

import javax.swing.JFrame;

/**TestGUI is the class which test the user interface.
 *
 * @author Anastasov
 */
public class TestGUI 
{
    
    /**main is the driver method of the whole folder.
     * @param args  
     */
    public static void main(String[] args)
    {
        /**
         * @param MAX_VALUE_OF_X represents the width of the frame.
         */
        final int MAX_VALUE_OF_X = 730;
        
        /**
         * @param MAX_VALUE_OF_Y represents the height of the frame.
         */
        final int MAX_VALUE_OF_Y = 650;
       
                final JFrame application = new JFrame();
		final GUI panel = new GUI();
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(MAX_VALUE_OF_X, MAX_VALUE_OF_Y);
		application.setLocationRelativeTo(panel);
		application.setResizable(false);
		application.setVisible(true);
    }
    
}
