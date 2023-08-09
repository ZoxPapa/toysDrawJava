import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /**
         * Creating service for creation collection
         */
        Service service = new Service();
        /**
         * Creating list of toys to draw
         */
        ToysList toysList = new ToysList();
        /**
         * Creating toys with 3 parameters: ID, name, weight for draw
         */
        Toy toy1 = new Toy(1, "jaja", 4);
        Toy toy2 = new Toy(2, "Kuku", 2);
        Toy toy3 = new Toy(3, "O", 1);
        /**
         * Adding toys to list. Only unique toys(with unique ID) will be added.
         */
        toysList.add(toy1);
        toysList.add(toy2);
        toysList.add(toy3);
        /**
         * There we get how many toys in sample we want
         */
        int quantityOfToys = 2; //TODO: There must by method or UI. How many toys we want in sample.
        /**
         * There we form sample of toys, based on their weight.
         */
        PriorityQueue myQueue = service.setCollection(quantityOfToys, toysList);

        /**
         * first method to save in file (without priority. used ObjectOutputStream)
         */
        service.saveWithoutPriority(myQueue);

        /**
         * second method to save in file (with priority(used PriorityQueue). used FileWriter)
         */
        service.saveWithPriority(myQueue);

    }
}