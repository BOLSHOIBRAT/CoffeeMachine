package itstep.org;

public class CoffeeMachineVariation1 extends CoffeeMachine {
    public CoffeeMachineVariation1(int water, int ground_coffee, int water_box, int ground_coffee_box, int scrap_coffee_box) {
        super(water, ground_coffee, water_box, ground_coffee_box, scrap_coffee_box);
    }

    public void cookEspresso() {
        if (isWork() == true) {
            int need_ground_coffee = 22;
            int need_water = 30;
            if(accessCook(need_ground_coffee,need_water)==true){
                setGround_coffee(getGround_coffee() - need_ground_coffee);
                setWater(getWater() - need_water);
                setScrap_coffee(getScrap_coffee() + need_ground_coffee);
                System.out.println("Ваш еспрессо успешно приготовлен!");
            }
        }
    }

    public void cookAmericano() {
        if (isWork() == true) {
            int need_ground_coffee = 22;
            int need_water = 100;
            if(accessCook(need_ground_coffee,need_water)==true){
                setGround_coffee(getGround_coffee() - need_ground_coffee);
                setWater(getWater() - need_water);
                setScrap_coffee(getScrap_coffee() + need_ground_coffee);
                System.out.println("Ваш американо успешно приготовлен!");
            }
        }
    }

    private boolean accessCook(int need_ground_coffee, int need_water) {
        if ((getWater() - need_water) < 0) {
            System.out.println("Недостаточно воды!");
            return false;
        } else if ((getGround_coffee() - need_ground_coffee) < 0) {
            System.out.println("Недостаточно молотого кофе!");
            return false;
        } else if ((getScrap_coffee() + need_ground_coffee) >= getScrap_coffee_box()) {
            System.out.println("Бак отходного кофе будет переполнен, очистите бак и повторите операцию!");
            return false;
        }
        else{
            return true;
        }
    }
}
