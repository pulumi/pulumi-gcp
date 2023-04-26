// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.FlowhookArgs;
import com.pulumi.gcp.apigee.inputs.FlowhookState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a sharedflow attachment to a flowhook point.
 * 
 * To get more information about Flowhook, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
 * * How-to Guides
 *     * [organizations.environments.flowhooks](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
 * 
 * ## Import
 * 
 * Flowhook can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/flowhook:Flowhook default organizations/{{org_id}}/environments/{{environment}}/flowhooks/{{flow_hook_point}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/flowhook:Flowhook default {{org_id}}/{{environment}}/{{flow_hook_point}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/flowhook:Flowhook")
public class Flowhook extends com.pulumi.resources.CustomResource {
    /**
     * Flag that specifies whether execution should continue if the flow hook throws an exception. Set to true to continue execution. Set to false to stop execution if the flow hook throws an exception. Defaults to true.
     * 
     */
    @Export(name="continueOnError", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> continueOnError;

    /**
     * @return Flag that specifies whether execution should continue if the flow hook throws an exception. Set to true to continue execution. Set to false to stop execution if the flow hook throws an exception. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> continueOnError() {
        return Codegen.optional(this.continueOnError);
    }
    /**
     * Description of the flow hook.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the flow hook.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
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
     * Where in the API call flow the flow hook is invoked. Must be one of PreProxyFlowHook, PostProxyFlowHook, PreTargetFlowHook, or PostTargetFlowHook.
     * 
     */
    @Export(name="flowHookPoint", type=String.class, parameters={})
    private Output<String> flowHookPoint;

    /**
     * @return Where in the API call flow the flow hook is invoked. Must be one of PreProxyFlowHook, PostProxyFlowHook, PreTargetFlowHook, or PostTargetFlowHook.
     * 
     */
    public Output<String> flowHookPoint() {
        return this.flowHookPoint;
    }
    /**
     * The Apigee Organization associated with the environment
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the environment
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Id of the Sharedflow attaching to a flowhook point.
     * 
     */
    @Export(name="sharedflow", type=String.class, parameters={})
    private Output<String> sharedflow;

    /**
     * @return Id of the Sharedflow attaching to a flowhook point.
     * 
     */
    public Output<String> sharedflow() {
        return this.sharedflow;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flowhook(String name) {
        this(name, FlowhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flowhook(String name, FlowhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flowhook(String name, FlowhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/flowhook:Flowhook", name, args == null ? FlowhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Flowhook(String name, Output<String> id, @Nullable FlowhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/flowhook:Flowhook", name, state, makeResourceOptions(options, id));
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
    public static Flowhook get(String name, Output<String> id, @Nullable FlowhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Flowhook(name, id, state, options);
    }
}