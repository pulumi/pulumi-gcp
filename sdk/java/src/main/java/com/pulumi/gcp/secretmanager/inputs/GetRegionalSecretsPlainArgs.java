// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionalSecretsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionalSecretsPlainArgs Empty = new GetRegionalSecretsPlainArgs();

    /**
     * Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all regional secrets are listed from the specified location.
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    /**
     * @return Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all regional secrets are listed from the specified location.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The location of the regional secret.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location of the regional secret.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The ID of the project.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetRegionalSecretsPlainArgs() {}

    private GetRegionalSecretsPlainArgs(GetRegionalSecretsPlainArgs $) {
        this.filter = $.filter;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionalSecretsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionalSecretsPlainArgs $;

        public Builder() {
            $ = new GetRegionalSecretsPlainArgs();
        }

        public Builder(GetRegionalSecretsPlainArgs defaults) {
            $ = new GetRegionalSecretsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Filter string, adhering to the rules in [List-operation filtering](https://cloud.google.com/secret-manager/docs/filtering). List only secrets matching the filter. If filter is empty, all regional secrets are listed from the specified location.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param location The location of the regional secret.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetRegionalSecretsPlainArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetRegionalSecretsPlainArgs", "location");
            }
            return $;
        }
    }

}
