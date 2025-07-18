// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.EventThreatDetectionCustomModuleArgs;
import com.pulumi.gcp.securitycenter.inputs.EventThreatDetectionCustomModuleState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents an instance of an Event Threat Detection custom module, including
 * its full module name, display name, enablement state, andlast updated time.
 * You can create a custom module at the organization level only.
 * 
 * To get more information about EventThreatDetectionCustomModule, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.eventThreatDetectionSettings.customModules)
 * * How-to Guides
 *     * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)
 * 
 * ## Example Usage
 * 
 * ### Scc Event Threat Detection Custom Module
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * EventThreatDetectionCustomModule can be imported using any of these accepted formats:
 * 
 * * `organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}`
 * 
 * * `{{organization}}/{{name}}`
 * 
 * When using the `pulumi import` command, EventThreatDetectionCustomModule can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default organizations/{{organization}}/eventThreatDetectionSettings/customModules/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule default {{organization}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule")
public class EventThreatDetectionCustomModule extends com.pulumi.resources.CustomResource {
    /**
     * Config for the module. For the resident module, its config value is defined at this level.
     * For the inherited module, its config value is inherited from the ancestor module.
     * 
     */
    @Export(name="config", refs={String.class}, tree="[0]")
    private Output<String> config;

    /**
     * @return Config for the module. For the resident module, its config value is defined at this level.
     * For the inherited module, its config value is inherited from the ancestor module.
     * 
     */
    public Output<String> config() {
        return this.config;
    }
    /**
     * The human readable name to be displayed for the module.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The human readable name to be displayed for the module.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The state of enablement for the module at the given level of the hierarchy.
     * Possible values are: `ENABLED`, `DISABLED`.
     * 
     */
    @Export(name="enablementState", refs={String.class}, tree="[0]")
    private Output<String> enablementState;

    /**
     * @return The state of enablement for the module at the given level of the hierarchy.
     * Possible values are: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> enablementState() {
        return this.enablementState;
    }
    /**
     * The editor that last updated the custom module
     * 
     */
    @Export(name="lastEditor", refs={String.class}, tree="[0]")
    private Output<String> lastEditor;

    /**
     * @return The editor that last updated the custom module
     * 
     */
    public Output<String> lastEditor() {
        return this.lastEditor;
    }
    /**
     * The resource name of the Event Threat Detection custom module.
     * Its format is &#34;organizations/{organization}/eventThreatDetectionSettings/customModules/{module}&#34;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the Event Threat Detection custom module.
     * Its format is &#34;organizations/{organization}/eventThreatDetectionSettings/customModules/{module}&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Numerical ID of the parent organization.
     * 
     */
    @Export(name="organization", refs={String.class}, tree="[0]")
    private Output<String> organization;

    /**
     * @return Numerical ID of the parent organization.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }
    /**
     * Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Immutable. Type for the module. e.g. CONFIGURABLE_BAD_IP.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time at which the custom module was last updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and
     * up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time at which the custom module was last updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and
     * up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventThreatDetectionCustomModule(java.lang.String name) {
        this(name, EventThreatDetectionCustomModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventThreatDetectionCustomModule(java.lang.String name, EventThreatDetectionCustomModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventThreatDetectionCustomModule(java.lang.String name, EventThreatDetectionCustomModuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EventThreatDetectionCustomModule(java.lang.String name, Output<java.lang.String> id, @Nullable EventThreatDetectionCustomModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/eventThreatDetectionCustomModule:EventThreatDetectionCustomModule", name, state, makeResourceOptions(options, id), false);
    }

    private static EventThreatDetectionCustomModuleArgs makeArgs(EventThreatDetectionCustomModuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EventThreatDetectionCustomModuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static EventThreatDetectionCustomModule get(java.lang.String name, Output<java.lang.String> id, @Nullable EventThreatDetectionCustomModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventThreatDetectionCustomModule(name, id, state, options);
    }
}
