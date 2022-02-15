import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geoId",
    "destinationId",
    "landmarkCityDestinationId",
    "type",
    "redirectPage",
    "latitude",
    "longitude",
    "searchDetail",
    "caption",
    "name"
})
public class Entity {

    @JsonProperty("geoId")
    private String geoId;
    @JsonProperty("destinationId")
    private String destinationId;
    @JsonProperty("landmarkCityDestinationId")
    private Object landmarkCityDestinationId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("redirectPage")
    private String redirectPage;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("searchDetail")
    private Object searchDetail;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geoId")
    public String getGeoId() {
        return geoId;
    }

    @JsonProperty("geoId")
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public Entity withGeoId(String geoId) {
        this.geoId = geoId;
        return this;
    }

    @JsonProperty("destinationId")
    public String getDestinationId() {
        return destinationId;
    }

    @JsonProperty("destinationId")
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public Entity withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    @JsonProperty("landmarkCityDestinationId")
    public Object getLandmarkCityDestinationId() {
        return landmarkCityDestinationId;
    }

    @JsonProperty("landmarkCityDestinationId")
    public void setLandmarkCityDestinationId(Object landmarkCityDestinationId) {
        this.landmarkCityDestinationId = landmarkCityDestinationId;
    }

    public Entity withLandmarkCityDestinationId(Object landmarkCityDestinationId) {
        this.landmarkCityDestinationId = landmarkCityDestinationId;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Entity withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("redirectPage")
    public String getRedirectPage() {
        return redirectPage;
    }

    @JsonProperty("redirectPage")
    public void setRedirectPage(String redirectPage) {
        this.redirectPage = redirectPage;
    }

    public Entity withRedirectPage(String redirectPage) {
        this.redirectPage = redirectPage;
        return this;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Entity withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Entity withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("searchDetail")
    public Object getSearchDetail() {
        return searchDetail;
    }

    @JsonProperty("searchDetail")
    public void setSearchDetail(Object searchDetail) {
        this.searchDetail = searchDetail;
    }

    public Entity withSearchDetail(Object searchDetail) {
        this.searchDetail = searchDetail;
        return this;
    }

    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Entity withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Entity withName(String name) {
        this.name = name;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Entity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
