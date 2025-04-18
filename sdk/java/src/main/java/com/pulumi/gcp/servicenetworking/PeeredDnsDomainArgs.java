// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeredDnsDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeredDnsDomainArgs Empty = new PeeredDnsDomainArgs();

    /**
     * The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
     * 
     */
    @Import(name="dnsSuffix", required=true)
    private Output<String> dnsSuffix;

    /**
     * @return The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
     * 
     */
    public Output<String> dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Internal name used for the peered DNS domain.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Internal name used for the peered DNS domain.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network in the consumer project.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The network in the consumer project.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The producer project number. If not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The producer project number. If not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private PeeredDnsDomainArgs() {}

    private PeeredDnsDomainArgs(PeeredDnsDomainArgs $) {
        this.dnsSuffix = $.dnsSuffix;
        this.name = $.name;
        this.network = $.network;
        this.project = $.project;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeredDnsDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeredDnsDomainArgs $;

        public Builder() {
            $ = new PeeredDnsDomainArgs();
        }

        public Builder(PeeredDnsDomainArgs defaults) {
            $ = new PeeredDnsDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsSuffix The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffix(Output<String> dnsSuffix) {
            $.dnsSuffix = dnsSuffix;
            return this;
        }

        /**
         * @param dnsSuffix The DNS domain suffix of the peered DNS domain. Make sure to suffix with a `.` (dot).
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffix(String dnsSuffix) {
            return dnsSuffix(Output.of(dnsSuffix));
        }

        /**
         * @param name Internal name used for the peered DNS domain.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Internal name used for the peered DNS domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The network in the consumer project.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network in the consumer project.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param project The producer project number. If not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The producer project number. If not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param service Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Private service connection between service and consumer network, defaults to `servicenetworking.googleapis.com`
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public PeeredDnsDomainArgs build() {
            if ($.dnsSuffix == null) {
                throw new MissingRequiredPropertyException("PeeredDnsDomainArgs", "dnsSuffix");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("PeeredDnsDomainArgs", "network");
            }
            return $;
        }
    }

}
