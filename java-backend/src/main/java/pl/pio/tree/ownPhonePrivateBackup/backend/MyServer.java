package pl.pio.tree.ownPhonePrivateBackup.backend;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import pl.pio.tree.ownPhonePrivateBackup.backend.resources.SampleResource;

/**
 * Created by tomasz on 02.03.17.
 */
public class MyServer {

    public static void main(final String... args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        Server server = new Server(8080);
        //server.setHandler(new IndexHandler());
        server.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", SampleResource.class.getCanonicalName());

        server.start();
        server.join();
    }
}
