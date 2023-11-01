// ex 5
public class Bottle {
    private double totalCapacity;
    private double avaiableLiquid;
    private boolean open;

    public Bottle(double totalCapacity, double avaiableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.avaiableLiquid = avaiableLiquid;
        this.open = open;
    }

    public boolean liquidQuantity() {
        if (avaiableLiquid > totalCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public double getAvaiableLiquid() {
        return avaiableLiquid;
    }

    public double getTotalCapacity() {
        return totalCapacity - avaiableLiquid;
    }

    public String openBottle() {
        if (open == true) {
            return "The bottle is already opened!";
        } else {
            open = true;
            return "Bottle is opened.";
        }
    }

    public String closeBottle() {
        if (open == false) {
            return "The bottle is already closed!";
        } else {
            open = false;
            return "Bottle is closed.";
        }
    }

    public String drink(double amountToDrink) {
        double remainingLiquid = avaiableLiquid - amountToDrink;
        if (amountToDrink > avaiableLiquid) {
            return "There's not enough liquid in the bottle!";
        }
        if (open == true) {
            return "You drank " + amountToDrink + " ml. There is still " + remainingLiquid + " ml in the bottle.";
        } else {
            return "The bottle is closed!";
        }
    }
}
