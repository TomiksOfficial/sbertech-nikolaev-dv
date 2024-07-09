package tomiks;

public class ServiceUtil {
    // Нет явной логики ответа сервиса, поэтому использую фейковый response
    public static <T extends MainService> boolean useService(T service, String query, String response) {
        return service.validateQuery(query) && service.validateResponse(response);
    }
}
