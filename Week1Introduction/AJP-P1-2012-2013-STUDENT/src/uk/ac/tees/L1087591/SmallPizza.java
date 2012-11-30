package uk.ac.tees.L1087591;

/** A SmallPizza that is responsible for all the small pizzas
 *
 * @author Anastasov
 */
public class SmallPizza extends Pizza {

      /**
     *@param radius sets the radius of Small Pizza
     */ 
    protected int radius;
    
    /**
     *@param topping1 sets the first topping of Small Pizza
     */
    protected String topping1;
            
    /**
     *@param topping2 sets the second topping of Small Pizza
     */        
    protected String topping2;
    
    
    /**
     * initializes a small pizza object.
     *
     * @param radius the radius of the pizza, in inches
     * @param topping1 the first topping on the pizza
     * @param topping2 the second topping on the pizza
     */
    public SmallPizza(int radius, String topping1, String topping2) {
        super(radius, topping1, topping2);
        this.radius = radius;
        if (topping1 != null && topping2 != null)
        {
            this.topping1 = topping1;
            this.topping2 = topping2;
        }
    }
    @Override
     public int getRadius() {
        return radius;
    }
  
}