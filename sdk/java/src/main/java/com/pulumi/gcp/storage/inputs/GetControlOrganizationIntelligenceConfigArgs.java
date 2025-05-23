// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetControlOrganizationIntelligenceConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetControlOrganizationIntelligenceConfigArgs Empty = new GetControlOrganizationIntelligenceConfigArgs();

    /**
     * The id of GCP organization.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The id of GCP organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetControlOrganizationIntelligenceConfigArgs() {}

    private GetControlOrganizationIntelligenceConfigArgs(GetControlOrganizationIntelligenceConfigArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetControlOrganizationIntelligenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetControlOrganizationIntelligenceConfigArgs $;

        public Builder() {
            $ = new GetControlOrganizationIntelligenceConfigArgs();
        }

        public Builder(GetControlOrganizationIntelligenceConfigArgs defaults) {
            $ = new GetControlOrganizationIntelligenceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The id of GCP organization.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The id of GCP organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetControlOrganizationIntelligenceConfigArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetControlOrganizationIntelligenceConfigArgs", "name");
            }
            return $;
        }
    }

}
