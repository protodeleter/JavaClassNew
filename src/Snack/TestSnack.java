package Snack;

public class TestSnack {
    public static void main(String[] args) {


        Snack[] snackArray = new Snack[200];
        for (int i = 0; i < snackArray.length; i++) {
            double randPr = (int) (Math.random() * (100 - 1 + 1) + 1);
            int randWeight = (int) (Math.random() * (100 - 1 + 1) + 1);
            int randRank = (int) (Math.random() * (5 - 1 + 1) + 1);
            snackArray[i] = new Snack("Name " + i, randWeight, randPr, randRank);
        }

        Snack other = new Snack("other", 15, 12.5, 4);


        getAvg(snackArray, 2);
        compareWeights(snackArray, other);
        printCheapestNames(snackArray, 12.0);

        for (int i = 0; i < snackArray.length; i++) {
            System.out.println(snackArray[i]);
        }

    }

    public static double getAvg(Snack[] arr, int n) {

        double sum = 0;
        int weight = 0;

        int i;
        for (i = 0; i < arr.length; i++) {
            weight = arr[i].getWeight();
            if (weight >= 15 && weight <= 20 && arr[i].getRank() == n) {
                sum += arr[i].getPrice();
            } else {
                return 0;
            }
        }
        return sum / i;
    }

    public static void compareWeights(Snack[] arr, Snack o) {


        for (int i = 0; i < arr.length; i++) {


            if (arr[i].isEqualWeight(o)) {
                System.out.println(arr[i].toString());
            }

        }


    }

    public static void printCheapestNames(Snack[] arr, double price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < price) {
                System.out.println(arr[i].getName());
            }
        }
    }


}
