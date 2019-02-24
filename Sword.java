/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenovice;

/**
 *
 * @author acer
 */
public class Sword extends item {
    //private float power;
    private float block;
    private String name;
    //private int age;
    
    public Sword(){
        super(56.7f, 5, "Sword");
        //this.power = 57.9f;
        this.name = "Sword";
        this.block = 24.6f;
    }
    public void list(){
        System.out.println("I have " + this.name);
        System.out.println("Power :" + getPower());
        System.out.println("Age :" + getAge());
        System.out.println("Block : " + this.block);
    }   
}
