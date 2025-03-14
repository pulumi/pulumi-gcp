// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.looker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.looker.inputs.InstancePscConfigServiceAttachmentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePscConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePscConfigArgs Empty = new InstancePscConfigArgs();

    /**
     * List of VPCs that are allowed ingress into the Looker instance.
     * 
     */
    @Import(name="allowedVpcs")
    private @Nullable Output<List<String>> allowedVpcs;

    /**
     * @return List of VPCs that are allowed ingress into the Looker instance.
     * 
     */
    public Optional<Output<List<String>>> allowedVpcs() {
        return Optional.ofNullable(this.allowedVpcs);
    }

    /**
     * (Output)
     * URI of the Looker service attachment.
     * 
     */
    @Import(name="lookerServiceAttachmentUri")
    private @Nullable Output<String> lookerServiceAttachmentUri;

    /**
     * @return (Output)
     * URI of the Looker service attachment.
     * 
     */
    public Optional<Output<String>> lookerServiceAttachmentUri() {
        return Optional.ofNullable(this.lookerServiceAttachmentUri);
    }

    /**
     * List of egress service attachment configurations.
     * Structure is documented below.
     * 
     */
    @Import(name="serviceAttachments")
    private @Nullable Output<List<InstancePscConfigServiceAttachmentArgs>> serviceAttachments;

    /**
     * @return List of egress service attachment configurations.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstancePscConfigServiceAttachmentArgs>>> serviceAttachments() {
        return Optional.ofNullable(this.serviceAttachments);
    }

    private InstancePscConfigArgs() {}

    private InstancePscConfigArgs(InstancePscConfigArgs $) {
        this.allowedVpcs = $.allowedVpcs;
        this.lookerServiceAttachmentUri = $.lookerServiceAttachmentUri;
        this.serviceAttachments = $.serviceAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePscConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePscConfigArgs $;

        public Builder() {
            $ = new InstancePscConfigArgs();
        }

        public Builder(InstancePscConfigArgs defaults) {
            $ = new InstancePscConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedVpcs List of VPCs that are allowed ingress into the Looker instance.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcs(@Nullable Output<List<String>> allowedVpcs) {
            $.allowedVpcs = allowedVpcs;
            return this;
        }

        /**
         * @param allowedVpcs List of VPCs that are allowed ingress into the Looker instance.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcs(List<String> allowedVpcs) {
            return allowedVpcs(Output.of(allowedVpcs));
        }

        /**
         * @param allowedVpcs List of VPCs that are allowed ingress into the Looker instance.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcs(String... allowedVpcs) {
            return allowedVpcs(List.of(allowedVpcs));
        }

        /**
         * @param lookerServiceAttachmentUri (Output)
         * URI of the Looker service attachment.
         * 
         * @return builder
         * 
         */
        public Builder lookerServiceAttachmentUri(@Nullable Output<String> lookerServiceAttachmentUri) {
            $.lookerServiceAttachmentUri = lookerServiceAttachmentUri;
            return this;
        }

        /**
         * @param lookerServiceAttachmentUri (Output)
         * URI of the Looker service attachment.
         * 
         * @return builder
         * 
         */
        public Builder lookerServiceAttachmentUri(String lookerServiceAttachmentUri) {
            return lookerServiceAttachmentUri(Output.of(lookerServiceAttachmentUri));
        }

        /**
         * @param serviceAttachments List of egress service attachment configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachments(@Nullable Output<List<InstancePscConfigServiceAttachmentArgs>> serviceAttachments) {
            $.serviceAttachments = serviceAttachments;
            return this;
        }

        /**
         * @param serviceAttachments List of egress service attachment configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachments(List<InstancePscConfigServiceAttachmentArgs> serviceAttachments) {
            return serviceAttachments(Output.of(serviceAttachments));
        }

        /**
         * @param serviceAttachments List of egress service attachment configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachments(InstancePscConfigServiceAttachmentArgs... serviceAttachments) {
            return serviceAttachments(List.of(serviceAttachments));
        }

        public InstancePscConfigArgs build() {
            return $;
        }
    }

}
