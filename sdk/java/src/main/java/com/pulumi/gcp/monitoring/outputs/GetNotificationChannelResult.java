// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.monitoring.outputs.GetNotificationChannelSensitiveLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationChannelResult {
    /**
     * @return An optional human-readable description of this notification channel.
     * 
     */
    private String description;
    private @Nullable String displayName;
    /**
     * @return Whether notifications are forwarded to the described channel.
     * 
     */
    private Boolean enabled;
    private Boolean forceDelete;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Configuration fields that define the channel and its behavior.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return The full REST resource name for this channel. The syntax is:
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
     * 
     */
    private String name;
    private @Nullable String project;
    private List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
    private @Nullable String type;
    /**
     * @return User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field.
     * 
     */
    private @Nullable Map<String,String> userLabels;
    /**
     * @return Indicates whether this channel has been verified or not.
     * 
     */
    private String verificationStatus;

    private GetNotificationChannelResult() {}
    /**
     * @return An optional human-readable description of this notification channel.
     * 
     */
    public String description() {
        return this.description;
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Whether notifications are forwarded to the described channel.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public Boolean forceDelete() {
        return this.forceDelete;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Configuration fields that define the channel and its behavior.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The full REST resource name for this channel. The syntax is:
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GetNotificationChannelSensitiveLabel> sensitiveLabels() {
        return this.sensitiveLabels;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field.
     * 
     */
    public Map<String,String> userLabels() {
        return this.userLabels == null ? Map.of() : this.userLabels;
    }
    /**
     * @return Indicates whether this channel has been verified or not.
     * 
     */
    public String verificationStatus() {
        return this.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private @Nullable String displayName;
        private Boolean enabled;
        private Boolean forceDelete;
        private String id;
        private @Nullable Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
        private @Nullable String type;
        private @Nullable Map<String,String> userLabels;
        private String verificationStatus;
        public Builder() {}
        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.forceDelete = defaults.forceDelete;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sensitiveLabels = defaults.sensitiveLabels;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder forceDelete(Boolean forceDelete) {
            if (forceDelete == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "forceDelete");
            }
            this.forceDelete = forceDelete;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder sensitiveLabels(List<GetNotificationChannelSensitiveLabel> sensitiveLabels) {
            if (sensitiveLabels == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "sensitiveLabels");
            }
            this.sensitiveLabels = sensitiveLabels;
            return this;
        }
        public Builder sensitiveLabels(GetNotificationChannelSensitiveLabel... sensitiveLabels) {
            return sensitiveLabels(List.of(sensitiveLabels));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder userLabels(@Nullable Map<String,String> userLabels) {

            this.userLabels = userLabels;
            return this;
        }
        @CustomType.Setter
        public Builder verificationStatus(String verificationStatus) {
            if (verificationStatus == null) {
              throw new MissingRequiredPropertyException("GetNotificationChannelResult", "verificationStatus");
            }
            this.verificationStatus = verificationStatus;
            return this;
        }
        public GetNotificationChannelResult build() {
            final var _resultValue = new GetNotificationChannelResult();
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.enabled = enabled;
            _resultValue.forceDelete = forceDelete;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.sensitiveLabels = sensitiveLabels;
            _resultValue.type = type;
            _resultValue.userLabels = userLabels;
            _resultValue.verificationStatus = verificationStatus;
            return _resultValue;
        }
    }
}
