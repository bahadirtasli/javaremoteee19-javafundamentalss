package model;

/**
 * Pocket exmp.
 *
 * @author bahadir tasli
 */

public class Pocket {
    private double money;

    public Pocket(int money) {
        this.money = money;

    }

    public double getMoney() {
       return money <= 10 ? 0 : money;
    }

    public void setMoney(int money) {
        if ( money < 0 || money > 3000) {
            this.money = money;
            System.out.println("I don't have enough space in my pocket for as much money!");
        } else {
            this.money = money;
        }
    }
}
