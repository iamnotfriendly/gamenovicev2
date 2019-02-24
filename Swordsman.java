package gamenovice;


public class Swordsman extends Novice {
    private int smPower;
    private String swSkill;
    private String name;
    

    public Swordsman() {
        super(40.6f ,"fencing", "Swordsman");
        this.smPower = 40;
        swSkill = "fencing";
        this.name = "Swordsman";
    }
    @Override
    public void list(){
        System.out.println("I am " + getName());
        System.out.println("Power :" + getPower());
        System.out.println("Skill : " + this.swSkill);
    }    
}
