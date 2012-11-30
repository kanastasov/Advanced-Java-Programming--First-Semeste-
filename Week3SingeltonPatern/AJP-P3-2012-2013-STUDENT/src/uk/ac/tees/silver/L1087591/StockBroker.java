/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.silver.L1087591;

/**
 *
 * @author Anastasov
 */
public class StockBroker implements ShareWatcher
{
    //need to change the potfolio
      int portfolio = 0;
     /**
     * Buy value for stock broker.
     */
     static double SB_BUY = 2.00;
    
    /**
     * Sell value for stock broker.
     */
     static double SB_SELL = 3.00;
    
    /**
     * Increment value for stock broker.
     */
     static int SB_INCREMENT = 500;

    StockBroker(double SB_BUY, double SB_SELL, int SB_INCREMENT)
    {
//        this.price = portfolio;
//        updatePrice(portfolio);
        this.SB_BUY = SB_BUY;
        this.SB_SELL = SB_SELL;
        this.SB_INCREMENT = SB_INCREMENT;
//        portfolio = 0;
        
//        updatePrice(portfolio);
    }
    public  int getPortfolio() 
    {
        return portfolio ;
    }

    public  void setPortfolio(int portfolio) 
    {
        this.portfolio = portfolio;
    }
     
    public void updatePrice(double price)
    {
//        StockBroker sb = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        
        if((SB_BUY < price) && (portfolio > 0) )
        {
            portfolio -=  SB_INCREMENT;
            
//           SB_BUY = price;
//           portfolio += Share.poundsAndPences;
//           Share.poundsAndPences += portfolio;
            System.out.println("StockBroker buy shares at: " + SB_BUY);
        }
        
        if(SB_SELL > price )  
        {
            
            portfolio +=  SB_INCREMENT;
//            SB_SELL = price;
            
//             portfolio += Share.poundsAndPences;
//            portfolio = 
//            Share.poundsAndPences += portfolio;
            System.out.println("StockBroker sell shares at:" + SB_SELL);
        }
        
//          new StockBroker(SB_BUY ,SB_SELL, SB_INCREMENT);
//        portfolio = SB_INCREMENT;
//        System.out.println("Update StockBroker");
//        System.out.println("New value is: " + portfolio);
    }
    
}
