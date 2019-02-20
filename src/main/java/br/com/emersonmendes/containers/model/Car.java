package br.com.emersonmendes.containers.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(generator = "car_generator")
    @SequenceGenerator( name = "car_generator", sequenceName = "car_seq")
    private Long id;

    @Column(columnDefinition = "name")
    private String name;

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

}
