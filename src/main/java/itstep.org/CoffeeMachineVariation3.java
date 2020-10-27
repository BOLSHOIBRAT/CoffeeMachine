package itstep.org;

public class CoffeeMachineVariation3 extends CoffeeMachineVariation2{
    private int no_ground_coffee;
    private int no_ground_coffee_box;
    public CoffeeMachineVariation3(int water, int ground_coffee, int water_box, int ground_coffee_box, int scrap_coffee_box, int milk, int milk_box,int no_ground_coffee,int no_ground_coffee_box){
        super(water, ground_coffee, water_box, ground_coffee_box, scrap_coffee_box, milk, milk_box);
        this.no_ground_coffee = no_ground_coffee;
        this.no_ground_coffee_box = no_ground_coffee_box;
    }

    public int getNo_ground_coffee() {
        return no_ground_coffee;
    }

    public void setNo_ground_coffee(int no_ground_coffee) {
        this.no_ground_coffee = no_ground_coffee;
    }

    public int getNo_ground_coffee_box() {
        return no_ground_coffee_box;
    }

    public void setNo_ground_coffee_box(int no_ground_coffee_box) {
        this.no_ground_coffee_box = no_ground_coffee_box;
    }

    @Override
    public void cookAmericano() {
        super.cookAmericano();
    }

    @Override
    public void cookLate() {
        super.cookLate();
    }

    public void cookAmericanoWithNoGroundCoffee(){
        if(isWork()==true) {
            int need_no_ground_coffee = 22;
            int need_water = 30;
            if (accessCookWithNoGroundCoffee(need_no_ground_coffee, need_water) == true) {
                System.out.println("Ваш Американо готов!");
            }
        }
    }

    public void cookLateWithNoGroundCoffee(){
        if(isWork()==true) {
            int need_no_ground_coffee = 22;
            int need_water = 30;
            System.out.println("Введите количество молока для порции латте:");
            int need_milk = scanner.nextInt();
            if (accessCookWithNoGroundCoffee(need_no_ground_coffee, need_water, need_milk) == true) {
                System.out.println("Ваш латте готов!");
            }
        }
    }

    private boolean accessCookWithNoGroundCoffee(int need_no_ground_coffee, int need_water,int need_milk){
        if((getWater()-need_water)<0){
            System.out.println("Недостаточно воды!");
            return false;
        }
        else if((getGround_coffee()-need_no_ground_coffee)<0){
            System.out.println("Недостаточно цельного кофе!");
            return false;
        }
        else if((getMilk()-need_milk)<0){
            System.out.println("Недостаточно молока!");
            return false;
        }
        else if((getScrap_coffee()+need_no_ground_coffee)>=getScrap_coffee_box()){
            System.out.println("Бак отходного кофе будет переполнен, очистите бак и повторите операцию!");
            return false;
        }
        else{
            setGround_coffee(getNo_ground_coffee()-need_no_ground_coffee);
            setWater(getWater()-need_water);
            setMilk(getMilk()-need_water);
            setScrap_coffee(getScrap_coffee()+need_no_ground_coffee);
            return true;
        }
    }

    private boolean accessCookWithNoGroundCoffee(int need_no_ground_coffee, int need_water){
        if ((getWater() - need_water) < 0) {
            System.out.println("Недостаточно воды!");
            return false;
        } else if ((getGround_coffee() - need_no_ground_coffee) < 0) {
            System.out.println("Недостаточно цельного кофе!");
            return false;
        } else if ((getScrap_coffee() + need_no_ground_coffee) >= getScrap_coffee_box()) {
            System.out.println("Бак отходного кофе будет переполнен, очистите бак и повторите операцию!");
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "itstep.org.CoffeeMachineVariation3{" +
                    "Вода = " + getWater() +
                    ", Молоко = " + getMilk() +
                    ", Цельнозерновой кофе =" + no_ground_coffee +
                    ", Хранилище цельнозернового кофе =" + no_ground_coffee_box +
                    ", Молотый кофе = " + getGround_coffee() +
                    ", Отработанный кофе = " + getScrap_coffee() +
                    ", Хранилище воды = " + getWater_box() +
                    ", Хранилище молотого кофе = " + getGround_coffee_box() +
                    ", Хранилище отработанного кофе = " + getScrap_coffee_box() +
                    ", Хранилище молока = " + getMilk_box() +
                    ", Состояние = " + isWork() +
                    '}';
    }
}
