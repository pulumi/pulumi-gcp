// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentOsTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentOsTypeArgs Empty = new GuestPoliciesAssignmentOsTypeArgs();

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    @Import(name="osArchitecture")
    private @Nullable Output<String> osArchitecture;

    /**
     * @return Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    public Optional<Output<String>> osArchitecture() {
        return Optional.ofNullable(this.osArchitecture);
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example &#34;debian&#34; or &#34;windows&#34;.
     * 
     */
    @Import(name="osShortName")
    private @Nullable Output<String> osShortName;

    /**
     * @return Targets VM instances with OS Inventory enabled and having the following OS short name, for example &#34;debian&#34; or &#34;windows&#34;.
     * 
     */
    public Optional<Output<String>> osShortName() {
        return Optional.ofNullable(this.osShortName);
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    @Import(name="osVersion")
    private @Nullable Output<String> osVersion;

    /**
     * @return Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    public Optional<Output<String>> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    private GuestPoliciesAssignmentOsTypeArgs() {}

    private GuestPoliciesAssignmentOsTypeArgs(GuestPoliciesAssignmentOsTypeArgs $) {
        this.osArchitecture = $.osArchitecture;
        this.osShortName = $.osShortName;
        this.osVersion = $.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesAssignmentOsTypeArgs $;

        public Builder() {
            $ = new GuestPoliciesAssignmentOsTypeArgs();
        }

        public Builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
            $ = new GuestPoliciesAssignmentOsTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param osArchitecture Targets VM instances with OS Inventory enabled and having the following OS architecture.
         * 
         * @return builder
         * 
         */
        public Builder osArchitecture(@Nullable Output<String> osArchitecture) {
            $.osArchitecture = osArchitecture;
            return this;
        }

        /**
         * @param osArchitecture Targets VM instances with OS Inventory enabled and having the following OS architecture.
         * 
         * @return builder
         * 
         */
        public Builder osArchitecture(String osArchitecture) {
            return osArchitecture(Output.of(osArchitecture));
        }

        /**
         * @param osShortName Targets VM instances with OS Inventory enabled and having the following OS short name, for example &#34;debian&#34; or &#34;windows&#34;.
         * 
         * @return builder
         * 
         */
        public Builder osShortName(@Nullable Output<String> osShortName) {
            $.osShortName = osShortName;
            return this;
        }

        /**
         * @param osShortName Targets VM instances with OS Inventory enabled and having the following OS short name, for example &#34;debian&#34; or &#34;windows&#34;.
         * 
         * @return builder
         * 
         */
        public Builder osShortName(String osShortName) {
            return osShortName(Output.of(osShortName));
        }

        /**
         * @param osVersion Targets VM instances with OS Inventory enabled and having the following following OS version.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(@Nullable Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param osVersion Targets VM instances with OS Inventory enabled and having the following following OS version.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        public GuestPoliciesAssignmentOsTypeArgs build() {
            return $;
        }
    }

}