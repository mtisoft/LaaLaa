package com.server.laalaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.server.laalaa.Repository.TypeUserRepository;
import com.server.laalaa.Model.TypeUser;


@Controller
@RequestMapping(path="/typeuser")
public class TypeUserController {

    @Autowired // This means to get the bean called usersRepository
         // Which is auto-generated by Spring, we will use it to handle the data
    private TypeUserRepository typeUserRepository;
    
    @PostMapping(path="/add")
    public @ResponseBody String addTypeUser(
           @RequestParam String code_type,
           @RequestParam String libelle){
           // @ResponseBody means the returned String is the response, not a view name
           // @RequestParam means it is a parameter from the GET or POST request

           TypeUser tu = new TypeUser();
           tu.setCODE_TYPE(code_type);
           tu.setLIBELLE(libelle);

           typeUserRepository.save(tu);
        
           return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<TypeUser> getAllTypeUser(){
        // This returns a JSON or XML with the users
        return typeUserRepository.findAll();
    }

}
