// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.securitycenter.outputs.FolderCustomModuleCustomConfigCustomOutputPropertyValueExpression;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FolderCustomModuleCustomConfigCustomOutputProperty {
    /**
     * @return Name of the property for the custom output.
     * 
     */
    private @Nullable String name;
    /**
     * @return The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * 
     */
    private @Nullable FolderCustomModuleCustomConfigCustomOutputPropertyValueExpression valueExpression;

    private FolderCustomModuleCustomConfigCustomOutputProperty() {}
    /**
     * @return Name of the property for the custom output.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * 
     */
    public Optional<FolderCustomModuleCustomConfigCustomOutputPropertyValueExpression> valueExpression() {
        return Optional.ofNullable(this.valueExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderCustomModuleCustomConfigCustomOutputProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable FolderCustomModuleCustomConfigCustomOutputPropertyValueExpression valueExpression;
        public Builder() {}
        public Builder(FolderCustomModuleCustomConfigCustomOutputProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.valueExpression = defaults.valueExpression;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder valueExpression(@Nullable FolderCustomModuleCustomConfigCustomOutputPropertyValueExpression valueExpression) {
            this.valueExpression = valueExpression;
            return this;
        }
        public FolderCustomModuleCustomConfigCustomOutputProperty build() {
            final var o = new FolderCustomModuleCustomConfigCustomOutputProperty();
            o.name = name;
            o.valueExpression = valueExpression;
            return o;
        }
    }
}