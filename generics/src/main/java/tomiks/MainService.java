package tomiks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MainService implements Service {
    @Getter
    private String serviceName;

    @Override
    public boolean validateQuery(String query) {
        return false;
    }

    @Override
    public boolean validateResponse(String response) {
        return false;
    }
}
