// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionSecurityPolicyDdosProtectionConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionSecurityPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RegionSecurityPolicyState Empty = new RegionSecurityPolicyState();

    /**
     * Configuration for Google Cloud Armor DDOS Proctection Config.
     * Structure is documented below.
     * 
     */
    @Import(name="ddosProtectionConfig")
    private @Nullable Output<RegionSecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig;

    /**
     * @return Configuration for Google Cloud Armor DDOS Proctection Config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionSecurityPolicyDdosProtectionConfigArgs>> ddosProtectionConfig() {
        return Optional.ofNullable(this.ddosProtectionConfig);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Fingerprint of this resource. This field is used internally during
     * updates of this resource.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field is used internally during
     * updates of this resource.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
     * Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     * ***
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
     * Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
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
     * The Region in which the created Region Security Policy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The Region in which the created Region Security Policy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Server-defined URL for the resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Import(name="selfLinkWithPolicyId")
    private @Nullable Output<String> selfLinkWithPolicyId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Optional<Output<String>> selfLinkWithPolicyId() {
        return Optional.ofNullable(this.selfLinkWithPolicyId);
    }

    /**
     * The type indicates the intended use of the security policy.
     * - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
     * - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
     * - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
     *   This field can be set only at resource creation time.
     *   Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type indicates the intended use of the security policy.
     * - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
     * - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
     * - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
     *   This field can be set only at resource creation time.
     *   Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RegionSecurityPolicyState() {}

    private RegionSecurityPolicyState(RegionSecurityPolicyState $) {
        this.ddosProtectionConfig = $.ddosProtectionConfig;
        this.description = $.description;
        this.fingerprint = $.fingerprint;
        this.name = $.name;
        this.policyId = $.policyId;
        this.project = $.project;
        this.region = $.region;
        this.selfLink = $.selfLink;
        this.selfLinkWithPolicyId = $.selfLinkWithPolicyId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionSecurityPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionSecurityPolicyState $;

        public Builder() {
            $ = new RegionSecurityPolicyState();
        }

        public Builder(RegionSecurityPolicyState defaults) {
            $ = new RegionSecurityPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosProtectionConfig Configuration for Google Cloud Armor DDOS Proctection Config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ddosProtectionConfig(@Nullable Output<RegionSecurityPolicyDdosProtectionConfigArgs> ddosProtectionConfig) {
            $.ddosProtectionConfig = ddosProtectionConfig;
            return this;
        }

        /**
         * @param ddosProtectionConfig Configuration for Google Cloud Armor DDOS Proctection Config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ddosProtectionConfig(RegionSecurityPolicyDdosProtectionConfigArgs ddosProtectionConfig) {
            return ddosProtectionConfig(Output.of(ddosProtectionConfig));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fingerprint Fingerprint of this resource. This field is used internally during
         * updates of this resource.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint Fingerprint of this resource. This field is used internally during
         * updates of this resource.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
         * Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
         * Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId The unique identifier for the resource. This identifier is defined by the server.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The unique identifier for the resource. This identifier is defined by the server.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
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
         * @param region The Region in which the created Region Security Policy should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region in which the created Region Security Policy should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param selfLink Server-defined URL for the resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink Server-defined URL for the resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param selfLinkWithPolicyId Server-defined URL for this resource with the resource id.
         * 
         * @return builder
         * 
         */
        public Builder selfLinkWithPolicyId(@Nullable Output<String> selfLinkWithPolicyId) {
            $.selfLinkWithPolicyId = selfLinkWithPolicyId;
            return this;
        }

        /**
         * @param selfLinkWithPolicyId Server-defined URL for this resource with the resource id.
         * 
         * @return builder
         * 
         */
        public Builder selfLinkWithPolicyId(String selfLinkWithPolicyId) {
            return selfLinkWithPolicyId(Output.of(selfLinkWithPolicyId));
        }

        /**
         * @param type The type indicates the intended use of the security policy.
         * - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
         * - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
         * - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
         *   This field can be set only at resource creation time.
         *   Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type indicates the intended use of the security policy.
         * - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers.
         * - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
         * - CLOUD_ARMOR_NETWORK: Cloud Armor network policies can be configured to filter packets targeting network load balancing resources such as backend services, target pools, target instances, and instances with external IPs. They filter requests before the request is served from the application.
         *   This field can be set only at resource creation time.
         *   Possible values are: `CLOUD_ARMOR`, `CLOUD_ARMOR_EDGE`, `CLOUD_ARMOR_NETWORK`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RegionSecurityPolicyState build() {
            return $;
        }
    }

}