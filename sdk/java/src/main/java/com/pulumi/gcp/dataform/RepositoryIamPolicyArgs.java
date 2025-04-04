// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryIamPolicyArgs Empty = new RepositoryIamPolicyArgs();

    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="repository", required=true)
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    private RepositoryIamPolicyArgs() {}

    private RepositoryIamPolicyArgs(RepositoryIamPolicyArgs $) {
        this.policyData = $.policyData;
        this.project = $.project;
        this.region = $.region;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryIamPolicyArgs $;

        public Builder() {
            $ = new RepositoryIamPolicyArgs();
        }

        public Builder(RepositoryIamPolicyArgs defaults) {
            $ = new RepositoryIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public RepositoryIamPolicyArgs build() {
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("RepositoryIamPolicyArgs", "policyData");
            }
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("RepositoryIamPolicyArgs", "repository");
            }
            return $;
        }
    }

}
