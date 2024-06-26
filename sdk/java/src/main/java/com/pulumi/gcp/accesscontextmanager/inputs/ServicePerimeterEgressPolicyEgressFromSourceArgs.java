// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterEgressPolicyEgressFromSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterEgressPolicyEgressFromSourceArgs Empty = new ServicePerimeterEgressPolicyEgressFromSourceArgs();

    /**
     * An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    private ServicePerimeterEgressPolicyEgressFromSourceArgs() {}

    private ServicePerimeterEgressPolicyEgressFromSourceArgs(ServicePerimeterEgressPolicyEgressFromSourceArgs $) {
        this.accessLevel = $.accessLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterEgressPolicyEgressFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterEgressPolicyEgressFromSourceArgs $;

        public Builder() {
            $ = new ServicePerimeterEgressPolicyEgressFromSourceArgs();
        }

        public Builder(ServicePerimeterEgressPolicyEgressFromSourceArgs defaults) {
            $ = new ServicePerimeterEgressPolicyEgressFromSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        public ServicePerimeterEgressPolicyEgressFromSourceArgs build() {
            return $;
        }
    }

}
