// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PrivateConnectionVpcPeeringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateConnectionVpcPeeringConfigArgs Empty = new PrivateConnectionVpcPeeringConfigArgs();

    /**
     * A free subnet for peering. (CIDR of /29)
     * 
     */
    @Import(name="subnet", required=true)
    private Output<String> subnet;

    /**
     * @return A free subnet for peering. (CIDR of /29)
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }

    /**
     * Fully qualified name of the VPC that Database Migration Service will peer to.
     * Format: projects/{project}/global/{networks}/{name}
     * 
     */
    @Import(name="vpcName", required=true)
    private Output<String> vpcName;

    /**
     * @return Fully qualified name of the VPC that Database Migration Service will peer to.
     * Format: projects/{project}/global/{networks}/{name}
     * 
     */
    public Output<String> vpcName() {
        return this.vpcName;
    }

    private PrivateConnectionVpcPeeringConfigArgs() {}

    private PrivateConnectionVpcPeeringConfigArgs(PrivateConnectionVpcPeeringConfigArgs $) {
        this.subnet = $.subnet;
        this.vpcName = $.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateConnectionVpcPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateConnectionVpcPeeringConfigArgs $;

        public Builder() {
            $ = new PrivateConnectionVpcPeeringConfigArgs();
        }

        public Builder(PrivateConnectionVpcPeeringConfigArgs defaults) {
            $ = new PrivateConnectionVpcPeeringConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnet A free subnet for peering. (CIDR of /29)
         * 
         * @return builder
         * 
         */
        public Builder subnet(Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet A free subnet for peering. (CIDR of /29)
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param vpcName Fully qualified name of the VPC that Database Migration Service will peer to.
         * Format: projects/{project}/global/{networks}/{name}
         * 
         * @return builder
         * 
         */
        public Builder vpcName(Output<String> vpcName) {
            $.vpcName = vpcName;
            return this;
        }

        /**
         * @param vpcName Fully qualified name of the VPC that Database Migration Service will peer to.
         * Format: projects/{project}/global/{networks}/{name}
         * 
         * @return builder
         * 
         */
        public Builder vpcName(String vpcName) {
            return vpcName(Output.of(vpcName));
        }

        public PrivateConnectionVpcPeeringConfigArgs build() {
            if ($.subnet == null) {
                throw new MissingRequiredPropertyException("PrivateConnectionVpcPeeringConfigArgs", "subnet");
            }
            if ($.vpcName == null) {
                throw new MissingRequiredPropertyException("PrivateConnectionVpcPeeringConfigArgs", "vpcName");
            }
            return $;
        }
    }

}
