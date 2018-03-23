public class Main {
    public static void main(String[] args) {
        History history = History.getInstance();

        System.out.println(history.toString());
        Shipment shipment =new Shipment("234234a000sd");
        System.out.println(history.toString());
        shipment.changeStatus(Status.CURRIER_STORAGE);
        System.out.println(history.toString());
    }
}
