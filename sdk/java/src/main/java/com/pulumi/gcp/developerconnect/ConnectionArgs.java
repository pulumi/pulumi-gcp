// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.developerconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketCloudConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionBitbucketDataCenterConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionCryptoKeyConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionGithubConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionGithubEnterpriseConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabConfigArgs;
import com.pulumi.gcp.developerconnect.inputs.ConnectionGitlabEnterpriseConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     * 
     */
    @Import(name="bitbucketCloudConfig")
    private @Nullable Output<ConnectionBitbucketCloudConfigArgs> bitbucketCloudConfig;

    /**
     * @return Configuration for connections to an instance of Bitbucket Cloud.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionBitbucketCloudConfigArgs>> bitbucketCloudConfig() {
        return Optional.ofNullable(this.bitbucketCloudConfig);
    }

    /**
     * Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     * 
     */
    @Import(name="bitbucketDataCenterConfig")
    private @Nullable Output<ConnectionBitbucketDataCenterConfigArgs> bitbucketDataCenterConfig;

    /**
     * @return Configuration for connections to an instance of Bitbucket Data Center.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionBitbucketDataCenterConfigArgs>> bitbucketDataCenterConfig() {
        return Optional.ofNullable(this.bitbucketDataCenterConfig);
    }

    /**
     * Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * connection_id from the method_signature of Create RPC
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * connection_id from the method_signature of Create RPC
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoKeyConfig")
    private @Nullable Output<ConnectionCryptoKeyConfigArgs> cryptoKeyConfig;

    /**
     * @return The crypto key configuration. This field is used by the Customer-managed
     * encryption keys (CMEK) feature.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionCryptoKeyConfigArgs>> cryptoKeyConfig() {
        return Optional.ofNullable(this.cryptoKeyConfig);
    }

    /**
     * Optional. If disabled is set to true, functionality is disabled for this connection.
     * Repository based API methods and webhooks processing for repositories in
     * this connection will be disabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Optional. If disabled is set to true, functionality is disabled for this connection.
     * Repository based API methods and webhooks processing for repositories in
     * this connection will be disabled.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Configuration for connections to github.com.
     * Structure is documented below.
     * 
     */
    @Import(name="githubConfig")
    private @Nullable Output<ConnectionGithubConfigArgs> githubConfig;

    /**
     * @return Configuration for connections to github.com.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionGithubConfigArgs>> githubConfig() {
        return Optional.ofNullable(this.githubConfig);
    }

    /**
     * Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * 
     */
    @Import(name="githubEnterpriseConfig")
    private @Nullable Output<ConnectionGithubEnterpriseConfigArgs> githubEnterpriseConfig;

    /**
     * @return Configuration for connections to an instance of GitHub Enterprise.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionGithubEnterpriseConfigArgs>> githubEnterpriseConfig() {
        return Optional.ofNullable(this.githubEnterpriseConfig);
    }

    /**
     * Configuration for connections to gitlab.com.
     * Structure is documented below.
     * 
     */
    @Import(name="gitlabConfig")
    private @Nullable Output<ConnectionGitlabConfigArgs> gitlabConfig;

    /**
     * @return Configuration for connections to gitlab.com.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionGitlabConfigArgs>> gitlabConfig() {
        return Optional.ofNullable(this.gitlabConfig);
    }

    /**
     * Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     * 
     */
    @Import(name="gitlabEnterpriseConfig")
    private @Nullable Output<ConnectionGitlabEnterpriseConfigArgs> gitlabEnterpriseConfig;

    /**
     * @return Configuration for connections to an instance of GitLab Enterprise.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionGitlabEnterpriseConfigArgs>> gitlabEnterpriseConfig() {
        return Optional.ofNullable(this.gitlabEnterpriseConfig);
    }

    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    public Output<String> location() {
        return this.location;
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

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.annotations = $.annotations;
        this.bitbucketCloudConfig = $.bitbucketCloudConfig;
        this.bitbucketDataCenterConfig = $.bitbucketDataCenterConfig;
        this.connectionId = $.connectionId;
        this.cryptoKeyConfig = $.cryptoKeyConfig;
        this.disabled = $.disabled;
        this.etag = $.etag;
        this.githubConfig = $.githubConfig;
        this.githubEnterpriseConfig = $.githubEnterpriseConfig;
        this.gitlabConfig = $.gitlabConfig;
        this.gitlabEnterpriseConfig = $.gitlabEnterpriseConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. Allows clients to store small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Optional. Allows clients to store small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param bitbucketCloudConfig Configuration for connections to an instance of Bitbucket Cloud.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketCloudConfig(@Nullable Output<ConnectionBitbucketCloudConfigArgs> bitbucketCloudConfig) {
            $.bitbucketCloudConfig = bitbucketCloudConfig;
            return this;
        }

        /**
         * @param bitbucketCloudConfig Configuration for connections to an instance of Bitbucket Cloud.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketCloudConfig(ConnectionBitbucketCloudConfigArgs bitbucketCloudConfig) {
            return bitbucketCloudConfig(Output.of(bitbucketCloudConfig));
        }

        /**
         * @param bitbucketDataCenterConfig Configuration for connections to an instance of Bitbucket Data Center.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketDataCenterConfig(@Nullable Output<ConnectionBitbucketDataCenterConfigArgs> bitbucketDataCenterConfig) {
            $.bitbucketDataCenterConfig = bitbucketDataCenterConfig;
            return this;
        }

        /**
         * @param bitbucketDataCenterConfig Configuration for connections to an instance of Bitbucket Data Center.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bitbucketDataCenterConfig(ConnectionBitbucketDataCenterConfigArgs bitbucketDataCenterConfig) {
            return bitbucketDataCenterConfig(Output.of(bitbucketDataCenterConfig));
        }

        /**
         * @param connectionId Required. Id of the requesting object
         * If auto-generating Id server-side, remove this field and
         * connection_id from the method_signature of Create RPC
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Required. Id of the requesting object
         * If auto-generating Id server-side, remove this field and
         * connection_id from the method_signature of Create RPC
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-managed
         * encryption keys (CMEK) feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyConfig(@Nullable Output<ConnectionCryptoKeyConfigArgs> cryptoKeyConfig) {
            $.cryptoKeyConfig = cryptoKeyConfig;
            return this;
        }

        /**
         * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-managed
         * encryption keys (CMEK) feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyConfig(ConnectionCryptoKeyConfigArgs cryptoKeyConfig) {
            return cryptoKeyConfig(Output.of(cryptoKeyConfig));
        }

        /**
         * @param disabled Optional. If disabled is set to true, functionality is disabled for this connection.
         * Repository based API methods and webhooks processing for repositories in
         * this connection will be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Optional. If disabled is set to true, functionality is disabled for this connection.
         * Repository based API methods and webhooks processing for repositories in
         * this connection will be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param etag Optional. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param githubConfig Configuration for connections to github.com.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubConfig(@Nullable Output<ConnectionGithubConfigArgs> githubConfig) {
            $.githubConfig = githubConfig;
            return this;
        }

        /**
         * @param githubConfig Configuration for connections to github.com.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubConfig(ConnectionGithubConfigArgs githubConfig) {
            return githubConfig(Output.of(githubConfig));
        }

        /**
         * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubEnterpriseConfig(@Nullable Output<ConnectionGithubEnterpriseConfigArgs> githubEnterpriseConfig) {
            $.githubEnterpriseConfig = githubEnterpriseConfig;
            return this;
        }

        /**
         * @param githubEnterpriseConfig Configuration for connections to an instance of GitHub Enterprise.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubEnterpriseConfig(ConnectionGithubEnterpriseConfigArgs githubEnterpriseConfig) {
            return githubEnterpriseConfig(Output.of(githubEnterpriseConfig));
        }

        /**
         * @param gitlabConfig Configuration for connections to gitlab.com.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitlabConfig(@Nullable Output<ConnectionGitlabConfigArgs> gitlabConfig) {
            $.gitlabConfig = gitlabConfig;
            return this;
        }

        /**
         * @param gitlabConfig Configuration for connections to gitlab.com.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitlabConfig(ConnectionGitlabConfigArgs gitlabConfig) {
            return gitlabConfig(Output.of(gitlabConfig));
        }

        /**
         * @param gitlabEnterpriseConfig Configuration for connections to an instance of GitLab Enterprise.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitlabEnterpriseConfig(@Nullable Output<ConnectionGitlabEnterpriseConfigArgs> gitlabEnterpriseConfig) {
            $.gitlabEnterpriseConfig = gitlabEnterpriseConfig;
            return this;
        }

        /**
         * @param gitlabEnterpriseConfig Configuration for connections to an instance of GitLab Enterprise.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitlabEnterpriseConfig(ConnectionGitlabEnterpriseConfigArgs gitlabEnterpriseConfig) {
            return gitlabEnterpriseConfig(Output.of(gitlabEnterpriseConfig));
        }

        /**
         * @param labels Optional. Labels as key value pairs
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
         * @param labels Optional. Labels as key value pairs
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
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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

        public ConnectionArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "connectionId");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "location");
            }
            return $;
        }
    }

}
