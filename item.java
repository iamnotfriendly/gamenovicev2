package gamenovice;

public class item {
    private float power;
    private int age;
    private String name;
    
public item(float power, int age, String name){
    this.power = power;
    this.age = age;
    this.name = name;
}
public float getPower(){
    return this.power;
}
public float getAge(){
    return this.age;
}
public String getName(){
    return this.name;
}
public void list(){
    
}
}   
