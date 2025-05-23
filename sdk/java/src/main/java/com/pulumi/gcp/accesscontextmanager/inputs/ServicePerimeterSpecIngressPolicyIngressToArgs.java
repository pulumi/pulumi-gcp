// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecIngressPolicyIngressToArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecIngressPolicyIngressToArgs Empty = new ServicePerimeterSpecIngressPolicyIngressToArgs();

    /**
     * A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<ServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations;

    /**
     * @return A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     * are allowed to perform in this `ServicePerimeter`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimeterSpecIngressPolicyIngressToOperationArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
     * that are allowed to be accessed by sources defined in the
     * corresponding `IngressFrom`. A request matches if it contains
     * a resource in this list. If `*` is specified for resources,
     * then this `IngressTo` rule will authorize access to all
     * resources inside the perimeter, provided that the request
     * also matches the `operations` field.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
     * that are allowed to be accessed by sources defined in the
     * corresponding `IngressFrom`. A request matches if it contains
     * a resource in this list. If `*` is specified for resources,
     * then this `IngressTo` rule will authorize access to all
     * resources inside the perimeter, provided that the request
     * also matches the `operations` field.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * A list of IAM roles that represent the set of operations that the sources
     * specified in the corresponding `IngressFrom`
     * are allowed to perform.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return A list of IAM roles that represent the set of operations that the sources
     * specified in the corresponding `IngressFrom`
     * are allowed to perform.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    private ServicePerimeterSpecIngressPolicyIngressToArgs() {}

    private ServicePerimeterSpecIngressPolicyIngressToArgs(ServicePerimeterSpecIngressPolicyIngressToArgs $) {
        this.operations = $.operations;
        this.resources = $.resources;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterSpecIngressPolicyIngressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterSpecIngressPolicyIngressToArgs $;

        public Builder() {
            $ = new ServicePerimeterSpecIngressPolicyIngressToArgs();
        }

        public Builder(ServicePerimeterSpecIngressPolicyIngressToArgs defaults) {
            $ = new ServicePerimeterSpecIngressPolicyIngressToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
         * are allowed to perform in this `ServicePerimeter`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<ServicePerimeterSpecIngressPolicyIngressToOperationArgs>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
         * are allowed to perform in this `ServicePerimeter`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<ServicePerimeterSpecIngressPolicyIngressToOperationArgs> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
         * are allowed to perform in this `ServicePerimeter`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder operations(ServicePerimeterSpecIngressPolicyIngressToOperationArgs... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
         * that are allowed to be accessed by sources defined in the
         * corresponding `IngressFrom`. A request matches if it contains
         * a resource in this list. If `*` is specified for resources,
         * then this `IngressTo` rule will authorize access to all
         * resources inside the perimeter, provided that the request
         * also matches the `operations` field.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
         * that are allowed to be accessed by sources defined in the
         * corresponding `IngressFrom`. A request matches if it contains
         * a resource in this list. If `*` is specified for resources,
         * then this `IngressTo` rule will authorize access to all
         * resources inside the perimeter, provided that the request
         * also matches the `operations` field.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, protected by this `ServicePerimeter`
         * that are allowed to be accessed by sources defined in the
         * corresponding `IngressFrom`. A request matches if it contains
         * a resource in this list. If `*` is specified for resources,
         * then this `IngressTo` rule will authorize access to all
         * resources inside the perimeter, provided that the request
         * also matches the `operations` field.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param roles A list of IAM roles that represent the set of operations that the sources
         * specified in the corresponding `IngressFrom`
         * are allowed to perform.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A list of IAM roles that represent the set of operations that the sources
         * specified in the corresponding `IngressFrom`
         * are allowed to perform.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles A list of IAM roles that represent the set of operations that the sources
         * specified in the corresponding `IngressFrom`
         * are allowed to perform.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        public ServicePerimeterSpecIngressPolicyIngressToArgs build() {
            return $;
        }
    }

}
