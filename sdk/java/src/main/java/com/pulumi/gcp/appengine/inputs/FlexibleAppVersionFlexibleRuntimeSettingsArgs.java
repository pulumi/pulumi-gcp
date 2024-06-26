// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionFlexibleRuntimeSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionFlexibleRuntimeSettingsArgs Empty = new FlexibleAppVersionFlexibleRuntimeSettingsArgs();

    /**
     * Operating System of the application runtime.
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable Output<String> operatingSystem;

    /**
     * @return Operating System of the application runtime.
     * 
     */
    public Optional<Output<String>> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * The runtime version of an App Engine flexible application.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return The runtime version of an App Engine flexible application.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    private FlexibleAppVersionFlexibleRuntimeSettingsArgs() {}

    private FlexibleAppVersionFlexibleRuntimeSettingsArgs(FlexibleAppVersionFlexibleRuntimeSettingsArgs $) {
        this.operatingSystem = $.operatingSystem;
        this.runtimeVersion = $.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionFlexibleRuntimeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionFlexibleRuntimeSettingsArgs $;

        public Builder() {
            $ = new FlexibleAppVersionFlexibleRuntimeSettingsArgs();
        }

        public Builder(FlexibleAppVersionFlexibleRuntimeSettingsArgs defaults) {
            $ = new FlexibleAppVersionFlexibleRuntimeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operatingSystem Operating System of the application runtime.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable Output<String> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem Operating System of the application runtime.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(String operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param runtimeVersion The runtime version of an App Engine flexible application.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion The runtime version of an App Engine flexible application.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public FlexibleAppVersionFlexibleRuntimeSettingsArgs build() {
            return $;
        }
    }

}
