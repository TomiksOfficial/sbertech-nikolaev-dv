package tomiks;

public interface Service {
    boolean validateQuery(String query);

    boolean validateResponse(String response);
}
