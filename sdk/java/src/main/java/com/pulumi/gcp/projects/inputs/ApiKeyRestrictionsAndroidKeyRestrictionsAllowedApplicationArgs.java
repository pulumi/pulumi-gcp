// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs Empty = new ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs();

    /**
     * The package name of the application.
     * 
     */
    @Import(name="packageName", required=true)
    private Output<String> packageName;

    /**
     * @return The package name of the application.
     * 
     */
    public Output<String> packageName() {
        return this.packageName;
    }

    /**
     * The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
     * 
     */
    @Import(name="sha1Fingerprint", required=true)
    private Output<String> sha1Fingerprint;

    /**
     * @return The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
     * 
     */
    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    private ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs() {}

    private ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs(ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs $) {
        this.packageName = $.packageName;
        this.sha1Fingerprint = $.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs $;

        public Builder() {
            $ = new ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs();
        }

        public Builder(ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs defaults) {
            $ = new ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packageName The package name of the application.
         * 
         * @return builder
         * 
         */
        public Builder packageName(Output<String> packageName) {
            $.packageName = packageName;
            return this;
        }

        /**
         * @param packageName The package name of the application.
         * 
         * @return builder
         * 
         */
        public Builder packageName(String packageName) {
            return packageName(Output.of(packageName));
        }

        /**
         * @param sha1Fingerprint The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
         * 
         * @return builder
         * 
         */
        public Builder sha1Fingerprint(Output<String> sha1Fingerprint) {
            $.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        /**
         * @param sha1Fingerprint The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
         * 
         * @return builder
         * 
         */
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            return sha1Fingerprint(Output.of(sha1Fingerprint));
        }

        public ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs build() {
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.sha1Fingerprint = Objects.requireNonNull($.sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
            return $;
        }
    }

}