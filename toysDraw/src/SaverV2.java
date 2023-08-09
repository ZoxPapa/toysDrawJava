import java.io.FileWriter;
import java.util.PriorityQueue;

public class SaverV2 {
    public void save(String priorityQueue){
        try(FileWriter fileWriter = new FileWriter("src/databaseV2.txt")) {
            fileWriter.write(priorityQueue);
        }catch (Exception e){
            System.out.println("Oooopse, error"+e);
        }
    }
}
