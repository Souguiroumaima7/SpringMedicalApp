package com.itgate.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Specialiste  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String Secialiste ;


    @ManyToOne
    @JoinColumn(name="id_Medecin")
    private Medecin Medecin;

    @OneToMany(mappedBy = "Specialiste")
    private Collection<Medecin>Medecins;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecialiste() {
        return Secialiste;
    }

    public void setSecialiste(String secialiste) {
        Secialiste = secialiste;
    }



    }

