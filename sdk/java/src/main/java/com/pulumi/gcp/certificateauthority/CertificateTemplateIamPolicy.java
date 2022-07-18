// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} Any variables not passed in the import command will be taken from the provider configuration. Certificate Authority Service certificatetemplate IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy")
public class CertificateTemplateIamPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="certificateTemplate", type=String.class, parameters={})
    private Output<String> certificateTemplate;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> certificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateTemplateIamPolicy(String name) {
        this(name, CertificateTemplateIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateTemplateIamPolicy(String name, CertificateTemplateIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateTemplateIamPolicy(String name, CertificateTemplateIamPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy", name, args == null ? CertificateTemplateIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateTemplateIamPolicy(String name, Output<String> id, @Nullable CertificateTemplateIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static CertificateTemplateIamPolicy get(String name, Output<String> id, @Nullable CertificateTemplateIamPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateTemplateIamPolicy(name, id, state, options);
    }
}