package dk.matzon.jerseybinary.infrastructure;

import com.sun.jersey.api.core.DefaultResourceConfig;
import dk.matzon.jerseybinary.interfaces.rest.RemoteInterface;

public class RestApplication extends DefaultResourceConfig {

    public RestApplication() {
        super(RemoteInterface.class);
    }
}
