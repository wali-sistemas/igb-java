package co.igb.hanaws.dto.login;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRestDTO implements Serializable {
    @JsonProperty("odata.metadata")
    private String metaData;
    @JsonProperty("SessionId")
    private String sessionId;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("SessionTimeout")
    private Integer sessionTimeout;

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }
}