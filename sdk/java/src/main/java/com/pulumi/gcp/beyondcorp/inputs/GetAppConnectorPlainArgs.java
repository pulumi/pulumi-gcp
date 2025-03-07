// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppConnectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppConnectorPlainArgs Empty = new GetAppConnectorPlainArgs();

    /**
     * The name of the App Connector.
     * 
     * ***
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the App Connector.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the resource belongs. If it
     * is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region in which the resource belongs. If it
     * is not provided, the provider region is used.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetAppConnectorPlainArgs() {}

    private GetAppConnectorPlainArgs(GetAppConnectorPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppConnectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppConnectorPlainArgs $;

        public Builder() {
            $ = new GetAppConnectorPlainArgs();
        }

        public Builder(GetAppConnectorPlainArgs defaults) {
            $ = new GetAppConnectorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the App Connector.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region in which the resource belongs. If it
         * is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetAppConnectorPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAppConnectorPlainArgs", "name");
            }
            return $;
        }
    }

}
