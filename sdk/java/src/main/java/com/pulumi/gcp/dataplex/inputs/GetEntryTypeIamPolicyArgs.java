// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryTypeIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntryTypeIamPolicyArgs Empty = new GetEntryTypeIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="entryTypeId", required=true)
    private Output<String> entryTypeId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> entryTypeId() {
        return this.entryTypeId;
    }

    /**
     * The location where entry type will be created in.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where entry type will be created in.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetEntryTypeIamPolicyArgs() {}

    private GetEntryTypeIamPolicyArgs(GetEntryTypeIamPolicyArgs $) {
        this.entryTypeId = $.entryTypeId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntryTypeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntryTypeIamPolicyArgs $;

        public Builder() {
            $ = new GetEntryTypeIamPolicyArgs();
        }

        public Builder(GetEntryTypeIamPolicyArgs defaults) {
            $ = new GetEntryTypeIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entryTypeId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder entryTypeId(Output<String> entryTypeId) {
            $.entryTypeId = entryTypeId;
            return this;
        }

        /**
         * @param entryTypeId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder entryTypeId(String entryTypeId) {
            return entryTypeId(Output.of(entryTypeId));
        }

        /**
         * @param location The location where entry type will be created in.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where entry type will be created in.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetEntryTypeIamPolicyArgs build() {
            if ($.entryTypeId == null) {
                throw new MissingRequiredPropertyException("GetEntryTypeIamPolicyArgs", "entryTypeId");
            }
            return $;
        }
    }

}
