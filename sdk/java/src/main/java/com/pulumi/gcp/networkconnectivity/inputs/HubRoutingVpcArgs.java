// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HubRoutingVpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final HubRoutingVpcArgs Empty = new HubRoutingVpcArgs();

    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private HubRoutingVpcArgs() {}

    private HubRoutingVpcArgs(HubRoutingVpcArgs $) {
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubRoutingVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubRoutingVpcArgs $;

        public Builder() {
            $ = new HubRoutingVpcArgs();
        }

        public Builder(HubRoutingVpcArgs defaults) {
            $ = new HubRoutingVpcArgs(Objects.requireNonNull(defaults));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public HubRoutingVpcArgs build() {
            return $;
        }
    }

}