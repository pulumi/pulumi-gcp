// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnvValueFrom;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecContainerEnv {
    /**
     * @return Name of the environment variable.
     * 
     */
    private @Nullable String name;
    /**
     * @return Defaults to &#34;&#34;.
     * 
     */
    private @Nullable String value;
    /**
     * @return Source for the environment variable&#39;s value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom;

    private ServiceTemplateSpecContainerEnv() {}
    /**
     * @return Name of the environment variable.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Defaults to &#34;&#34;.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return Source for the environment variable&#39;s value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateSpecContainerEnvValueFrom> valueFrom() {
        return Optional.ofNullable(this.valueFrom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;
        private @Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom;
        public Builder() {}
        public Builder(ServiceTemplateSpecContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueFrom(@Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom) {

            this.valueFrom = valueFrom;
            return this;
        }
        public ServiceTemplateSpecContainerEnv build() {
            final var _resultValue = new ServiceTemplateSpecContainerEnv();
            _resultValue.name = name;
            _resultValue.value = value;
            _resultValue.valueFrom = valueFrom;
            return _resultValue;
        }
    }
}
