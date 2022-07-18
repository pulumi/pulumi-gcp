// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.secretmanager.SecretArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretState;
import com.pulumi.gcp.secretmanager.outputs.SecretReplication;
import com.pulumi.gcp.secretmanager.outputs.SecretRotation;
import com.pulumi.gcp.secretmanager.outputs.SecretTopic;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Secret is a logical secret whose value and versions can be accessed.
 * 
 * To get more information about Secret, see:
 * 
 * * [API documentation](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets)
 * 
 * ## Example Usage
 * ### Secret Config Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var secret_basic = new Secret(&#34;secret-basic&#34;, SecretArgs.builder()        
 *             .labels(Map.of(&#34;label&#34;, &#34;my-label&#34;))
 *             .replication(SecretReplicationArgs.builder()
 *                 .userManaged(SecretReplicationUserManagedArgs.builder()
 *                     .replicas(                    
 *                         SecretReplicationUserManagedReplicaArgs.builder()
 *                             .location(&#34;us-central1&#34;)
 *                             .build(),
 *                         SecretReplicationUserManagedReplicaArgs.builder()
 *                             .location(&#34;us-east1&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .secretId(&#34;secret&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Secret can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secret:Secret default projects/{{project}}/secrets/{{secret_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secret:Secret default {{project}}/{{secret_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secret:Secret default {{secret_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:secretmanager/secret:Secret")
public class Secret extends com.pulumi.resources.CustomResource {
    /**
     * The time at which the Secret was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the Secret was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * The labels assigned to this Secret.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example:
     * { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels assigned to this Secret.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
     * and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be assigned to a given resource.
     * An object containing a list of &#34;key&#34;: value pairs. Example:
     * { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Pub/Sub topic that will be published to, in the following format: projects/*{@literal /}topics/*.
     * For publication to succeed, the Secret Manager Service Agent service account must have pubsub.publisher permissions on the topic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * 
     */
    @Export(name="replication", type=SecretReplication.class, parameters={})
    private Output<SecretReplication> replication;

    /**
     * @return The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * 
     */
    public Output<SecretReplication> replication() {
        return this.replication;
    }
    /**
     * The rotation time and period for a Secret. At `next_rotation_time`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * 
     */
    @Export(name="rotation", type=SecretRotation.class, parameters={})
    private Output</* @Nullable */ SecretRotation> rotation;

    /**
     * @return The rotation time and period for a Secret. At `next_rotation_time`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * 
     */
    public Output<Optional<SecretRotation>> rotation() {
        return Codegen.optional(this.rotation);
    }
    /**
     * This must be unique within the project.
     * 
     */
    @Export(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    /**
     * @return This must be unique within the project.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }
    /**
     * A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * 
     */
    @Export(name="topics", type=List.class, parameters={SecretTopic.class})
    private Output</* @Nullable */ List<SecretTopic>> topics;

    /**
     * @return A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<SecretTopic>>> topics() {
        return Codegen.optional(this.topics);
    }
    /**
     * The TTL for the Secret.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output</* @Nullable */ String> ttl;

    /**
     * @return The TTL for the Secret.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Output<Optional<String>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Secret(String name) {
        this(name, SecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Secret(String name, SecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Secret(String name, SecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secret:Secret", name, args == null ? SecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Secret(String name, Output<String> id, @Nullable SecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secret:Secret", name, state, makeResourceOptions(options, id));
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
    public static Secret get(String name, Output<String> id, @Nullable SecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, state, options);
    }
}