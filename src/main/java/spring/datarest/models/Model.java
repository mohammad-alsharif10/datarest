package spring.datarest.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MODEL_ID")
    private Long id;

    private String name;

    private Integer price;

    private Integer frets;

    @Column(name = "WOOD_TYPE")
    private String woodType;

    @Column(name = "YEAR_FIRST_MADE")
    private Date yearFirstMade;

    @ManyToOne
    @JoinColumn(name = "MANUFACTURER_ID")
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "MODEL_TYPE_ID")
    private ModelType modelType;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFrets() {
        return frets;
    }

    public void setFrets(Integer frets) {
        this.frets = frets;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Date getYearFirstMade() {
        return yearFirstMade;
    }

    public void setYearFirstMade(Date yearFirstMade) {
        this.yearFirstMade = yearFirstMade;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }
}
