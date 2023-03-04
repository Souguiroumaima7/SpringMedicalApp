package com.itgate.demo.models;


import javax.persistence.*;

@Entity
public class FichePatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id ;

    private String ref ;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
