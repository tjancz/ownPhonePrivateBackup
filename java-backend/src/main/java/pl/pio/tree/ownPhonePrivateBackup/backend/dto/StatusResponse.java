package pl.pio.tree.ownPhonePrivateBackup.backend.dto;

/**
 * Created by tomasz on 03.03.17.
 */
public class StatusResponse {
    private String reasult;

    public StatusResponse(String reasult) {
        this.reasult = reasult;
    }

    public String getReasult() {
        return reasult;
    }

    public void setReasult(String reasult) {
        this.reasult = reasult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusResponse that = (StatusResponse) o;

        return reasult != null ? reasult.equals(that.reasult) : that.reasult == null;
    }

    @Override
    public int hashCode() {
        return reasult != null ? reasult.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "StatusResponse{" +
                "reasult='" + reasult + '\'' +
                '}';
    }
}
