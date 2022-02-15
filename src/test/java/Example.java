import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "term",
    "moresuggestions",
    "autoSuggestInstance",
    "trackingID",
    "misspellingfallback",
    "suggestions",
    "geocodeFallback"
})
public class Example {

    @JsonProperty("term")
    private String term;
    @JsonProperty("moresuggestions")
    private Integer moresuggestions;
    @JsonProperty("autoSuggestInstance")
    private Object autoSuggestInstance;
    @JsonProperty("trackingID")
    private String trackingID;
    @JsonProperty("misspellingfallback")
    private Boolean misspellingfallback;
    @JsonProperty("suggestions")
    private List<Suggestion> suggestions = null;
    @JsonProperty("geocodeFallback")
    private Boolean geocodeFallback;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public Example withTerm(String term) {
        this.term = term;
        return this;
    }

    @JsonProperty("moresuggestions")
    public Integer getMoresuggestions() {
        return moresuggestions;
    }

    @JsonProperty("moresuggestions")
    public void setMoresuggestions(Integer moresuggestions) {
        this.moresuggestions = moresuggestions;
    }

    public Example withMoresuggestions(Integer moresuggestions) {
        this.moresuggestions = moresuggestions;
        return this;
    }

    @JsonProperty("autoSuggestInstance")
    public Object getAutoSuggestInstance() {
        return autoSuggestInstance;
    }

    @JsonProperty("autoSuggestInstance")
    public void setAutoSuggestInstance(Object autoSuggestInstance) {
        this.autoSuggestInstance = autoSuggestInstance;
    }

    public Example withAutoSuggestInstance(Object autoSuggestInstance) {
        this.autoSuggestInstance = autoSuggestInstance;
        return this;
    }

    @JsonProperty("trackingID")
    public String getTrackingID() {
        return trackingID;
    }

    @JsonProperty("trackingID")
    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    public Example withTrackingID(String trackingID) {
        this.trackingID = trackingID;
        return this;
    }

    @JsonProperty("misspellingfallback")
    public Boolean getMisspellingfallback() {
        return misspellingfallback;
    }

    @JsonProperty("misspellingfallback")
    public void setMisspellingfallback(Boolean misspellingfallback) {
        this.misspellingfallback = misspellingfallback;
    }

    public Example withMisspellingfallback(Boolean misspellingfallback) {
        this.misspellingfallback = misspellingfallback;
        return this;
    }

    @JsonProperty("suggestions")
    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    @JsonProperty("suggestions")
    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public Example withSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    @JsonProperty("geocodeFallback")
    public Boolean getGeocodeFallback() {
        return geocodeFallback;
    }

    @JsonProperty("geocodeFallback")
    public void setGeocodeFallback(Boolean geocodeFallback) {
        this.geocodeFallback = geocodeFallback;
    }

    public Example withGeocodeFallback(Boolean geocodeFallback) {
        this.geocodeFallback = geocodeFallback;
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

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
