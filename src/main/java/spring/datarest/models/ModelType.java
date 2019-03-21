package spring.datarest.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModelType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MODEL_TYPE_ID")
    private Long id;

    private String name;


    @OneToMany(
            mappedBy = "modelType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Model> models = new ArrayList<Model>();

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

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
