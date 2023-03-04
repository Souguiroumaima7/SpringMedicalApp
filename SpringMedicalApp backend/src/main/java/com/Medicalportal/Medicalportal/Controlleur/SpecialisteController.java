package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.SepecialisteRepository;
import com.itgate.demo.models.Specialiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Specialiste")
public class SpecialisteController {


    @Autowired
    private SepecialisteRepository iSpecialiste;

    @GetMapping("/all")
    public List<Specialiste> getall(){
        return iSpecialiste.findAll();
    }
    @GetMapping("/getone/{Id}")
    public Specialiste getone(@PathVariable Long Id){
        return iSpecialiste.findOne(Id);
    }

    @PostMapping("/save")
    public Specialiste savespecialiste(Specialiste SP, @PathVariable  Long id) {

        return iSpecialiste.save(SP);
    }
    @PutMapping("/update/{Id}")
    public Specialiste update(@RequestBody Specialiste SP, @PathVariable Long Id){
        SP.setId(Id);
        return iSpecialiste.saveAndFlush(SP);
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
