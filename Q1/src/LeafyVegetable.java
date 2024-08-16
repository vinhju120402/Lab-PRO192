/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class LeafyVegetable extends Vegetable{
    
    private int daysToHarvest;

    public LeafyVegetable(int daysToHarvest, String name, double pricePerUnit) {
        super(name, pricePerUnit);
        this.daysToHarvest = daysToHarvest;
    }

    public int getDaysToHarvest() {
        return daysToHarvest;
    }

    public void setDaysToHarvest(int daysToHarvest) {
        this.daysToHarvest = daysToHarvest;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.daysToHarvest;
    }

    public void reducePrice(double reduction){
        setPricePerUnit(getPricePerUnit() - reduction);
    }
    
    public boolean isSeasonal(){
        return this.daysToHarvest < 60;
    }
}
