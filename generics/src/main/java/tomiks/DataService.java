package tomiks;

public class DataService extends MainService {

    public DataService(String serviceName) {
        super(serviceName);
    }

    @Override
    public boolean validateQuery(String query) {
        return query.startsWith(super.getServiceName() + "::data/");
    }

    // Нет явной логики ответа сервиса, поэтому использую фейковый response
    @Override
    public boolean validateResponse(String response) {
        return response.startsWith(super.getServiceName() + "::") && response.contains("status/200");
    }

}
