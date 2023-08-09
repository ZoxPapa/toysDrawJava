import java.util.ArrayList;

public class ToysList extends ArrayList<Toy> implements Iterable<Toy>{
    ArrayList<Toy> toysList;

    public ToysList (){
        this.toysList = new ArrayList<>();
    }

    private boolean checkToyUniqId (Toy toy){
        for(Toy item: this.toysList) {
            if (toy.toyId.equals(item.toyId)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean add(Toy toy){
        if(checkToyUniqId(toy)){
            toysList.add(toy);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Toy toy: this.toysList){
            sb.append(toy.toString()+"\n");
        }
        return sb.toString();
    }
}
