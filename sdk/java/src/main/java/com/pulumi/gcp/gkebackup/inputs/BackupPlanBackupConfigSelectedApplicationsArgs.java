// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs;
import java.util.List;
import java.util.Objects;


public final class BackupPlanBackupConfigSelectedApplicationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPlanBackupConfigSelectedApplicationsArgs Empty = new BackupPlanBackupConfigSelectedApplicationsArgs();

    /**
     * A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    @Import(name="namespacedNames", required=true)
    private Output<List<BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames;

    /**
     * @return A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    public Output<List<BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames() {
        return this.namespacedNames;
    }

    private BackupPlanBackupConfigSelectedApplicationsArgs() {}

    private BackupPlanBackupConfigSelectedApplicationsArgs(BackupPlanBackupConfigSelectedApplicationsArgs $) {
        this.namespacedNames = $.namespacedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanBackupConfigSelectedApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanBackupConfigSelectedApplicationsArgs $;

        public Builder() {
            $ = new BackupPlanBackupConfigSelectedApplicationsArgs();
        }

        public Builder(BackupPlanBackupConfigSelectedApplicationsArgs defaults) {
            $ = new BackupPlanBackupConfigSelectedApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(Output<List<BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames) {
            $.namespacedNames = namespacedNames;
            return this;
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(List<BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs> namespacedNames) {
            return namespacedNames(Output.of(namespacedNames));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs... namespacedNames) {
            return namespacedNames(List.of(namespacedNames));
        }

        public BackupPlanBackupConfigSelectedApplicationsArgs build() {
            $.namespacedNames = Objects.requireNonNull($.namespacedNames, "expected parameter 'namespacedNames' to be non-null");
            return $;
        }
    }

}