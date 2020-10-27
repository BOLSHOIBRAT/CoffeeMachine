package itstep.org;

import java.util.Scanner;
public class CoffeeMachineVariation2 extends  CoffeeMachineVariation1 {
    Scanner scanner = new Scanner(System.in);
    private int milk;
    private int milk_box;
    public CoffeeMachineVariation2(int water, int ground_coffee, int water_box, int ground_coffee_box, int scrap_coffee_box, int milk, int milk_box){
        super(water, ground_coffee, water_box, ground_coffee_box, scrap_coffee_box);
        this.milk = milk;
        this.milk_box = milk_box;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMilk_box() {
        return milk_box;
    }

    public void setMilk_box(int milk_box) {
        this.milk_box = milk_box;
    }

    public void cookLate(){
        if(isWork()==true) {
            int need_ground_coffee = 22;
            int need_water = 30;
            System.out.println("Введите количество молока для порции латте:");
            int need_milk = scanner.nextInt();
            if (accessCook(need_ground_coffee, need_water, need_milk) == true) {
                System.out.println("Ваш латте готов!");
            }
        }
    }

    public void cookKapuchino(){
        if(isWork()==true) {
            int need_ground_coffee = 22;
            int need_water = 30;
            System.out.println("Введите количество молока для порции латте:");
            int need_milk = scanner.nextInt();
            if (accessCook(need_ground_coffee, need_water, need_milk) == true) {
                System.out.println("Ваш Капучино готов!");
            }
        }
    }

    private boolean accessCook(int need_ground_coffee,int need_water,int need_milk){
        if((getWater()-need_water)<0){
            System.out.println("Недостаточно воды!");
            return false;
        }
        else if((getGround_coffee()-need_ground_coffee)<0){
            System.out.println("Недостаточно молотого кофе!");
            return false;
        }
        else if((getMilk()-need_milk)<0){
            System.out.println("Недостаточно молока!");
            return false;
        }
        else if((getScrap_coffee()+need_ground_coffee)>=getScrap_coffee_box()){
            System.out.println("Бак отходного кофе будет переполнен, очистите бак и повторите операцию!");
            return false;
        }
        else{
            setGround_coffee(getGround_coffee()-need_ground_coffee);
            setWater(getWater()-need_water);
            setMilk(getMilk()-need_water);
            setScrap_coffee(getScrap_coffee()+need_ground_coffee);
            return true;
        }
    }

    @Override
    public String toString() {
        return "itstep.org.CoffeeMachineVariation2{" +
                "Вода = " + getWater() +
                ", Молоко = " + milk +
                ", Молотый кофе = " + getGround_coffee() +
                ", Отработанный кофе = " + getScrap_coffee() +
                ", Хранилище воды = " + getWater_box() +
                ", Хранилище молока = " + milk_box +
                ", Хранилище молотого кофе = " + getGround_coffee_box() +
                ", Хранилище отработанного кофе = " + getScrap_coffee_box() +
                ", Состояние = " + isWork() +
                '}';
    }
}
