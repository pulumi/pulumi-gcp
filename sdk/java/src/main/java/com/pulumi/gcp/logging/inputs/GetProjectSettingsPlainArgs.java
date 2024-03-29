// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProjectSettingsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectSettingsPlainArgs Empty = new GetProjectSettingsPlainArgs();

    /**
     * The ID of the project for which to retrieve settings.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The ID of the project for which to retrieve settings.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetProjectSettingsPlainArgs() {}

    private GetProjectSettingsPlainArgs(GetProjectSettingsPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectSettingsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectSettingsPlainArgs $;

        public Builder() {
            $ = new GetProjectSettingsPlainArgs();
        }

        public Builder(GetProjectSettingsPlainArgs defaults) {
            $ = new GetProjectSettingsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project for which to retrieve settings.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetProjectSettingsPlainArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetProjectSettingsPlainArgs", "project");
            }
            return $;
        }
    }

}
