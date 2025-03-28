// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupRunArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupRunArgs Empty = new GetBackupRunArgs();

    /**
     * The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
     * 
     */
    @Import(name="backupId")
    private @Nullable Output<Integer> backupId;

    /**
     * @return The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
     * 
     */
    public Optional<Output<Integer>> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * The name of the instance the backup is taken from.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name of the instance the backup is taken from.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * Toggles use of the most recent backup run if multiple backups exist for a
     * Cloud SQL instance.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return Toggles use of the most recent backup run if multiple backups exist for a
     * Cloud SQL instance.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The project to list instances for. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project to list instances for. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackupRunArgs() {}

    private GetBackupRunArgs(GetBackupRunArgs $) {
        this.backupId = $.backupId;
        this.instance = $.instance;
        this.mostRecent = $.mostRecent;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupRunArgs $;

        public Builder() {
            $ = new GetBackupRunArgs();
        }

        public Builder(GetBackupRunArgs defaults) {
            $ = new GetBackupRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId The identifier for this backup run. Unique only for a specific Cloud SQL instance.
         * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder backupId(@Nullable Output<Integer> backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupId The identifier for this backup run. Unique only for a specific Cloud SQL instance.
         * If left empty and multiple backups exist for the instance, `most_recent` must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder backupId(Integer backupId) {
            return backupId(Output.of(backupId));
        }

        /**
         * @param instance The name of the instance the backup is taken from.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the instance the backup is taken from.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param mostRecent Toggles use of the most recent backup run if multiple backups exist for a
         * Cloud SQL instance.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent Toggles use of the most recent backup run if multiple backups exist for a
         * Cloud SQL instance.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param project The project to list instances for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project to list instances for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetBackupRunArgs build() {
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("GetBackupRunArgs", "instance");
            }
            return $;
        }
    }

}
