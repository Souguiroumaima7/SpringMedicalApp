package com.itgate.demo.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String date ;
    private String description ;




    @ManyToOne
    @JoinColumn(name="id_Patient")
    private Patient Patient;



    @OneToMany(mappedBy = "Patient")
    private Collection<Rdv> Rdv ;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public com.itgate.demo.models.Patient getPatient() {
        return Patient;
    }

    public void setPatient(com.itgate.demo.models.Patient patient) {
        Patient = patient;
    }
}
