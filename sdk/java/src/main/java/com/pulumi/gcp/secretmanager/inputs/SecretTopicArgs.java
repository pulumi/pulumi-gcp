// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecretTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretTopicArgs Empty = new SecretTopicArgs();

    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private SecretTopicArgs() {}

    private SecretTopicArgs(SecretTopicArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretTopicArgs $;

        public Builder() {
            $ = new SecretTopicArgs();
        }

        public Builder(SecretTopicArgs defaults) {
            $ = new SecretTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
         * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
         * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SecretTopicArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}