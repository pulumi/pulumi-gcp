// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkforcePoolAccessRestrictionsAllowedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforcePoolAccessRestrictionsAllowedServiceArgs Empty = new WorkforcePoolAccessRestrictionsAllowedServiceArgs();

    /**
     * Domain name of the service.
     * Example: console.cloud.google
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Domain name of the service.
     * Example: console.cloud.google
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    private WorkforcePoolAccessRestrictionsAllowedServiceArgs() {}

    private WorkforcePoolAccessRestrictionsAllowedServiceArgs(WorkforcePoolAccessRestrictionsAllowedServiceArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforcePoolAccessRestrictionsAllowedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforcePoolAccessRestrictionsAllowedServiceArgs $;

        public Builder() {
            $ = new WorkforcePoolAccessRestrictionsAllowedServiceArgs();
        }

        public Builder(WorkforcePoolAccessRestrictionsAllowedServiceArgs defaults) {
            $ = new WorkforcePoolAccessRestrictionsAllowedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Domain name of the service.
         * Example: console.cloud.google
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Domain name of the service.
         * Example: console.cloud.google
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public WorkforcePoolAccessRestrictionsAllowedServiceArgs build() {
            return $;
        }
    }

}