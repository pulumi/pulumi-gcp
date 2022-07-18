// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.InstanceAttachmentArgs;
import com.pulumi.gcp.apigee.inputs.InstanceAttachmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An `Instance attachment` in Apigee.
 * 
 * To get more information about InstanceAttachment, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.attachments/create)
 * * How-to Guides
 *     * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
 * 
 * ## Example Usage
 * ### Apigee Instance Attachment Basic
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
 *         var project = new Project(&#34;project&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;tf-test&#34;)
 *             .orgId(&#34;&#34;)
 *             .billingAccount(&#34;&#34;)
 *             .build());
 * 
 *         var apigee = new Service(&#34;apigee&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;apigee.googleapis.com&#34;)
 *             .build());
 * 
 *         var compute = new Service(&#34;compute&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;compute.googleapis.com&#34;)
 *             .build());
 * 
 *         var servicenetworking = new Service(&#34;servicenetworking&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .build());
 * 
 *         var apigeeNetwork = new Network(&#34;apigeeNetwork&#34;, NetworkArgs.builder()        
 *             .project(project.projectId())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(compute)
 *                 .build());
 * 
 *         var apigeeRange = new GlobalAddress(&#34;apigeeRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(apigeeNetwork.id())
 *             .project(project.projectId())
 *             .build());
 * 
 *         var apigeeVpcConnection = new Connection(&#34;apigeeVpcConnection&#34;, ConnectionArgs.builder()        
 *             .network(apigeeNetwork.id())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(apigeeRange.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(servicenetworking)
 *                 .build());
 * 
 *         var apigeeOrg = new Organization(&#34;apigeeOrg&#34;, OrganizationArgs.builder()        
 *             .analyticsRegion(&#34;us-central1&#34;)
 *             .projectId(project.projectId())
 *             .authorizedNetwork(apigeeNetwork.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     apigeeVpcConnection,
 *                     apigee)
 *                 .build());
 * 
 *         var apigeeIns = new Instance(&#34;apigeeIns&#34;, InstanceArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .orgId(apigeeOrg.id())
 *             .build());
 * 
 *         var apigeeEnv = new Environment(&#34;apigeeEnv&#34;, EnvironmentArgs.builder()        
 *             .orgId(apigeeOrg.id())
 *             .description(&#34;Apigee Environment&#34;)
 *             .displayName(&#34;environment-1&#34;)
 *             .build());
 * 
 *         var instanceAttachment = new InstanceAttachment(&#34;instanceAttachment&#34;, InstanceAttachmentArgs.builder()        
 *             .instanceId(google_apigee_instance.apigee_instance().id())
 *             .environment(apigeeEnv.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * InstanceAttachment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/instanceAttachment:InstanceAttachment default {{instance_id}}/attachments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/instanceAttachment:InstanceAttachment default {{instance_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/instanceAttachment:InstanceAttachment")
public class InstanceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The resource ID of the environment.
     * 
     */
    @Export(name="environment", type=String.class, parameters={})
    private Output<String> environment;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }
    /**
     * The Apigee instance associated with the Apigee environment,
     * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The Apigee instance associated with the Apigee environment,
     * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the newly created attachment (output parameter).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the newly created attachment (output parameter).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceAttachment(String name) {
        this(name, InstanceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceAttachment(String name, InstanceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceAttachment(String name, InstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/instanceAttachment:InstanceAttachment", name, args == null ? InstanceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceAttachment(String name, Output<String> id, @Nullable InstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/instanceAttachment:InstanceAttachment", name, state, makeResourceOptions(options, id));
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
    public static InstanceAttachment get(String name, Output<String> id, @Nullable InstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceAttachment(name, id, state, options);
    }
}