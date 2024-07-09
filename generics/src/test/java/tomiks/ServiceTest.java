package tomiks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    void validateServiceUtil() {
        final String AUTH_SERVICE = "auth";
        final String DATA_SERVICE = "data";

        AuthService auth = new AuthService(AUTH_SERVICE);

        String query = AUTH_SERVICE + "::need authentication::login/::password/";
        String response = AUTH_SERVICE + "::password/test::login/admin";

        Assertions.assertThat(ServiceUtil.useService(auth, query, response)).isEqualTo(true);

        DataService data = new DataService(DATA_SERVICE);

        query = DATA_SERVICE + "::data/some cool data";
        response = DATA_SERVICE + "::status/200";

        Assertions.assertThat(ServiceUtil.useService(data, query, response)).isEqualTo(true);
    }
}