/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

import java.awt.Point;

/**RailgunState is interface responsible for the states move and fire.
 *
 * @author Anastasov
 */
public interface RailgunState 
{
 
    public String fire(Point p, int rounds);
    public String move(Point p);

    public RailgunState getState();
}
