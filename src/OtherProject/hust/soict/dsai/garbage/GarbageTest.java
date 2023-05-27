package OtherProject.hust.soict.dsai.garbage;

import java.io.IOException;

public class GarbageTest {
    public static void main(String[] args) throws IOException {
        GarbageCreator garbageCreator = new GarbageCreator();
        garbageCreator.createGarbage();

        NoGarbage noGarbage = new NoGarbage();
        String text = noGarbage.readTextFile("/Users/ibulmnie/Documents/GitHub/OOP/src/OtherProject/hust/soict/dsai/garbage/ConGaConVit.txt");
        System.out.println(text);
    }
}
