package com.itgate.demo.models;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Long id ;

    private String Location ;
    private String Maladie ;




    @OneToMany(mappedBy = "Patient")
    private Collection<Rdv> Rdv ;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getMaladie() {
        return Maladie;
    }

    public void setMaladie(String maladie) {
        Maladie = maladie;
    }

    public Collection<com.itgate.demo.models.Rdv> getRdv() {
        return Rdv;
    }

    public void setRdv(Collection<com.itgate.demo.models.Rdv> rdv) {
        Rdv = rdv;
    }
}
