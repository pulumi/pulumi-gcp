// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionRequestHeadersToAddArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionResponseHeadersToAddArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherHeaderActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherHeaderActionArgs Empty = new URLMapPathMatcherHeaderActionArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    @Import(name="requestHeadersToAdds")
    private @Nullable Output<List<URLMapPathMatcherHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds;

    /**
     * @return Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<URLMapPathMatcherHeaderActionRequestHeadersToAddArgs>>> requestHeadersToAdds() {
        return Optional.ofNullable(this.requestHeadersToAdds);
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToRemoves")
    private @Nullable Output<List<String>> requestHeadersToRemoves;

    /**
     * @return A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    public Optional<Output<List<String>>> requestHeadersToRemoves() {
        return Optional.ofNullable(this.requestHeadersToRemoves);
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @Import(name="responseHeadersToAdds")
    private @Nullable Output<List<URLMapPathMatcherHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds;

    /**
     * @return Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<URLMapPathMatcherHeaderActionResponseHeadersToAddArgs>>> responseHeadersToAdds() {
        return Optional.ofNullable(this.responseHeadersToAdds);
    }

    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    @Import(name="responseHeadersToRemoves")
    private @Nullable Output<List<String>> responseHeadersToRemoves;

    /**
     * @return A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    public Optional<Output<List<String>>> responseHeadersToRemoves() {
        return Optional.ofNullable(this.responseHeadersToRemoves);
    }

    private URLMapPathMatcherHeaderActionArgs() {}

    private URLMapPathMatcherHeaderActionArgs(URLMapPathMatcherHeaderActionArgs $) {
        this.requestHeadersToAdds = $.requestHeadersToAdds;
        this.requestHeadersToRemoves = $.requestHeadersToRemoves;
        this.responseHeadersToAdds = $.responseHeadersToAdds;
        this.responseHeadersToRemoves = $.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherHeaderActionArgs $;

        public Builder() {
            $ = new URLMapPathMatcherHeaderActionArgs();
        }

        public Builder(URLMapPathMatcherHeaderActionArgs defaults) {
            $ = new URLMapPathMatcherHeaderActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(@Nullable Output<List<URLMapPathMatcherHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds) {
            $.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(List<URLMapPathMatcherHeaderActionRequestHeadersToAddArgs> requestHeadersToAdds) {
            return requestHeadersToAdds(Output.of(requestHeadersToAdds));
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(URLMapPathMatcherHeaderActionRequestHeadersToAddArgs... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request prior to
         * forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(@Nullable Output<List<String>> requestHeadersToRemoves) {
            $.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request prior to
         * forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(List<String> requestHeadersToRemoves) {
            return requestHeadersToRemoves(Output.of(requestHeadersToRemoves));
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request prior to
         * forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(String... requestHeadersToRemoves) {
            return requestHeadersToRemoves(List.of(requestHeadersToRemoves));
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(@Nullable Output<List<URLMapPathMatcherHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds) {
            $.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(List<URLMapPathMatcherHeaderActionResponseHeadersToAddArgs> responseHeadersToAdds) {
            return responseHeadersToAdds(Output.of(responseHeadersToAdds));
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(URLMapPathMatcherHeaderActionResponseHeadersToAddArgs... responseHeadersToAdds) {
            return responseHeadersToAdds(List.of(responseHeadersToAdds));
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response prior to sending the
         * response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(@Nullable Output<List<String>> responseHeadersToRemoves) {
            $.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response prior to sending the
         * response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(List<String> responseHeadersToRemoves) {
            return responseHeadersToRemoves(Output.of(responseHeadersToRemoves));
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response prior to sending the
         * response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(String... responseHeadersToRemoves) {
            return responseHeadersToRemoves(List.of(responseHeadersToRemoves));
        }

        public URLMapPathMatcherHeaderActionArgs build() {
            return $;
        }
    }

}