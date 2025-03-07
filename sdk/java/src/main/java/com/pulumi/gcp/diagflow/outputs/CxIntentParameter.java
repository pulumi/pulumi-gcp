// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxIntentParameter {
    /**
     * @return The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/&lt;System Entity Type ID&gt; for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/entityTypes/&lt;Entity Type ID&gt; for developer entity types.
     * 
     */
    private String entityType;
    /**
     * @return The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    private String id;
    /**
     * @return Indicates whether the parameter represents a list of values.
     * 
     */
    private @Nullable Boolean isList;
    /**
     * @return Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging.
     * Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    private @Nullable Boolean redact;

    private CxIntentParameter() {}
    /**
     * @return The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/&lt;System Entity Type ID&gt; for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/entityTypes/&lt;Entity Type ID&gt; for developer entity types.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the parameter represents a list of values.
     * 
     */
    public Optional<Boolean> isList() {
        return Optional.ofNullable(this.isList);
    }
    /**
     * @return Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging.
     * Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    public Optional<Boolean> redact() {
        return Optional.ofNullable(this.redact);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityType;
        private String id;
        private @Nullable Boolean isList;
        private @Nullable Boolean redact;
        public Builder() {}
        public Builder(CxIntentParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.id = defaults.id;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
        }

        @CustomType.Setter
        public Builder entityType(String entityType) {
            if (entityType == null) {
              throw new MissingRequiredPropertyException("CxIntentParameter", "entityType");
            }
            this.entityType = entityType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("CxIntentParameter", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isList(@Nullable Boolean isList) {

            this.isList = isList;
            return this;
        }
        @CustomType.Setter
        public Builder redact(@Nullable Boolean redact) {

            this.redact = redact;
            return this;
        }
        public CxIntentParameter build() {
            final var _resultValue = new CxIntentParameter();
            _resultValue.entityType = entityType;
            _resultValue.id = id;
            _resultValue.isList = isList;
            _resultValue.redact = redact;
            return _resultValue;
        }
    }
}
