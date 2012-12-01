package uk.ac.tees.L1087591.gold.factorymethod;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

/**GUI is responsible for the user interface of the program.
 *
 * @author Anastasov
 */
public class GUI extends JPanel implements ActionListener {
    /**
     * • Asks the customer for their maximum spend per machine
       • Asks the customer for the number of units required
       • Enters these values into the ordering system
       • Talks the customer through the deal suggested by the ordering system
     */
    
    /**
     * @param acf has a relation ship with Computer Factory.
     */
    private AbstractComputerFactory acf;
    
    /**
     *@param unitFIeld a field for the units. 
     */
    private JTextField unitField;

    /**
     *@param quantityField a field for the quantity of the PCs. 
     */
    private JTextField quantityField;
    
    /**
     * @param submit a button to react on the events and submit the data.
     */
    private JButton submit;
    
    /**
     * @param quote a label for the quote.
     */
    private  JLabel quote;
    
    /**
     * @param display a label where to display the data.
     */
    private JLabel display;
    
     /**
     * @param quantity a label where to display the quantity.
     */
    private JLabel quantity;
    
    
    /**
     * @param c represent the has a relationship.
     */
    Computer c;
    
    
    /**
     * @param northPanel represent a gridLayout(3,2) for the labels,textfield and buttons.
     * @param imgPanel reset the appropriate image for the PC.
     */
    private JPanel northPanel, imgPanel;
    
    /**
     * @param image store the images in the array of ImageIcons for the PCs.
     */
    protected ImageIcon []image = {
                                	new ImageIcon("Pictures/DEFAULT.gif"),
                                        new ImageIcon("Pictures/TB17b.gif"),
					new ImageIcon("Pictures/TB17d.gif"),
					new ImageIcon("Pictures/TBOFF31.gif"),
					new ImageIcon("Pictures/TBOFF32EX.gif"),
					new ImageIcon("Pictures/TBXX6.gif"),
					new ImageIcon("Pictures/TBXX8.gif")};
    
    
     /**
     * @param img a label where to display the image.
     */
        JLabel[] img  = {new JLabel(image[0])};
        
        
        /**
         * @paramt tb17bPrice represent the price of the TB17b PC.
         */
        private final int tb17bPrice = 299;
        
         /**
         * @paramt tboff31Price represent the price of the tboff31 PC.
         */
        private final int tboff31Price = 499;
        
        
         /**
         * @paramt tbxx6Price represent the price of the tbxx6 PC.
         */
        private final int tbxx6Price = 599;
        
          /**
         * @paramt tboff32exPrice represent the price of the TB17b PC.
         */
        private final int tboff32exPrice = 400;
        
         /**
         * @paramt tboff32exPrice represent the price of the TB17b PC.
         */
        private final int tbxx8Price = 500;
        
         /**
         * @paramt tbxx6Img represent the image of the tbxx6 and the grid widt PC.
         */
        private final int tboff31Img = 3;
        
        
          /**
         * @paramt tboff32exImg represent the image of the tboff32exImg and the grid widt PC.
         */
        private final int tboff32exImg = 4;
        
        
        /**
         * @paramt tbxx6Img represent the image of the tbxx6 PC.
         */
        private final int tbxx6Img = 5;
        
         /**
         * @paramt tbxx8Img represent the image of the tbxx8Img PC.
         */
        private final int tbxx8Img = 6;
        
        /**
         * @param bulk represent the number of pc required to do a bulk order.
         */
        private final int bulk = 50;
    
    /**GUI constructor to construct the GUI when invoked.
     */
    public GUI() {
        this.setLayout(new BorderLayout());
        northPanel = new JPanel(new GridLayout(tboff31Img, 2));
        display = new JLabel("Price per unit: ");
        unitField = new JTextField();
        quantity = new JLabel("Quantity: ");
        quantityField = new JTextField();
        submit = new JButton("Submit");
        submit.addActionListener(this);
        quote = new JLabel("£QUOTE");
       
        northPanel.add(display);
        northPanel.add(unitField);
        northPanel.add(quantity);
        northPanel.add(quantityField);
        northPanel.add(submit);
        northPanel.add(quote);
        this.add(northPanel, BorderLayout.NORTH);
        
        imgPanel = new JPanel();
        img[0].setIcon(image[0]);	
        imgPanel.add(img[0]);
        this.add(imgPanel, BorderLayout.CENTER);
        
    }
    /**actionPerformed() responsible for the events button clicks.
     * 
     * @param ae handles the action events.
     */
   public void actionPerformed(ActionEvent ae) {
       
       
       
            final String unit = unitField.getText();    
            if (unit.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {  
                 System.out.println("Is a number");  
            } else {  
                unitField.setText("Please enter numberic value");
                System.out.println("Is not a number");  
            }
             
             final String quantity = quantityField.getText();
            if (quantity.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+"))  {  
                 System.out.println("Is a number");  
            }  else  {  
                quantityField.setText("Please enter numberic value");
                System.out.println("Is not a number");  
            }
             
             if (ae.getSource() == submit) {
                 
                final int unitToInteger = Integer.parseInt(unit);
                final int quantityToInteger = Integer.parseInt(quantity);
                
                String ts = "";
                String bcf = "";
                if (quantityToInteger < bulk) {
                    acf = new ComputerFactory();
                    
                    if (acf.getComputer(unitToInteger) == null) {
                        quote.setText("No such computers in that price range:");
                        img[0].setIcon(image[0]);
                         return;
                    }
                    System.out.println(acf.getComputer(unitToInteger));
                    ts = acf.getComputer(unitToInteger).toString();
                    System.out.println("ComputerFactory: " + ts);
                }  else {
                    acf = new BulkComputerFactory();
                    
                    if (acf.getComputer(unitToInteger) == null) {
                        quote.setText("No such computers in that price range:");
                        img[0].setIcon(image[0]);
                         return;
                    }
                    System.out.println(acf.getComputer(unitToInteger));
                    bcf = "";
                    bcf = acf.getComputer(unitToInteger).toString();
                    System.out.println("BulkComputerFactory: " + bcf);
                }
               
//                System.out.println("TTTTTTTTTT NEWWWWW" + bcf);
                
                System.out.println(("quantityToInteger" + quantityToInteger));
                System.out.println(bcf.contains("TBOFF32EX"));
                
                if (bcf.contains("TBXX8")) {
                      quote.setText("****Unit Price: " + tbxx8Price + " Total Price: " + (quantityToInteger  *  tbxx8Price));
                      img[0].setIcon(image[tbxx8Img]);	
                } else if (bcf.contains("TBOFF32EX")) {
                      quote.setText("****Unit Price: " + tboff32exPrice + " Total Price: " + (quantityToInteger  *  tboff32exPrice));
                      img[0].setIcon(image[tboff32exImg]);	
                } else if (ts.contains("TB17b")) {
                    quote.setText("Unit Price: " + tb17bPrice + " Total Price: " + (quantityToInteger  *  tb17bPrice));
                     img[0].setIcon(image[1]);	
                    
                }  else if (ts.contains("TBOFF31")) {
                    quote.setText("Unit Price: " + tboff31Price + " Total Price: " + (quantityToInteger  *  tboff31Price));
                     img[0].setIcon(image[tboff31Img]);	
                    
                } else if (ts.contains("TBXX6")) {
                    quote.setText("Unit Price: " + tbxx6Price + " Total Price: " + (quantityToInteger  *  tbxx6Price));
                     img[0].setIcon(image[tbxx6Img]);	
                    
                } else {
                    quote.setText("No such computers in that price range:");
                     img[0].setIcon(image[0]);	
                    
                }
            }
   }
    
}
