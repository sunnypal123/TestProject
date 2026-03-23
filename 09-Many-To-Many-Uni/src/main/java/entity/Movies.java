package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity                         // ← was missing
public class Movies {

    @Id                         // ← was missing
    private int mid;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Actors> actors;

    public List<Actors> getActors() {       // ← renamed to getActors
        return actors;
    }
    public void setActors(List<Actors> actors) {  // ← renamed to setActors
        this.actors = actors;
    }
    public int getMid() {
        return mid;
    }
    public void setMid(int mid) {
        this.mid = mid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}