// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ConnectionAuthConfigUserPasswordPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAuthConfigUserPasswordPasswordArgs Empty = new ConnectionAuthConfigUserPasswordPasswordArgs();

    /**
     * The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     */
    @Import(name="secretVersion", required=true)
    private Output<String> secretVersion;

    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     */
    public Output<String> secretVersion() {
        return this.secretVersion;
    }

    private ConnectionAuthConfigUserPasswordPasswordArgs() {}

    private ConnectionAuthConfigUserPasswordPasswordArgs(ConnectionAuthConfigUserPasswordPasswordArgs $) {
        this.secretVersion = $.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAuthConfigUserPasswordPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAuthConfigUserPasswordPasswordArgs $;

        public Builder() {
            $ = new ConnectionAuthConfigUserPasswordPasswordArgs();
        }

        public Builder(ConnectionAuthConfigUserPasswordPasswordArgs defaults) {
            $ = new ConnectionAuthConfigUserPasswordPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretVersion The resource name of the secret version in the format,
         * format as: projects/*&#47;secrets/*&#47;versions/*.
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
         * @return builder
         * 
         */
        public Builder secretVersion(String secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        public ConnectionAuthConfigUserPasswordPasswordArgs build() {
            if ($.secretVersion == null) {
                throw new MissingRequiredPropertyException("ConnectionAuthConfigUserPasswordPasswordArgs", "secretVersion");
            }
            return $;
        }
    }

}
