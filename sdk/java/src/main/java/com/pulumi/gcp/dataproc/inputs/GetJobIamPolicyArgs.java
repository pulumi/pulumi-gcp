// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobIamPolicyArgs Empty = new GetJobIamPolicyArgs();

    /**
     * The name or relative resource id of the job to manage IAM policies for.
     * 
     */
    @Import(name="jobId", required=true)
    private Output<String> jobId;

    /**
     * @return The name or relative resource id of the job to manage IAM policies for.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
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

    private GetJobIamPolicyArgs() {}

    private GetJobIamPolicyArgs(GetJobIamPolicyArgs $) {
        this.jobId = $.jobId;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobIamPolicyArgs $;

        public Builder() {
            $ = new GetJobIamPolicyArgs();
        }

        public Builder(GetJobIamPolicyArgs defaults) {
            $ = new GetJobIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId The name or relative resource id of the job to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The name or relative resource id of the job to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
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

        public GetJobIamPolicyArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}