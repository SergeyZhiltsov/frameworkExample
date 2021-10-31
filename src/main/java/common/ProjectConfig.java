package common;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import static org.aeonbits.owner.Config.DisableableFeature.PARAMETER_FORMATTING;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:config.properties"})
@Config.DisableFeature({PARAMETER_FORMATTING})

public interface ProjectConfig extends Config {
    ProjectConfig BASE_CONFIG = ConfigFactory.create(ProjectConfig.class, System.getenv(), System.getProperties());
    @Key("PROJECT.ENV")
    String env();

}
