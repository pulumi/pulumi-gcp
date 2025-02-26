// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceGuestAttributesQueryValue {
    /**
     * @return Key of the guest_attribute.
     * 
     */
    private String key;
    /**
     * @return Namespace of the guest_attribute.
     * 
     */
    private String namespace;
    /**
     * @return Value of the guest_attribute.
     * 
     */
    private String value;

    private GetInstanceGuestAttributesQueryValue() {}
    /**
     * @return Key of the guest_attribute.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Namespace of the guest_attribute.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Value of the guest_attribute.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGuestAttributesQueryValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String namespace;
        private String value;
        public Builder() {}
        public Builder(GetInstanceGuestAttributesQueryValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.namespace = defaults.namespace;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetInstanceGuestAttributesQueryValue", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("GetInstanceGuestAttributesQueryValue", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetInstanceGuestAttributesQueryValue", "value");
            }
            this.value = value;
            return this;
        }
        public GetInstanceGuestAttributesQueryValue build() {
            final var _resultValue = new GetInstanceGuestAttributesQueryValue();
            _resultValue.key = key;
            _resultValue.namespace = namespace;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
