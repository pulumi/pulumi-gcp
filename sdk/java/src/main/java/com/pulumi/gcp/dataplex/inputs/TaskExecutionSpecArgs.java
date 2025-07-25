// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskExecutionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskExecutionSpecArgs Empty = new TaskExecutionSpecArgs();

    /**
     * The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${taskId} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument. An object containing a list of &#39;key&#39;: value pairs. Example: { &#39;name&#39;: &#39;wrench&#39;, &#39;mass&#39;: &#39;1.3kg&#39;, &#39;count&#39;: &#39;3&#39; }.
     * 
     */
    @Import(name="args")
    private @Nullable Output<Map<String,String>> args;

    /**
     * @return The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${taskId} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument. An object containing a list of &#39;key&#39;: value pairs. Example: { &#39;name&#39;: &#39;wrench&#39;, &#39;mass&#39;: &#39;1.3kg&#39;, &#39;count&#39;: &#39;3&#39; }.
     * 
     */
    public Optional<Output<Map<String,String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * The Cloud KMS key to use for encryption, of the form: projects/{project_number}/locations/{locationId}/keyRings/{key-ring-name}/cryptoKeys/{key-name}.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The Cloud KMS key to use for encryption, of the form: projects/{project_number}/locations/{locationId}/keyRings/{key-ring-name}/cryptoKeys/{key-name}.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * The maximum duration after which the job execution is expired. A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#39;3.5s&#39;.
     * 
     */
    @Import(name="maxJobExecutionLifetime")
    private @Nullable Output<String> maxJobExecutionLifetime;

    /**
     * @return The maximum duration after which the job execution is expired. A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#39;3.5s&#39;.
     * 
     */
    public Optional<Output<String>> maxJobExecutionLifetime() {
        return Optional.ofNullable(this.maxJobExecutionLifetime);
    }

    /**
     * The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the ExecutionSpec.service_account must belong to this project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the ExecutionSpec.service_account must belong to this project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private Output<String> serviceAccount;

    /**
     * @return Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }

    private TaskExecutionSpecArgs() {}

    private TaskExecutionSpecArgs(TaskExecutionSpecArgs $) {
        this.args = $.args;
        this.kmsKey = $.kmsKey;
        this.maxJobExecutionLifetime = $.maxJobExecutionLifetime;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskExecutionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskExecutionSpecArgs $;

        public Builder() {
            $ = new TaskExecutionSpecArgs();
        }

        public Builder(TaskExecutionSpecArgs defaults) {
            $ = new TaskExecutionSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${taskId} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument. An object containing a list of &#39;key&#39;: value pairs. Example: { &#39;name&#39;: &#39;wrench&#39;, &#39;mass&#39;: &#39;1.3kg&#39;, &#39;count&#39;: &#39;3&#39; }.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<Map<String,String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${taskId} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument. An object containing a list of &#39;key&#39;: value pairs. Example: { &#39;name&#39;: &#39;wrench&#39;, &#39;mass&#39;: &#39;1.3kg&#39;, &#39;count&#39;: &#39;3&#39; }.
         * 
         * @return builder
         * 
         */
        public Builder args(Map<String,String> args) {
            return args(Output.of(args));
        }

        /**
         * @param kmsKey The Cloud KMS key to use for encryption, of the form: projects/{project_number}/locations/{locationId}/keyRings/{key-ring-name}/cryptoKeys/{key-name}.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The Cloud KMS key to use for encryption, of the form: projects/{project_number}/locations/{locationId}/keyRings/{key-ring-name}/cryptoKeys/{key-name}.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param maxJobExecutionLifetime The maximum duration after which the job execution is expired. A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#39;3.5s&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxJobExecutionLifetime(@Nullable Output<String> maxJobExecutionLifetime) {
            $.maxJobExecutionLifetime = maxJobExecutionLifetime;
            return this;
        }

        /**
         * @param maxJobExecutionLifetime The maximum duration after which the job execution is expired. A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#39;3.5s&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxJobExecutionLifetime(String maxJobExecutionLifetime) {
            return maxJobExecutionLifetime(Output.of(maxJobExecutionLifetime));
        }

        /**
         * @param project The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the ExecutionSpec.service_account must belong to this project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the ExecutionSpec.service_account must belong to this project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccount Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public TaskExecutionSpecArgs build() {
            if ($.serviceAccount == null) {
                throw new MissingRequiredPropertyException("TaskExecutionSpecArgs", "serviceAccount");
            }
            return $;
        }
    }

}
