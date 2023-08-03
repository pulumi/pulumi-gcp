// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networksecurity.AddressGroupArgs;
import com.pulumi.gcp.networksecurity.inputs.AddressGroupState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.
 * 
 * To get more information about AddressGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
 * * How-to Guides
 *     * [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)
 * 
 * ## Example Usage
 * ### Network Security Address Groups Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networksecurity.AddressGroup;
 * import com.pulumi.gcp.networksecurity.AddressGroupArgs;
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
 *         var default_ = new AddressGroup(&#34;default&#34;, AddressGroupArgs.builder()        
 *             .capacity(&#34;100&#34;)
 *             .items(&#34;208.80.154.224/32&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .parent(&#34;projects/my-project-name&#34;)
 *             .type(&#34;IPV4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Network Security Address Groups Organization Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networksecurity.AddressGroup;
 * import com.pulumi.gcp.networksecurity.AddressGroupArgs;
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
 *         var default_ = new AddressGroup(&#34;default&#34;, AddressGroupArgs.builder()        
 *             .capacity(&#34;100&#34;)
 *             .items(&#34;208.80.154.224/32&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .parent(&#34;organizations/123456789&#34;)
 *             .type(&#34;IPV4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Network Security Address Groups Advanced
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networksecurity.AddressGroup;
 * import com.pulumi.gcp.networksecurity.AddressGroupArgs;
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
 *         var default_ = new AddressGroup(&#34;default&#34;, AddressGroupArgs.builder()        
 *             .capacity(&#34;100&#34;)
 *             .description(&#34;my description&#34;)
 *             .items(&#34;208.80.154.224/32&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .parent(&#34;projects/my-project-name&#34;)
 *             .type(&#34;IPV4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AddressGroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:networksecurity/addressGroup:AddressGroup default {{parent}}/locations/{{location}}/addressGroups/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networksecurity/addressGroup:AddressGroup")
public class AddressGroup extends com.pulumi.resources.CustomResource {
    /**
     * Capacity of the Address Group.
     * 
     */
    @Export(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    /**
     * @return Capacity of the Address Group.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * The timestamp when the resource was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Free-text description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Free-text description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of items.
     * 
     */
    @Export(name="items", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> items;

    /**
     * @return List of items.
     * 
     */
    public Output<Optional<List<String>>> items() {
        return Codegen.optional(this.items);
    }
    /**
     * Set of label tags associated with the AddressGroup resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the AddressGroup resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location of the gateway security policy.
     * The default value is `global`.
     * 
     * ***
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the gateway security policy.
     * The default value is `global`.
     * 
     * ***
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the AddressGroup resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the AddressGroup resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The name of the parent this address group belongs to. Format: organizations/{organization_id} or projects/{project_id}.
     * 
     */
    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }
    /**
     * The type of the Address Group. Possible values are &#34;IPV4&#34; or &#34;IPV6&#34;.
     * Possible values are: `IPV4`, `IPV6`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the Address Group. Possible values are &#34;IPV4&#34; or &#34;IPV6&#34;.
     * Possible values are: `IPV4`, `IPV6`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The timestamp when the resource was updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AddressGroup(String name) {
        this(name, AddressGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AddressGroup(String name, AddressGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AddressGroup(String name, AddressGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/addressGroup:AddressGroup", name, args == null ? AddressGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AddressGroup(String name, Output<String> id, @Nullable AddressGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/addressGroup:AddressGroup", name, state, makeResourceOptions(options, id));
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
    public static AddressGroup get(String name, Output<String> id, @Nullable AddressGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AddressGroup(name, id, state, options);
    }
}