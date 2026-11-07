package OOP_ex4_2;

public class BattleYear {

    private int maxFights;
    private int currentFights;

    private Battle[] figtsArr;

    private int currentSeason;

    public BattleYear(int currentFights, int currentSeason) {
        this.maxFights = 100;
        if (currentFights < 0) {
            currentFights = 0;
        }

        this.currentSeason = currentSeason;
        this.currentFights = currentFights;
        this.figtsArr = new Battle[maxFights];
    }

    public void addBattle(Battle fight) {

        if (this.currentFights < 100) {
            this.figtsArr[this.currentFights] = fight;
            this.currentFights++;
        }

    }

    public Battle[] getFigtsArr() {
        return this.figtsArr;
    }

    public int getCurrentSeason() {
        return this.currentSeason;
    }

    public Jclub getClubWithMostWins(Jclub[] clubs) {
        int[] clubWins = new int[clubs.length];

        for (int i = 0; i < this.currentFights; i++) {
            int winnerId = this.figtsArr[i].getIdWin();

            if (winnerId != 0) { // not draw
                for (int j = 0; j < clubs.length; j++) {
                    if (clubs[j].getWo(winnerId) != null) {
                        clubWins[j]++;
                    }
                }
            }
        }

        int maxIndex = 0;

        for (int i = 1; i < clubWins.length; i++) {
            if (clubWins[i] > clubWins[maxIndex]) {
                maxIndex = i;
            }
        }

        return clubs[maxIndex];
    }

}
