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

    public Integer age;

     //**************************************** */
    //  Constructors
    //**************************************** */

    public Client(){

    }

    public Client(String name, Integer age){
        this.name = name;
        this.age = age;
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

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}