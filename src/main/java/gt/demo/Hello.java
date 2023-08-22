package gt.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Ola da minha API de Filmes v2.0";
    }
}
