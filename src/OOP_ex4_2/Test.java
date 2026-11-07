package OOP_ex4_2;

import Date.Date;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        Judoka jd1 = new Judoka("test", 95);
        Judoka jd2 = new Judoka("test2", 91.5);
        Judoka jd3 = new Judoka("test3", 92.5);
        Judoka jd4 = new Judoka("test4", 93.5);
        Judoka jd5 = new Judoka("test5", 94.5);
        Judoka jd6 = new Judoka("test5", 96.5);

        Jclub cl1 = new Jclub("Battle Royal");
        Jclub cl2 = new Jclub("Battle Royal2");
        Jclub cl3 = new Jclub("Battle Royal3");
        Jclub cl4 = new Jclub("Battle Royal4");
        Jclub cl5 = new Jclub("Battle Royal5");
        Jclub cl6 = new Jclub("Battle Royal6");

        Jclub[] clubs = new Jclub[]{cl1, cl2, cl3, cl4, cl6};

        cl1.addWo(jd1);
        cl2.addWo(jd2);
        cl3.addWo(jd3);
        cl4.addWo(jd4);
        cl5.addWo(jd5);
        cl6.addWo(jd6);


        BattleYear by = new BattleYear(0, 1);

//            public Battle(Judoka wo1, Judoka wo2, int idWin, Date bDate) {

        Battle b1 = new Battle(jd1, jd2, jd1.getId(), new Date(9, 5, 2026));
        Battle b2 = new Battle(jd3, jd4, jd3.getId(), new Date(9, 5, 2026));
        Battle b3 = new Battle(jd5, jd6, jd5.getId(), new Date(9, 5, 2026));
        Battle b4 = new Battle(jd1, jd3, jd1.getId(), new Date(9, 5, 2026));
        Battle b5 = new Battle(jd1, jd5, jd1.getId(), new Date(9, 5, 2026));


        by.addBattle(b1);
        by.addBattle(b2);
        by.addBattle(b3);
        by.addBattle(b4);
        by.addBattle(b5);

        Jclub winnerClub = by.getClubWithMostWins(clubs);
        System.out.println("Club with most wins: " + winnerClub.getName());
    }


}
