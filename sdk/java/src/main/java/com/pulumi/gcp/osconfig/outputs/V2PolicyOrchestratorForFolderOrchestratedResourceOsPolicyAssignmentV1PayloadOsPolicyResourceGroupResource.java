// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExec;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFile;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepository;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource {
    /**
     * @return A resource that allows executing scripts on the VM.
     * The `ExecResource` has 2 stages: `validate` and `enforce` and both stages
     * accept a script as an argument to execute.
     * When the `ExecResource` is applied by the agent, it first executes the
     * script in the `validate` stage. The `validate` stage can signal that the
     * `ExecResource` is already in the desired state by returning an exit code
     * of `100`. If the `ExecResource` is not in the desired state, it should
     * return an exit code of `101`. Any other exit code returned by this stage
     * is considered an error.
     * If the `ExecResource` is not in the desired state based on the exit code
     * from the `validate` stage, the agent proceeds to execute the script from
     * the `enforce` stage. If the `ExecResource` is already in the desired
     * state, the `enforce` stage will not be run.
     * Similar to `validate` stage, the `enforce` stage should return an exit
     * code of `100` to indicate that the resource in now in its desired state.
     * Any other exit code is considered an error.
     * NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to
     * have an explicit indicator of `in desired state`, `not in desired state`
     * and errors. Because, for example, Powershell will always return an exit
     * code of `0` unless an `exit` statement is provided in the script. So, for
     * reasons of consistency and being explicit, exit codes `100` and `101`
     * were chosen.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExec exec;
    /**
     * @return A resource that manages the state of a file.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFile file;
    /**
     * @return The id of the resource with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the OS policy.
     * 
     */
    private String id;
    /**
     * @return A resource that manages a system package.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg pkg;
    /**
     * @return A resource that manages a package repository.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepository repository;

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource() {}
    /**
     * @return A resource that allows executing scripts on the VM.
     * The `ExecResource` has 2 stages: `validate` and `enforce` and both stages
     * accept a script as an argument to execute.
     * When the `ExecResource` is applied by the agent, it first executes the
     * script in the `validate` stage. The `validate` stage can signal that the
     * `ExecResource` is already in the desired state by returning an exit code
     * of `100`. If the `ExecResource` is not in the desired state, it should
     * return an exit code of `101`. Any other exit code returned by this stage
     * is considered an error.
     * If the `ExecResource` is not in the desired state based on the exit code
     * from the `validate` stage, the agent proceeds to execute the script from
     * the `enforce` stage. If the `ExecResource` is already in the desired
     * state, the `enforce` stage will not be run.
     * Similar to `validate` stage, the `enforce` stage should return an exit
     * code of `100` to indicate that the resource in now in its desired state.
     * Any other exit code is considered an error.
     * NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to
     * have an explicit indicator of `in desired state`, `not in desired state`
     * and errors. Because, for example, Powershell will always return an exit
     * code of `0` unless an `exit` statement is provided in the script. So, for
     * reasons of consistency and being explicit, exit codes `100` and `101`
     * were chosen.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExec> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return A resource that manages the state of a file.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return The id of the resource with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the OS policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A resource that manages a system package.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg> pkg() {
        return Optional.ofNullable(this.pkg);
    }
    /**
     * @return A resource that manages a package repository.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepository> repository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExec exec;
        private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFile file;
        private String id;
        private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg pkg;
        private @Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepository repository;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.id = defaults.id;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder exec(@Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExec exec) {

            this.exec = exec;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pkg(@Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg pkg) {

            this.pkg = pkg;
            return this;
        }
        @CustomType.Setter
        public Builder repository(@Nullable V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepository repository) {

            this.repository = repository;
            return this;
        }
        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource build() {
            final var _resultValue = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource();
            _resultValue.exec = exec;
            _resultValue.file = file;
            _resultValue.id = id;
            _resultValue.pkg = pkg;
            _resultValue.repository = repository;
            return _resultValue;
        }
    }
}
