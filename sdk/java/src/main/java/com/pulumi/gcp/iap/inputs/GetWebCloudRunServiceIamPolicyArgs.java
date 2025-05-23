// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebCloudRunServiceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebCloudRunServiceIamPolicyArgs Empty = new GetWebCloudRunServiceIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="cloudRunServiceName", required=true)
    private Output<String> cloudRunServiceName;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> cloudRunServiceName() {
        return this.cloudRunServiceName;
    }

    /**
     * The location of a cloud run service. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of a cloud run service. Used to find the parent resource to bind the IAM policy to. If not specified,
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

    private GetWebCloudRunServiceIamPolicyArgs() {}

    private GetWebCloudRunServiceIamPolicyArgs(GetWebCloudRunServiceIamPolicyArgs $) {
        this.cloudRunServiceName = $.cloudRunServiceName;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebCloudRunServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebCloudRunServiceIamPolicyArgs $;

        public Builder() {
            $ = new GetWebCloudRunServiceIamPolicyArgs();
        }

        public Builder(GetWebCloudRunServiceIamPolicyArgs defaults) {
            $ = new GetWebCloudRunServiceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudRunServiceName Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder cloudRunServiceName(Output<String> cloudRunServiceName) {
            $.cloudRunServiceName = cloudRunServiceName;
            return this;
        }

        /**
         * @param cloudRunServiceName Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder cloudRunServiceName(String cloudRunServiceName) {
            return cloudRunServiceName(Output.of(cloudRunServiceName));
        }

        /**
         * @param location The location of a cloud run service. Used to find the parent resource to bind the IAM policy to. If not specified,
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
         * @param location The location of a cloud run service. Used to find the parent resource to bind the IAM policy to. If not specified,
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

        public GetWebCloudRunServiceIamPolicyArgs build() {
            if ($.cloudRunServiceName == null) {
                throw new MissingRequiredPropertyException("GetWebCloudRunServiceIamPolicyArgs", "cloudRunServiceName");
            }
            return $;
        }
    }

}
