package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.SecretaireRepository;
import com.itgate.demo.models.Secretaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Secretaire")
public class SecretaireController {

    @Autowired
    private SecretaireRepository iSecretaire;


    @GetMapping("/all")
    public List<Secretaire> getall(){
        return iSecretaire.findAll();
    }
    @GetMapping("/getone/{Id}")
    public Secretaire getone(@PathVariable Long Id){
        return iSecretaire.findOne(Id);
    }

    @PostMapping("/save")
    public Secretaire savesecretaire(Secretaire S, @PathVariable  Long id) {

        return iSecretaire.save(S);
    }
    @PutMapping("/update/{Id}")
    public Secretaire update(@RequestBody Secretaire p, @PathVariable Long Id){
        p.setId(Id);
        return iSecretaire.saveAndFlush(p);
    }
    @DeleteMapping("/delete/{Id}")
    public HashMap<String,String> deletesecraitaire(@PathVariable Long Id) {
        HashMap message=new HashMap();
        try{
            iSecretaire.delete(Id);
            message.put("etat","product deleted");
            return message;
        }
        catch (Exception e) {
            message.put("etat","product not deleted");
            return message;
        }
    }

}
