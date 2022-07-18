// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Restricts access to Cloud Console and Google Cloud APIs for a set of users using Context-Aware Access.
 * 
 * To get more information about GcpUserAccessBinding, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/organizations.gcpUserAccessBindings)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GcpUserAccessBinding can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding")
public class GcpUserAccessBinding extends com.pulumi.resources.CustomResource {
    /**
     * Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    @Export(name="accessLevels", type=String.class, parameters={})
    private Output<String> accessLevels;

    /**
     * @return Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    public Output<String> accessLevels() {
        return this.accessLevels;
    }
    /**
     * Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    @Export(name="groupKey", type=String.class, parameters={})
    private Output<String> groupKey;

    /**
     * @return Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    public Output<String> groupKey() {
        return this.groupKey;
    }
    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required. ID of the parent organization.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return Required. ID of the parent organization.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GcpUserAccessBinding(String name) {
        this(name, GcpUserAccessBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcpUserAccessBinding(String name, GcpUserAccessBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcpUserAccessBinding(String name, GcpUserAccessBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding", name, args == null ? GcpUserAccessBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GcpUserAccessBinding(String name, Output<String> id, @Nullable GcpUserAccessBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/gcpUserAccessBinding:GcpUserAccessBinding", name, state, makeResourceOptions(options, id));
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
    public static GcpUserAccessBinding get(String name, Output<String> id, @Nullable GcpUserAccessBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcpUserAccessBinding(name, id, state, options);
    }
}