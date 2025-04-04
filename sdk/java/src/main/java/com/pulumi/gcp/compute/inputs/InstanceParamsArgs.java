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


public final class InstanceParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceParamsArgs Empty = new InstanceParamsArgs();

    /**
     * A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    @Import(name="resourceManagerTags")
    private @Nullable Output<Map<String,String>> resourceManagerTags;

    /**
     * @return A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    public Optional<Output<Map<String,String>>> resourceManagerTags() {
        return Optional.ofNullable(this.resourceManagerTags);
    }

    private InstanceParamsArgs() {}

    private InstanceParamsArgs(InstanceParamsArgs $) {
        this.resourceManagerTags = $.resourceManagerTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceParamsArgs $;

        public Builder() {
            $ = new InstanceParamsArgs();
        }

        public Builder(InstanceParamsArgs defaults) {
            $ = new InstanceParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceManagerTags A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored (both PUT &amp; PATCH) when empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerTags(@Nullable Output<Map<String,String>> resourceManagerTags) {
            $.resourceManagerTags = resourceManagerTags;
            return this;
        }

        /**
         * @param resourceManagerTags A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored (both PUT &amp; PATCH) when empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerTags(Map<String,String> resourceManagerTags) {
            return resourceManagerTags(Output.of(resourceManagerTags));
        }

        public InstanceParamsArgs build() {
            return $;
        }
    }

}
