// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.TaskNotebookInfrastructureSpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskNotebook {
    /**
     * @return Cloud Storage URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private @Nullable List<String> archiveUris;
    /**
     * @return Cloud Storage URIs of files to be placed in the working directory of each executor.
     * 
     */
    private @Nullable List<String> fileUris;
    /**
     * @return Infrastructure specification for the execution.
     * Structure is documented below.
     * 
     */
    private @Nullable TaskNotebookInfrastructureSpec infrastructureSpec;
    /**
     * @return Path to input notebook. This can be the Cloud Storage URI of the notebook file or the path to a Notebook Content. The execution args are accessible as environment variables (TASK_key=value).
     * 
     */
    private String notebook;

    private TaskNotebook() {}
    /**
     * @return Cloud Storage URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    /**
     * @return Cloud Storage URIs of files to be placed in the working directory of each executor.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    /**
     * @return Infrastructure specification for the execution.
     * Structure is documented below.
     * 
     */
    public Optional<TaskNotebookInfrastructureSpec> infrastructureSpec() {
        return Optional.ofNullable(this.infrastructureSpec);
    }
    /**
     * @return Path to input notebook. This can be the Cloud Storage URI of the notebook file or the path to a Notebook Content. The execution args are accessible as environment variables (TASK_key=value).
     * 
     */
    public String notebook() {
        return this.notebook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskNotebook defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> fileUris;
        private @Nullable TaskNotebookInfrastructureSpec infrastructureSpec;
        private String notebook;
        public Builder() {}
        public Builder(TaskNotebook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.fileUris = defaults.fileUris;
    	      this.infrastructureSpec = defaults.infrastructureSpec;
    	      this.notebook = defaults.notebook;
        }

        @CustomType.Setter
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        @CustomType.Setter
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        @CustomType.Setter
        public Builder infrastructureSpec(@Nullable TaskNotebookInfrastructureSpec infrastructureSpec) {
            this.infrastructureSpec = infrastructureSpec;
            return this;
        }
        @CustomType.Setter
        public Builder notebook(String notebook) {
            this.notebook = Objects.requireNonNull(notebook);
            return this;
        }
        public TaskNotebook build() {
            final var o = new TaskNotebook();
            o.archiveUris = archiveUris;
            o.fileUris = fileUris;
            o.infrastructureSpec = infrastructureSpec;
            o.notebook = notebook;
            return o;
        }
    }
}