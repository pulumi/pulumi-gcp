// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxWebhookGenericWebServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxWebhookGenericWebServiceArgs Empty = new CxWebhookGenericWebServiceArgs();

    /**
     * Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
     * 
     */
    @Import(name="allowedCaCerts")
    private @Nullable Output<List<String>> allowedCaCerts;

    /**
     * @return Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
     * 
     */
    public Optional<Output<List<String>>> allowedCaCerts() {
        return Optional.ofNullable(this.allowedCaCerts);
    }

    /**
     * The HTTP request headers to send together with webhook requests.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<Map<String,String>> requestHeaders;

    /**
     * @return The HTTP request headers to send together with webhook requests.
     * 
     */
    public Optional<Output<Map<String,String>>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return Whether to use speech adaptation for speech recognition.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private CxWebhookGenericWebServiceArgs() {}

    private CxWebhookGenericWebServiceArgs(CxWebhookGenericWebServiceArgs $) {
        this.allowedCaCerts = $.allowedCaCerts;
        this.requestHeaders = $.requestHeaders;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxWebhookGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxWebhookGenericWebServiceArgs $;

        public Builder() {
            $ = new CxWebhookGenericWebServiceArgs();
        }

        public Builder(CxWebhookGenericWebServiceArgs defaults) {
            $ = new CxWebhookGenericWebServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedCaCerts Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
         * 
         * @return builder
         * 
         */
        public Builder allowedCaCerts(@Nullable Output<List<String>> allowedCaCerts) {
            $.allowedCaCerts = allowedCaCerts;
            return this;
        }

        /**
         * @param allowedCaCerts Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
         * 
         * @return builder
         * 
         */
        public Builder allowedCaCerts(List<String> allowedCaCerts) {
            return allowedCaCerts(Output.of(allowedCaCerts));
        }

        /**
         * @param allowedCaCerts Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
         * 
         * @return builder
         * 
         */
        public Builder allowedCaCerts(String... allowedCaCerts) {
            return allowedCaCerts(List.of(allowedCaCerts));
        }

        /**
         * @param requestHeaders The HTTP request headers to send together with webhook requests.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * @param requestHeaders The HTTP request headers to send together with webhook requests.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(Map<String,String> requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        /**
         * @param uri Whether to use speech adaptation for speech recognition.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Whether to use speech adaptation for speech recognition.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public CxWebhookGenericWebServiceArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}