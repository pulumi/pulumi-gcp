// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ConnectionAuthConfigSshPublicKeySshClientCertPassArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAuthConfigSshPublicKeySshClientCertPassArgs Empty = new ConnectionAuthConfigSshPublicKeySshClientCertPassArgs();

    /**
     * The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     * &lt;a name=&#34;nested_auth_config_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
     * 
     */
    @Import(name="secretVersion", required=true)
    private Output<String> secretVersion;

    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     * &lt;a name=&#34;nested_auth_config_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
     * 
     */
    public Output<String> secretVersion() {
        return this.secretVersion;
    }

    private ConnectionAuthConfigSshPublicKeySshClientCertPassArgs() {}

    private ConnectionAuthConfigSshPublicKeySshClientCertPassArgs(ConnectionAuthConfigSshPublicKeySshClientCertPassArgs $) {
        this.secretVersion = $.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAuthConfigSshPublicKeySshClientCertPassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAuthConfigSshPublicKeySshClientCertPassArgs $;

        public Builder() {
            $ = new ConnectionAuthConfigSshPublicKeySshClientCertPassArgs();
        }

        public Builder(ConnectionAuthConfigSshPublicKeySshClientCertPassArgs defaults) {
            $ = new ConnectionAuthConfigSshPublicKeySshClientCertPassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretVersion The resource name of the secret version in the format,
         * format as: projects/*&#47;secrets/*&#47;versions/*.
         * 
         * &lt;a name=&#34;nested_auth_config_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(Output<String> secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        /**
         * @param secretVersion The resource name of the secret version in the format,
         * format as: projects/*&#47;secrets/*&#47;versions/*.
         * 
         * &lt;a name=&#34;nested_auth_config_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(String secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        public ConnectionAuthConfigSshPublicKeySshClientCertPassArgs build() {
            if ($.secretVersion == null) {
                throw new MissingRequiredPropertyException("ConnectionAuthConfigSshPublicKeySshClientCertPassArgs", "secretVersion");
            }
            return $;
        }
    }

}
