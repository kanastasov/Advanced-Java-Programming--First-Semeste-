package uk.ac.tees.gold.L1087591;

/** <p>An enumeration of the various levels of radiation a robot can experience 
 * on Mars.</p>
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.</p>
 *
 */
public enum RadiationLevel
{
    /**
     * Low radiation levels, scanning robots can operate normally.
     */
    LOW, 
    /**
     * Medium radiation levels, scanning robots can operate but there is some 
     * interference.
     */
    MEDIUM, 
    /**
     * High radiation levels, scanning robots cannot operate.
     */
    HIGH, 
    /**
     * Critical radiation levels, scanning robots cannot operate.
     */
    CRITICAL
}
