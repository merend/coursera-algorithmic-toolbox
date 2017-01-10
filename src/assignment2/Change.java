package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {

        ArrayList<Integer> sortedCoinsValueList = new ArrayList<Integer>();
        sortedCoinsValueList.add(10);
        sortedCoinsValueList.add(5);
        sortedCoinsValueList.add(1);
        int numberOfCoins = 0 ;
        while(m > 0)
        {
            if (sortedCoinsValueList.size() > 0)
            {
                int currentBiggestCoin = sortedCoinsValueList.get(0);
                int division = m / currentBiggestCoin;
                if (division >= 1) {
                    numberOfCoins += division;
                }
                m -= currentBiggestCoin * division;
                sortedCoinsValueList.remove(0);
            }else{
                break;
            }
        }
        return numberOfCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long result =  getChange(m);
        long endTime = System.currentTimeMillis();
        System.out.println( "Change-result = " + result + " - took: " + (endTime - startTime) + " milliseconds");
    }
}

