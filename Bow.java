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
public class Bow extends item {
        private String name;
        //private float power;
        private float agi;
        //private int age;
    
    public Bow(){
        super(30.5f, 14,"Bow");
        //this.power = 46.2f;
        this.agi = 62.4f;
        this.name = "Bow";
    }
        @Override
    public void list(){
        System.out.println("I have " + this.name);
        System.out.println("Power :" + getPower());
        System.out.println("Age :" + getAge());
        System.out.println("AGI : " + this.agi);
    }  
}
