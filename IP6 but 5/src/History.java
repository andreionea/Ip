import java.util.*;


public class History {

    private static Map<String,String> history;
    private static History instance = new History(); // create an object
    private History(){} //constructor
    public static History getInstance(){  //get the only object available
        return instance;
    }

    public static String getStatus(String id){
        return history.get(id);
    }

    public static void addShipment(String id){
        history.put(id, Status.IN_STORAGE.toString());
    }

}
