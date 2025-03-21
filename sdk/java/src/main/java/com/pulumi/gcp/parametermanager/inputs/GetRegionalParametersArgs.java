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


public final class GetRegionalParametersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionalParametersArgs Empty = new GetRegionalParametersArgs();

    /**
     * Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The location of regional parameter.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of regional parameter.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The ID of the project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetRegionalParametersArgs() {}

    private GetRegionalParametersArgs(GetRegionalParametersArgs $) {
        this.filter = $.filter;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionalParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionalParametersArgs $;

        public Builder() {
            $ = new GetRegionalParametersArgs();
        }

        public Builder(GetRegionalParametersArgs defaults) {
            $ = new GetRegionalParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filter string, adhering to the rules in List-operation filtering. List only parameters matching the filter. If filter is empty, all regional parameters are listed.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param location The location of regional parameter.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of regional parameter.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetRegionalParametersArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetRegionalParametersArgs", "location");
            }
            return $;
        }
    }

}
