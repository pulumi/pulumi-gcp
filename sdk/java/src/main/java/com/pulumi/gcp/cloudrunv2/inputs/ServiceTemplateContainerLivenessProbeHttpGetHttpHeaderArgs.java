// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs Empty = new ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs();

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Volume&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The header field value
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The header field value
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs() {}

    private ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs(ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs $;

        public Builder() {
            $ = new ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs();
        }

        public Builder(ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs defaults) {
            $ = new ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The header field value
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The header field value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}