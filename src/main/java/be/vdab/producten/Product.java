package be.vdab.producten;

public class Product {
    private long id;
    private String naam;

    public Product(long id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
