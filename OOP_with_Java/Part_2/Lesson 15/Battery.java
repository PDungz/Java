public class Battery {
    private int energy;

    public Battery() {
        this.energy = 10;
    }

    public void setEnergy(int egy) {
        this.energy = egy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void decreaseEnergy() {
        this.energy = this.energy -2;
    }

}
