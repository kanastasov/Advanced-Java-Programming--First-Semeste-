package uk.ac.tees.L1087591;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** A PizzaSorter that sorts the pizzas 
 *  
 * @author Anastasov
 */
public class PizzaSorter {

    /**
     * @param SMALL_PIZZA initializa the SMALL_PIZZA
     * * @param MEDIUM_PIZZA initializa the MEDIUM pizza
     * * @param LARGE_PIZZA initializa the LARGE pizza
     */
    final int SMALL_PIZZA = 9;
    final int MEDIUM_PIZZA = 12;
    final int LARGE_PIZZA = 15;
    /**
     * This method parses the named data file and creates pizza objects.
     *
     * @param file the file containing the data
     * @return an array list of pizza objects
     * @throws FileNotFoundException  
     */
    public ArrayList<Pizza> parseFile(File file) throws FileNotFoundException 
    {
        ArrayList<Pizza> list = new ArrayList<Pizza>();
        SmallPizza sp = new SmallPizza(SMALL_PIZZA, "cheese", "tomato");
        MediumPizza mp = new MediumPizza(MEDIUM_PIZZA, "ham", "pineapple", "cheese crust");
        LargePizza lp = new LargePizza(LARGE_PIZZA, "sausage", "bacon", "cheese crust", ",deep-pan");
        String[] add;
        if ((!file.exists()))
        {
           
             return null;   
        }  
        
        if (file.exists() && ((sp.getRadius() != SMALL_PIZZA) || (mp.getRadius() != MEDIUM_PIZZA)  || (lp.getRadius() != LARGE_PIZZA)))
        {                            
             return null;
        }     
        
           final Scanner scanner = new Scanner(file); 
            while (scanner.hasNextLine()) 
            {
                add = new String[list.size()];
               final String line = scanner.nextLine();
                add = line.split(" ");
//                System.out.println(line);
               
          
                if (line.contains("9"))
                {                 
                    sp = new SmallPizza(sp.radius, add[1], add[2]);                 
                    list.add(sp);
//                    System.out.println(list.toString() + "\n");                            
                    
                }
                else if (line.contains("12"))
                {
//                    mp = new MediumPizza(12, mp.topping1, mp.topping2, mp.crust);
                     mp = new MediumPizza(mp.radius, add[1], add[2], add[3]);
                     list.add(mp);
                }
                else if (line.contains("15"))
                {
//                   lp = new LargePizza(15, lp.topping1, lp.topping2, lp.crust, lp.thickness);
                    lp = new LargePizza(lp.radius, add[1], add[2], add[3], add[4]);
                    list.add(lp);
                }
                
                else if (!(line.contains("9") || (line.contains("12")) || (line.contains("15"))))
                {
                   return null;        
                }
               }
//             System.out.println(list.toString() + "\n"); 
            return list;
          }
    
    /**
     * This method returns a list of all the pizzas in the named data file.
     *
     * @param fileName The name of the file containing the data
     * @return A list of pizzas
     * @throws FileNotFoundException  
     */
    public String listAllPizzas(final String fileName) throws FileNotFoundException 
    {
        ArrayList<Pizza> myList;
        final File file = new File(fileName);
//        parseFile(file);
        myList = new ArrayList<Pizza>(parseFile(file));
        
       
        
        StringBuffer list = new StringBuffer();
//        String list = new String();       
        for (int i = 0; i < myList.size(); i++)
        {               
            list.append(myList.get(i).toString() + "\n");
//               list += myList.get(i).toString() + "\n";          
        }  
        return list.toString();     
    }
    
    /**
     * This method returns a list of all the pizzas of a given size.
     *
     * @param fileName The name of the file containing the data
     * @param radius the radius of the pizza
     * @return A list of pizzas
     * @throws FileNotFoundException  
     */
    public String filterPizzas(final String fileName, int radius) throws FileNotFoundException 
    {
        ArrayList<Pizza> myList;
       final File file = new File(fileName);
//        parseFile(file);
        myList = new ArrayList<Pizza>(parseFile(file));
//        String list = new String(); 
        StringBuffer list = new StringBuffer();
        
//        System.out.println(myList.toString());
//        System.out.println("Kura mi");
        for (Pizza item : myList)
        {
               if (item.radius == (radius))
               {   
//                    list += myList.get(i).toString() + "\n";          
//                     list += item.toString() + "\n";
                        list.append(item.toString() + "\n");
//                     System.out.println(item.toString());
//                    list += "2";
               }
//               list += radius;
        }  
//        String test = "A pizza (9 inches) with cheese and tomato\n"
//                + "A pizza (9 inches) with ham and mushroom\nA pizza "
//                + "(9 inches) with banana and pineapple\n";
//        return test;
       
        System.out.println("list");
        
        
        return list.toString();    
    }   
}