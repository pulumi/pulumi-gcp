// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildArtifactsPythonPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArtifactsPythonPackageArgs Empty = new TriggerBuildArtifactsPythonPackageArgs();

    /**
     * Path globs used to match files in the build&#39;s workspace. For Python/ Twine, this is usually dist/*, and sometimes additionally an .asc file.
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return Path globs used to match files in the build&#39;s workspace. For Python/ Twine, this is usually dist/*, and sometimes additionally an .asc file.
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * Artifact Registry repository, in the form &#34;https://$REGION-python.pkg.dev/$PROJECT/$REPOSITORY&#34;
     * Files in the workspace matching any path pattern will be uploaded to Artifact Registry with this location as a prefix.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    /**
     * @return Artifact Registry repository, in the form &#34;https://$REGION-python.pkg.dev/$PROJECT/$REPOSITORY&#34;
     * Files in the workspace matching any path pattern will be uploaded to Artifact Registry with this location as a prefix.
     * 
     */
    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private TriggerBuildArtifactsPythonPackageArgs() {}

    private TriggerBuildArtifactsPythonPackageArgs(TriggerBuildArtifactsPythonPackageArgs $) {
        this.paths = $.paths;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildArtifactsPythonPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildArtifactsPythonPackageArgs $;

        public Builder() {
            $ = new TriggerBuildArtifactsPythonPackageArgs();
        }

        public Builder(TriggerBuildArtifactsPythonPackageArgs defaults) {
            $ = new TriggerBuildArtifactsPythonPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param paths Path globs used to match files in the build&#39;s workspace. For Python/ Twine, this is usually dist/*, and sometimes additionally an .asc file.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths Path globs used to match files in the build&#39;s workspace. For Python/ Twine, this is usually dist/*, and sometimes additionally an .asc file.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths Path globs used to match files in the build&#39;s workspace. For Python/ Twine, this is usually dist/*, and sometimes additionally an .asc file.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param repository Artifact Registry repository, in the form &#34;https://$REGION-python.pkg.dev/$PROJECT/$REPOSITORY&#34;
         * Files in the workspace matching any path pattern will be uploaded to Artifact Registry with this location as a prefix.
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Artifact Registry repository, in the form &#34;https://$REGION-python.pkg.dev/$PROJECT/$REPOSITORY&#34;
         * Files in the workspace matching any path pattern will be uploaded to Artifact Registry with this location as a prefix.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public TriggerBuildArtifactsPythonPackageArgs build() {
            return $;
        }
    }

}