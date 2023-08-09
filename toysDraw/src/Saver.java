import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.PriorityQueue;

public class Saver {
    public void save(PriorityQueue<Toy> queue){
        try (ObjectOutputStream saver = new ObjectOutputStream(new FileOutputStream("src/database.txt"))){
            saver.writeObject(queue);
        }catch (Exception e){
            System.out.println("Oooopse, error"+e);
        }
    }
}
