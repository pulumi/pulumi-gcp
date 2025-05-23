// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs Empty = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs();

    /**
     * Defaults to false. When false, files are subject to validations
     * based on the file type:
     * Remote: A checksum must be specified.
     * Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Defaults to false. When false, files are subject to validations
     * based on the file type:
     * Remote: A checksum must be specified.
     * Cloud Storage: An object generation number must be specified.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * Specifies a file available as a Cloud Storage Object.
     * Structure is documented below.
     * 
     */
    @Import(name="gcs")
    private @Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs> gcs;

    /**
     * @return Specifies a file available as a Cloud Storage Object.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath")
    private @Nullable Output<String> localPath;

    /**
     * @return A local path within the VM to use.
     * 
     */
    public Optional<Output<String>> localPath() {
        return Optional.ofNullable(this.localPath);
    }

    /**
     * Specifies a file available via some URI.
     * Structure is documented below.
     * 
     */
    @Import(name="remote")
    private @Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs> remote;

    /**
     * @return Specifies a file available via some URI.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs>> remote() {
        return Optional.ofNullable(this.remote);
    }

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs() {}

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.gcs = $.gcs;
        this.localPath = $.localPath;
        this.remote = $.remote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs();
        }

        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs defaults) {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowInsecure Defaults to false. When false, files are subject to validations
         * based on the file type:
         * Remote: A checksum must be specified.
         * Cloud Storage: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Defaults to false. When false, files are subject to validations
         * based on the file type:
         * Remote: A checksum must be specified.
         * Cloud Storage: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param gcs Specifies a file available as a Cloud Storage Object.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcs(@Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        /**
         * @param gcs Specifies a file available as a Cloud Storage Object.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcs(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        /**
         * @param localPath A local path within the VM to use.
         * 
         * @return builder
         * 
         */
        public Builder localPath(@Nullable Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        /**
         * @param localPath A local path within the VM to use.
         * 
         * @return builder
         * 
         */
        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        /**
         * @param remote Specifies a file available via some URI.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder remote(@Nullable Output<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs> remote) {
            $.remote = remote;
            return this;
        }

        /**
         * @param remote Specifies a file available via some URI.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder remote(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs remote) {
            return remote(Output.of(remote));
        }

        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs build() {
            return $;
        }
    }

}
