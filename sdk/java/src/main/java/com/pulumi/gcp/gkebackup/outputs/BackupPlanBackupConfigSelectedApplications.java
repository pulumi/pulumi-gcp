// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkebackup.outputs.BackupPlanBackupConfigSelectedApplicationsNamespacedName;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackupPlanBackupConfigSelectedApplications {
    /**
     * @return A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    private List<BackupPlanBackupConfigSelectedApplicationsNamespacedName> namespacedNames;

    private BackupPlanBackupConfigSelectedApplications() {}
    /**
     * @return A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    public List<BackupPlanBackupConfigSelectedApplicationsNamespacedName> namespacedNames() {
        return this.namespacedNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanBackupConfigSelectedApplications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BackupPlanBackupConfigSelectedApplicationsNamespacedName> namespacedNames;
        public Builder() {}
        public Builder(BackupPlanBackupConfigSelectedApplications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedNames = defaults.namespacedNames;
        }

        @CustomType.Setter
        public Builder namespacedNames(List<BackupPlanBackupConfigSelectedApplicationsNamespacedName> namespacedNames) {
            this.namespacedNames = Objects.requireNonNull(namespacedNames);
            return this;
        }
        public Builder namespacedNames(BackupPlanBackupConfigSelectedApplicationsNamespacedName... namespacedNames) {
            return namespacedNames(List.of(namespacedNames));
        }
        public BackupPlanBackupConfigSelectedApplications build() {
            final var o = new BackupPlanBackupConfigSelectedApplications();
            o.namespacedNames = namespacedNames;
            return o;
        }
    }
}