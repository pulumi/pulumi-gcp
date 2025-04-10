// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs();

    /**
     * Defaults to false. When false, files are
     * subject to validations based on the file type: Remote: A checksum must be
     * specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Defaults to false. When false, files are
     * subject to validations based on the file type: Remote: A checksum must be
     * specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * A Cloud Storage object. Structure is
     * documented below.
     * 
     */
    @Import(name="gcs")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs> gcs;

    /**
     * @return A Cloud Storage object. Structure is
     * documented below.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs>> gcs() {
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
     * A generic remote file. Structure is
     * documented below.
     * 
     */
    @Import(name="remote")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs> remote;

    /**
     * @return A generic remote file. Structure is
     * documented below.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs>> remote() {
        return Optional.ofNullable(this.remote);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.gcs = $.gcs;
        this.localPath = $.localPath;
        this.remote = $.remote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowInsecure Defaults to false. When false, files are
         * subject to validations based on the file type: Remote: A checksum must be
         * specified. Cloud Storage: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Defaults to false. When false, files are
         * subject to validations based on the file type: Remote: A checksum must be
         * specified. Cloud Storage: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param gcs A Cloud Storage object. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcs(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        /**
         * @param gcs A Cloud Storage object. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcs(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs gcs) {
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
         * @param remote A generic remote file. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder remote(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs> remote) {
            $.remote = remote;
            return this;
        }

        /**
         * @param remote A generic remote file. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder remote(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs remote) {
            return remote(Output.of(remote));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs build() {
            return $;
        }
    }

}
