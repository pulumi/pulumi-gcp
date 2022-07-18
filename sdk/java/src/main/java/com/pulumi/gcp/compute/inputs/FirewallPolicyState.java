// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyState Empty = new FirewallPolicyState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
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
     * Fingerprint of the resource. This field is used internally during updates of this resource.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return Fingerprint of the resource. This field is used internally during updates of this resource.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @Import(name="firewallPolicyId")
    private @Nullable Output<String> firewallPolicyId;

    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    public Optional<Output<String>> firewallPolicyId() {
        return Optional.ofNullable(this.firewallPolicyId);
    }

    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parent of the firewall policy.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The parent of the firewall policy.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    @Import(name="ruleTupleCount")
    private @Nullable Output<Integer> ruleTupleCount;

    /**
     * @return Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    public Optional<Output<Integer>> ruleTupleCount() {
        return Optional.ofNullable(this.ruleTupleCount);
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
    @Import(name="selfLinkWithId")
    private @Nullable Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Optional<Output<String>> selfLinkWithId() {
        return Optional.ofNullable(this.selfLinkWithId);
    }

    /**
     * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    /**
     * @return User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    private FirewallPolicyState() {}

    private FirewallPolicyState(FirewallPolicyState $) {
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.fingerprint = $.fingerprint;
        this.firewallPolicyId = $.firewallPolicyId;
        this.name = $.name;
        this.parent = $.parent;
        this.ruleTupleCount = $.ruleTupleCount;
        this.selfLink = $.selfLink;
        this.selfLinkWithId = $.selfLinkWithId;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyState $;

        public Builder() {
            $ = new FirewallPolicyState();
        }

        public Builder(FirewallPolicyState defaults) {
            $ = new FirewallPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
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
         * @param fingerprint Fingerprint of the resource. This field is used internally during updates of this resource.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint Fingerprint of the resource. This field is used internally during updates of this resource.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param firewallPolicyId The unique identifier for the resource. This identifier is defined by the server.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyId(@Nullable Output<String> firewallPolicyId) {
            $.firewallPolicyId = firewallPolicyId;
            return this;
        }

        /**
         * @param firewallPolicyId The unique identifier for the resource. This identifier is defined by the server.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyId(String firewallPolicyId) {
            return firewallPolicyId(Output.of(firewallPolicyId));
        }

        /**
         * @param name Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The parent of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param ruleTupleCount Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
         * 
         * @return builder
         * 
         */
        public Builder ruleTupleCount(@Nullable Output<Integer> ruleTupleCount) {
            $.ruleTupleCount = ruleTupleCount;
            return this;
        }

        /**
         * @param ruleTupleCount Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
         * 
         * @return builder
         * 
         */
        public Builder ruleTupleCount(Integer ruleTupleCount) {
            return ruleTupleCount(Output.of(ruleTupleCount));
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
         * @param selfLinkWithId Server-defined URL for this resource with the resource id.
         * 
         * @return builder
         * 
         */
        public Builder selfLinkWithId(@Nullable Output<String> selfLinkWithId) {
            $.selfLinkWithId = selfLinkWithId;
            return this;
        }

        /**
         * @param selfLinkWithId Server-defined URL for this resource with the resource id.
         * 
         * @return builder
         * 
         */
        public Builder selfLinkWithId(String selfLinkWithId) {
            return selfLinkWithId(Output.of(selfLinkWithId));
        }

        /**
         * @param shortName User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public FirewallPolicyState build() {
            return $;
        }
    }

}