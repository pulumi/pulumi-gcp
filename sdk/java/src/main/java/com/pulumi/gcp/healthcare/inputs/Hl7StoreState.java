// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Hl7StoreState extends com.pulumi.resources.ResourceArgs {

    public static final Hl7StoreState Empty = new Hl7StoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
     * 
     * @deprecated
     * `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
     * 
     */
    @Deprecated /* `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead. */
    @Import(name="notificationConfig")
    private @Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig;

    /**
     * @return (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
     * 
     * @deprecated
     * `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
     * 
     */
    @Deprecated /* `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead. */
    public Optional<Output<Hl7StoreNotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfigs")
    private @Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs;

    /**
     * @return A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<Hl7StoreNotificationConfigsArgs>>> notificationConfigs() {
        return Optional.ofNullable(this.notificationConfigs);
    }

    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Import(name="parserConfig")
    private @Nullable Output<Hl7StoreParserConfigArgs> parserConfig;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<Hl7StoreParserConfigArgs>> parserConfig() {
        return Optional.ofNullable(this.parserConfig);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * Determines whether duplicate messages are allowed.
     * 
     */
    @Import(name="rejectDuplicateMessage")
    private @Nullable Output<Boolean> rejectDuplicateMessage;

    /**
     * @return Determines whether duplicate messages are allowed.
     * 
     */
    public Optional<Output<Boolean>> rejectDuplicateMessage() {
        return Optional.ofNullable(this.rejectDuplicateMessage);
    }

    /**
     * The fully qualified name of this dataset
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    private Hl7StoreState() {}

    private Hl7StoreState(Hl7StoreState $) {
        this.dataset = $.dataset;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.name = $.name;
        this.notificationConfig = $.notificationConfig;
        this.notificationConfigs = $.notificationConfigs;
        this.parserConfig = $.parserConfig;
        this.pulumiLabels = $.pulumiLabels;
        this.rejectDuplicateMessage = $.rejectDuplicateMessage;
        this.selfLink = $.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7StoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7StoreState $;

        public Builder() {
            $ = new Hl7StoreState();
        }

        public Builder(Hl7StoreState defaults) {
            $ = new Hl7StoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
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
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
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
         * @param name The resource name for the Hl7V2Store.
         * ** Changing this property may recreate the Hl7v2 store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the Hl7V2Store.
         * ** Changing this property may recreate the Hl7v2 store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationConfig (Optional, Deprecated)
         * A nested object resource.
         * Structure is documented below.
         * 
         * &gt; **Warning:** `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
         * 
         */
        @Deprecated /* `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead. */
        public Builder notificationConfig(@Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig (Optional, Deprecated)
         * A nested object resource.
         * Structure is documented below.
         * 
         * &gt; **Warning:** `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead.
         * 
         */
        @Deprecated /* `notification_config` is deprecated and will be removed in a future major release. Use `notification_configs` instead. */
        public Builder notificationConfig(Hl7StoreNotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
         * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
         * is sent as part of the notification. Supplied by the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(@Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs) {
            $.notificationConfigs = notificationConfigs;
            return this;
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
         * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
         * is sent as part of the notification. Supplied by the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(List<Hl7StoreNotificationConfigsArgs> notificationConfigs) {
            return notificationConfigs(Output.of(notificationConfigs));
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
         * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
         * is sent as part of the notification. Supplied by the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(Hl7StoreNotificationConfigsArgs... notificationConfigs) {
            return notificationConfigs(List.of(notificationConfigs));
        }

        /**
         * @param parserConfig A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder parserConfig(@Nullable Output<Hl7StoreParserConfigArgs> parserConfig) {
            $.parserConfig = parserConfig;
            return this;
        }

        /**
         * @param parserConfig A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder parserConfig(Hl7StoreParserConfigArgs parserConfig) {
            return parserConfig(Output.of(parserConfig));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param rejectDuplicateMessage Determines whether duplicate messages are allowed.
         * 
         * @return builder
         * 
         */
        public Builder rejectDuplicateMessage(@Nullable Output<Boolean> rejectDuplicateMessage) {
            $.rejectDuplicateMessage = rejectDuplicateMessage;
            return this;
        }

        /**
         * @param rejectDuplicateMessage Determines whether duplicate messages are allowed.
         * 
         * @return builder
         * 
         */
        public Builder rejectDuplicateMessage(Boolean rejectDuplicateMessage) {
            return rejectDuplicateMessage(Output.of(rejectDuplicateMessage));
        }

        /**
         * @param selfLink The fully qualified name of this dataset
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The fully qualified name of this dataset
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Hl7StoreState build() {
            return $;
        }
    }

}
