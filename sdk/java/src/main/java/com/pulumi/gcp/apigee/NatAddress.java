// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.NatAddressArgs;
import com.pulumi.gcp.apigee.inputs.NatAddressState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Apigee NAT (network address translation) address. A NAT address is a static external IP address used for Internet egress traffic. This is not avaible for Apigee hybrid.
 * Apigee NAT addresses are not automatically activated because they might require explicit allow entries on the target systems first. See https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses/activate
 * 
 * To get more information about NatAddress, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses)
 * * How-to Guides
 *     * [Provisioning NAT IPs](https://cloud.google.com/apigee/docs/api-platform/security/nat-provisioning)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NatAddress can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/natAddresses/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/natAddress:NatAddress default {{instance_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/natAddress:NatAddress")
public class NatAddress extends com.pulumi.resources.CustomResource {
    /**
     * The Apigee instance associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The Apigee instance associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The allocated NAT IP address.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The allocated NAT IP address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * Resource ID of the NAT address.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource ID of the NAT address.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of the NAT IP address.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the NAT IP address.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatAddress(String name) {
        this(name, NatAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatAddress(String name, NatAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatAddress(String name, NatAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/natAddress:NatAddress", name, args == null ? NatAddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatAddress(String name, Output<String> id, @Nullable NatAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/natAddress:NatAddress", name, state, makeResourceOptions(options, id));
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
    public static NatAddress get(String name, Output<String> id, @Nullable NatAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatAddress(name, id, state, options);
    }
}