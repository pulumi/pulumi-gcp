// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.NotificationChannelSensitiveLabelsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationChannelState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelState Empty = new NotificationChannelState();

    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Configuration fields that define the channel and its behavior. The
     * permissible and required labels are specified in the
     * NotificationChannelDescriptor corresponding to the type field.
     * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
     * determine if there are upstream changes to these fields. They can also be configured via
     * the sensitive_labels block, but cannot be configured in both places.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Configuration fields that define the channel and its behavior. The
     * permissible and required labels are specified in the
     * NotificationChannelDescriptor corresponding to the type field.
     * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
     * determine if there are upstream changes to these fields. They can also be configured via
     * the sensitive_labels block, but cannot be configured in both places.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
     * [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
     * [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Different notification type behaviors are configured primarily using the the `labels` field on this
     * resource. This block contains the labels which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     * in the `labels` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    @Import(name="sensitiveLabels")
    private @Nullable Output<NotificationChannelSensitiveLabelsArgs> sensitiveLabels;

    /**
     * @return Different notification type behaviors are configured primarily using the the `labels` field on this
     * resource. This block contains the labels which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
     * in the `labels` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NotificationChannelSensitiveLabelsArgs>> sensitiveLabels() {
        return Optional.ofNullable(this.sensitiveLabels);
    }

    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as &#34;email&#34;, &#34;slack&#34;, etc...
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as &#34;email&#34;, &#34;slack&#34;, etc...
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
     * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
     * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
     * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
     * verification or that this specific channel has been exempted from verification because it was created prior to
     * verification being required for channels of this type.This field cannot be modified using a standard
     * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    @Import(name="verificationStatus")
    private @Nullable Output<String> verificationStatus;

    /**
     * @return Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
     * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
     * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
     * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
     * verification or that this specific channel has been exempted from verification because it was created prior to
     * verification being required for channels of this type.This field cannot be modified using a standard
     * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    public Optional<Output<String>> verificationStatus() {
        return Optional.ofNullable(this.verificationStatus);
    }

    private NotificationChannelState() {}

    private NotificationChannelState(NotificationChannelState $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.sensitiveLabels = $.sensitiveLabels;
        this.type = $.type;
        this.userLabels = $.userLabels;
        this.verificationStatus = $.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelState $;

        public Builder() {
            $ = new NotificationChannelState();
        }

        public Builder(NotificationChannelState defaults) {
            $ = new NotificationChannelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param labels Configuration fields that define the channel and its behavior. The
         * permissible and required labels are specified in the
         * NotificationChannelDescriptor corresponding to the type field.
         * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
         * determine if there are upstream changes to these fields. They can also be configured via
         * the sensitive_labels block, but cannot be configured in both places.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Configuration fields that define the channel and its behavior. The
         * permissible and required labels are specified in the
         * NotificationChannelDescriptor corresponding to the type field.
         * Labels with sensitive data are obfuscated by the API and therefore the provider cannot
         * determine if there are upstream changes to these fields. They can also be configured via
         * the sensitive_labels block, but cannot be configured in both places.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
         * [CHANNEL_ID] is automatically assigned by the server on creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The
         * [CHANNEL_ID] is automatically assigned by the server on creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param sensitiveLabels Different notification type behaviors are configured primarily using the the `labels` field on this
         * resource. This block contains the labels which contain secrets or passwords so that they can be marked
         * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
         * in the `labels` map in the api request.
         * Credentials may not be specified in both locations and will cause an error. Changing from one location
         * to a different credential configuration in the config will require an apply to update state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveLabels(@Nullable Output<NotificationChannelSensitiveLabelsArgs> sensitiveLabels) {
            $.sensitiveLabels = sensitiveLabels;
            return this;
        }

        /**
         * @param sensitiveLabels Different notification type behaviors are configured primarily using the the `labels` field on this
         * resource. This block contains the labels which contain secrets or passwords so that they can be marked
         * sensitive and hidden from plan output. The name of the field, eg: password, will be the key
         * in the `labels` map in the api request.
         * Credentials may not be specified in both locations and will cause an error. Changing from one location
         * to a different credential configuration in the config will require an apply to update state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveLabels(NotificationChannelSensitiveLabelsArgs sensitiveLabels) {
            return sensitiveLabels(Output.of(sensitiveLabels));
        }

        /**
         * @param type The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as &#34;email&#34;, &#34;slack&#34;, etc...
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. See https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannelDescriptors/list to get the list of valid values such as &#34;email&#34;, &#34;slack&#34;, etc...
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userLabels User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        /**
         * @param userLabels User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        /**
         * @param verificationStatus Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
         * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
         * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
         * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
         * verification or that this specific channel has been exempted from verification because it was created prior to
         * verification being required for channels of this type.This field cannot be modified using a standard
         * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
         * 
         * @return builder
         * 
         */
        public Builder verificationStatus(@Nullable Output<String> verificationStatus) {
            $.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * @param verificationStatus Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel
         * operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is
         * non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel
         * works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require
         * verification or that this specific channel has been exempted from verification because it was created prior to
         * verification being required for channels of this type.This field cannot be modified using a standard
         * UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
         * 
         * @return builder
         * 
         */
        public Builder verificationStatus(String verificationStatus) {
            return verificationStatus(Output.of(verificationStatus));
        }

        public NotificationChannelState build() {
            return $;
        }
    }

}