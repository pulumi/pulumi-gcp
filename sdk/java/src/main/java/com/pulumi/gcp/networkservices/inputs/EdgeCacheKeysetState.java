// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetValidationSharedKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheKeysetState extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheKeysetState Empty = new EdgeCacheKeysetState();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description of the resource.
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
     * Set of label tags associated with the EdgeCache resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
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
     * An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
     * You may specify no more than one Google-managed public key.
     * If you specify `public_keys`, you must specify at least one (1) key and may specify up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys")
    private @Nullable Output<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys;

    /**
     * @return An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
     * You may specify no more than one Google-managed public key.
     * If you specify `public_keys`, you must specify at least one (1) key and may specify up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EdgeCacheKeysetPublicKeyArgs>>> publicKeys() {
        return Optional.ofNullable(this.publicKeys);
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
     * An ordered list of shared keys to use for validating signed requests.
     * Shared keys are secret.  Ensure that only authorized users can add `validation_shared_keys` to a keyset.
     * You can rotate keys by appending (pushing) a new key to the list of `validation_shared_keys` and removing any superseded keys.
     * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
     * Structure is documented below.
     * 
     */
    @Import(name="validationSharedKeys")
    private @Nullable Output<List<EdgeCacheKeysetValidationSharedKeyArgs>> validationSharedKeys;

    /**
     * @return An ordered list of shared keys to use for validating signed requests.
     * Shared keys are secret.  Ensure that only authorized users can add `validation_shared_keys` to a keyset.
     * You can rotate keys by appending (pushing) a new key to the list of `validation_shared_keys` and removing any superseded keys.
     * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EdgeCacheKeysetValidationSharedKeyArgs>>> validationSharedKeys() {
        return Optional.ofNullable(this.validationSharedKeys);
    }

    private EdgeCacheKeysetState() {}

    private EdgeCacheKeysetState(EdgeCacheKeysetState $) {
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.publicKeys = $.publicKeys;
        this.pulumiLabels = $.pulumiLabels;
        this.validationSharedKeys = $.validationSharedKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheKeysetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheKeysetState $;

        public Builder() {
            $ = new EdgeCacheKeysetState();
        }

        public Builder(EdgeCacheKeysetState defaults) {
            $ = new EdgeCacheKeysetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the resource.
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
         * @param labels Set of label tags associated with the EdgeCache resource.
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
         * @param labels Set of label tags associated with the EdgeCache resource.
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
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
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
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * You may specify no more than one Google-managed public key.
         * If you specify `public_keys`, you must specify at least one (1) key and may specify up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(@Nullable Output<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * You may specify no more than one Google-managed public key.
         * If you specify `public_keys`, you must specify at least one (1) key and may specify up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<EdgeCacheKeysetPublicKeyArgs> publicKeys) {
            return publicKeys(Output.of(publicKeys));
        }

        /**
         * @param publicKeys An ordered list of Ed25519 public keys to use for validating signed requests.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * You may specify no more than one Google-managed public key.
         * If you specify `public_keys`, you must specify at least one (1) key and may specify up to three (3) keys.
         * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
         * Ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(EdgeCacheKeysetPublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
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
         * @param validationSharedKeys An ordered list of shared keys to use for validating signed requests.
         * Shared keys are secret.  Ensure that only authorized users can add `validation_shared_keys` to a keyset.
         * You can rotate keys by appending (pushing) a new key to the list of `validation_shared_keys` and removing any superseded keys.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder validationSharedKeys(@Nullable Output<List<EdgeCacheKeysetValidationSharedKeyArgs>> validationSharedKeys) {
            $.validationSharedKeys = validationSharedKeys;
            return this;
        }

        /**
         * @param validationSharedKeys An ordered list of shared keys to use for validating signed requests.
         * Shared keys are secret.  Ensure that only authorized users can add `validation_shared_keys` to a keyset.
         * You can rotate keys by appending (pushing) a new key to the list of `validation_shared_keys` and removing any superseded keys.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder validationSharedKeys(List<EdgeCacheKeysetValidationSharedKeyArgs> validationSharedKeys) {
            return validationSharedKeys(Output.of(validationSharedKeys));
        }

        /**
         * @param validationSharedKeys An ordered list of shared keys to use for validating signed requests.
         * Shared keys are secret.  Ensure that only authorized users can add `validation_shared_keys` to a keyset.
         * You can rotate keys by appending (pushing) a new key to the list of `validation_shared_keys` and removing any superseded keys.
         * You must specify `public_keys` or `validation_shared_keys` (or both). The keys in `public_keys` are checked first.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder validationSharedKeys(EdgeCacheKeysetValidationSharedKeyArgs... validationSharedKeys) {
            return validationSharedKeys(List.of(validationSharedKeys));
        }

        public EdgeCacheKeysetState build() {
            return $;
        }
    }

}
