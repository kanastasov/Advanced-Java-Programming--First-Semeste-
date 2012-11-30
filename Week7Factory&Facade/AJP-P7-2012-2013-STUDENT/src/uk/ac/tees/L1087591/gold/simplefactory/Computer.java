/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.gold.simplefactory;

import javax.swing.ImageIcon;

/**Computer represent all the computers sold by Techno-Byte.
 * 1. TB17b
 * 2. TBOFF31
 * 3. TBXX6
 *
 * @author Anastasov
 */
public abstract class Computer {
    
    /**
     * @param memory represent the memory of PC.
     */
    protected int memory;
    
    /**
     * @param disc represent the disc of PC.
     */
    protected int disc;
    
    
    /**
     * @param processor represent the processor of PC.
     */
    protected double processor;
    
    /**
     * @param img stores the images for the GUI.
     */
    protected ImageIcon[] img;
    
    /**
     * @param price represent the price for the PC.
     */
    protected double price;

    /**getMemory() gets the memory of the PC.
     * 
     * @return  memory
     */
    public int getMemory() {
        return memory;
    }

    /**setMemory() sets the memory of the PC.
     * 
     * @param memory initialize the memory.
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**getDisc() gets the disk of the PC.
     * 
     * @return  disk
     */
    public int getDisc() {
        return disc;
    }

     /**setDisc() sets the disc of the PC.
     * 
     * @param disc initialize the disc.
     */
    public void setDisc(int disc) {
        this.disc = disc;
    }

    /**getProcessor() gets the processor of the PC.
     * 
     * @return  processor
     */
    public double getProcessor() {
        return processor;
    }

     /**setProcessor() sets the processor of the PC.
     * 
     * @param processor initialize the processor.
     */
    public void setProcessor(double processor) {
        this.processor = processor;
    }

     /**getImg() gets the image of the PC.
     * 
     * @return  img
     */
    public ImageIcon[] getImg() {
        return img;
    }

    /**setImg() sets the image for the GUI.
     * 
     * @param img initialize the img.
     */
    public void setImg(ImageIcon []img) {
        this.img = img;
    }

    /**getPrice() gets the price of the PC.
     * 
     * @return  price
     */
    public double getPrice() {
        return price;
    }

     /**setPrice() sets the price of the PC.
     * 
     * @param price initialize the price.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
