import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class MyResource {


    @GET
    @Path("uri1")
    public void uri1() {
        System.out.println("uri1");
    }


}
