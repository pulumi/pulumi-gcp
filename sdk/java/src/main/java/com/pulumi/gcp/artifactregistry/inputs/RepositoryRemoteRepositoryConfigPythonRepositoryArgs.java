// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryRemoteRepositoryConfigPythonRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRemoteRepositoryConfigPythonRepositoryArgs Empty = new RepositoryRemoteRepositoryConfigPythonRepositoryArgs();

    /**
     * [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * 
     */
    @Import(name="customRepository")
    private @Nullable Output<RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs> customRepository;

    /**
     * @return [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs>> customRepository() {
        return Optional.ofNullable(this.customRepository);
    }

    /**
     * Address of the remote repository.
     * Default value is `PYPI`.
     * Possible values are: `PYPI`.
     * 
     */
    @Import(name="publicRepository")
    private @Nullable Output<String> publicRepository;

    /**
     * @return Address of the remote repository.
     * Default value is `PYPI`.
     * Possible values are: `PYPI`.
     * 
     */
    public Optional<Output<String>> publicRepository() {
        return Optional.ofNullable(this.publicRepository);
    }

    private RepositoryRemoteRepositoryConfigPythonRepositoryArgs() {}

    private RepositoryRemoteRepositoryConfigPythonRepositoryArgs(RepositoryRemoteRepositoryConfigPythonRepositoryArgs $) {
        this.customRepository = $.customRepository;
        this.publicRepository = $.publicRepository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRemoteRepositoryConfigPythonRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRemoteRepositoryConfigPythonRepositoryArgs $;

        public Builder() {
            $ = new RepositoryRemoteRepositoryConfigPythonRepositoryArgs();
        }

        public Builder(RepositoryRemoteRepositoryConfigPythonRepositoryArgs defaults) {
            $ = new RepositoryRemoteRepositoryConfigPythonRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customRepository(@Nullable Output<RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs> customRepository) {
            $.customRepository = customRepository;
            return this;
        }

        /**
         * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customRepository(RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs customRepository) {
            return customRepository(Output.of(customRepository));
        }

        /**
         * @param publicRepository Address of the remote repository.
         * Default value is `PYPI`.
         * Possible values are: `PYPI`.
         * 
         * @return builder
         * 
         */
        public Builder publicRepository(@Nullable Output<String> publicRepository) {
            $.publicRepository = publicRepository;
            return this;
        }

        /**
         * @param publicRepository Address of the remote repository.
         * Default value is `PYPI`.
         * Possible values are: `PYPI`.
         * 
         * @return builder
         * 
         */
        public Builder publicRepository(String publicRepository) {
            return publicRepository(Output.of(publicRepository));
        }

        public RepositoryRemoteRepositoryConfigPythonRepositoryArgs build() {
            return $;
        }
    }

}
