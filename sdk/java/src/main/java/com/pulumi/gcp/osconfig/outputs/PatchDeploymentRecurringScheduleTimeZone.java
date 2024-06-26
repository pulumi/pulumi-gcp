// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentRecurringScheduleTimeZone {
    /**
     * @return IANA Time Zone Database time zone, e.g. &#34;America/New_York&#34;.
     * 
     */
    private String id;
    /**
     * @return IANA Time Zone Database version number, e.g. &#34;2019a&#34;.
     * 
     */
    private @Nullable String version;

    private PatchDeploymentRecurringScheduleTimeZone() {}
    /**
     * @return IANA Time Zone Database time zone, e.g. &#34;America/New_York&#34;.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IANA Time Zone Database version number, e.g. &#34;2019a&#34;.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleTimeZone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String version;
        public Builder() {}
        public Builder(PatchDeploymentRecurringScheduleTimeZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("PatchDeploymentRecurringScheduleTimeZone", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public PatchDeploymentRecurringScheduleTimeZone build() {
            final var _resultValue = new PatchDeploymentRecurringScheduleTimeZone();
            _resultValue.id = id;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
