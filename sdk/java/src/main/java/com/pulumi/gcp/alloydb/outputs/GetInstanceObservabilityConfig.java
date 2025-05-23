// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetInstanceObservabilityConfig {
    /**
     * @return Whether assistive experiences are enabled for this AlloyDB instance.
     * 
     */
    private Boolean assistiveExperiencesEnabled;
    /**
     * @return Observability feature status for an instance.
     * 
     */
    private Boolean enabled;
    /**
     * @return Query string length. The default value is 10240. Any integer between 1024 and 100000 is considered valid.
     * 
     */
    private Integer maxQueryStringLength;
    /**
     * @return Preserve comments in the query string.
     * 
     */
    private Boolean preserveComments;
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. The default value is 5. Any integer between 0 and 200 is considered valid.
     * 
     */
    private Integer queryPlansPerMinute;
    /**
     * @return Record application tags for an instance. This flag is turned &#34;on&#34; by default.
     * 
     */
    private Boolean recordApplicationTags;
    /**
     * @return Track actively running queries. If not set, default value is &#34;off&#34;.
     * 
     */
    private Boolean trackActiveQueries;
    /**
     * @return Record wait event types during query execution for an instance.
     * 
     */
    private Boolean trackWaitEventTypes;
    /**
     * @return Record wait events during query execution for an instance.
     * 
     */
    private Boolean trackWaitEvents;

    private GetInstanceObservabilityConfig() {}
    /**
     * @return Whether assistive experiences are enabled for this AlloyDB instance.
     * 
     */
    public Boolean assistiveExperiencesEnabled() {
        return this.assistiveExperiencesEnabled;
    }
    /**
     * @return Observability feature status for an instance.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Query string length. The default value is 10240. Any integer between 1024 and 100000 is considered valid.
     * 
     */
    public Integer maxQueryStringLength() {
        return this.maxQueryStringLength;
    }
    /**
     * @return Preserve comments in the query string.
     * 
     */
    public Boolean preserveComments() {
        return this.preserveComments;
    }
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. The default value is 5. Any integer between 0 and 200 is considered valid.
     * 
     */
    public Integer queryPlansPerMinute() {
        return this.queryPlansPerMinute;
    }
    /**
     * @return Record application tags for an instance. This flag is turned &#34;on&#34; by default.
     * 
     */
    public Boolean recordApplicationTags() {
        return this.recordApplicationTags;
    }
    /**
     * @return Track actively running queries. If not set, default value is &#34;off&#34;.
     * 
     */
    public Boolean trackActiveQueries() {
        return this.trackActiveQueries;
    }
    /**
     * @return Record wait event types during query execution for an instance.
     * 
     */
    public Boolean trackWaitEventTypes() {
        return this.trackWaitEventTypes;
    }
    /**
     * @return Record wait events during query execution for an instance.
     * 
     */
    public Boolean trackWaitEvents() {
        return this.trackWaitEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceObservabilityConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean assistiveExperiencesEnabled;
        private Boolean enabled;
        private Integer maxQueryStringLength;
        private Boolean preserveComments;
        private Integer queryPlansPerMinute;
        private Boolean recordApplicationTags;
        private Boolean trackActiveQueries;
        private Boolean trackWaitEventTypes;
        private Boolean trackWaitEvents;
        public Builder() {}
        public Builder(GetInstanceObservabilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assistiveExperiencesEnabled = defaults.assistiveExperiencesEnabled;
    	      this.enabled = defaults.enabled;
    	      this.maxQueryStringLength = defaults.maxQueryStringLength;
    	      this.preserveComments = defaults.preserveComments;
    	      this.queryPlansPerMinute = defaults.queryPlansPerMinute;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.trackActiveQueries = defaults.trackActiveQueries;
    	      this.trackWaitEventTypes = defaults.trackWaitEventTypes;
    	      this.trackWaitEvents = defaults.trackWaitEvents;
        }

        @CustomType.Setter
        public Builder assistiveExperiencesEnabled(Boolean assistiveExperiencesEnabled) {
            if (assistiveExperiencesEnabled == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "assistiveExperiencesEnabled");
            }
            this.assistiveExperiencesEnabled = assistiveExperiencesEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxQueryStringLength(Integer maxQueryStringLength) {
            if (maxQueryStringLength == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "maxQueryStringLength");
            }
            this.maxQueryStringLength = maxQueryStringLength;
            return this;
        }
        @CustomType.Setter
        public Builder preserveComments(Boolean preserveComments) {
            if (preserveComments == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "preserveComments");
            }
            this.preserveComments = preserveComments;
            return this;
        }
        @CustomType.Setter
        public Builder queryPlansPerMinute(Integer queryPlansPerMinute) {
            if (queryPlansPerMinute == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "queryPlansPerMinute");
            }
            this.queryPlansPerMinute = queryPlansPerMinute;
            return this;
        }
        @CustomType.Setter
        public Builder recordApplicationTags(Boolean recordApplicationTags) {
            if (recordApplicationTags == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "recordApplicationTags");
            }
            this.recordApplicationTags = recordApplicationTags;
            return this;
        }
        @CustomType.Setter
        public Builder trackActiveQueries(Boolean trackActiveQueries) {
            if (trackActiveQueries == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "trackActiveQueries");
            }
            this.trackActiveQueries = trackActiveQueries;
            return this;
        }
        @CustomType.Setter
        public Builder trackWaitEventTypes(Boolean trackWaitEventTypes) {
            if (trackWaitEventTypes == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "trackWaitEventTypes");
            }
            this.trackWaitEventTypes = trackWaitEventTypes;
            return this;
        }
        @CustomType.Setter
        public Builder trackWaitEvents(Boolean trackWaitEvents) {
            if (trackWaitEvents == null) {
              throw new MissingRequiredPropertyException("GetInstanceObservabilityConfig", "trackWaitEvents");
            }
            this.trackWaitEvents = trackWaitEvents;
            return this;
        }
        public GetInstanceObservabilityConfig build() {
            final var _resultValue = new GetInstanceObservabilityConfig();
            _resultValue.assistiveExperiencesEnabled = assistiveExperiencesEnabled;
            _resultValue.enabled = enabled;
            _resultValue.maxQueryStringLength = maxQueryStringLength;
            _resultValue.preserveComments = preserveComments;
            _resultValue.queryPlansPerMinute = queryPlansPerMinute;
            _resultValue.recordApplicationTags = recordApplicationTags;
            _resultValue.trackActiveQueries = trackActiveQueries;
            _resultValue.trackWaitEventTypes = trackWaitEventTypes;
            _resultValue.trackWaitEvents = trackWaitEvents;
            return _resultValue;
        }
    }
}
