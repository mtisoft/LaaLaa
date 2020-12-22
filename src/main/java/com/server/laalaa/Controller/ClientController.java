package com.server.laalaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.server.laalaa.Exception.ResourceNotFoundException;
import com.server.laalaa.Model.Client;
import com.server.laalaa.Repository.ClientRepository;

@Controller
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired // This means to get the bean called usersRepository// Which is auto-generated by Spring, we will use it to handle the data
    private ClientRepository clientRepository;

    @Autowired
    EntityManager entityManager ;

    // // create employee rest api
    // @PostMapping("/employees")
    // public Employee createEmployee(@RequestBody Employee employee) {
    // return employeeRepository.save(employee);
    // }

    // adding a client
    @PostMapping(path = "/add")
    public @ResponseBody String addClient(@RequestParam String code_client, @RequestParam String nom,
            @RequestParam String prenom, @RequestParam char sexe, @RequestParam Integer telephone,
            @RequestParam Integer nbre_cmde) {

        Client cl = new Client();

        cl.setCODE_CLIENT(code_client);
        cl.setNOM(nom);
        cl.setPRENOM(prenom);
        cl.setSEXE(sexe);
        cl.setTELEPHONE(telephone);
        cl.setNBRE_CMDE(nbre_cmde);

        clientRepository.save(cl);

        return "saved";
    }

    // update a client
    @PutMapping("/update/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Integer id, @RequestParam String CODE_CLIENT,
            @RequestParam String Nom, @RequestParam String Prenom, @RequestParam Character sexe,
            @RequestParam Integer Telephone, @RequestParam Integer NBRE_CMDE) {

        Client cli = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not exist with id :" + id));

        Client cli_fin = clientRepository.save(cli);
        return ResponseEntity.ok(cli_fin);
    }

    // get all client
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Client> getAllClient() {
        return clientRepository.findAll();
    }

    // delete a client
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteClient(@PathVariable Integer id) {

        Client cli = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        clientRepository.delete(cli);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    // select a client
    @GetMapping("/select/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id_Client) {
        Client cli = clientRepository.findById(id_Client)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id_Client));
        return ResponseEntity.ok(cli);
    }

    @GetMapping("/Identifiant/{id}")
    @ResponseBody ArrayList<Client> getClientqueryByID(@PathVariable Integer id){
           
        String qlString ="select c from Client c where IDCLIENT="+id;
        System.out.println(qlString);
        Query query = entityManager.createQuery(qlString);
        ArrayList<Client> resultList = (ArrayList<Client>)query.getResultList();
        ArrayList<Client> clients =resultList;
        return clients ;
    }

    @GetMapping("/CodeCli/{cl}")
    @ResponseBody ArrayList<Client> getClientqueryCodeClient(@PathVariable String cl){
           
        String qlString ="select c from Client c where code_CLIENT='"+cl+"'";
        System.out.println(qlString);
        Query query = entityManager.createQuery(qlString);
        ArrayList<Client> resultList = (ArrayList<Client>)query.getResultList();
        ArrayList<Client> clients =resultList;
        return clients ;
    }

    //@RequestMapping(value = "/{id}/identifiant/{code}", method=RequestMethod.GET)
    @GetMapping(path = "/{id}/identifiant/{code}")
    @ResponseBody ArrayList<Client> mutiplePathVariable(@PathVariable("id") Integer id, @PathVariable("code") String code) {
        //String qlString = "select c from Client c where id="+id+ " and code_CLIENT='"+code+"'";
        String qlString = "select  c.NOM , c.TELEPHONE from Client c where id="+id+ " or code_CLIENT='"+code+"'";
        System.out.println(qlString);
        Query query = entityManager.createQuery(qlString);
        ArrayList<Client> clients =(ArrayList<Client>)query.getResultList();
        return clients;
    }
    
    
}
