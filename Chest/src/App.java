import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.CoinsGenerator;
import Fabric.FoodGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.NewLifeGenerator;
import Fabric.NullGenerator;
import Fabric.SilverGenerator;
import Fabric.WoodGenerator;


public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> listGenerator = new ArrayList<>();

        for (int i = 0; i < 23; i++) {
            listGenerator.add(new CoinsGenerator());
        }

        for (int i = 0; i < 20; i++) {
            listGenerator.add(new WoodGenerator());
        }

        for (int i = 0; i < 20; i++) {
            listGenerator.add(new FoodGenerator());
        }

        for (int i = 0; i < 15; i++) {
            listGenerator.add(new NullGenerator());
        }

        for (int i = 0; i < 10; i++) {
            listGenerator.add(new SilverGenerator());
        }

        for (int i = 0; i < 7; i++) {
            listGenerator.add(new GoldGenerator());
        }
        for (int i = 0; i < 3; i++) {
            listGenerator.add(new GemGenerator());
        }

        for (int i = 0; i < 3; i++) {
            listGenerator.add(new NewLifeGenerator());
        }


        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int index = ran.nextInt(101);
            listGenerator.get(index).openReward();
        }
    }
}