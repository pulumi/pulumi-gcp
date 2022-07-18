// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs();

    /**
     * Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
     * 
     */
    @Import(name="archiveType", required=true)
    private Output<String> archiveType;

    /**
     * @return Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
     * 
     */
    public Output<String> archiveType() {
        return this.archiveType;
    }

    /**
     * Required. List of components for this repository. Must contain at least one item.
     * 
     */
    @Import(name="components", required=true)
    private Output<List<String>> components;

    /**
     * @return Required. List of components for this repository. Must contain at least one item.
     * 
     */
    public Output<List<String>> components() {
        return this.components;
    }

    /**
     * Required. Distribution of this repository.
     * 
     */
    @Import(name="distribution", required=true)
    private Output<String> distribution;

    /**
     * @return Required. Distribution of this repository.
     * 
     */
    public Output<String> distribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    @Import(name="gpgKey")
    private @Nullable Output<String> gpgKey;

    /**
     * @return URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    public Optional<Output<String>> gpgKey() {
        return Optional.ofNullable(this.gpgKey);
    }

    /**
     * Required. URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return Required. URI for this repository.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs $) {
        this.archiveType = $.archiveType;
        this.components = $.components;
        this.distribution = $.distribution;
        this.gpgKey = $.gpgKey;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveType Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
         * 
         * @return builder
         * 
         */
        public Builder archiveType(Output<String> archiveType) {
            $.archiveType = archiveType;
            return this;
        }

        /**
         * @param archiveType Required. Type of archive files in this repository. Possible values: ARCHIVE_TYPE_UNSPECIFIED, DEB, DEB_SRC
         * 
         * @return builder
         * 
         */
        public Builder archiveType(String archiveType) {
            return archiveType(Output.of(archiveType));
        }

        /**
         * @param components Required. List of components for this repository. Must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder components(Output<List<String>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Required. List of components for this repository. Must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder components(List<String> components) {
            return components(Output.of(components));
        }

        /**
         * @param components Required. List of components for this repository. Must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder components(String... components) {
            return components(List.of(components));
        }

        /**
         * @param distribution Required. Distribution of this repository.
         * 
         * @return builder
         * 
         */
        public Builder distribution(Output<String> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution Required. Distribution of this repository.
         * 
         * @return builder
         * 
         */
        public Builder distribution(String distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param gpgKey URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
         * 
         * @return builder
         * 
         */
        public Builder gpgKey(@Nullable Output<String> gpgKey) {
            $.gpgKey = gpgKey;
            return this;
        }

        /**
         * @param gpgKey URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
         * 
         * @return builder
         * 
         */
        public Builder gpgKey(String gpgKey) {
            return gpgKey(Output.of(gpgKey));
        }

        /**
         * @param uri Required. URI for this repository.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Required. URI for this repository.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs build() {
            $.archiveType = Objects.requireNonNull($.archiveType, "expected parameter 'archiveType' to be non-null");
            $.components = Objects.requireNonNull($.components, "expected parameter 'components' to be non-null");
            $.distribution = Objects.requireNonNull($.distribution, "expected parameter 'distribution' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}