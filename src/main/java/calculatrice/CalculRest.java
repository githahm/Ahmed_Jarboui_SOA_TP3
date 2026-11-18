package calculatrice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculatrice")
@Produces(MediaType.APPLICATION_JSON)
public class CalculRest {

    private final Calculatrice calc = new Calculatrice();

    @GET
    @Path("/add")
    public Operation add(@QueryParam("a") double a, @QueryParam("b") double b) {
        return new Operation(a, b, calc.additionner(a, b));
    }

    @GET
    @Path("/sub")
    public Operation sub(@QueryParam("a") double a, @QueryParam("b") double b) {
        return new Operation(a, b, calc.soustraire(a, b));
    }

    @GET
    @Path("/mul")
    public Operation mul(@QueryParam("a") double a, @QueryParam("b") double b) {
        return new Operation(a, b, calc.multiplier(a, b));
    }

    @GET
    @Path("/div")
    public Operation div(@QueryParam("a") double a, @QueryParam("b") double b) {
        return new Operation(a, b, calc.diviser(a, b));
    }
}