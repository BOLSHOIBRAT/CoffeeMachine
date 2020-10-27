package itstep.org;

public abstract class CoffeeMachine {
    private int water;
    private int ground_coffee;
    private int scrap_coffee;
    private int water_box;
    private int ground_coffee_box;
    private int scrap_coffee_box;
    private boolean work;
    public CoffeeMachine(int water, int ground_coffee, int water_box, int ground_coffee_box, int scrap_coffee_box) {
        this.water = water;
        this.ground_coffee = ground_coffee;
        this.scrap_coffee = 0;
        this.water_box = water_box;
        this.ground_coffee_box = ground_coffee_box;
        this.scrap_coffee_box = scrap_coffee_box;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getGround_coffee() {
        return ground_coffee;
    }

    public void setGround_coffee(int ground_coffee) {
        this.ground_coffee = ground_coffee;
    }

    public int getScrap_coffee() {
        return scrap_coffee;
    }

    public void setScrap_coffee(int scrap_coffee) {
        this.scrap_coffee = scrap_coffee;
    }

    public int getWater_box() {
        return water_box;
    }

    public void setWater_box(int water_box) {
        this.water_box = water_box;
    }

    public int getGround_coffee_box() {
        return ground_coffee_box;
    }

    public void setGround_coffee_box(int ground_coffee_box) {
        this.ground_coffee_box = ground_coffee_box;
    }

    public int getScrap_coffee_box() {
        return scrap_coffee_box;
    }

    public void setScrap_coffee_box(int scrap_coffee_box) {
        this.scrap_coffee_box = scrap_coffee_box;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public void turn_in(){
        this.work = true;
    }

    public void turn_out(){
        this.work = false;
    }

    public void clear_scrap_coffee_box(){
        this.scrap_coffee = 0;
    }

    @Override
    public String toString() {
        return "itstep.org.CoffeeMachine{" +
                "Вода =" + water +
                ", Молотый кофе =" + ground_coffee +
                ", Отработанный кофе =" + scrap_coffee +
                ", Хранилище воды =" + water_box +
                ", Хранилище молотого кофе =" + ground_coffee_box +
                ", Хранилище отработанного кофе =" + scrap_coffee_box +
                ", Состояние =" + work +
                '}';
    }
}
