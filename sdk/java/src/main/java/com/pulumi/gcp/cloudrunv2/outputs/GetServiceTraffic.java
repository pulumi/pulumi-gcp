// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTraffic {
    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    private Integer percent;
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    private String revision;
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    private String tag;
    /**
     * @return The allocation type for this traffic target. Possible values: [&#34;TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST&#34;, &#34;TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION&#34;]
     * 
     */
    private String type;

    private GetServiceTraffic() {}
    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    public Integer percent() {
        return this.percent;
    }
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    public String revision() {
        return this.revision;
    }
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return The allocation type for this traffic target. Possible values: [&#34;TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST&#34;, &#34;TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION&#34;]
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTraffic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percent;
        private String revision;
        private String tag;
        private String type;
        public Builder() {}
        public Builder(GetServiceTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder percent(Integer percent) {
            if (percent == null) {
              throw new MissingRequiredPropertyException("GetServiceTraffic", "percent");
            }
            this.percent = percent;
            return this;
        }
        @CustomType.Setter
        public Builder revision(String revision) {
            if (revision == null) {
              throw new MissingRequiredPropertyException("GetServiceTraffic", "revision");
            }
            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("GetServiceTraffic", "tag");
            }
            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTraffic", "type");
            }
            this.type = type;
            return this;
        }
        public GetServiceTraffic build() {
            final var _resultValue = new GetServiceTraffic();
            _resultValue.percent = percent;
            _resultValue.revision = revision;
            _resultValue.tag = tag;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
