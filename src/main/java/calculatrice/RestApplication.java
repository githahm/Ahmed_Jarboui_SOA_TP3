package calculatrice;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/api")
public class RestApplication extends Application {
    // Jersey auto-scans the `calculatrice` package and finds CalculRest
    // thanks to its @Path annotation. Nothing to override.
}