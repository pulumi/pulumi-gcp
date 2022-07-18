// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileArgs;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentArgs Empty = new StandardAppVersionDeploymentArgs();

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @Import(name="files")
    private @Nullable Output<List<StandardAppVersionDeploymentFileArgs>> files;

    /**
     * @return Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StandardAppVersionDeploymentFileArgs>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @Import(name="zip")
    private @Nullable Output<StandardAppVersionDeploymentZipArgs> zip;

    /**
     * @return Zip File
     * Structure is documented below.
     * 
     */
    public Optional<Output<StandardAppVersionDeploymentZipArgs>> zip() {
        return Optional.ofNullable(this.zip);
    }

    private StandardAppVersionDeploymentArgs() {}

    private StandardAppVersionDeploymentArgs(StandardAppVersionDeploymentArgs $) {
        this.files = $.files;
        this.zip = $.zip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionDeploymentArgs $;

        public Builder() {
            $ = new StandardAppVersionDeploymentArgs();
        }

        public Builder(StandardAppVersionDeploymentArgs defaults) {
            $ = new StandardAppVersionDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param files Manifest of the files stored in Google Cloud Storage that are included as part of this version.
         * All files must be readable using the credentials supplied with this call.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder files(@Nullable Output<List<StandardAppVersionDeploymentFileArgs>> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files Manifest of the files stored in Google Cloud Storage that are included as part of this version.
         * All files must be readable using the credentials supplied with this call.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder files(List<StandardAppVersionDeploymentFileArgs> files) {
            return files(Output.of(files));
        }

        /**
         * @param files Manifest of the files stored in Google Cloud Storage that are included as part of this version.
         * All files must be readable using the credentials supplied with this call.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder files(StandardAppVersionDeploymentFileArgs... files) {
            return files(List.of(files));
        }

        /**
         * @param zip Zip File
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder zip(@Nullable Output<StandardAppVersionDeploymentZipArgs> zip) {
            $.zip = zip;
            return this;
        }

        /**
         * @param zip Zip File
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder zip(StandardAppVersionDeploymentZipArgs zip) {
            return zip(Output.of(zip));
        }

        public StandardAppVersionDeploymentArgs build() {
            return $;
        }
    }

}