// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataProfileResultProfileFieldProfileStringProfile {
    /**
     * @return Average length of non-null values in the scanned data.
     * 
     */
    private @Nullable Integer averageLength;
    /**
     * @return Maximum length of non-null values in the scanned data.
     * 
     */
    private @Nullable String maxLength;
    /**
     * @return Minimum length of non-null values in the scanned data.
     * 
     */
    private @Nullable String minLength;

    private DatascanDataProfileResultProfileFieldProfileStringProfile() {}
    /**
     * @return Average length of non-null values in the scanned data.
     * 
     */
    public Optional<Integer> averageLength() {
        return Optional.ofNullable(this.averageLength);
    }
    /**
     * @return Maximum length of non-null values in the scanned data.
     * 
     */
    public Optional<String> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    /**
     * @return Minimum length of non-null values in the scanned data.
     * 
     */
    public Optional<String> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataProfileResultProfileFieldProfileStringProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer averageLength;
        private @Nullable String maxLength;
        private @Nullable String minLength;
        public Builder() {}
        public Builder(DatascanDataProfileResultProfileFieldProfileStringProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageLength = defaults.averageLength;
    	      this.maxLength = defaults.maxLength;
    	      this.minLength = defaults.minLength;
        }

        @CustomType.Setter
        public Builder averageLength(@Nullable Integer averageLength) {
            this.averageLength = averageLength;
            return this;
        }
        @CustomType.Setter
        public Builder maxLength(@Nullable String maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        @CustomType.Setter
        public Builder minLength(@Nullable String minLength) {
            this.minLength = minLength;
            return this;
        }
        public DatascanDataProfileResultProfileFieldProfileStringProfile build() {
            final var o = new DatascanDataProfileResultProfileFieldProfileStringProfile();
            o.averageLength = averageLength;
            o.maxLength = maxLength;
            o.minLength = minLength;
            return o;
        }
    }
}