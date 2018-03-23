import java.util.*;

public class Customer {
    private List<Shippment> listaComenzi = new ArrayList<Shippment>();
    private String idCustomer;
    private String Name;

    public void setListaComenzi(List<Shippment> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Shippment> getListaComenzi() {
        return listaComenzi;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return Name;
    }

    public void Customer(String id){
        this.idCustomer=id;
    }

    public void addShippment(String NumeProdus)
    {
        Integer branza = (int)Math.random() * 10000;
        String idulMeu = idCustomer + branza.toString();

        Shippment myShippment = new Shippment(idulMeu);
        listaComenzi.add(myShippment);

    }
}
