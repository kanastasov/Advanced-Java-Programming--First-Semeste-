/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.silver.L1087591;

/**
 *
 * @author Anastasov
 */
public class BankManager implements ShareWatcher
{
    
    
     
     
     int portfolio = 0;
    /**
     * Buy value for bank manager.
     */
     static double BM_BUY = 1.00;
    
    /**
     * Sell value for bank manager.
     */
     static double BM_SELL = 4.00;
    
    /**
     * Increment value for bank manager.
     */
     static int BM_INCREMENT = 100;
    
    
    public BankManager(double BM_BUY, double BM_SELL, int BM_INCREMENT)
    {
        this.BM_BUY = BM_BUY;
        this.BM_SELL = BM_SELL;
        this.BM_INCREMENT = BM_INCREMENT;
        
        portfolio = 0;
        
//        updatePrice(portfolio);
    }
    

    public  int getPortfolio()
    {
        return portfolio;
    }

    public  void setPortfolio(int portfolio)
    {
        this.portfolio = portfolio;
//        updatePrice(portfolio);
    }
    
    @Override
    public void  updatePrice(double price)
    {
        if((BM_BUY < price) && (portfolio > 0) )
        {    
            portfolio -=  BM_INCREMENT;
//            BM_BUY = price;
//             portfolio += Share.poundsAndPences;
            System.out.println("BankManager buy shares at: " + BM_BUY);
            
        }
        
        if(BM_SELL >= price)  
        {
//            BM_SELL = price;
            portfolio +=  BM_INCREMENT;
//             portfolio += Share.poundsAndPences;
            System.out.println("BankManager sell shares at:" + BM_SELL);
        }
//        new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
//        portfolio = price;
//        System.out.println("Update BankManager");
//        System.out.println("New value is: " + portfolio);
    }
}
