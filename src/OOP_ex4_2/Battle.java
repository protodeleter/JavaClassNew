package OOP_ex4_2;

import Date.Date;

public class Battle {

    private int idWin;
    private Judoka wo1;
    private Judoka wo2;
    private Date bDate;

    public Battle() {
    }

    public Battle(Judoka wo1, Judoka wo2, int idWin, Date bDate) {
        this.wo1 = wo1;
        this.wo2 = wo2;
        this.idWin = idWin;
        this.bDate = bDate;
        
        if (wo1.getId() == idWin) {
            wo1.moreWin();
        } else if (wo2.getId() == idWin) {
            wo2.moreWin();
        }


    }

    public Judoka getWo1() {
        return this.wo1;
    }

    public void setWo1(Judoka wo1) {
        this.wo1 = wo1;
    }

    public Judoka getWo2() {
        return this.wo2;
    }

    public void setWo2(Judoka wo2) {
        this.wo2 = wo2;
    }

    public int getIdWin() {
        return this.idWin;
    }

    public void setIdWin(int idWin) {
        this.idWin = idWin;
    }

    public Date getbDate() {
        return this.bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;

    }

}
