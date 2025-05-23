// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs Empty = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs();

    /**
     * A resource that allows executing scripts on the VM.
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
    @Import(name="exec")
    private @Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs> exec;

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
    public Optional<Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * A resource that manages the state of a file.
     * Structure is documented below.
     * 
     */
    @Import(name="file")
    private @Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs> file;

    /**
     * @return A resource that manages the state of a file.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * Required. The id of the resource with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the OS policy.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Required. The id of the resource with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the OS policy.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * A resource that manages a system package.
     * Structure is documented below.
     * 
     */
    @Import(name="pkg")
    private @Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs> pkg;

    /**
     * @return A resource that manages a system package.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs>> pkg() {
        return Optional.ofNullable(this.pkg);
    }

    /**
     * A resource that manages a package repository.
     * Structure is documented below.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs> repository;

    /**
     * @return A resource that manages a package repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs() {}

    private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs $) {
        this.exec = $.exec;
        this.file = $.file;
        this.id = $.id;
        this.pkg = $.pkg;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs();
        }

        public Builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs defaults) {
            $ = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec A resource that allows executing scripts on the VM.
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
         * @return builder
         * 
         */
        public Builder exec(@Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs> exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param exec A resource that allows executing scripts on the VM.
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
         * @return builder
         * 
         */
        public Builder exec(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs exec) {
            return exec(Output.of(exec));
        }

        /**
         * @param file A resource that manages the state of a file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file A resource that manages the state of a file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder file(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param id Required. The id of the resource with the following restrictions:
         * * Must contain only lowercase letters, numbers, and hyphens.
         * * Must start with a letter.
         * * Must be between 1-63 characters.
         * * Must end with a number or a letter.
         * * Must be unique within the OS policy.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Required. The id of the resource with the following restrictions:
         * * Must contain only lowercase letters, numbers, and hyphens.
         * * Must start with a letter.
         * * Must be between 1-63 characters.
         * * Must end with a number or a letter.
         * * Must be unique within the OS policy.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param pkg A resource that manages a system package.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pkg(@Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs> pkg) {
            $.pkg = pkg;
            return this;
        }

        /**
         * @param pkg A resource that manages a system package.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pkg(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs pkg) {
            return pkg(Output.of(pkg));
        }

        /**
         * @param repository A resource that manages a package repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository A resource that manages a package repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder repository(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs repository) {
            return repository(Output.of(repository));
        }

        public V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs", "id");
            }
            return $;
        }
    }

}
