// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs;
import com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * Policy to control how the repository and its child resources are deleted. When set to `FORCE`, any child resources of this repository will also be deleted. Possible values: `DELETE`, `FORCE`. Defaults to `DELETE`.
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return Policy to control how the repository and its child resources are deleted. When set to `FORCE`, any child resources of this repository will also be deleted. Possible values: `DELETE`, `FORCE`. Defaults to `DELETE`.
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * Optional. The repository&#39;s user-friendly name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. The repository&#39;s user-friendly name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * 
     */
    @Import(name="gitRemoteSettings")
    private @Nullable Output<RepositoryGitRemoteSettingsArgs> gitRemoteSettings;

    /**
     * @return Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RepositoryGitRemoteSettingsArgs>> gitRemoteSettings() {
        return Optional.ofNullable(this.gitRemoteSettings);
    }

    /**
     * Optional. The reference to a KMS encryption key. If provided, it will be used to encrypt user data in the repository and all child resources.
     * It is not possible to add or update the encryption key after the repository is created. Example projects/[kms_project_id]/locations/[region]/keyRings/[key_region]/cryptoKeys/[key]
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return Optional. The reference to a KMS encryption key. If provided, it will be used to encrypt user data in the repository and all child resources.
     * It is not possible to add or update the encryption key after the repository is created. Example projects/[kms_project_id]/locations/[region]/keyRings/[key_region]/cryptoKeys/[key]
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Optional. Repository user labels.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Repository user labels.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The repository&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The repository&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. The name of the Secret Manager secret version to be used to interpolate variables into the .npmrc file for package installation operations. Must be in the format projects/*&#47;secrets/*&#47;versions/*. The file itself must be in a JSON format.
     * 
     */
    @Import(name="npmrcEnvironmentVariablesSecretVersion")
    private @Nullable Output<String> npmrcEnvironmentVariablesSecretVersion;

    /**
     * @return Optional. The name of the Secret Manager secret version to be used to interpolate variables into the .npmrc file for package installation operations. Must be in the format projects/*&#47;secrets/*&#47;versions/*. The file itself must be in a JSON format.
     * 
     */
    public Optional<Output<String>> npmrcEnvironmentVariablesSecretVersion() {
        return Optional.ofNullable(this.npmrcEnvironmentVariablesSecretVersion);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A reference to the region
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return A reference to the region
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The service account to run workflow invocations under.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account to run workflow invocations under.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * 
     */
    @Import(name="workspaceCompilationOverrides")
    private @Nullable Output<RepositoryWorkspaceCompilationOverridesArgs> workspaceCompilationOverrides;

    /**
     * @return If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RepositoryWorkspaceCompilationOverridesArgs>> workspaceCompilationOverrides() {
        return Optional.ofNullable(this.workspaceCompilationOverrides);
    }

    private RepositoryArgs() {}

    private RepositoryArgs(RepositoryArgs $) {
        this.deletionPolicy = $.deletionPolicy;
        this.displayName = $.displayName;
        this.gitRemoteSettings = $.gitRemoteSettings;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.name = $.name;
        this.npmrcEnvironmentVariablesSecretVersion = $.npmrcEnvironmentVariablesSecretVersion;
        this.project = $.project;
        this.region = $.region;
        this.serviceAccount = $.serviceAccount;
        this.workspaceCompilationOverrides = $.workspaceCompilationOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryArgs $;

        public Builder() {
            $ = new RepositoryArgs();
        }

        public Builder(RepositoryArgs defaults) {
            $ = new RepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deletionPolicy Policy to control how the repository and its child resources are deleted. When set to `FORCE`, any child resources of this repository will also be deleted. Possible values: `DELETE`, `FORCE`. Defaults to `DELETE`.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy Policy to control how the repository and its child resources are deleted. When set to `FORCE`, any child resources of this repository will also be deleted. Possible values: `DELETE`, `FORCE`. Defaults to `DELETE`.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param displayName Optional. The repository&#39;s user-friendly name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. The repository&#39;s user-friendly name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitRemoteSettings(@Nullable Output<RepositoryGitRemoteSettingsArgs> gitRemoteSettings) {
            $.gitRemoteSettings = gitRemoteSettings;
            return this;
        }

        /**
         * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitRemoteSettings(RepositoryGitRemoteSettingsArgs gitRemoteSettings) {
            return gitRemoteSettings(Output.of(gitRemoteSettings));
        }

        /**
         * @param kmsKeyName Optional. The reference to a KMS encryption key. If provided, it will be used to encrypt user data in the repository and all child resources.
         * It is not possible to add or update the encryption key after the repository is created. Example projects/[kms_project_id]/locations/[region]/keyRings/[key_region]/cryptoKeys/[key]
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Optional. The reference to a KMS encryption key. If provided, it will be used to encrypt user data in the repository and all child resources.
         * It is not possible to add or update the encryption key after the repository is created. Example projects/[kms_project_id]/locations/[region]/keyRings/[key_region]/cryptoKeys/[key]
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels Optional. Repository user labels.
         * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Repository user labels.
         * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The repository&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The repository&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param npmrcEnvironmentVariablesSecretVersion Optional. The name of the Secret Manager secret version to be used to interpolate variables into the .npmrc file for package installation operations. Must be in the format projects/*&#47;secrets/*&#47;versions/*. The file itself must be in a JSON format.
         * 
         * @return builder
         * 
         */
        public Builder npmrcEnvironmentVariablesSecretVersion(@Nullable Output<String> npmrcEnvironmentVariablesSecretVersion) {
            $.npmrcEnvironmentVariablesSecretVersion = npmrcEnvironmentVariablesSecretVersion;
            return this;
        }

        /**
         * @param npmrcEnvironmentVariablesSecretVersion Optional. The name of the Secret Manager secret version to be used to interpolate variables into the .npmrc file for package installation operations. Must be in the format projects/*&#47;secrets/*&#47;versions/*. The file itself must be in a JSON format.
         * 
         * @return builder
         * 
         */
        public Builder npmrcEnvironmentVariablesSecretVersion(String npmrcEnvironmentVariablesSecretVersion) {
            return npmrcEnvironmentVariablesSecretVersion(Output.of(npmrcEnvironmentVariablesSecretVersion));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
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
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region A reference to the region
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region A reference to the region
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param serviceAccount The service account to run workflow invocations under.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account to run workflow invocations under.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder workspaceCompilationOverrides(@Nullable Output<RepositoryWorkspaceCompilationOverridesArgs> workspaceCompilationOverrides) {
            $.workspaceCompilationOverrides = workspaceCompilationOverrides;
            return this;
        }

        /**
         * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder workspaceCompilationOverrides(RepositoryWorkspaceCompilationOverridesArgs workspaceCompilationOverrides) {
            return workspaceCompilationOverrides(Output.of(workspaceCompilationOverrides));
        }

        public RepositoryArgs build() {
            return $;
        }
    }

}
