// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebIamPolicyPlainArgs Empty = new GetWebIamPolicyPlainArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetWebIamPolicyPlainArgs() {}

    private GetWebIamPolicyPlainArgs(GetWebIamPolicyPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetWebIamPolicyPlainArgs();
        }

        public Builder(GetWebIamPolicyPlainArgs defaults) {
            $ = new GetWebIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetWebIamPolicyPlainArgs build() {
            return $;
        }
    }

}