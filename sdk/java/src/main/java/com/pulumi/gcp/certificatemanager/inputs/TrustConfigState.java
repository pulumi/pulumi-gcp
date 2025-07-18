// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs;
import com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrustConfigState extends com.pulumi.resources.ResourceArgs {

    public static final TrustConfigState Empty = new TrustConfigState();

    /**
     * Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     * Structure is documented below.
     * 
     */
    @Import(name="allowlistedCertificates")
    private @Nullable Output<List<TrustConfigAllowlistedCertificateArgs>> allowlistedCertificates;

    /**
     * @return Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TrustConfigAllowlistedCertificateArgs>>> allowlistedCertificates() {
        return Optional.ofNullable(this.allowlistedCertificates);
    }

    /**
     * The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * One or more paragraphs of text description of a trust config.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return One or more paragraphs of text description of a trust config.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * Set of label tags associated with the trust config.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the trust config.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The trust config location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The trust config location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A user-defined name of the trust config. Trust config names must be unique globally.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-defined name of the trust config. Trust config names must be unique globally.
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
     * Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * 
     */
    @Import(name="trustStores")
    private @Nullable Output<List<TrustConfigTrustStoreArgs>> trustStores;

    /**
     * @return Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TrustConfigTrustStoreArgs>>> trustStores() {
        return Optional.ofNullable(this.trustStores);
    }

    /**
     * The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private TrustConfigState() {}

    private TrustConfigState(TrustConfigState $) {
        this.allowlistedCertificates = $.allowlistedCertificates;
        this.createTime = $.createTime;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.trustStores = $.trustStores;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrustConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrustConfigState $;

        public Builder() {
            $ = new TrustConfigState();
        }

        public Builder(TrustConfigState defaults) {
            $ = new TrustConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
         * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowlistedCertificates(@Nullable Output<List<TrustConfigAllowlistedCertificateArgs>> allowlistedCertificates) {
            $.allowlistedCertificates = allowlistedCertificates;
            return this;
        }

        /**
         * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
         * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowlistedCertificates(List<TrustConfigAllowlistedCertificateArgs> allowlistedCertificates) {
            return allowlistedCertificates(Output.of(allowlistedCertificates));
        }

        /**
         * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
         * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowlistedCertificates(TrustConfigAllowlistedCertificateArgs... allowlistedCertificates) {
            return allowlistedCertificates(List.of(allowlistedCertificates));
        }

        /**
         * @param createTime The creation timestamp of a TrustConfig.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation timestamp of a TrustConfig.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description One or more paragraphs of text description of a trust config.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description One or more paragraphs of text description of a trust config.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param labels Set of label tags associated with the trust config.
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
         * @param labels Set of label tags associated with the trust config.
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
         * @param location The trust config location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The trust config location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name A user-defined name of the trust config. Trust config names must be unique globally.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-defined name of the trust config. Trust config names must be unique globally.
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
         * @param trustStores Set of trust stores to perform validation against.
         * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trustStores(@Nullable Output<List<TrustConfigTrustStoreArgs>> trustStores) {
            $.trustStores = trustStores;
            return this;
        }

        /**
         * @param trustStores Set of trust stores to perform validation against.
         * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trustStores(List<TrustConfigTrustStoreArgs> trustStores) {
            return trustStores(Output.of(trustStores));
        }

        /**
         * @param trustStores Set of trust stores to perform validation against.
         * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder trustStores(TrustConfigTrustStoreArgs... trustStores) {
            return trustStores(List.of(trustStores));
        }

        /**
         * @param updateTime The last update timestamp of a TrustConfig.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The last update timestamp of a TrustConfig.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public TrustConfigState build() {
            return $;
        }
    }

}
