package Soldier;

import java.util.Scanner;

public class TestSoldier {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        Soldier[] soldiers = new Soldier[5];

        int height = 0;
        String personalName;

        for (int i = 0; i < soldiers.length; i++) {
            System.out.println("Enter Name");
            personalName = inp.nextLine();
            System.out.println("Enter height");
            height = inp.nextInt();
            inp.nextLine();
            soldiers[i] = new Soldier(personalName, height);
        }

        leftForDuty(soldiers);

    }

    /**
     * Checks is the int is a > b < c
     * a < b
     * last int < prev int
     *
     * @param soldiers
     */
    public static void leftForDuty(Soldier[] soldiers) {

        for (int i = 0; i < soldiers.length; i++) {
            if (
                    (i == 0 && soldiers[i].getHeight() < soldiers[i + 1].getHeight()
                            || i == soldiers.length - 1 && soldiers[i].getHeight() < soldiers[i - 1].getHeight())
                            ||
                            (i < soldiers.length - 1 &&
                                    i > 0 &&
                                    soldiers[i].getHeight() < soldiers[i + 1].getHeight() &&
                                    soldiers[i].getHeight() < soldiers[i - 1].getHeight())


            )
                System.out.println(soldiers[i].getPersonalName() + " is left for duty");
        }

//        10 12 11 14 13

    }


}
