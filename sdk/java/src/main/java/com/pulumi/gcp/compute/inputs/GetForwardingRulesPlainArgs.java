// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetForwardingRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetForwardingRulesPlainArgs Empty = new GetForwardingRulesPlainArgs();

    /**
     * The name of the project.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The name of the project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region you want to get the forwarding rules from.
     * 
     * These arguments must be set in either the provider or the resource in order for the information to be queried.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region you want to get the forwarding rules from.
     * 
     * These arguments must be set in either the provider or the resource in order for the information to be queried.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetForwardingRulesPlainArgs() {}

    private GetForwardingRulesPlainArgs(GetForwardingRulesPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetForwardingRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetForwardingRulesPlainArgs $;

        public Builder() {
            $ = new GetForwardingRulesPlainArgs();
        }

        public Builder(GetForwardingRulesPlainArgs defaults) {
            $ = new GetForwardingRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The name of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region you want to get the forwarding rules from.
         * 
         * These arguments must be set in either the provider or the resource in order for the information to be queried.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetForwardingRulesPlainArgs build() {
            return $;
        }
    }

}
