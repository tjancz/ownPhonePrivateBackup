package pl.pio.tree.ownPhonePrivateBackup.backend;

import org.eclipse.jetty.server.Server;
import pl.pio.tree.ownPhonePrivateBackup.backend.handlers.IndexHandler;

/**
 * Created by tomasz on 02.03.17.
 */
public class MyServer {

    public static void main(final String... args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new IndexHandler());
        server.start();
        server.join();
    }
}
