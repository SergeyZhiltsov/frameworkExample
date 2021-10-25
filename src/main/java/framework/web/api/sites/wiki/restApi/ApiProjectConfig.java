package framework.web.api.sites.wiki.restApi;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import static org.aeonbits.owner.Config.DisableableFeature.PARAMETER_FORMATTING;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:api-config.properties"})
@Config.DisableFeature({PARAMETER_FORMATTING})

public interface ApiProjectConfig extends Config {
    ApiProjectConfig BASE_API_CONFIG = ConfigFactory.create(ApiProjectConfig.class, System.getenv(), System.getProperties());


}
