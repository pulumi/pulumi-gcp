// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.HostingChannelArgs;
import com.pulumi.gcp.firebase.inputs.HostingChannelState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Firebasehosting Channel Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
 * import com.pulumi.gcp.firebase.HostingChannel;
 * import com.pulumi.gcp.firebase.HostingChannelArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultHostingSite = new HostingSite(&#34;defaultHostingSite&#34;, HostingSiteArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .siteId(&#34;site-with-channel&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultHostingChannel = new HostingChannel(&#34;defaultHostingChannel&#34;, HostingChannelArgs.builder()        
 *             .siteId(defaultHostingSite.siteId())
 *             .channelId(&#34;channel-basic&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Firebasehosting Channel Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
 * import com.pulumi.gcp.firebase.HostingChannel;
 * import com.pulumi.gcp.firebase.HostingChannelArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new HostingSite(&#34;default&#34;, HostingSiteArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .siteId(&#34;site-with-channel&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var full = new HostingChannel(&#34;full&#34;, HostingChannelArgs.builder()        
 *             .siteId(default_.siteId())
 *             .channelId(&#34;channel-full&#34;)
 *             .ttl(&#34;86400s&#34;)
 *             .retainedReleaseCount(20)
 *             .labels(Map.of(&#34;some-key&#34;, &#34;some-value&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Channel can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingChannel:HostingChannel default sites/{{site_id}}/channels/{{channel_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingChannel:HostingChannel default {{site_id}}/{{channel_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/hostingChannel:HostingChannel")
public class HostingChannel extends com.pulumi.resources.CustomResource {
    /**
     * Required. Immutable. A unique ID within the site that identifies the channel.
     * 
     */
    @Export(name="channelId", type=String.class, parameters={})
    private Output<String> channelId;

    /**
     * @return Required. Immutable. A unique ID within the site that identifies the channel.
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }
    /**
     * The time at which the channel will be automatically deleted. If null, the channel
     * will not be automatically deleted. This field is present in the output whether it&#39;s
     * set directly or via the `ttl` field.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time at which the channel will be automatically deleted. If null, the channel
     * will not be automatically deleted. This field is present in the output whether it&#39;s
     * set directly or via the `ttl` field.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Text labels used for extra metadata and/or filtering
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Text labels used for extra metadata and/or filtering
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The fully-qualified resource name for the channel, in the format: sites/SITE_ID/channels/CHANNEL_ID
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully-qualified resource name for the channel, in the format: sites/SITE_ID/channels/CHANNEL_ID
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of previous releases to retain on the channel for rollback or other
     * purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    @Export(name="retainedReleaseCount", type=Integer.class, parameters={})
    private Output<Integer> retainedReleaseCount;

    /**
     * @return The number of previous releases to retain on the channel for rollback or other
     * purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    public Output<Integer> retainedReleaseCount() {
        return this.retainedReleaseCount;
    }
    /**
     * Required. The ID of the site in which to create this channel.
     * 
     */
    @Export(name="siteId", type=String.class, parameters={})
    private Output<String> siteId;

    /**
     * @return Required. The ID of the site in which to create this channel.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * Input only. A time-to-live for this channel. Sets `expire_time` to the provided
     * duration past the time of the request. A duration in seconds with up to nine fractional
     * digits, terminated by &#39;s&#39;. Example: &#34;86400s&#34; (one day).
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output</* @Nullable */ String> ttl;

    /**
     * @return Input only. A time-to-live for this channel. Sets `expire_time` to the provided
     * duration past the time of the request. A duration in seconds with up to nine fractional
     * digits, terminated by &#39;s&#39;. Example: &#34;86400s&#34; (one day).
     * 
     */
    public Output<Optional<String>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostingChannel(String name) {
        this(name, HostingChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostingChannel(String name, HostingChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostingChannel(String name, HostingChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingChannel:HostingChannel", name, args == null ? HostingChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostingChannel(String name, Output<String> id, @Nullable HostingChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingChannel:HostingChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HostingChannel get(String name, Output<String> id, @Nullable HostingChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostingChannel(name, id, state, options);
    }
}