package uk.ac.tees.L1087591;

/** Pizza.java abstract class for all the Pizzas.
 * class description: responsible for radius topping1 and topping2,
 * and for the getRadius() method and also a toString method with brief description. 
 * @author Anastasov
 */
public abstract class Pizza {

    /**
     * The radius of the pizza, in inches.
     */
    protected int radius;
    
    /**
     * The first pizza topping.
     */
    protected String topping1;
    
    /**
     * The second pizza topping.
     */
    protected String topping2;

    /** Initialises a generic pizza object.
     * 
     * @param radius  the radius of the pizza
     * @param topping1 the first topping on the pizza
     * @param topping2 the second topping on the pizza
     */
    public Pizza(int radius, String topping1, String topping2) {
        this.radius = radius;
        if (topping1 != null && topping2 != null)
        {
            this.topping1 = topping1;
            this.topping2 = topping2;
        }
        
    }
    
    /** This method gets the radius of the pizza, in inches.
     * 
     * @return the radius of the pizza, in inches
     */
    public int getRadius() {
        return radius;
    }
            
    /**
     * This method returns a textual description of the pizza.
     *
     * @return A textual description of the pizza
     */
    @Override
    public String toString() {
        return "A pizza (" + radius + " inches) with " + topping1 + " and " + topping2;
    }
}