package ToyShop;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lottery {
    PriorityQueue<Toy> prizesList = new PriorityQueue<>(Toy::compareTo);
    public ArrayList<Toy> createToys() {
        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1,"Кукла", 20));
        toys.add(new Toy(2, "Мяч", 20));
        toys.add(new Toy(3,"Мишка", 60));

        return toys;
    }

    public PriorityQueue<Toy> createQueue(ArrayList<Toy> toys, int number) {

        for (int i = 0; i < toys.size(); i++) {
            for (int j = 0; j < (toys.get(i).getWeight() * number / 100); j++) {
                prizesList.add(toys.get(i));
            }
        }
        return prizesList;
    }

    public Toy lotteryResult(PriorityQueue<Toy> prizesList) {
        Random random = new Random();
        Toy result = null;

        int num = random.nextInt(0, prizesList.size());
        for (int i = 0; i <= num; i++) {
            result = prizesList.poll();
        }
        return result;
    }

    public void fileWriter(ArrayList<Toy> toys, String text, Integer number) throws IOException {
        FileWriter writer = new FileWriter(text);

        for (int i = 0; i < number; i++) {
            Toy toy = lotteryResult(createQueue(toys, number));
            writer.write(toy.toString() + "\n");
        }
        writer.close();
    }
}