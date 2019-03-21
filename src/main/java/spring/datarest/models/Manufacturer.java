package spring.datarest.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MANUFACTURER_ID")
    private Long id;

    private String name;

    @Column(name = "FOUNDED_DATE")
    private Date foundedDate;

    @Column(name = "AVERAGE_YEARLY_SALES")
    private BigDecimal averageYearlySales;

    private Boolean active;

    @OneToMany(
            mappedBy = "manufacturer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Model> models = new ArrayList<Model>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Location headquarters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public BigDecimal getAverageYearlySales() {
        return averageYearlySales;
    }

    public void setAverageYearlySales(BigDecimal averageYearlySales) {
        this.averageYearlySales = averageYearlySales;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Location getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Location headquarters) {
        this.headquarters = headquarters;
    }
}
