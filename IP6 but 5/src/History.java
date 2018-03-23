import java.util.*;


public class History {

    private  Map<String,String> history;
    private static History instance = new History(); // create an object
    private History(){} //constructor
    public static History getInstance(){  //get the only object available
        return instance;
    }

    public String getStatus(String id){
        return history.get(id);
    }

    public void addShipment(String id){
        history.put(id, Status.IN_STORAGE.toString());
    }

    public void changeStatus(String id, String status){
        history.replace(id, status);
    }

    public String getAllHistory() {
        return "History{ "+
                history.toString()
                +"}";
    }
}
