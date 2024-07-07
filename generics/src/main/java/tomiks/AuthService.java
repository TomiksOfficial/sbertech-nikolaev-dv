package tomiks;

public class AuthService extends MainService {

    public AuthService(String serviceName) {
        super(serviceName);
    }

    @Override
    public boolean validateQuery(String query) {
        return query.startsWith(super.getServiceName() + "::") && query.contains("login/::password/");
    }

    // Нет явной логики ответа сервиса, поэтому использую фейковый response
    @Override
    public boolean validateResponse(String response) {
        return response.startsWith(super.getServiceName() + "::") && response.contains("password/") && response.contains("::login/");
    }
}
