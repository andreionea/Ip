public class Main {

    public static void main(String args[]){
        String numeProdus = "TV Samsung";
        History myHistory = History.getInstace();
        Customer client = new Customer("11");
        client.addShippment(numeProdus);
        myHistory.toString();
    }
}
