// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingReleaseState extends com.pulumi.resources.ResourceArgs {

    public static final HostingReleaseState Empty = new HostingReleaseState();

    /**
     * The ID of the channel to which the release belongs. If not provided, the release will
     * belong to the default &#34;live&#34; channel
     * 
     */
    @Import(name="channelId")
    private @Nullable Output<String> channelId;

    /**
     * @return The ID of the channel to which the release belongs. If not provided, the release will
     * belong to the default &#34;live&#34; channel
     * 
     */
    public Optional<Output<String>> channelId() {
        return Optional.ofNullable(this.channelId);
    }

    /**
     * The deploy description when the release was created. The value can be up to 512 characters.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The deploy description when the release was created. The value can be up to 512 characters.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The unique identifier for the release, in either of the following formats:
     * sites/SITE_ID/releases/RELEASE_ID
     * sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier for the release, in either of the following formats:
     * sites/SITE_ID/releases/RELEASE_ID
     * sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier for the Release.
     * 
     */
    @Import(name="releaseId")
    private @Nullable Output<String> releaseId;

    /**
     * @return The unique identifier for the Release.
     * 
     */
    public Optional<Output<String>> releaseId() {
        return Optional.ofNullable(this.releaseId);
    }

    /**
     * Required. The ID of the site to which the release belongs.
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    /**
     * @return Required. The ID of the site to which the release belongs.
     * 
     */
    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * The type of the release; indicates what happened to the content of the site. There is no need to specify
     * `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
     * DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
     * ROLLBACK: The release points back to a previously deployed version. Output only.
     * SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
     * Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the release; indicates what happened to the content of the site. There is no need to specify
     * `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
     * DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
     * ROLLBACK: The release points back to a previously deployed version. Output only.
     * SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
     * Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
     * The content of the version specified will be actively displayed on the appropriate URL.
     * The Version must belong to the same site as in the `site_id`.
     * This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
     * 
     */
    @Import(name="versionName")
    private @Nullable Output<String> versionName;

    /**
     * @return The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
     * The content of the version specified will be actively displayed on the appropriate URL.
     * The Version must belong to the same site as in the `site_id`.
     * This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
     * 
     */
    public Optional<Output<String>> versionName() {
        return Optional.ofNullable(this.versionName);
    }

    private HostingReleaseState() {}

    private HostingReleaseState(HostingReleaseState $) {
        this.channelId = $.channelId;
        this.message = $.message;
        this.name = $.name;
        this.releaseId = $.releaseId;
        this.siteId = $.siteId;
        this.type = $.type;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingReleaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingReleaseState $;

        public Builder() {
            $ = new HostingReleaseState();
        }

        public Builder(HostingReleaseState defaults) {
            $ = new HostingReleaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId The ID of the channel to which the release belongs. If not provided, the release will
         * belong to the default &#34;live&#34; channel
         * 
         * @return builder
         * 
         */
        public Builder channelId(@Nullable Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId The ID of the channel to which the release belongs. If not provided, the release will
         * belong to the default &#34;live&#34; channel
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        /**
         * @param message The deploy description when the release was created. The value can be up to 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The deploy description when the release was created. The value can be up to 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param name The unique identifier for the release, in either of the following formats:
         * sites/SITE_ID/releases/RELEASE_ID
         * sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier for the release, in either of the following formats:
         * sites/SITE_ID/releases/RELEASE_ID
         * sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param releaseId The unique identifier for the Release.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(@Nullable Output<String> releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        /**
         * @param releaseId The unique identifier for the Release.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(String releaseId) {
            return releaseId(Output.of(releaseId));
        }

        /**
         * @param siteId Required. The ID of the site to which the release belongs.
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Required. The ID of the site to which the release belongs.
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param type The type of the release; indicates what happened to the content of the site. There is no need to specify
         * `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
         * DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
         * ROLLBACK: The release points back to a previously deployed version. Output only.
         * SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
         * Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the release; indicates what happened to the content of the site. There is no need to specify
         * `DEPLOY` or `ROLLBACK` type if a `version_name` is provided.
         * DEPLOY: A version was uploaded to Firebase Hosting and released. Output only.
         * ROLLBACK: The release points back to a previously deployed version. Output only.
         * SITE_DISABLE: The release prevents the site from serving content. Firebase Hosting acts as if the site never existed
         * Possible values are: `DEPLOY`, `ROLLBACK`, `SITE_DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param versionName The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
         * The content of the version specified will be actively displayed on the appropriate URL.
         * The Version must belong to the same site as in the `site_id`.
         * This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder versionName(@Nullable Output<String> versionName) {
            $.versionName = versionName;
            return this;
        }

        /**
         * @param versionName The unique identifier for a version, in the format: sites/SITE_ID/versions/VERSION_ID.
         * The content of the version specified will be actively displayed on the appropriate URL.
         * The Version must belong to the same site as in the `site_id`.
         * This parameter must be empty if the `type` of the release is `SITE_DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder versionName(String versionName) {
            return versionName(Output.of(versionName));
        }

        public HostingReleaseState build() {
            return $;
        }
    }

}
