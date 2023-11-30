 
package pkg22205015.pbo.lat53;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Rabbit


class Animal {
    
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }
}

class Rabbit extends Animal{
    private final String color;
    private final String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}

public class PBOLAT53 {
    public static void main(String[] args) {
        System.out.println("===LATIHAN 53===");
        
        Rabbit oo1 = new Rabbit("Peter",true,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + oo1.getName());
        System.out.println(oo1.getName() + " is Vegetarian? " + oo1.isVegetarian());
        System.out.println(oo1.getName() + " eat " + oo1.getEats());
        System.out.println(oo1.getName() + " has " + oo1.getNoOfLegs() + " legs");
        System.out.println(oo1.getName() + " color is " + oo1.getColor());
        System.out.println();
    }

    
}
