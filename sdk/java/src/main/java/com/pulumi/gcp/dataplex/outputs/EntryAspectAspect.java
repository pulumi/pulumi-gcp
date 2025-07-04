// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryAspectAspect {
    /**
     * @return (Output)
     * The resource name of the type used to create this Aspect.
     * 
     */
    private @Nullable String aspectType;
    /**
     * @return (Output)
     * The time when the Aspect was created.
     * 
     */
    private @Nullable String createTime;
    /**
     * @return The content of the aspect in JSON form, according to its aspect type schema. The maximum size of the field is 120KB (encoded as UTF-8).
     * 
     */
    private String data;
    /**
     * @return (Output)
     * The path in the entry under which the aspect is attached.
     * 
     */
    private @Nullable String path;
    /**
     * @return (Output)
     * The time when the Aspect was last modified.
     * 
     */
    private @Nullable String updateTime;

    private EntryAspectAspect() {}
    /**
     * @return (Output)
     * The resource name of the type used to create this Aspect.
     * 
     */
    public Optional<String> aspectType() {
        return Optional.ofNullable(this.aspectType);
    }
    /**
     * @return (Output)
     * The time when the Aspect was created.
     * 
     */
    public Optional<String> createTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * @return The content of the aspect in JSON form, according to its aspect type schema. The maximum size of the field is 120KB (encoded as UTF-8).
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return (Output)
     * The path in the entry under which the aspect is attached.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return (Output)
     * The time when the Aspect was last modified.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryAspectAspect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aspectType;
        private @Nullable String createTime;
        private String data;
        private @Nullable String path;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(EntryAspectAspect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aspectType = defaults.aspectType;
    	      this.createTime = defaults.createTime;
    	      this.data = defaults.data;
    	      this.path = defaults.path;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder aspectType(@Nullable String aspectType) {

            this.aspectType = aspectType;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(@Nullable String createTime) {

            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder data(String data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("EntryAspectAspect", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {

            this.updateTime = updateTime;
            return this;
        }
        public EntryAspectAspect build() {
            final var _resultValue = new EntryAspectAspect();
            _resultValue.aspectType = aspectType;
            _resultValue.createTime = createTime;
            _resultValue.data = data;
            _resultValue.path = path;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
