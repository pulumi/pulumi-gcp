// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTrafficArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTrafficArgs Empty = new ServiceTrafficArgs();

    /**
     * LatestRevision may be optionally provided to indicate that the latest ready
     * Revision of the Configuration should be used for this traffic target. When
     * provided LatestRevision must be true if RevisionName is empty; it must be
     * false when RevisionName is non-empty.
     * 
     */
    @Import(name="latestRevision")
    private @Nullable Output<Boolean> latestRevision;

    /**
     * @return LatestRevision may be optionally provided to indicate that the latest ready
     * Revision of the Configuration should be used for this traffic target. When
     * provided LatestRevision must be true if RevisionName is empty; it must be
     * false when RevisionName is non-empty.
     * 
     */
    public Optional<Output<Boolean>> latestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration.
     * 
     */
    @Import(name="percent", required=true)
    private Output<Integer> percent;

    /**
     * @return Percent specifies percent of the traffic to this Revision or Configuration.
     * 
     */
    public Output<Integer> percent() {
        return this.percent;
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic.
     * 
     */
    @Import(name="revisionName")
    private @Nullable Output<String> revisionName;

    /**
     * @return RevisionName of a specific revision to which to send this portion of traffic.
     * 
     */
    public Optional<Output<String>> revisionName() {
        return Optional.ofNullable(this.revisionName);
    }

    /**
     * Tag is optionally used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Tag is optionally used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * - 
     * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
     * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
     * but may not contain anything else (e.g. basic auth, url path, etc.)
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return -
     * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
     * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
     * but may not contain anything else (e.g. basic auth, url path, etc.)
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ServiceTrafficArgs() {}

    private ServiceTrafficArgs(ServiceTrafficArgs $) {
        this.latestRevision = $.latestRevision;
        this.percent = $.percent;
        this.revisionName = $.revisionName;
        this.tag = $.tag;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTrafficArgs $;

        public Builder() {
            $ = new ServiceTrafficArgs();
        }

        public Builder(ServiceTrafficArgs defaults) {
            $ = new ServiceTrafficArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param latestRevision LatestRevision may be optionally provided to indicate that the latest ready
         * Revision of the Configuration should be used for this traffic target. When
         * provided LatestRevision must be true if RevisionName is empty; it must be
         * false when RevisionName is non-empty.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(@Nullable Output<Boolean> latestRevision) {
            $.latestRevision = latestRevision;
            return this;
        }

        /**
         * @param latestRevision LatestRevision may be optionally provided to indicate that the latest ready
         * Revision of the Configuration should be used for this traffic target. When
         * provided LatestRevision must be true if RevisionName is empty; it must be
         * false when RevisionName is non-empty.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(Boolean latestRevision) {
            return latestRevision(Output.of(latestRevision));
        }

        /**
         * @param percent Percent specifies percent of the traffic to this Revision or Configuration.
         * 
         * @return builder
         * 
         */
        public Builder percent(Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent Percent specifies percent of the traffic to this Revision or Configuration.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        /**
         * @param revisionName RevisionName of a specific revision to which to send this portion of traffic.
         * 
         * @return builder
         * 
         */
        public Builder revisionName(@Nullable Output<String> revisionName) {
            $.revisionName = revisionName;
            return this;
        }

        /**
         * @param revisionName RevisionName of a specific revision to which to send this portion of traffic.
         * 
         * @return builder
         * 
         */
        public Builder revisionName(String revisionName) {
            return revisionName(Output.of(revisionName));
        }

        /**
         * @param tag Tag is optionally used to expose a dedicated url for referencing this target exclusively.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Tag is optionally used to expose a dedicated url for referencing this target exclusively.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param url -
         * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
         * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
         * but may not contain anything else (e.g. basic auth, url path, etc.)
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url -
         * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
         * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
         * but may not contain anything else (e.g. basic auth, url path, etc.)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ServiceTrafficArgs build() {
            $.percent = Objects.requireNonNull($.percent, "expected parameter 'percent' to be non-null");
            return $;
        }
    }

}