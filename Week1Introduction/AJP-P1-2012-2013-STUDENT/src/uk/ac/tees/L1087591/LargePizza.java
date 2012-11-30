package uk.ac.tees.L1087591;

/** This class represents a LargePizza (12 inch) pizza.
 * 
 *  and a toString method with brief description
 * @author Anastasov
 */
public class LargePizza extends Pizza {

    
    /**
     *@param radius sets the radius of Large Pizza
     */ 
    protected int radius;
    
    /**
     *@param topping1 sets the first topping of Large Pizza
     */
    protected String topping1,
            
    /**
     *@param topping2 sets the second topping of Large Pizza
     */        
    topping2;
    
    /**
     -*@param crust sets the crust of Large Pizza
     */
    protected String crust;
    /**
     *@param thickness sets the thickness of Large Pizza
     */
    protected String thickness;
    /**
     * Initialises a small pizza object.
     *
     * @param radius the radius of the pizza, in inches
     * @param topping1 the first topping on the pizza
     * @param topping2 the second topping on the pizza
     * @param crust the pizza
     * @param thickness  
     */
    public LargePizza(int radius, String topping1, String topping2, String crust, String thickness) 
    {
        super(radius, topping1, topping2);
        this.radius = radius;
        if (topping1 != null && topping2 != null)
        {
            this.topping1 = topping1;
            this.topping2 = topping2;
        }
        this.crust = crust;
        this.thickness = thickness;
    }
    @Override
     public int getRadius() {
        return radius;
    }
     
     @Override
    public String toString() {
        return "A pizza (" + radius + " inches) with " + topping1 + " and "
                + topping2 + " and a " + crust + " crust, " + thickness;
    }

}