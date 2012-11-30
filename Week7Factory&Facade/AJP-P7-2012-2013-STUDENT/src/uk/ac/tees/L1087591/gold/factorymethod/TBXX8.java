/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.gold.factorymethod;

import javax.swing.ImageIcon;

/**
 *
 * @author Anastasov
 */
public class TBXX8 extends Computer {
    /**
     * @param memory represent the memory of PC.
     */
    protected int memory = 8;
    
    /**
     * @param disc represent the disc of PC.
     */
    protected int disc = 1024;
    
    
    /**
     * @param processor represent the processor of PC.
     */
    protected double processor = 3.40;
    
    /**
     * @param img stores the images for the GUI.
     */
    protected ImageIcon []img = {new ImageIcon("TBXX8.gif")};
    
    /**
     * @param price represent the price for the PC.
     */
    protected double price = 500;

    
    /**TB17b initialize the variables of the PC.
     * 
     * @param memory initialize the memory of the PC.
     * @param disc initialize the disc of the PC.
     * @param processor initialize the processor of the PC.
     * @param img initialize the image of the PC.
     * @param price  initialize the price of the PC.
     */
    public TBXX8(int memory, int disc, double processor, ImageIcon []img, double price) {
        this.memory = memory;
        this.disc = disc;
        this.processor = processor;
        this.img = img;
        this.price = price;
        System.out.println("Text from TBXX8 constructor");
    }
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
