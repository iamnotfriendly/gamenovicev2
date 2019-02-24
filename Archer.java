
package gamenovice;


public class Archer extends Novice{
    private int ahPower;
    private String ahSkill;
    private String name;

    public Archer() {
        super(32.1f, "archery", "Archer");
        this.ahPower = 32;
        this.ahSkill = "archery";
        this.name = "Archer";
    }
public void list(){
        System.out.println("I am " + getName());
        System.out.println("Power :" + getPower());
        System.out.println("Skill : " + this.ahSkill);
    }     
}
