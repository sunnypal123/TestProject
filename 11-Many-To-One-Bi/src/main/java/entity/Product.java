package entity;

import java.util.List;
import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ← missing
    private int pid;
    private String name;
    private String brand;                                 // ← fixed typo "brnad"

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)  // ← fixed, was @ManyToOne
    private List<Review> reviews;                         // ← missing field

    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}