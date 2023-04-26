package capstone.java.remember.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Client {
    
    //**************************************** */
    //  Entity Properties
    //**************************************** */

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String name;

    public String nextAppt;

    public String serviceNeeded;

    public String serviceOffered;

    public String clientKnowledge;

    public String continuedConversation;

     //**************************************** */
    //  Constructors
    //**************************************** */

    public Client(){

    }

    public Client(String name, String nextAppt, String serviceNeeded, String serviceOffered, String clientKnowledge, String continuedConversation){
        this.name = name;
        this.nextAppt = nextAppt;
        this.serviceNeeded = serviceNeeded;
        this.serviceOffered = serviceOffered;
        this.clientKnowledge = clientKnowledge;
        this.continuedConversation = continuedConversation;
    }

     //**************************************** */
    //  Getters and Setters
    //**************************************** */

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNextAppt(){
        return this.nextAppt;
    }

    public void setNextAppt(String nextAppt){
        this.nextAppt = nextAppt;
    }

    public String getServiceNeeded(){
        return this.serviceNeeded;
    }

    public void setServiceNeeded(String serviceNeeded){
        this.serviceNeeded = serviceNeeded;
    }

    public String getServiceOffered(){
        return this.serviceOffered;
    }

    public void setServiceOffered(String serviceOffered){
        this.serviceOffered = serviceOffered;
    }

    public String getClientKnowledge(){
        return this.clientKnowledge;
    }

    public void setClientKnowledge(String clientKnowledge){
        this.clientKnowledge = clientKnowledge;
    }

    public String getContinuedConversation(){
        return this.continuedConversation;
    }

    public void setContinuedConversation(String continuedConversation){
        this.continuedConversation = continuedConversation;
    }

}