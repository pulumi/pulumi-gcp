// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.parametermanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParameterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParameterArgs Empty = new GetParameterArgs();

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="parameterId", required=true)
    private Output<String> parameterId;

    /**
     * @return The name of the parameter.
     * 
     */
    public Output<String> parameterId() {
        return this.parameterId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetParameterArgs() {}

    private GetParameterArgs(GetParameterArgs $) {
        this.parameterId = $.parameterId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParameterArgs $;

        public Builder() {
            $ = new GetParameterArgs();
        }

        public Builder(GetParameterArgs defaults) {
            $ = new GetParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterId The name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameterId(Output<String> parameterId) {
            $.parameterId = parameterId;
            return this;
        }

        /**
         * @param parameterId The name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameterId(String parameterId) {
            return parameterId(Output.of(parameterId));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetParameterArgs build() {
            if ($.parameterId == null) {
                throw new MissingRequiredPropertyException("GetParameterArgs", "parameterId");
            }
            return $;
        }
    }

}
