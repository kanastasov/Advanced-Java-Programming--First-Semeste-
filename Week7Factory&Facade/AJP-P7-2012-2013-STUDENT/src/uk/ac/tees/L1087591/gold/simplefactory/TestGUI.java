package uk.ac.tees.L1087591.gold.simplefactory;

import javax.swing.JFrame;

/**TestGUI is the class which test the user interface.
 *
 * @author Anastasov
 */
public class TestGUI {
    
    /**main is the driver method of the whole folder.
     * @param args  
     */
    public static void main(String[] args) {
        /**
         * @param maxValueOfX represents the width of the frame.
         */
        final int maxValueOfX = 730;
        
        /**
         * @param maxValueOfY represents the height of the frame.
         */
        final int maxValueOfY = 650;
       
                final JFrame application = new JFrame();
		final GUI panel = new GUI();
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(maxValueOfX, maxValueOfY);
		application.setLocationRelativeTo(panel);
		application.setResizable(false);
		application.setVisible(true);
    }
}
