// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionServiceConfigSecretVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionServiceConfigSecretVolumeArgs Empty = new FunctionServiceConfigSecretVolumeArgs();

    /**
     * The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
     * 
     */
    @Import(name="mountPath", required=true)
    private Output<String> mountPath;

    /**
     * @return The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
     * 
     */
    public Output<String> mountPath() {
        return this.mountPath;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     * List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     * Structure is documented below.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<List<FunctionServiceConfigSecretVolumeVersionArgs>> versions;

    /**
     * @return List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<FunctionServiceConfigSecretVolumeVersionArgs>>> versions() {
        return Optional.ofNullable(this.versions);
    }

    private FunctionServiceConfigSecretVolumeArgs() {}

    private FunctionServiceConfigSecretVolumeArgs(FunctionServiceConfigSecretVolumeArgs $) {
        this.mountPath = $.mountPath;
        this.projectId = $.projectId;
        this.secret = $.secret;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionServiceConfigSecretVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionServiceConfigSecretVolumeArgs $;

        public Builder() {
            $ = new FunctionServiceConfigSecretVolumeArgs();
        }

        public Builder(FunctionServiceConfigSecretVolumeArgs defaults) {
            $ = new FunctionServiceConfigSecretVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountPath The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
         * 
         * @return builder
         * 
         */
        public Builder mountPath(Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param projectId Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param secret Name of the secret in secret manager (not the full resource name).
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Name of the secret in secret manager (not the full resource name).
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param versions List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable Output<List<FunctionServiceConfigSecretVolumeVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(List<FunctionServiceConfigSecretVolumeVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        /**
         * @param versions List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versions(FunctionServiceConfigSecretVolumeVersionArgs... versions) {
            return versions(List.of(versions));
        }

        public FunctionServiceConfigSecretVolumeArgs build() {
            $.mountPath = Objects.requireNonNull($.mountPath, "expected parameter 'mountPath' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}