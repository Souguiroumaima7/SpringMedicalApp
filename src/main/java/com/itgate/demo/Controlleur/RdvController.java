package com.itgate.demo.Controlleur;


import com.itgate.demo.dao.RdvRepository;
import com.itgate.demo.dao.SepecialisteRepository;
import com.itgate.demo.models.Rdv;
import com.itgate.demo.models.Specialiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Rdv")
public class RdvController {

    @Autowired
    private RdvRepository iRdv;

    @GetMapping("/all")
    public List<Rdv> getall(){
        return iRdv.findAll();
    }
    @GetMapping("/getone/{Id}")
    public Rdv getone(@PathVariable Long Id){
        return iRdv.findOne(Id);
    }

    @PostMapping("/save")
    public Rdv save(Rdv R, @PathVariable  Long id) {

        return iRdv.save(R);
    }
    @PutMapping("/update/{Id}")
    public Specialiste update(@RequestBody Specialiste SP, @PathVariable Long Id){
        SP.setId(Id);
        return iRdv.saveAndFlush(SP);
    }
    @DeleteMapping("/delete/{Id}")
    public HashMap<String,String> deletespecialiste(@PathVariable Long Id) {
        HashMap message=new HashMap();
        try{
            iSpecialiste.delete(Id);
            message.put("etat","product deleted");
            return message;
        }
        catch (Exception e) {
            message.put("etat","product not deleted");
            return message;
        }
    }
}
