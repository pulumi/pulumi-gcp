// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentTargetImport {
    /**
     * @return The full contents of the template that you want to import.
     * 
     */
    private final @Nullable String content;
    /**
     * @return The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private DeploymentTargetImport(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("name") @Nullable String name) {
        this.content = content;
        this.name = name;
    }

    /**
     * @return The full contents of the template that you want to import.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTargetImport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTargetImport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DeploymentTargetImport build() {
            return new DeploymentTargetImport(content, name);
        }
    }
}