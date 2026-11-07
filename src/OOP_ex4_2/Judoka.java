package OOP_ex4_2;

public class Judoka {

    private static int nextId = 1;

    private int id = 0;
    private int win = 0;
    private String woName;
    private double weight;

    public Judoka(String woName, double weight) {
        this.id = nextId;
        nextId++;

        this.win = 0;
        this.weight = weight;
        this.woName = woName;
    }

    public Judoka(Judoka o) {
        this.woName = o.woName;
        this.weight = o.weight;
        this.win = o.win;
    }

    public int getId() {
        return this.id;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getWoName() {
        return this.woName;
    }

    public int getWin() {
        return this.win;
    }

    public void moreWin() {
        this.win++;
    }
}
