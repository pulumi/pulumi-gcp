// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageEntryFulfillmentSetParameterAction {
    /**
     * @return Display name of the parameter.
     * 
     */
    private @Nullable String parameter;
    /**
     * @return The new JSON-encoded value of the parameter. A null value clears the parameter.
     * 
     */
    private @Nullable String value;

    private CxPageEntryFulfillmentSetParameterAction() {}
    /**
     * @return Display name of the parameter.
     * 
     */
    public Optional<String> parameter() {
        return Optional.ofNullable(this.parameter);
    }
    /**
     * @return The new JSON-encoded value of the parameter. A null value clears the parameter.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEntryFulfillmentSetParameterAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String parameter;
        private @Nullable String value;
        public Builder() {}
        public Builder(CxPageEntryFulfillmentSetParameterAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder parameter(@Nullable String parameter) {
            this.parameter = parameter;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CxPageEntryFulfillmentSetParameterAction build() {
            final var o = new CxPageEntryFulfillmentSetParameterAction();
            o.parameter = parameter;
            o.value = value;
            return o;
        }
    }
}