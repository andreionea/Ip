import java.util.*;

public class Customer {
    private List<Shipment> listaComenzi = new ArrayList<Shipment>();
    private String idCustomer;
    private String Name;

    public void setListaComenzi(List<Shipment> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Shipment> getListaComenzi() {
        return listaComenzi;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return Name;
    }

    public  Customer(String id){
        this.idCustomer=id;
    }

    public void addShippment(String NumeProdus)
    {
        Integer branza = (int)Math.random() * 10000;
        String idulMeu = idCustomer + branza.toString();

        Shipment myShippment = new Shipment(idulMeu);
        listaComenzi.add(myShippment);

    }
}
