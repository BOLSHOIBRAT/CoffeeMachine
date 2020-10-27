package itstep.org;

public class Сheck {
    public static void main(String[]argv){
        CoffeeMachineVariation1 Sony = new CoffeeMachineVariation1(300,300,500,500,500);
        Sony.turn_in();
        Sony.cookEspresso();
        System.out.println(Sony);
        Sony.cookAmericano();
        System.out.println(Sony);
    }
}
