// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LbTrafficExtensionExtensionChainExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LbTrafficExtensionExtensionChainExtensionArgs Empty = new LbTrafficExtensionExtensionChainExtensionArgs();

    /**
     * The :authority header in the gRPC request sent from Envoy to the extension service.
     * 
     */
    @Import(name="authority")
    private @Nullable Output<String> authority;

    /**
     * @return The :authority header in the gRPC request sent from Envoy to the extension service.
     * 
     */
    public Optional<Output<String>> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * Determines how the proxy behaves if the call to the extension fails or times out.
     * When set to TRUE, request or response processing continues without error.
     * Any subsequent extensions in the extension chain are also executed.
     * When set to FALSE: * If response headers have not been delivered to the downstream client,
     * a generic 500 error is returned to the client. The error response can be tailored by
     * configuring a custom error response in the load balancer.
     * 
     */
    @Import(name="failOpen")
    private @Nullable Output<Boolean> failOpen;

    /**
     * @return Determines how the proxy behaves if the call to the extension fails or times out.
     * When set to TRUE, request or response processing continues without error.
     * Any subsequent extensions in the extension chain are also executed.
     * When set to FALSE: * If response headers have not been delivered to the downstream client,
     * a generic 500 error is returned to the client. The error response can be tailored by
     * configuring a custom error response in the load balancer.
     * 
     */
    public Optional<Output<Boolean>> failOpen() {
        return Optional.ofNullable(this.failOpen);
    }

    /**
     * List of the HTTP headers to forward to the extension (from the client or backend).
     * If omitted, all headers are sent. Each element is a string indicating the header name.
     * 
     */
    @Import(name="forwardHeaders")
    private @Nullable Output<List<String>> forwardHeaders;

    /**
     * @return List of the HTTP headers to forward to the extension (from the client or backend).
     * If omitted, all headers are sent. Each element is a string indicating the header name.
     * 
     */
    public Optional<Output<List<String>>> forwardHeaders() {
        return Optional.ofNullable(this.forwardHeaders);
    }

    /**
     * Metadata associated with the extension. This field is used to pass metadata to the extension service.
     * You can set up key value pairs for metadata as you like and need.
     * f.e. {&#34;key&#34;: &#34;value&#34;, &#34;key2&#34;: &#34;value2&#34;}.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Metadata associated with the extension. This field is used to pass metadata to the extension service.
     * You can set up key value pairs for metadata as you like and need.
     * f.e. {&#34;key&#34;: &#34;value&#34;, &#34;key2&#34;: &#34;value2&#34;}.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name for this extension. The name is logged as part of the HTTP request logs.
     * The name must conform with RFC-1034, is restricted to lower-cased letters, numbers and hyphens,
     * and can have a maximum length of 63 characters. Additionally, the first character must be a letter
     * and the last a letter or a number.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name for this extension. The name is logged as part of the HTTP request logs.
     * The name must conform with RFC-1034, is restricted to lower-cased letters, numbers and hyphens,
     * and can have a maximum length of 63 characters. Additionally, the first character must be a letter
     * and the last a letter or a number.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The reference to the service that runs the extension. Must be a reference to a backend service
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The reference to the service that runs the extension. Must be a reference to a backend service
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * A set of events during request or response processing for which this extension is called.
     * This field is required for the LbTrafficExtension resource. It&#39;s not relevant for the LbRouteExtension
     * resource. Possible values:`EVENT_TYPE_UNSPECIFIED`, `REQUEST_HEADERS`, `REQUEST_BODY`, `RESPONSE_HEADERS`,
     * `RESPONSE_BODY`, `RESPONSE_BODY` and `RESPONSE_BODY`.
     * 
     */
    @Import(name="supportedEvents")
    private @Nullable Output<List<String>> supportedEvents;

    /**
     * @return A set of events during request or response processing for which this extension is called.
     * This field is required for the LbTrafficExtension resource. It&#39;s not relevant for the LbRouteExtension
     * resource. Possible values:`EVENT_TYPE_UNSPECIFIED`, `REQUEST_HEADERS`, `REQUEST_BODY`, `RESPONSE_HEADERS`,
     * `RESPONSE_BODY`, `RESPONSE_BODY` and `RESPONSE_BODY`.
     * 
     */
    public Optional<Output<List<String>>> supportedEvents() {
        return Optional.ofNullable(this.supportedEvents);
    }

    /**
     * Specifies the timeout for each individual message on the stream. The timeout must be between 10-1000 milliseconds.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Specifies the timeout for each individual message on the stream. The timeout must be between 10-1000 milliseconds.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private LbTrafficExtensionExtensionChainExtensionArgs() {}

    private LbTrafficExtensionExtensionChainExtensionArgs(LbTrafficExtensionExtensionChainExtensionArgs $) {
        this.authority = $.authority;
        this.failOpen = $.failOpen;
        this.forwardHeaders = $.forwardHeaders;
        this.metadata = $.metadata;
        this.name = $.name;
        this.service = $.service;
        this.supportedEvents = $.supportedEvents;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LbTrafficExtensionExtensionChainExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LbTrafficExtensionExtensionChainExtensionArgs $;

        public Builder() {
            $ = new LbTrafficExtensionExtensionChainExtensionArgs();
        }

        public Builder(LbTrafficExtensionExtensionChainExtensionArgs defaults) {
            $ = new LbTrafficExtensionExtensionChainExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authority The :authority header in the gRPC request sent from Envoy to the extension service.
         * 
         * @return builder
         * 
         */
        public Builder authority(@Nullable Output<String> authority) {
            $.authority = authority;
            return this;
        }

        /**
         * @param authority The :authority header in the gRPC request sent from Envoy to the extension service.
         * 
         * @return builder
         * 
         */
        public Builder authority(String authority) {
            return authority(Output.of(authority));
        }

        /**
         * @param failOpen Determines how the proxy behaves if the call to the extension fails or times out.
         * When set to TRUE, request or response processing continues without error.
         * Any subsequent extensions in the extension chain are also executed.
         * When set to FALSE: * If response headers have not been delivered to the downstream client,
         * a generic 500 error is returned to the client. The error response can be tailored by
         * configuring a custom error response in the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder failOpen(@Nullable Output<Boolean> failOpen) {
            $.failOpen = failOpen;
            return this;
        }

        /**
         * @param failOpen Determines how the proxy behaves if the call to the extension fails or times out.
         * When set to TRUE, request or response processing continues without error.
         * Any subsequent extensions in the extension chain are also executed.
         * When set to FALSE: * If response headers have not been delivered to the downstream client,
         * a generic 500 error is returned to the client. The error response can be tailored by
         * configuring a custom error response in the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder failOpen(Boolean failOpen) {
            return failOpen(Output.of(failOpen));
        }

        /**
         * @param forwardHeaders List of the HTTP headers to forward to the extension (from the client or backend).
         * If omitted, all headers are sent. Each element is a string indicating the header name.
         * 
         * @return builder
         * 
         */
        public Builder forwardHeaders(@Nullable Output<List<String>> forwardHeaders) {
            $.forwardHeaders = forwardHeaders;
            return this;
        }

        /**
         * @param forwardHeaders List of the HTTP headers to forward to the extension (from the client or backend).
         * If omitted, all headers are sent. Each element is a string indicating the header name.
         * 
         * @return builder
         * 
         */
        public Builder forwardHeaders(List<String> forwardHeaders) {
            return forwardHeaders(Output.of(forwardHeaders));
        }

        /**
         * @param forwardHeaders List of the HTTP headers to forward to the extension (from the client or backend).
         * If omitted, all headers are sent. Each element is a string indicating the header name.
         * 
         * @return builder
         * 
         */
        public Builder forwardHeaders(String... forwardHeaders) {
            return forwardHeaders(List.of(forwardHeaders));
        }

        /**
         * @param metadata Metadata associated with the extension. This field is used to pass metadata to the extension service.
         * You can set up key value pairs for metadata as you like and need.
         * f.e. {&#34;key&#34;: &#34;value&#34;, &#34;key2&#34;: &#34;value2&#34;}.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata associated with the extension. This field is used to pass metadata to the extension service.
         * You can set up key value pairs for metadata as you like and need.
         * f.e. {&#34;key&#34;: &#34;value&#34;, &#34;key2&#34;: &#34;value2&#34;}.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name for this extension. The name is logged as part of the HTTP request logs.
         * The name must conform with RFC-1034, is restricted to lower-cased letters, numbers and hyphens,
         * and can have a maximum length of 63 characters. Additionally, the first character must be a letter
         * and the last a letter or a number.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for this extension. The name is logged as part of the HTTP request logs.
         * The name must conform with RFC-1034, is restricted to lower-cased letters, numbers and hyphens,
         * and can have a maximum length of 63 characters. Additionally, the first character must be a letter
         * and the last a letter or a number.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param service The reference to the service that runs the extension. Must be a reference to a backend service
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The reference to the service that runs the extension. Must be a reference to a backend service
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param supportedEvents A set of events during request or response processing for which this extension is called.
         * This field is required for the LbTrafficExtension resource. It&#39;s not relevant for the LbRouteExtension
         * resource. Possible values:`EVENT_TYPE_UNSPECIFIED`, `REQUEST_HEADERS`, `REQUEST_BODY`, `RESPONSE_HEADERS`,
         * `RESPONSE_BODY`, `RESPONSE_BODY` and `RESPONSE_BODY`.
         * 
         * @return builder
         * 
         */
        public Builder supportedEvents(@Nullable Output<List<String>> supportedEvents) {
            $.supportedEvents = supportedEvents;
            return this;
        }

        /**
         * @param supportedEvents A set of events during request or response processing for which this extension is called.
         * This field is required for the LbTrafficExtension resource. It&#39;s not relevant for the LbRouteExtension
         * resource. Possible values:`EVENT_TYPE_UNSPECIFIED`, `REQUEST_HEADERS`, `REQUEST_BODY`, `RESPONSE_HEADERS`,
         * `RESPONSE_BODY`, `RESPONSE_BODY` and `RESPONSE_BODY`.
         * 
         * @return builder
         * 
         */
        public Builder supportedEvents(List<String> supportedEvents) {
            return supportedEvents(Output.of(supportedEvents));
        }

        /**
         * @param supportedEvents A set of events during request or response processing for which this extension is called.
         * This field is required for the LbTrafficExtension resource. It&#39;s not relevant for the LbRouteExtension
         * resource. Possible values:`EVENT_TYPE_UNSPECIFIED`, `REQUEST_HEADERS`, `REQUEST_BODY`, `RESPONSE_HEADERS`,
         * `RESPONSE_BODY`, `RESPONSE_BODY` and `RESPONSE_BODY`.
         * 
         * @return builder
         * 
         */
        public Builder supportedEvents(String... supportedEvents) {
            return supportedEvents(List.of(supportedEvents));
        }

        /**
         * @param timeout Specifies the timeout for each individual message on the stream. The timeout must be between 10-1000 milliseconds.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for each individual message on the stream. The timeout must be between 10-1000 milliseconds.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public LbTrafficExtensionExtensionChainExtensionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("LbTrafficExtensionExtensionChainExtensionArgs", "name");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("LbTrafficExtensionExtensionChainExtensionArgs", "service");
            }
            return $;
        }
    }

}
