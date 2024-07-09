package tomiks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class MainService implements Service {
    protected String serviceName;
}
