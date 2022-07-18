// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceArgs();

    /**
     * Exec resource
     * 
     */
    @Import(name="exec")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs> exec;

    /**
     * @return Exec resource
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * A remote or local source.
     * 
     */
    @Import(name="file")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs> file;

    /**
     * @return A remote or local source.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Package resource
     * 
     */
    @Import(name="pkg")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs> pkg;

    /**
     * @return Package resource
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs>> pkg() {
        return Optional.ofNullable(this.pkg);
    }

    /**
     * Package repository resource
     * 
     */
    @Import(name="repository")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs> repository;

    /**
     * @return Package repository resource
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceArgs $) {
        this.exec = $.exec;
        this.file = $.file;
        this.id = $.id;
        this.pkg = $.pkg;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec Exec resource
         * 
         * @return builder
         * 
         */
        public Builder exec(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs> exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param exec Exec resource
         * 
         * @return builder
         * 
         */
        public Builder exec(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs exec) {
            return exec(Output.of(exec));
        }

        /**
         * @param file A remote or local source.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file A remote or local source.
         * 
         * @return builder
         * 
         */
        public Builder file(OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param id Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param pkg Package resource
         * 
         * @return builder
         * 
         */
        public Builder pkg(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs> pkg) {
            $.pkg = pkg;
            return this;
        }

        /**
         * @param pkg Package resource
         * 
         * @return builder
         * 
         */
        public Builder pkg(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs pkg) {
            return pkg(Output.of(pkg));
        }

        /**
         * @param repository Package repository resource
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Package repository resource
         * 
         * @return builder
         * 
         */
        public Builder repository(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs repository) {
            return repository(Output.of(repository));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}