package example;
import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
/**
 * Created by Private on 10/12/15.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/html")
    public String getClichedMessageNoParam() {
        // Return some cliched textual content
        return "Hello World";
    }
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/html")
    @Path("/{param}")
    public String getClichedMessage(@PathParam("param") String msg) {
        // Return some cliched textual content
        //return "Hello World";
        return "<h1>Hello " + msg + "</h1>";
    }

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")
    @Path("/{param}/{newParam}")
    public String getClichedMessage(@PathParam("param") String msg, @PathParam("newParam") String newMsg) {
        // Return some cliched textual content
        //return "Hello World";
        return "<h1>Hello " + "old: " + msg + ". new: " + newMsg + ".</h1>";
    }


    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/helloworld");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
