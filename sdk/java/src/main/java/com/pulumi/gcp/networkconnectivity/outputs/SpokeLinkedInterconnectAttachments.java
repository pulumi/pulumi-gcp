// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SpokeLinkedInterconnectAttachments {
    /**
     * @return IP ranges allowed to be included during import from hub (does not control transit connectivity).
     * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
     * 
     */
    private @Nullable List<String> includeImportRanges;
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    private Boolean siteToSiteDataTransfer;
    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    private List<String> uris;

    private SpokeLinkedInterconnectAttachments() {}
    /**
     * @return IP ranges allowed to be included during import from hub (does not control transit connectivity).
     * The only allowed value for now is &#34;ALL_IPV4_RANGES&#34;.
     * 
     */
    public List<String> includeImportRanges() {
        return this.includeImportRanges == null ? List.of() : this.includeImportRanges;
    }
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    public Boolean siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }
    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    public List<String> uris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedInterconnectAttachments defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> includeImportRanges;
        private Boolean siteToSiteDataTransfer;
        private List<String> uris;
        public Builder() {}
        public Builder(SpokeLinkedInterconnectAttachments defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeImportRanges = defaults.includeImportRanges;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        @CustomType.Setter
        public Builder includeImportRanges(@Nullable List<String> includeImportRanges) {

            this.includeImportRanges = includeImportRanges;
            return this;
        }
        public Builder includeImportRanges(String... includeImportRanges) {
            return includeImportRanges(List.of(includeImportRanges));
        }
        @CustomType.Setter
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            if (siteToSiteDataTransfer == null) {
              throw new MissingRequiredPropertyException("SpokeLinkedInterconnectAttachments", "siteToSiteDataTransfer");
            }
            this.siteToSiteDataTransfer = siteToSiteDataTransfer;
            return this;
        }
        @CustomType.Setter
        public Builder uris(List<String> uris) {
            if (uris == null) {
              throw new MissingRequiredPropertyException("SpokeLinkedInterconnectAttachments", "uris");
            }
            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }
        public SpokeLinkedInterconnectAttachments build() {
            final var _resultValue = new SpokeLinkedInterconnectAttachments();
            _resultValue.includeImportRanges = includeImportRanges;
            _resultValue.siteToSiteDataTransfer = siteToSiteDataTransfer;
            _resultValue.uris = uris;
            return _resultValue;
        }
    }
}
