package Snack;

public class Snack {

    private String name;
    private int weight;
    private double price;
    private int rank;

    public Snack(String name, int weight, double price, int rank) {

        this.name = name;
        this.price = price;
        this.rank = rank;
        this.weight = weight;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", rank=" + rank
                ;
    }


    public boolean isEqualWeight(Snack o) {


        return o.getWeight() == this.getWeight();
    }
}


