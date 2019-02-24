
package gamenovice;

import java.util.ArrayList;
import java.util.Scanner;

public class bag {
    private  ArrayList<item> noobbag;;
    
    public bag(){
        this.noobbag = new ArrayList<>();
	
    }

	public void collect(item Things){   
            noobbag.add(Things);
	}

	
	public void list(){
            System.out.println("********************************");
		for(item weapon : noobbag){ 
                    weapon.list(); 
		}
            System.out.println("********************************"); 
	}
    
}