import javafx.util.Pair;

import java.util.*;


public class History {

    private  Map<String,List<String>> history;
    private static History instance = new History(); // create an object
    private History(){
        this.history=new HashMap<>();
    } //constructor
    public static History getInstance(){  //get the only object available
        return instance;
    }

    public String getStatus(String id){
        return history.get(id).get(history.get(id).size());
    }

    public void addShipment(String id){
        List<String> aux = new LinkedList<>();
        aux.add(Status.IN_STORAGE.toString());

        history.put(id,aux);
//        history.put(id, new Pair<>(id,Status.IN_STORAGE.toString()));
    }

    public void changeStatus(String id, String status){
        List<String> aux=history.get(id);
        aux.add(status);
        history.put(id, aux);
    }

    @Override
    public String toString() {
        return "History{" +
                "history=" + history +
                '}';
    }
}
