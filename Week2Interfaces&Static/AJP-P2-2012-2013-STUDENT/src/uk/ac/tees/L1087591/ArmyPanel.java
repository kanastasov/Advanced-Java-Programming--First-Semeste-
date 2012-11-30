/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**ArmyPanel is the main class with the GUI.
 *
 * @author Anastasov
 */
public class ArmyPanel extends javax.swing.JFrame {

    static int max =0;
     ArrayList orderList;
    protected ImageIcon[] image = {
		new ImageIcon("Pictures/cadet.png"),       
                new ImageIcon("Pictures/colonel.png"),
		new ImageIcon("Pictures/major.png"),
		new ImageIcon("Pictures/lighttank.png"),
		new ImageIcon("Pictures/heavytank.png")};
									
    /**
     * Creates new form ArmyPanel
     */
    public ArmyPanel() {
        initComponents();
    }

   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Current score: ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redbutton.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Highest score: ");

        jLabel7.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /** The method fileSaving() saves the information in orderList into "filename".dat
	 */
	public  void createAFile() throws IOException
	{
//		String msg = "Enter name of the file: ";
//		String fileName = JOptionPane.showInputDialog(msg);
		File file = new File("example.txt");
                if(!file.exists())
                {
                    file.createNewFile();
                }
		
		
		PrintStream fileWriter = new PrintStream("example.txt");
		Scanner fileReader;
//                String total = jButton1.getText();
		int totalScores = Vehicle.totalisimo + Soldier.totalisimo;
                
		try {
			fileReader = new Scanner(file);
                        if(totalScores > max)
                        {
                            fileWriter.println(totalScores);
                        }
                        else
                        {
                            fileWriter.println(max);
                        }
			
			fileReader.close();
			fileWriter.close();
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException ne) 
		{
			// TODO Auto-generated catch block
			ne.printStackTrace();
		}
		
	}
        
        /** The method fileLoading is loading a file with .dat extension. If there is no such a 
	 * file it will throw FileNotFoundException which is caught in the first catch.
	 * The method is also going throw the values of the orderList and is displaying the appropriate image. 
	 */
	private void fileLoading()
	{
            File file = new File("example.txt");
         
        try {
            //
            // Create a new Scanner object which will read the data 
            // from the file passed in. To check if there are more 
            // line to read from it we check by calling the 
            // scanner.hasNextLine() method. We then read line one 
            // by one till all line is read.
            //
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Max: " + line + " file reading successful");
                final  int button1 = Vehicle.totalisimo + Soldier.totalisimo;
                final  int button3 = Integer.parseInt(line);
                max = button3;
                if (button1 >= button3)
                {
                    jButton3.setText("Highest score: " + button1);
                }
                else
                {
                    jButton3.setText("Highest score: " + max);
                    
                }
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            
        }
        
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               
       
            
        final Random generator = new Random();
        final int roll = generator.nextInt(5) + 1;       
        final ArrayList<Killable> list = new ArrayList<Killable>();
   
                if (evt.getSource() == jButton2)
                {
                     for (int i = 0; i < roll; i++)
                    {
                        final int soldiersVehicles = generator.nextInt(5) + 1;
                        final int faction = generator.nextInt(3) + 1;
                        if (soldiersVehicles == 1)
                        {
                          jLabel1.setIcon(image[0]);
                          switch(faction)
                          {
                              case(1):
                                  list.add(new Cadet(Faction.GDI));
                                  break;
                              case(2):
                                  list.add(new Cadet(Faction.NOD));
                                  break;
                              case(3):
                                  list.add(new Cadet(Faction.SCRIN));
                              default:
                                  System.out.println("Invalid entry:");
                                  break;
                          }
                     }
                    
                        if(soldiersVehicles == 2)
                        {
                            jLabel2.setIcon(image[1]);
                            switch(faction)
                             {
                                 case(1):
                                     list.add(new Colonel(Faction.GDI));
                                     break;
                                 case(2):
                                     list.add(new Colonel(Faction.NOD));
                                     break;
                                 case(3):
                                     list.add(new Colonel(Faction.SCRIN));
                                 default:
                                     System.out.println("Invalid entry:");
                                     break;
                             }
                        }
                        if (soldiersVehicles == 3)
                        {
                             jLabel3.setIcon(image[2]);
                             switch(faction)
                              {
                                  case(1):
                                      list.add(new Major(Faction.GDI));
                                      break;
                                  case(2):
                                      list.add(new Major(Faction.NOD));
                                      break;
                                  case(3):
                                      list.add(new Major(Faction.SCRIN));
                                  default:
                                     System.out.println("Invalid entry:");
                                      break;
                              }
                        }
                        if (soldiersVehicles == 4)
                        {
                             jLabel5.setIcon(image[3]);  
                             switch(faction)
                              {
                                  case(1):
                                      list.add(new LightTank(Faction.GDI));
                                      break;
                                  case(2):
                                      list.add(new LightTank(Faction.NOD));
                                      break;
                                  case(3):
                                      list.add(new LightTank(Faction.SCRIN));
                                  default:
                                      System.out.println("Invalid entry:");
                                      break;
                              }
                        }
                        if(soldiersVehicles == 5)
                        {
                             jLabel6.setIcon(image[4]);
                             switch(faction)
                              {
                                  case(1):
                                      list.add(new HeavyTank(Faction.GDI));
                                      break;
                                  case(2):
                                      list.add(new HeavyTank(Faction.NOD));
                                      break;
                                  case(3):
                                      list.add(new HeavyTank(Faction.SCRIN));
                                  default:
                                      System.out.println("Invalid entry:");
                                      break;
                              }
                        }

                         System.out.println("number of objects: " + roll);
                         System.out.println("exact obj: " + soldiersVehicles);
                    }
                         final int total = Vehicle.totalisimo + Soldier.totalisimo;
                         final String setButton1 = total + "";
                         jButton1.setText("Current score: " + "\n" + setButton1);
                         jButton3.setText(total + "");
                     
        }
                        fileLoading();
        try 
        {
            createAFile();
        } catch (IOException ex) {
            Logger.getLogger(ArmyPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArmyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArmyPanel().setVisible(true);
                
            }
        });
    }
    /** auto generated buttons and labels with netbeans
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
