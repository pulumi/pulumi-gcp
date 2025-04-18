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


public final class GetRegionalParameterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionalParameterArgs Empty = new GetRegionalParameterArgs();

    /**
     * The location of the regional parameter. eg us-central1
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the regional parameter. eg us-central1
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The name of the regional parameter.
     * 
     */
    @Import(name="parameterId", required=true)
    private Output<String> parameterId;

    /**
     * @return The name of the regional parameter.
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

    private GetRegionalParameterArgs() {}

    private GetRegionalParameterArgs(GetRegionalParameterArgs $) {
        this.location = $.location;
        this.parameterId = $.parameterId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionalParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionalParameterArgs $;

        public Builder() {
            $ = new GetRegionalParameterArgs();
        }

        public Builder(GetRegionalParameterArgs defaults) {
            $ = new GetRegionalParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location of the regional parameter. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the regional parameter. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parameterId The name of the regional parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameterId(Output<String> parameterId) {
            $.parameterId = parameterId;
            return this;
        }

        /**
         * @param parameterId The name of the regional parameter.
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

        public GetRegionalParameterArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetRegionalParameterArgs", "location");
            }
            if ($.parameterId == null) {
                throw new MissingRequiredPropertyException("GetRegionalParameterArgs", "parameterId");
            }
            return $;
        }
    }

}
