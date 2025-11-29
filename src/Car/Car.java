package Car;

public class Car {

    private String carType;
    private String color;
    private double kms;

    public Car(String carType, String color, double kms) {

        this.carType = carType;
        this.color = color;
        this.kms = kms;

    }

    public String getCarType() {
        return this.carType;
    }

//    public void setCarType(String carType) {
//        this.carType = carType;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getColor() {
        return this.color;
    }


    public double getKms() {
        return this.kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String toString() {
        return this.carType + " " + this.color + " " + this.kms;
    }
}
