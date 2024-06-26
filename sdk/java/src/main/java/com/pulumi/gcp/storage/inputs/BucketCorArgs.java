// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketCorArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketCorArgs Empty = new BucketCorArgs();

    /**
     * The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    @Import(name="maxAgeSeconds")
    private @Nullable Output<Integer> maxAgeSeconds;

    /**
     * @return The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    public Optional<Output<Integer>> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    /**
     * @return The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    @Import(name="origins")
    private @Nullable Output<List<String>> origins;

    /**
     * @return The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    public Optional<Output<List<String>>> origins() {
        return Optional.ofNullable(this.origins);
    }

    /**
     * The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    @Import(name="responseHeaders")
    private @Nullable Output<List<String>> responseHeaders;

    /**
     * @return The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    public Optional<Output<List<String>>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private BucketCorArgs() {}

    private BucketCorArgs(BucketCorArgs $) {
        this.maxAgeSeconds = $.maxAgeSeconds;
        this.methods = $.methods;
        this.origins = $.origins;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketCorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketCorArgs $;

        public Builder() {
            $ = new BucketCorArgs();
        }

        public Builder(BucketCorArgs defaults) {
            $ = new BucketCorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxAgeSeconds The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(@Nullable Output<Integer> maxAgeSeconds) {
            $.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * @param maxAgeSeconds The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            return maxAgeSeconds(Output.of(maxAgeSeconds));
        }

        /**
         * @param methods The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param origins The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
         * 
         * @return builder
         * 
         */
        public Builder origins(@Nullable Output<List<String>> origins) {
            $.origins = origins;
            return this;
        }

        /**
         * @param origins The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
         * 
         * @return builder
         * 
         */
        public Builder origins(List<String> origins) {
            return origins(Output.of(origins));
        }

        /**
         * @param origins The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
         * 
         * @return builder
         * 
         */
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }

        /**
         * @param responseHeaders The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(@Nullable Output<List<String>> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        /**
         * @param responseHeaders The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(List<String> responseHeaders) {
            return responseHeaders(Output.of(responseHeaders));
        }

        /**
         * @param responseHeaders The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(String... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }

        public BucketCorArgs build() {
            return $;
        }
    }

}
