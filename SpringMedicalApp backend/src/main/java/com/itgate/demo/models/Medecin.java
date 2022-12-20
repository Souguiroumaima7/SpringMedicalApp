package com.itgate.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String FirstName ;
    private String LastName ;
    private String adress ;


    @OneToMany(mappedBy = "Medecin")
    private Collection<Specialiste>Specialistes ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Collection<Specialiste> getSpecialistes() {
        return Specialistes;
    }

    public void setSpecialistes(Collection<Specialiste> specialistes) {
        Specialistes = specialistes;
    }
}
