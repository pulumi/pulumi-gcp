// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Beta
     * If `true`, the usage of the service to be disabled will be checked and an error
     * will be returned if the service to be disabled has usage in last 30 days.
     * Defaults to `false`.
     * 
     */
    @Import(name="checkIfServiceHasUsageOnDestroy")
    private @Nullable Output<Boolean> checkIfServiceHasUsageOnDestroy;

    /**
     * @return Beta
     * If `true`, the usage of the service to be disabled will be checked and an error
     * will be returned if the service to be disabled has usage in last 30 days.
     * Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> checkIfServiceHasUsageOnDestroy() {
        return Optional.ofNullable(this.checkIfServiceHasUsageOnDestroy);
    }

    /**
     * If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    @Import(name="disableDependentServices")
    private @Nullable Output<Boolean> disableDependentServices;

    /**
     * @return If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    public Optional<Output<Boolean>> disableDependentServices() {
        return Optional.ofNullable(this.disableDependentServices);
    }

    @Import(name="disableOnDestroy")
    private @Nullable Output<Boolean> disableOnDestroy;

    public Optional<Output<Boolean>> disableOnDestroy() {
        return Optional.ofNullable(this.disableOnDestroy);
    }

    /**
     * The project ID. If not provided, the provider project
     * is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project ID. If not provided, the provider project
     * is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The service to enable.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The service to enable.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.checkIfServiceHasUsageOnDestroy = $.checkIfServiceHasUsageOnDestroy;
        this.disableDependentServices = $.disableDependentServices;
        this.disableOnDestroy = $.disableOnDestroy;
        this.project = $.project;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkIfServiceHasUsageOnDestroy Beta
         * If `true`, the usage of the service to be disabled will be checked and an error
         * will be returned if the service to be disabled has usage in last 30 days.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder checkIfServiceHasUsageOnDestroy(@Nullable Output<Boolean> checkIfServiceHasUsageOnDestroy) {
            $.checkIfServiceHasUsageOnDestroy = checkIfServiceHasUsageOnDestroy;
            return this;
        }

        /**
         * @param checkIfServiceHasUsageOnDestroy Beta
         * If `true`, the usage of the service to be disabled will be checked and an error
         * will be returned if the service to be disabled has usage in last 30 days.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder checkIfServiceHasUsageOnDestroy(Boolean checkIfServiceHasUsageOnDestroy) {
            return checkIfServiceHasUsageOnDestroy(Output.of(checkIfServiceHasUsageOnDestroy));
        }

        /**
         * @param disableDependentServices If `true`, services that are enabled
         * and which depend on this service should also be disabled when this service is
         * destroyed. If `false` or unset, an error will be generated if any enabled
         * services depend on this service when destroying it.
         * 
         * @return builder
         * 
         */
        public Builder disableDependentServices(@Nullable Output<Boolean> disableDependentServices) {
            $.disableDependentServices = disableDependentServices;
            return this;
        }

        /**
         * @param disableDependentServices If `true`, services that are enabled
         * and which depend on this service should also be disabled when this service is
         * destroyed. If `false` or unset, an error will be generated if any enabled
         * services depend on this service when destroying it.
         * 
         * @return builder
         * 
         */
        public Builder disableDependentServices(Boolean disableDependentServices) {
            return disableDependentServices(Output.of(disableDependentServices));
        }

        public Builder disableOnDestroy(@Nullable Output<Boolean> disableOnDestroy) {
            $.disableOnDestroy = disableOnDestroy;
            return this;
        }

        public Builder disableOnDestroy(Boolean disableOnDestroy) {
            return disableOnDestroy(Output.of(disableOnDestroy));
        }

        /**
         * @param project The project ID. If not provided, the provider project
         * is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project ID. If not provided, the provider project
         * is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param service The service to enable.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service to enable.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ServiceArgs build() {
            if ($.service == null) {
                throw new MissingRequiredPropertyException("ServiceArgs", "service");
            }
            return $;
        }
    }

}
