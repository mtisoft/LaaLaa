package com.server.laalaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.server.laalaa.Repository.EquipeRepository;
import com.server.laalaa.Model.Equipe;

@Controller // This means that this class is a Controller
@RequestMapping(path="/equipe") // This means URL's start with /demo (after Application path)
public class EquipeController {
    @Autowired // This means to get the bean called usersRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private EquipeRepository equipeRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewEquipe (
         @RequestParam String code_equipe, 
         @RequestParam String mat_superviseur ) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Equipe eq = new Equipe();
    eq.setCODE_EQUIPE(code_equipe);
    eq.setMAT_SUPERVISEUR(mat_superviseur);
    
    equipeRepository.save(eq);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Equipe> getAllEquipes() {
    // This returns a JSON or XML with the users
    return equipeRepository.findAll();
  }
}