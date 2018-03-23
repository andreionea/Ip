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

    public void Customer(){}

    public void addShippment(String NumeProdus)
    {
        String idulMeu = idCustomer;

        Shippment myShippment = new Shippment(idulMeu);
    }
}
