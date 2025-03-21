// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateParameterValidation;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateParameter {
    /**
     * @return Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    private @Nullable String description;
    /**
     * @return Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths. A field path is similar in syntax to a .sparkJob.args
     * 
     */
    private List<String> fields;
    /**
     * @return Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    private String name;
    /**
     * @return Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    private @Nullable WorkflowTemplateParameterValidation validation;

    private WorkflowTemplateParameter() {}
    /**
     * @return Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths. A field path is similar in syntax to a .sparkJob.args
     * 
     */
    public List<String> fields() {
        return this.fields;
    }
    /**
     * @return Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    public Optional<WorkflowTemplateParameterValidation> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private List<String> fields;
        private String name;
        private @Nullable WorkflowTemplateParameterValidation validation;
        public Builder() {}
        public Builder(WorkflowTemplateParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.validation = defaults.validation;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder fields(List<String> fields) {
            if (fields == null) {
              throw new MissingRequiredPropertyException("WorkflowTemplateParameter", "fields");
            }
            this.fields = fields;
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkflowTemplateParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder validation(@Nullable WorkflowTemplateParameterValidation validation) {

            this.validation = validation;
            return this;
        }
        public WorkflowTemplateParameter build() {
            final var _resultValue = new WorkflowTemplateParameter();
            _resultValue.description = description;
            _resultValue.fields = fields;
            _resultValue.name = name;
            _resultValue.validation = validation;
            return _resultValue;
        }
    }
}
