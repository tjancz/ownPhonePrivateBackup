package pl.pio.tree.ownPhonePrivateBackup.backend.handlers;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tomasz on 02.03.17.
 */
public class IndexHandler extends AbstractHandler {
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

        final PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Jetty 9</h1>");

        baseRequest.setHandled(true);
    }
}
