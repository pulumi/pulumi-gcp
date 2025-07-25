// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallParamsArgs Empty = new FirewallParamsArgs();

    /**
     * Resource manager tags to be bound to the firewall. Tag keys and values have the
     * same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id},
     * and values are in the format tagValues/456. The field is ignored when empty.
     * The field is immutable and causes resource replacement when mutated. This field is only
     * set at create time and modifying this field after creation will trigger recreation.
     * To apply tags to an existing resource, see the gcp.tags.TagBinding resource.
     * 
     */
    @Import(name="resourceManagerTags")
    private @Nullable Output<Map<String,String>> resourceManagerTags;

    /**
     * @return Resource manager tags to be bound to the firewall. Tag keys and values have the
     * same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id},
     * and values are in the format tagValues/456. The field is ignored when empty.
     * The field is immutable and causes resource replacement when mutated. This field is only
     * set at create time and modifying this field after creation will trigger recreation.
     * To apply tags to an existing resource, see the gcp.tags.TagBinding resource.
     * 
     */
    public Optional<Output<Map<String,String>>> resourceManagerTags() {
        return Optional.ofNullable(this.resourceManagerTags);
    }

    private FirewallParamsArgs() {}

    private FirewallParamsArgs(FirewallParamsArgs $) {
        this.resourceManagerTags = $.resourceManagerTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallParamsArgs $;

        public Builder() {
            $ = new FirewallParamsArgs();
        }

        public Builder(FirewallParamsArgs defaults) {
            $ = new FirewallParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceManagerTags Resource manager tags to be bound to the firewall. Tag keys and values have the
         * same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id},
         * and values are in the format tagValues/456. The field is ignored when empty.
         * The field is immutable and causes resource replacement when mutated. This field is only
         * set at create time and modifying this field after creation will trigger recreation.
         * To apply tags to an existing resource, see the gcp.tags.TagBinding resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerTags(@Nullable Output<Map<String,String>> resourceManagerTags) {
            $.resourceManagerTags = resourceManagerTags;
            return this;
        }

        /**
         * @param resourceManagerTags Resource manager tags to be bound to the firewall. Tag keys and values have the
         * same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id},
         * and values are in the format tagValues/456. The field is ignored when empty.
         * The field is immutable and causes resource replacement when mutated. This field is only
         * set at create time and modifying this field after creation will trigger recreation.
         * To apply tags to an existing resource, see the gcp.tags.TagBinding resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerTags(Map<String,String> resourceManagerTags) {
            return resourceManagerTags(Output.of(resourceManagerTags));
        }

        public FirewallParamsArgs build() {
            return $;
        }
    }

}
