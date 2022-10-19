package HomeWorks;

public class FuelStorage {

    private FuelTypes[]fuels;

    private double totalPrice;

    public FuelTypes[] getFuels() {
        return fuels;
    }

    public void setFuels(FuelTypes[] fuel) {
        this.fuels = fuel;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
