// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMemcacheNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMemcacheNodeArgs Empty = new InstanceMemcacheNodeArgs();

    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceMemcacheNodeArgs() {}

    private InstanceMemcacheNodeArgs(InstanceMemcacheNodeArgs $) {
        this.host = $.host;
        this.nodeId = $.nodeId;
        this.port = $.port;
        this.state = $.state;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMemcacheNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMemcacheNodeArgs $;

        public Builder() {
            $ = new InstanceMemcacheNodeArgs();
        }

        public Builder(InstanceMemcacheNodeArgs defaults) {
            $ = new InstanceMemcacheNodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceMemcacheNodeArgs build() {
            return $;
        }
    }

}