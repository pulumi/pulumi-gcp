// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigActionExportData;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigActionPubSubNotification;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigActionTagResources;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigAction {
    /**
     * @return Export data profiles into a provided location
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDiscoveryConfigActionExportData exportData;
    /**
     * @return Publish a message into the Pub/Sub topic.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDiscoveryConfigActionPubSubNotification pubSubNotification;
    /**
     * @return Publish a message into the Pub/Sub topic.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDiscoveryConfigActionTagResources tagResources;

    private PreventionDiscoveryConfigAction() {}
    /**
     * @return Export data profiles into a provided location
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDiscoveryConfigActionExportData> exportData() {
        return Optional.ofNullable(this.exportData);
    }
    /**
     * @return Publish a message into the Pub/Sub topic.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDiscoveryConfigActionPubSubNotification> pubSubNotification() {
        return Optional.ofNullable(this.pubSubNotification);
    }
    /**
     * @return Publish a message into the Pub/Sub topic.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDiscoveryConfigActionTagResources> tagResources() {
        return Optional.ofNullable(this.tagResources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionDiscoveryConfigActionExportData exportData;
        private @Nullable PreventionDiscoveryConfigActionPubSubNotification pubSubNotification;
        private @Nullable PreventionDiscoveryConfigActionTagResources tagResources;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportData = defaults.exportData;
    	      this.pubSubNotification = defaults.pubSubNotification;
    	      this.tagResources = defaults.tagResources;
        }

        @CustomType.Setter
        public Builder exportData(@Nullable PreventionDiscoveryConfigActionExportData exportData) {

            this.exportData = exportData;
            return this;
        }
        @CustomType.Setter
        public Builder pubSubNotification(@Nullable PreventionDiscoveryConfigActionPubSubNotification pubSubNotification) {

            this.pubSubNotification = pubSubNotification;
            return this;
        }
        @CustomType.Setter
        public Builder tagResources(@Nullable PreventionDiscoveryConfigActionTagResources tagResources) {

            this.tagResources = tagResources;
            return this;
        }
        public PreventionDiscoveryConfigAction build() {
            final var _resultValue = new PreventionDiscoveryConfigAction();
            _resultValue.exportData = exportData;
            _resultValue.pubSubNotification = pubSubNotification;
            _resultValue.tagResources = tagResources;
            return _resultValue;
        }
    }
}
