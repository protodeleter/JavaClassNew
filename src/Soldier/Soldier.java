package Soldier;

public class Soldier {

    private String personalName;
    private int height;

    public Soldier(String personalName, int height) {

        this.height = height;
        this.personalName = personalName;

    }

    /**
     * name getter
     *
     * @return int
     */
    public String getPersonalName() {
        return this.personalName;
    }

    /**
     * height getter
     *
     * @return int
     */
    public int getHeight() {
        return this.height;
    }

    /**
     *
     * @return String
     */
    public String toString() {
        return this.personalName + " " + this.height;
    }
}
