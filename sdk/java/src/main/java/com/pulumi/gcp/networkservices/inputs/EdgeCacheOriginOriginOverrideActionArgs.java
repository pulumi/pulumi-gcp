// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionHeaderActionArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginOriginOverrideActionUrlRewriteArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheOriginOriginOverrideActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheOriginOriginOverrideActionArgs Empty = new EdgeCacheOriginOriginOverrideActionArgs();

    /**
     * The header actions, including adding and removing
     * headers, for request handled by this origin.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<EdgeCacheOriginOriginOverrideActionHeaderActionArgs> headerAction;

    /**
     * @return The header actions, including adding and removing
     * headers, for request handled by this origin.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EdgeCacheOriginOriginOverrideActionHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The URL rewrite configuration for request that are
     * handled by this origin.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<EdgeCacheOriginOriginOverrideActionUrlRewriteArgs> urlRewrite;

    /**
     * @return The URL rewrite configuration for request that are
     * handled by this origin.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EdgeCacheOriginOriginOverrideActionUrlRewriteArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    private EdgeCacheOriginOriginOverrideActionArgs() {}

    private EdgeCacheOriginOriginOverrideActionArgs(EdgeCacheOriginOriginOverrideActionArgs $) {
        this.headerAction = $.headerAction;
        this.urlRewrite = $.urlRewrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheOriginOriginOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheOriginOriginOverrideActionArgs $;

        public Builder() {
            $ = new EdgeCacheOriginOriginOverrideActionArgs();
        }

        public Builder(EdgeCacheOriginOriginOverrideActionArgs defaults) {
            $ = new EdgeCacheOriginOriginOverrideActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerAction The header actions, including adding and removing
         * headers, for request handled by this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<EdgeCacheOriginOriginOverrideActionHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction The header actions, including adding and removing
         * headers, for request handled by this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(EdgeCacheOriginOriginOverrideActionHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param urlRewrite The URL rewrite configuration for request that are
         * handled by this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<EdgeCacheOriginOriginOverrideActionUrlRewriteArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param urlRewrite The URL rewrite configuration for request that are
         * handled by this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(EdgeCacheOriginOriginOverrideActionUrlRewriteArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        public EdgeCacheOriginOriginOverrideActionArgs build() {
            return $;
        }
    }

}
