// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingVersionArgs Empty = new HostingVersionArgs();

    /**
     * The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     * Structure is documented below.
     * 
     */
    @Import(name="config")
    private @Nullable Output<HostingVersionConfigArgs> config;

    /**
     * @return The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
     * Structure is documented below.
     * 
     */
    public Optional<Output<HostingVersionConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Required. The ID of the site in which to create this Version.
     * 
     */
    @Import(name="siteId", required=true)
    private Output<String> siteId;

    /**
     * @return Required. The ID of the site in which to create this Version.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }

    private HostingVersionArgs() {}

    private HostingVersionArgs(HostingVersionArgs $) {
        this.config = $.config;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingVersionArgs $;

        public Builder() {
            $ = new HostingVersionArgs();
        }

        public Builder(HostingVersionArgs defaults) {
            $ = new HostingVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<HostingVersionConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration for the behavior of the site. This configuration exists in the `firebase.json` file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder config(HostingVersionConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param siteId Required. The ID of the site in which to create this Version.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Required. The ID of the site in which to create this Version.
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public HostingVersionArgs build() {
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("HostingVersionArgs", "siteId");
            }
            return $;
        }
    }

}
