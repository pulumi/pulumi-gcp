// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GoogleChannelConfigState extends com.pulumi.resources.ResourceArgs {

    public static final GoogleChannelConfigState Empty = new GoogleChannelConfigState();

    /**
     * Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt their event data. It must match the pattern `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="cryptoKeyName")
    private @Nullable Output<String> cryptoKeyName;

    /**
     * @return Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt their event data. It must match the pattern `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    public Optional<Output<String>> cryptoKeyName() {
        return Optional.ofNullable(this.cryptoKeyName);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Required. The resource name of the config. Must be in the format of, `projects/{project}/locations/{location}/googleChannelConfig`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required. The resource name of the config. Must be in the format of, `projects/{project}/locations/{location}/googleChannelConfig`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Output only. The last-modified time.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The last-modified time.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private GoogleChannelConfigState() {}

    private GoogleChannelConfigState(GoogleChannelConfigState $) {
        this.cryptoKeyName = $.cryptoKeyName;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleChannelConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleChannelConfigState $;

        public Builder() {
            $ = new GoogleChannelConfigState();
        }

        public Builder(GoogleChannelConfigState defaults) {
            $ = new GoogleChannelConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cryptoKeyName Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt their event data. It must match the pattern `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyName(@Nullable Output<String> cryptoKeyName) {
            $.cryptoKeyName = cryptoKeyName;
            return this;
        }

        /**
         * @param cryptoKeyName Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt their event data. It must match the pattern `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyName(String cryptoKeyName) {
            return cryptoKeyName(Output.of(cryptoKeyName));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Required. The resource name of the config. Must be in the format of, `projects/{project}/locations/{location}/googleChannelConfig`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The resource name of the config. Must be in the format of, `projects/{project}/locations/{location}/googleChannelConfig`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param updateTime Output only. The last-modified time.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The last-modified time.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public GoogleChannelConfigState build() {
            return $;
        }
    }

}