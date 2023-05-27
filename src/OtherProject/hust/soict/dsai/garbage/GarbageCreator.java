package OtherProject.hust.soict.dsai.garbage;

public class GarbageCreator {
    public void createGarbage(){
        for (int i = 0; i < 100000; i++){
            String garbage = new String("Garbage" + i);
        }
    }
}
