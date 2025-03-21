// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeLinkedInterconnectAttachmentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedInterconnectAttachmentsArgs Empty = new SpokeLinkedInterconnectAttachmentsArgs();

    /**
     * IP ranges allowed to be included during import from hub (does not control transit connectivity).
     * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
     * 
     */
    @Import(name="includeImportRanges")
    private @Nullable Output<List<String>> includeImportRanges;

    /**
     * @return IP ranges allowed to be included during import from hub (does not control transit connectivity).
     * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
     * 
     */
    public Optional<Output<List<String>>> includeImportRanges() {
        return Optional.ofNullable(this.includeImportRanges);
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    @Import(name="siteToSiteDataTransfer", required=true)
    private Output<Boolean> siteToSiteDataTransfer;

    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    public Output<Boolean> siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    /**
     * The URIs of linked interconnect attachment resources
     * 
     */
    @Import(name="uris", required=true)
    private Output<List<String>> uris;

    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    public Output<List<String>> uris() {
        return this.uris;
    }

    private SpokeLinkedInterconnectAttachmentsArgs() {}

    private SpokeLinkedInterconnectAttachmentsArgs(SpokeLinkedInterconnectAttachmentsArgs $) {
        this.includeImportRanges = $.includeImportRanges;
        this.siteToSiteDataTransfer = $.siteToSiteDataTransfer;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeLinkedInterconnectAttachmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeLinkedInterconnectAttachmentsArgs $;

        public Builder() {
            $ = new SpokeLinkedInterconnectAttachmentsArgs();
        }

        public Builder(SpokeLinkedInterconnectAttachmentsArgs defaults) {
            $ = new SpokeLinkedInterconnectAttachmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeImportRanges IP ranges allowed to be included during import from hub (does not control transit connectivity).
         * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
         * 
         * @return builder
         * 
         */
        public Builder includeImportRanges(@Nullable Output<List<String>> includeImportRanges) {
            $.includeImportRanges = includeImportRanges;
            return this;
        }

        /**
         * @param includeImportRanges IP ranges allowed to be included during import from hub (does not control transit connectivity).
         * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
         * 
         * @return builder
         * 
         */
        public Builder includeImportRanges(List<String> includeImportRanges) {
            return includeImportRanges(Output.of(includeImportRanges));
        }

        /**
         * @param includeImportRanges IP ranges allowed to be included during import from hub (does not control transit connectivity).
         * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
         * 
         * @return builder
         * 
         */
        public Builder includeImportRanges(String... includeImportRanges) {
            return includeImportRanges(List.of(includeImportRanges));
        }

        /**
         * @param siteToSiteDataTransfer A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
         * 
         * @return builder
         * 
         */
        public Builder siteToSiteDataTransfer(Output<Boolean> siteToSiteDataTransfer) {
            $.siteToSiteDataTransfer = siteToSiteDataTransfer;
            return this;
        }

        /**
         * @param siteToSiteDataTransfer A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
         * 
         * @return builder
         * 
         */
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            return siteToSiteDataTransfer(Output.of(siteToSiteDataTransfer));
        }

        /**
         * @param uris The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder uris(Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris The URIs of linked interconnect attachment resources
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public SpokeLinkedInterconnectAttachmentsArgs build() {
            if ($.siteToSiteDataTransfer == null) {
                throw new MissingRequiredPropertyException("SpokeLinkedInterconnectAttachmentsArgs", "siteToSiteDataTransfer");
            }
            if ($.uris == null) {
                throw new MissingRequiredPropertyException("SpokeLinkedInterconnectAttachmentsArgs", "uris");
            }
            return $;
        }
    }

}
