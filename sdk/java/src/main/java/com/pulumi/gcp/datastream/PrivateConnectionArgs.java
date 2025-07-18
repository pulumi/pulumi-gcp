// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.inputs.PrivateConnectionPscInterfaceConfigArgs;
import com.pulumi.gcp.datastream.inputs.PrivateConnectionVpcPeeringConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateConnectionArgs Empty = new PrivateConnectionArgs();

    /**
     * If set to true, will skip validations.
     * 
     */
    @Import(name="createWithoutValidation")
    private @Nullable Output<Boolean> createWithoutValidation;

    /**
     * @return If set to true, will skip validations.
     * 
     */
    public Optional<Output<Boolean>> createWithoutValidation() {
        return Optional.ofNullable(this.createWithoutValidation);
    }

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location this private connection is located in.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The name of the location this private connection is located in.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The private connectivity identifier.
     * 
     */
    @Import(name="privateConnectionId", required=true)
    private Output<String> privateConnectionId;

    /**
     * @return The private connectivity identifier.
     * 
     */
    public Output<String> privateConnectionId() {
        return this.privateConnectionId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The PSC Interface configuration is used to create PSC Interface
     * between Datastream and the consumer&#39;s PSC.
     * Structure is documented below.
     * 
     */
    @Import(name="pscInterfaceConfig")
    private @Nullable Output<PrivateConnectionPscInterfaceConfigArgs> pscInterfaceConfig;

    /**
     * @return The PSC Interface configuration is used to create PSC Interface
     * between Datastream and the consumer&#39;s PSC.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrivateConnectionPscInterfaceConfigArgs>> pscInterfaceConfig() {
        return Optional.ofNullable(this.pscInterfaceConfig);
    }

    /**
     * The VPC Peering configuration is used to create VPC peering
     * between Datastream and the consumer&#39;s VPC.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcPeeringConfig")
    private @Nullable Output<PrivateConnectionVpcPeeringConfigArgs> vpcPeeringConfig;

    /**
     * @return The VPC Peering configuration is used to create VPC peering
     * between Datastream and the consumer&#39;s VPC.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PrivateConnectionVpcPeeringConfigArgs>> vpcPeeringConfig() {
        return Optional.ofNullable(this.vpcPeeringConfig);
    }

    private PrivateConnectionArgs() {}

    private PrivateConnectionArgs(PrivateConnectionArgs $) {
        this.createWithoutValidation = $.createWithoutValidation;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.privateConnectionId = $.privateConnectionId;
        this.project = $.project;
        this.pscInterfaceConfig = $.pscInterfaceConfig;
        this.vpcPeeringConfig = $.vpcPeeringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateConnectionArgs $;

        public Builder() {
            $ = new PrivateConnectionArgs();
        }

        public Builder(PrivateConnectionArgs defaults) {
            $ = new PrivateConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createWithoutValidation If set to true, will skip validations.
         * 
         * @return builder
         * 
         */
        public Builder createWithoutValidation(@Nullable Output<Boolean> createWithoutValidation) {
            $.createWithoutValidation = createWithoutValidation;
            return this;
        }

        /**
         * @param createWithoutValidation If set to true, will skip validations.
         * 
         * @return builder
         * 
         */
        public Builder createWithoutValidation(Boolean createWithoutValidation) {
            return createWithoutValidation(Output.of(createWithoutValidation));
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Labels.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location this private connection is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this private connection is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param privateConnectionId The private connectivity identifier.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionId(Output<String> privateConnectionId) {
            $.privateConnectionId = privateConnectionId;
            return this;
        }

        /**
         * @param privateConnectionId The private connectivity identifier.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectionId(String privateConnectionId) {
            return privateConnectionId(Output.of(privateConnectionId));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pscInterfaceConfig The PSC Interface configuration is used to create PSC Interface
         * between Datastream and the consumer&#39;s PSC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscInterfaceConfig(@Nullable Output<PrivateConnectionPscInterfaceConfigArgs> pscInterfaceConfig) {
            $.pscInterfaceConfig = pscInterfaceConfig;
            return this;
        }

        /**
         * @param pscInterfaceConfig The PSC Interface configuration is used to create PSC Interface
         * between Datastream and the consumer&#39;s PSC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscInterfaceConfig(PrivateConnectionPscInterfaceConfigArgs pscInterfaceConfig) {
            return pscInterfaceConfig(Output.of(pscInterfaceConfig));
        }

        /**
         * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
         * between Datastream and the consumer&#39;s VPC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpcPeeringConfig(@Nullable Output<PrivateConnectionVpcPeeringConfigArgs> vpcPeeringConfig) {
            $.vpcPeeringConfig = vpcPeeringConfig;
            return this;
        }

        /**
         * @param vpcPeeringConfig The VPC Peering configuration is used to create VPC peering
         * between Datastream and the consumer&#39;s VPC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpcPeeringConfig(PrivateConnectionVpcPeeringConfigArgs vpcPeeringConfig) {
            return vpcPeeringConfig(Output.of(vpcPeeringConfig));
        }

        public PrivateConnectionArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("PrivateConnectionArgs", "displayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("PrivateConnectionArgs", "location");
            }
            if ($.privateConnectionId == null) {
                throw new MissingRequiredPropertyException("PrivateConnectionArgs", "privateConnectionId");
            }
            return $;
        }
    }

}
