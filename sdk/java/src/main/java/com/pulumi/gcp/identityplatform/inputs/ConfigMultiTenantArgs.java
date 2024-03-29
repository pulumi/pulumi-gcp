// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigMultiTenantArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigMultiTenantArgs Empty = new ConfigMultiTenantArgs();

    /**
     * Whether this project can have tenants or not.
     * 
     */
    @Import(name="allowTenants")
    private @Nullable Output<Boolean> allowTenants;

    /**
     * @return Whether this project can have tenants or not.
     * 
     */
    public Optional<Output<Boolean>> allowTenants() {
        return Optional.ofNullable(this.allowTenants);
    }

    /**
     * The default cloud parent org or folder that the tenant project should be created under.
     * The parent resource name should be in the format of &#34;/&#34;, such as &#34;folders/123&#34; or &#34;organizations/456&#34;.
     * If the value is not set, the tenant will be created under the same organization or folder as the agent project.
     * 
     */
    @Import(name="defaultTenantLocation")
    private @Nullable Output<String> defaultTenantLocation;

    /**
     * @return The default cloud parent org or folder that the tenant project should be created under.
     * The parent resource name should be in the format of &#34;/&#34;, such as &#34;folders/123&#34; or &#34;organizations/456&#34;.
     * If the value is not set, the tenant will be created under the same organization or folder as the agent project.
     * 
     */
    public Optional<Output<String>> defaultTenantLocation() {
        return Optional.ofNullable(this.defaultTenantLocation);
    }

    private ConfigMultiTenantArgs() {}

    private ConfigMultiTenantArgs(ConfigMultiTenantArgs $) {
        this.allowTenants = $.allowTenants;
        this.defaultTenantLocation = $.defaultTenantLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigMultiTenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMultiTenantArgs $;

        public Builder() {
            $ = new ConfigMultiTenantArgs();
        }

        public Builder(ConfigMultiTenantArgs defaults) {
            $ = new ConfigMultiTenantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowTenants Whether this project can have tenants or not.
         * 
         * @return builder
         * 
         */
        public Builder allowTenants(@Nullable Output<Boolean> allowTenants) {
            $.allowTenants = allowTenants;
            return this;
        }

        /**
         * @param allowTenants Whether this project can have tenants or not.
         * 
         * @return builder
         * 
         */
        public Builder allowTenants(Boolean allowTenants) {
            return allowTenants(Output.of(allowTenants));
        }

        /**
         * @param defaultTenantLocation The default cloud parent org or folder that the tenant project should be created under.
         * The parent resource name should be in the format of &#34;/&#34;, such as &#34;folders/123&#34; or &#34;organizations/456&#34;.
         * If the value is not set, the tenant will be created under the same organization or folder as the agent project.
         * 
         * @return builder
         * 
         */
        public Builder defaultTenantLocation(@Nullable Output<String> defaultTenantLocation) {
            $.defaultTenantLocation = defaultTenantLocation;
            return this;
        }

        /**
         * @param defaultTenantLocation The default cloud parent org or folder that the tenant project should be created under.
         * The parent resource name should be in the format of &#34;/&#34;, such as &#34;folders/123&#34; or &#34;organizations/456&#34;.
         * If the value is not set, the tenant will be created under the same organization or folder as the agent project.
         * 
         * @return builder
         * 
         */
        public Builder defaultTenantLocation(String defaultTenantLocation) {
            return defaultTenantLocation(Output.of(defaultTenantLocation));
        }

        public ConfigMultiTenantArgs build() {
            return $;
        }
    }

}
