package capstone.java.remember.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import capstone.java.remember.repositories.ClientRepository;
import capstone.java.remember.entities.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ClientController {

   public ClientRepository Clients;

   public ClientController(ClientRepository Clients){
    this.Clients = Clients;
   }

   //INDEX
   @CrossOrigin // Enable CORS <-
   @GetMapping("/clients")
   public List<Client> index(){
    return Clients.findAll();
   }
    
   //SHOW
   @CrossOrigin // Enable CORS <-
   @GetMapping("/clients/{id}")
   public Optional<Client> show(@PathVariable Integer id){
    return Clients.findById(id);
   }

   //CREATE
   @CrossOrigin // Enable CORS <-
   @PostMapping("/clients")
   public List<Client> create(@RequestBody Client newClient){
    Clients.save(newClient);
    return Clients.findAll();
   }

   //UPDATE
   @CrossOrigin // Enable CORS <-
   @PutMapping("/clients/{id}")
   public List<Client> update(@RequestBody Client fixClient, @PathVariable Integer id){
    Clients.findById(id).map(client -> {

        client.setName(fixClient.getName());
        client.setNextAppt(fixClient.getNextAppt());
        client.setServiceNeeded(fixClient.getServiceNeeded());
        client.setServiceOffered(fixClient.getServiceOffered());
        client.setClientKnowledge(fixClient.getClientKnowledge());
        client.setContinuedConversation(fixClient.getContinuedConversation());
        Clients.save(client);
        return client;

    });
    return Clients.findAll();
   }

   //DESTROY
   @CrossOrigin // Enable CORS <-
   @DeleteMapping("/clients/{id}")
   public List<Client> destroy(@PathVariable Integer id){
    Clients.deleteById(id);
    return Clients.findAll();
   }
}