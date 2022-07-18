// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionSourceRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionSourceRepositoryArgs Empty = new FunctionSourceRepositoryArgs();

    @Import(name="deployedUrl")
    private @Nullable Output<String> deployedUrl;

    public Optional<Output<String>> deployedUrl() {
        return Optional.ofNullable(this.deployedUrl);
    }

    /**
     * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private FunctionSourceRepositoryArgs() {}

    private FunctionSourceRepositoryArgs(FunctionSourceRepositoryArgs $) {
        this.deployedUrl = $.deployedUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionSourceRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionSourceRepositoryArgs $;

        public Builder() {
            $ = new FunctionSourceRepositoryArgs();
        }

        public Builder(FunctionSourceRepositoryArgs defaults) {
            $ = new FunctionSourceRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder deployedUrl(@Nullable Output<String> deployedUrl) {
            $.deployedUrl = deployedUrl;
            return this;
        }

        public Builder deployedUrl(String deployedUrl) {
            return deployedUrl(Output.of(deployedUrl));
        }

        /**
         * @param url The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public FunctionSourceRepositoryArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}