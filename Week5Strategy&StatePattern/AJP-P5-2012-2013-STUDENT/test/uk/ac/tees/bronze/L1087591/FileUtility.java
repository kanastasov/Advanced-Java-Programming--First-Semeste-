package uk.ac.tees.bronze.L1087591;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * <p>A utility class for writing to, and reading from, text files.</p>
 *
 * <p>This program is part of AJP-P4-2012-2013-SOLUTION.</p>
 *
 * <p>AJP-P4-2012-2013-SOLUTION is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License along
 * with this program. If not, see http://www.gnu.org/licenses/.</p>
 *
 * <p>Copyright Mark Truran m.a.truran@tees.ac.uk 27-Oct-2012 </p>
 */
public class FileUtility {

    /** This method appends a single string to a text file.
     * 
     * @param f The file to write to
     * @param entry The string to append
     */
    public static void writeFile(File f, String entry) {
        try {
            final BufferedWriter out = new BufferedWriter(new FileWriter(f, true));
            out.write(entry);
            out.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file");
        }
    }

    /** This method resets the named text file.
     * 
     * @param f The file to reset
     */
    public static void resetFile(File f) {
        try {
            final BufferedWriter out = new BufferedWriter(new FileWriter(f, false));
            out.write("");
            out.close();
        } catch (IOException e) {
            System.err.println("Problem reset the file");
        }
    }

    /** This method reads the contents of a text file.
     * 
     * @param f The file to read from
     * @return the contents of the text file as a single string
     */
    public static String readFile(File f) {
        //Z means: "The end of the input but for the final terminator, if any
        String output = "No final terminator";
        try {
            output = new Scanner(f).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            System.err.println("Problem reading from file");
        }
        return output;
    }
}