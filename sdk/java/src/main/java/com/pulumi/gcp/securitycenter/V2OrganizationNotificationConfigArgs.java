// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2OrganizationNotificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2OrganizationNotificationConfigArgs Empty = new V2OrganizationNotificationConfigArgs();

    /**
     * This must be unique within the organization.
     * 
     */
    @Import(name="configId", required=true)
    private Output<String> configId;

    /**
     * @return This must be unique within the organization.
     * 
     */
    public Output<String> configId() {
        return this.configId;
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * location Id is provided by organization. If not provided, Use global as default.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return location Id is provided by organization. If not provided, Use global as default.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    /**
     * @return The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    @Import(name="pubsubTopic", required=true)
    private Output<String> pubsubTopic;

    /**
     * @return The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }

    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    @Import(name="streamingConfig", required=true)
    private Output<V2OrganizationNotificationConfigStreamingConfigArgs> streamingConfig;

    /**
     * @return The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    public Output<V2OrganizationNotificationConfigStreamingConfigArgs> streamingConfig() {
        return this.streamingConfig;
    }

    private V2OrganizationNotificationConfigArgs() {}

    private V2OrganizationNotificationConfigArgs(V2OrganizationNotificationConfigArgs $) {
        this.configId = $.configId;
        this.description = $.description;
        this.location = $.location;
        this.organization = $.organization;
        this.pubsubTopic = $.pubsubTopic;
        this.streamingConfig = $.streamingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2OrganizationNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2OrganizationNotificationConfigArgs $;

        public Builder() {
            $ = new V2OrganizationNotificationConfigArgs();
        }

        public Builder(V2OrganizationNotificationConfigArgs defaults) {
            $ = new V2OrganizationNotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<String> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId This must be unique within the organization.
         * 
         * @return builder
         * 
         */
        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the notification config (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param location location Id is provided by organization. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location location Id is provided by organization. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param organization The organization whose Cloud Security Command Center the Notification
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The organization whose Cloud Security Command Center the Notification
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param pubsubTopic The Pub/Sub topic to send notifications to. Its format is
         * &#34;projects/[project_id]/topics/[topic]&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic The Pub/Sub topic to send notifications to. Its format is
         * &#34;projects/[project_id]/topics/[topic]&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        /**
         * @param streamingConfig The config for triggering streaming-based notifications.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamingConfig(Output<V2OrganizationNotificationConfigStreamingConfigArgs> streamingConfig) {
            $.streamingConfig = streamingConfig;
            return this;
        }

        /**
         * @param streamingConfig The config for triggering streaming-based notifications.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamingConfig(V2OrganizationNotificationConfigStreamingConfigArgs streamingConfig) {
            return streamingConfig(Output.of(streamingConfig));
        }

        public V2OrganizationNotificationConfigArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("V2OrganizationNotificationConfigArgs", "configId");
            }
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("V2OrganizationNotificationConfigArgs", "organization");
            }
            if ($.pubsubTopic == null) {
                throw new MissingRequiredPropertyException("V2OrganizationNotificationConfigArgs", "pubsubTopic");
            }
            if ($.streamingConfig == null) {
                throw new MissingRequiredPropertyException("V2OrganizationNotificationConfigArgs", "streamingConfig");
            }
            return $;
        }
    }

}
