package RDR;

public class Duck {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Duck(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Duck number: " + number;
    }
}
