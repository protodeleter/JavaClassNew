package OOP_ex4_2;

public class Jclub {


    private String jclubName;
    private int numW;

    /**
     * quantity of judokas in the club
     */
    private int num;

    private Judoka[] warriors;

    private int maxArr = 50;

    public Jclub(String jclubName) {
        this.jclubName = jclubName;
        this.warriors = new Judoka[maxArr];
        this.num = 0;
    }

    public Judoka[] getWoArray(int w1, int w2) {
        int cc = 0;
        for (int i = 0; i < this.warriors.length; i++) {
            if (this.warriors[i].getWeight() > w1 && this.warriors[i].getWeight() < w2) {
                cc++;
            }
        }
        Judoka[] res = new Judoka[cc];

        int cc2 = 0;
        for (int i = 0; i < this.warriors.length; i++) {
            if (this.warriors[i].getWeight() > w1 && this.warriors[i].getWeight() < w2) {
                res[cc2] = this.warriors[i];
                cc2++;
            }
        }

        return res;
    }

    public void addWo(Judoka o) {
        if (this.num < this.warriors.length) {
            this.warriors[this.num] = o;
            this.num++;
        }
    }

    public Judoka[] getWarriors() {
        return this.warriors;
    }

    public Judoka getWo(int id) {
        for (int i = 0; i < this.num; i++) {
            if (id == this.warriors[i].getId()) {
                return this.warriors[i];
            }
        }

        return null;
    }

    public String getName() {
        return this.jclubName;
    }

    public int getNum() {
        return this.num;
    }
}
