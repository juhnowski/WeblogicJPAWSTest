package webservice;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Entity
@SuppressWarnings("oracle.toplink.jpa.entity.id-mapping-unkown")
@Path("webservice")
@Consumes("*")
@Produces("*")
public class User {
    @Id
    private int id;
    private String name;
    private String password;
    
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @POST
    public void setId(int id){
        this.id = id;
    }

    @GET
    public int getId(){
        return id;
    }

    @POST
    public void setName(String name){
        this.name = name;
    }

    @GET
    public String getName(){
        return name;
    }

    @POST
    public void setPassword(String password){
        this.password = password;
    }

    @GET
    public String getPassword(){
        return password;
    }
}
