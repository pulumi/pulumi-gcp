// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGceSetupContainerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGceSetupContainerImageArgs Empty = new InstanceGceSetupContainerImageArgs();

    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private InstanceGceSetupContainerImageArgs() {}

    private InstanceGceSetupContainerImageArgs(InstanceGceSetupContainerImageArgs $) {
        this.repository = $.repository;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGceSetupContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGceSetupContainerImageArgs $;

        public Builder() {
            $ = new InstanceGceSetupContainerImageArgs();
        }

        public Builder(InstanceGceSetupContainerImageArgs defaults) {
            $ = new InstanceGceSetupContainerImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repository The path to the container image repository.
         * For example: gcr.io/{project_id}/{imageName}
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The path to the container image repository.
         * For example: gcr.io/{project_id}/{imageName}
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param tag The tag of the container image. If not specified, this defaults to the latest tag.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag of the container image. If not specified, this defaults to the latest tag.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public InstanceGceSetupContainerImageArgs build() {
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("InstanceGceSetupContainerImageArgs", "repository");
            }
            return $;
        }
    }

}
