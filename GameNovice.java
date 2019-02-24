/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenovice;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class GameNovice {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
                Scanner Scan = new Scanner(System.in);
                
                boolean status = true;
		Novice ice = new Novice(100.0f,"punch","Novice");
                bag myBag = new bag();
                System.out.println("Choose your career:");
                    System.out.println("press 1: Swordsman");
                    System.out.println("press 2: Archer");
                    System.out.println("I choose : ");
                    String myCareer = Scan.next();
                    if(myCareer.equals("1")){
                        Swordsman newSwordsman = new Swordsman();
                        newSwordsman.list();
                    }
                    if(myCareer.equals("2")){
                        Archer newArcher = new Archer();
                        newArcher.list();
                    }
                while(status){
                    System.out.println("Add , Open bag or Quit: "); 
                String Choose = Scan.next();
                if(Choose.equals("add")){
                    System.out.println("press 1: Sword");
                    System.out.println("press 2: Bow");
                    System.out.println("I choose : ");
                    String type = Scan.next();
                    if(type.equals("1")){
                        System.out.println("Sword's name : ");
                        String name = Scan.next();
                        Sword aSword = new Sword();
                        myBag.collect(aSword);
                    }
                    else if(type.equals("2")){
                        System.out.println("Bow's name : ");
                        String name = Scan.next();
                        Bow aBow = new Bow();
                        myBag.collect(aBow);
                    }
                }
                if(Choose.equals("open")){
                    myBag.list();
                }
                if(Choose.equals("quit")){
                    status = false;
                }
                }
                
	}
    
}
