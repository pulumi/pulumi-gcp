// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectAccessControlProjectTeam {
    private final @Nullable String projectNumber;
    private final @Nullable String team;

    @CustomType.Constructor
    private ObjectAccessControlProjectTeam(
        @CustomType.Parameter("projectNumber") @Nullable String projectNumber,
        @CustomType.Parameter("team") @Nullable String team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    public Optional<String> projectNumber() {
        return Optional.ofNullable(this.projectNumber);
    }
    public Optional<String> team() {
        return Optional.ofNullable(this.team);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlProjectTeam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String projectNumber;
        private @Nullable String team;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlProjectTeam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder projectNumber(@Nullable String projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }
        public Builder team(@Nullable String team) {
            this.team = team;
            return this;
        }        public ObjectAccessControlProjectTeam build() {
            return new ObjectAccessControlProjectTeam(projectNumber, team);
        }
    }
}