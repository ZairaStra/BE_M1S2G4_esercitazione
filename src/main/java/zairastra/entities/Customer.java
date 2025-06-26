package zairastra.entities;

public class Customer {

    //ATTRIBUTI
    private long id;
    private String name;
    private int tier;

    //COSTRUTTORE
    public Customer(long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    //METODI
    //GETTER
    public long getId() {
        return id;
    }

    //SETTER
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', tier=" + tier + "}";
    }

}
