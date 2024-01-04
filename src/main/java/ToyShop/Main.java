package ToyShop;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Lottery lottery = new Lottery();

        ArrayList<Toy> toys = lottery.createToys();

        int number = 10;

        lottery.fileWriter(toys, "lottery_result.txt", number);
    }
}