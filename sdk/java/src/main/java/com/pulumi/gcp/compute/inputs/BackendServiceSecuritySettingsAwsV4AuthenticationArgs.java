// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceSecuritySettingsAwsV4AuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceSecuritySettingsAwsV4AuthenticationArgs Empty = new BackendServiceSecuritySettingsAwsV4AuthenticationArgs();

    /**
     * The access key used for s3 bucket authentication.
     * Required for updating or creating a backend that uses AWS v4 signature authentication, but will not be returned as part of the configuration when queried with a REST API GET request.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return The access key used for s3 bucket authentication.
     * Required for updating or creating a backend that uses AWS v4 signature authentication, but will not be returned as part of the configuration when queried with a REST API GET request.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * The identifier of an access key used for s3 bucket authentication.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return The identifier of an access key used for s3 bucket authentication.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * The optional version identifier for the access key. You can use this to keep track of different iterations of your access key.
     * 
     */
    @Import(name="accessKeyVersion")
    private @Nullable Output<String> accessKeyVersion;

    /**
     * @return The optional version identifier for the access key. You can use this to keep track of different iterations of your access key.
     * 
     */
    public Optional<Output<String>> accessKeyVersion() {
        return Optional.ofNullable(this.accessKeyVersion);
    }

    /**
     * The name of the cloud region of your origin. This is a free-form field with the name of the region your cloud uses to host your origin.
     * For example, &#34;us-east-1&#34; for AWS or &#34;us-ashburn-1&#34; for OCI.
     * 
     */
    @Import(name="originRegion")
    private @Nullable Output<String> originRegion;

    /**
     * @return The name of the cloud region of your origin. This is a free-form field with the name of the region your cloud uses to host your origin.
     * For example, &#34;us-east-1&#34; for AWS or &#34;us-ashburn-1&#34; for OCI.
     * 
     */
    public Optional<Output<String>> originRegion() {
        return Optional.ofNullable(this.originRegion);
    }

    private BackendServiceSecuritySettingsAwsV4AuthenticationArgs() {}

    private BackendServiceSecuritySettingsAwsV4AuthenticationArgs(BackendServiceSecuritySettingsAwsV4AuthenticationArgs $) {
        this.accessKey = $.accessKey;
        this.accessKeyId = $.accessKeyId;
        this.accessKeyVersion = $.accessKeyVersion;
        this.originRegion = $.originRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceSecuritySettingsAwsV4AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceSecuritySettingsAwsV4AuthenticationArgs $;

        public Builder() {
            $ = new BackendServiceSecuritySettingsAwsV4AuthenticationArgs();
        }

        public Builder(BackendServiceSecuritySettingsAwsV4AuthenticationArgs defaults) {
            $ = new BackendServiceSecuritySettingsAwsV4AuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key used for s3 bucket authentication.
         * Required for updating or creating a backend that uses AWS v4 signature authentication, but will not be returned as part of the configuration when queried with a REST API GET request.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key used for s3 bucket authentication.
         * Required for updating or creating a backend that uses AWS v4 signature authentication, but will not be returned as part of the configuration when queried with a REST API GET request.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param accessKeyId The identifier of an access key used for s3 bucket authentication.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId The identifier of an access key used for s3 bucket authentication.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param accessKeyVersion The optional version identifier for the access key. You can use this to keep track of different iterations of your access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyVersion(@Nullable Output<String> accessKeyVersion) {
            $.accessKeyVersion = accessKeyVersion;
            return this;
        }

        /**
         * @param accessKeyVersion The optional version identifier for the access key. You can use this to keep track of different iterations of your access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyVersion(String accessKeyVersion) {
            return accessKeyVersion(Output.of(accessKeyVersion));
        }

        /**
         * @param originRegion The name of the cloud region of your origin. This is a free-form field with the name of the region your cloud uses to host your origin.
         * For example, &#34;us-east-1&#34; for AWS or &#34;us-ashburn-1&#34; for OCI.
         * 
         * @return builder
         * 
         */
        public Builder originRegion(@Nullable Output<String> originRegion) {
            $.originRegion = originRegion;
            return this;
        }

        /**
         * @param originRegion The name of the cloud region of your origin. This is a free-form field with the name of the region your cloud uses to host your origin.
         * For example, &#34;us-east-1&#34; for AWS or &#34;us-ashburn-1&#34; for OCI.
         * 
         * @return builder
         * 
         */
        public Builder originRegion(String originRegion) {
            return originRegion(Output.of(originRegion));
        }

        public BackendServiceSecuritySettingsAwsV4AuthenticationArgs build() {
            return $;
        }
    }

}
