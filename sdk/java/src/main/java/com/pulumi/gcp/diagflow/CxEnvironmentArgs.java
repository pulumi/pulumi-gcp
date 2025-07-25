// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxEnvironmentArgs Empty = new CxEnvironmentArgs();

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The Agent to create an Environment for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The Agent to create an Environment for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    @Import(name="versionConfigs", required=true)
    private Output<List<CxEnvironmentVersionConfigArgs>> versionConfigs;

    /**
     * @return A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    public Output<List<CxEnvironmentVersionConfigArgs>> versionConfigs() {
        return this.versionConfigs;
    }

    private CxEnvironmentArgs() {}

    private CxEnvironmentArgs(CxEnvironmentArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.parent = $.parent;
        this.versionConfigs = $.versionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxEnvironmentArgs $;

        public Builder() {
            $ = new CxEnvironmentArgs();
        }

        public Builder(CxEnvironmentArgs defaults) {
            $ = new CxEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param parent The Agent to create an Environment for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The Agent to create an Environment for.
         * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(Output<List<CxEnvironmentVersionConfigArgs>> versionConfigs) {
            $.versionConfigs = versionConfigs;
            return this;
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(List<CxEnvironmentVersionConfigArgs> versionConfigs) {
            return versionConfigs(Output.of(versionConfigs));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(CxEnvironmentVersionConfigArgs... versionConfigs) {
            return versionConfigs(List.of(versionConfigs));
        }

        public CxEnvironmentArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("CxEnvironmentArgs", "displayName");
            }
            if ($.versionConfigs == null) {
                throw new MissingRequiredPropertyException("CxEnvironmentArgs", "versionConfigs");
            }
            return $;
        }
    }

}
