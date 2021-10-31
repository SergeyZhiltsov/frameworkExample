package common.core;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import static org.aeonbits.owner.Config.DisableableFeature.PARAMETER_FORMATTING;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:ui-config.properties"})
@Config.DisableFeature({PARAMETER_FORMATTING})

public interface UiProjectConfig extends Config {
    UiProjectConfig BASE_UI_CONFIG = ConfigFactory.create(UiProjectConfig.class, System.getenv(), System.getProperties());
    @Key("BROWSER.NAME")
    String browserName();

    @Key("BROWSER.WIDTH")
    int browserWidth();

    @Key("BROWSER.HEIGHT")
    int browserHeight();

    @Key("PROJECT.BASE.URI")
    String baseUri();

    @Key("PROJECT.TEST.URI")
    String testUri();

    @Key("PROJECT.STG.URI")
    String stgUri();

    @Key("PROJECT.PROD.URI")
    String prodUri();

}
