// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkehub.FeatureMembershipArgs;
import com.pulumi.gcp.gkehub.inputs.FeatureMembershipState;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagement;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Config Management
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var cluster = new Cluster(&#34;cluster&#34;, ClusterArgs.builder()        
 *             .location(&#34;us-central1-a&#34;)
 *             .initialNodeCount(1)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var membership = new Membership(&#34;membership&#34;, MembershipArgs.builder()        
 *             .membershipId(&#34;my-membership&#34;)
 *             .endpoint(MembershipEndpointArgs.builder()
 *                 .gkeCluster(MembershipEndpointGkeClusterArgs.builder()
 *                     .resourceLink(cluster.id().apply(id -&gt; String.format(&#34;//container.googleapis.com/%s&#34;, id)))
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var feature = new Feature(&#34;feature&#34;, FeatureArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var featureMember = new FeatureMembership(&#34;featureMember&#34;, FeatureMembershipArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .feature(feature.name())
 *             .membership(membership.membershipId())
 *             .configmanagement(FeatureMembershipConfigmanagementArgs.builder()
 *                 .version(&#34;1.6.2&#34;)
 *                 .configSync(FeatureMembershipConfigmanagementConfigSyncArgs.builder()
 *                     .git(FeatureMembershipConfigmanagementConfigSyncGitArgs.builder()
 *                         .syncRepo(&#34;https://github.com/hashicorp/terraform&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Multi Cluster Service Discovery
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var feature = new Feature(&#34;feature&#34;, FeatureArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
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
 * FeatureMembership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default projects/{{project}}/locations/{{location}}/features/{{feature}}/membershipId/{{membership}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default {{project}}/{{location}}/{{feature}}/{{membership}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/featureMembership:FeatureMembership default {{location}}/{{feature}}/{{membership}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/featureMembership:FeatureMembership")
public class FeatureMembership extends com.pulumi.resources.CustomResource {
    /**
     * Config Management-specific spec. Structure is documented below.
     * 
     */
    @Export(name="configmanagement", type=FeatureMembershipConfigmanagement.class, parameters={})
    private Output<FeatureMembershipConfigmanagement> configmanagement;

    /**
     * @return Config Management-specific spec. Structure is documented below.
     * 
     */
    public Output<FeatureMembershipConfigmanagement> configmanagement() {
        return this.configmanagement;
    }
    /**
     * The name of the feature
     * 
     */
    @Export(name="feature", type=String.class, parameters={})
    private Output<String> feature;

    /**
     * @return The name of the feature
     * 
     */
    public Output<String> feature() {
        return this.feature;
    }
    /**
     * The location of the feature
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the feature
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the membership
     * 
     */
    @Export(name="membership", type=String.class, parameters={})
    private Output<String> membership;

    /**
     * @return The name of the membership
     * 
     */
    public Output<String> membership() {
        return this.membership;
    }
    /**
     * The project of the feature
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project of the feature
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeatureMembership(String name) {
        this(name, FeatureMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureMembership(String name, FeatureMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureMembership(String name, FeatureMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/featureMembership:FeatureMembership", name, args == null ? FeatureMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FeatureMembership(String name, Output<String> id, @Nullable FeatureMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/featureMembership:FeatureMembership", name, state, makeResourceOptions(options, id));
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
    public static FeatureMembership get(String name, Output<String> id, @Nullable FeatureMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FeatureMembership(name, id, state, options);
    }
}