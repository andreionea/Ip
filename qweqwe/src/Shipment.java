import java.util.Vector;

public class Shipment {
    public String id;
    public String status;
    private History history = History.getInstance();

    public Shipment(String id) {
        this.id = id;
        history.addShipment(id);
    }

    public void changeStatus(Status status) {

        this.status = status.toString();
        history.changeStatus(this.id,this.status);
    }

    public String getStatus() {
        return this.status;
    }


}