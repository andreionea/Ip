import java.util.Vector;

public class Shipment {
    public String id;
    public String status;

    public Shipment(String id) {
        this.id = id;
        History.addShipment(id);
    }

    public void changeStatus(Status status) {

        this.status = status.toString();
        History.changeStatus(this.id,this.status);
    }

    public String getStatus() {
        return this.status;
    }


}