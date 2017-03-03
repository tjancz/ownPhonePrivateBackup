package pl.pio.tree.ownPhonePrivateBackup.backend.resources;

import pl.pio.tree.ownPhonePrivateBackup.backend.dto.StatusResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tomasz on 03.03.17.
 */
@Path("sample")
public class SampleResource {

    @GET
    @Path("{hello}")
    @Produces(MediaType.APPLICATION_JSON)
    public StatusResponse hello(@PathParam("hello") final String hello) {
        return new StatusResponse(hello);
    }
}
