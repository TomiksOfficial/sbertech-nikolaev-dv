package tomiks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    void validateServiceUtil() {
        AuthService auth = new AuthService("auth");

        String query = auth.serviceName + "::need authentication::login/::password/";
        String response = auth.serviceName + "::password/test::login/admin";

        Assertions.assertThat(ServiceUtil.useService(auth, query, response)).isEqualTo(true);

        DataService data = new DataService("data");

        query = data.serviceName + "::data/some cool data";
        response = data.serviceName + "::status/200";

        Assertions.assertThat(ServiceUtil.useService(data, query, response)).isEqualTo(true);
    }
}