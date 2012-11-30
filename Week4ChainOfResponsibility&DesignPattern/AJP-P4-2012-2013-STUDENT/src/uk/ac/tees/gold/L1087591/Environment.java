package uk.ac.tees.gold.L1087591;

/** <p>A class which stores environmental data about Mars. This class is used
 * by robots on Mars to determine if it is safe to operate.</p>
 *
 * <p>This program is part of AJP-P4-2012-2013-SOLUTION.</p>
 *
 * <p>AJP-P4-2012-2013-SOLUTION is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.</p>
 *
 */
public class Environment {
    
    /**
     * A measurement of ambient radiation levels.
     */
    public static RadiationLevel radiationLevel = RadiationLevel.LOW;
    
    /**
     * Is a dust storm pounding the planet?.
     */
    public static boolean dustStorm = false;

    /** This method sets the ambient radiation levels. 
     * 
     * @param radiationLevel The ambient radiation levels 
     */
    public static void setRadiationLevel(RadiationLevel radiationLevel) {
        Environment.radiationLevel = radiationLevel;
    }

    /** This method is invoked when a dust storm appears or disappears.
     * 
     * @param dustStorm true if a dust storm is active
     */
    public static void setDustStorm(boolean dustStorm) {
        Environment.dustStorm = dustStorm;
    }
    
}