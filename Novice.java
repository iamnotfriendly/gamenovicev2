package gamenovice;


public class Novice {
    private int hp;
    private int exp;
    private float power;
    private String nvSkill;
    private String name;
    
    public Novice(float power, String nvSkill,String name){
           this.hp = hp;
           this.exp = exp;
           this.power = power;
           this.nvSkill = "punch";
           this.name = name;
    }
public float getPower(){
    return this.power;
}
public String getName(){
    return this.name;
}
public String getSkill(){
    return this.nvSkill;
}
public void list(){
    
}
}
