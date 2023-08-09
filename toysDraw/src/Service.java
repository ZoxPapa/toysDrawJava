import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class Service {
//    private double getRandomPercentage(){
//        Random random = new Random();
//        double k = random.nextDouble();
//        double l = Double.parseDouble(String.format("%.2f", k).replace(",", "."));
//        return l;
//    }

    private ArrayList<Toy> setCollectionOnWeight(ToysList toysList){
        ArrayList<Toy> myCollection = new ArrayList<>();
        for(Toy toy: toysList.toysList){
            for (int i = 0; i < toy.weight; i++) {
                myCollection.add(toy);
            }
        }
        return myCollection;
    }
    private int getRandomIndex(ArrayList<Toy> collection){
        Random random = new Random();
        int k = random.nextInt(collection.size());
        return k;
    }

    private Toy getToyOnWeight(ToysList toysList){
        ArrayList<Toy> listOfToys = setCollectionOnWeight(toysList);
        int index = getRandomIndex(listOfToys);
        Toy myToy = listOfToys.get(index);
        return myToy;
    }

    public PriorityQueue setCollection(int qty, ToysList toysList){
        PriorityQueue<Toy> queue = new PriorityQueue<>();
        for (int i = 0; i < qty; i++) {
            queue.add(getToyOnWeight(toysList));
        }
        return queue;
    }

    public String prioritiseToys(PriorityQueue queue){
        StringBuilder stringBuilder = new StringBuilder();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(queue.poll()+"\n");
        }
        return stringBuilder.toString();
    }

    public void saveWithoutPriority(PriorityQueue myQueue){
        Saver saver = new Saver();
        saver.save(myQueue);
    }

    public void saveWithPriority(PriorityQueue myQueue){
        SaverV2 saverV2 = new SaverV2();
        String priorityListToys =  this.prioritiseToys(myQueue);
        saverV2.save(priorityListToys);
    }



}
