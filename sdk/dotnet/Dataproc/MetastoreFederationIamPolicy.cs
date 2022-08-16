// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc
{
    /// <summary>
    /// ## Import
    /// 
    /// For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/locations/{{location}}/federations/{{federation_id}} * {{project}}/{{location}}/{{federation_id}} * {{location}}/{{federation_id}} * {{federation_id}} Any variables not passed in the import command will be taken from the provider configuration. Dataproc metastore federation IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy editor "projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer user:jane@example.com"
    /// ```
    /// 
    ///  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy editor "projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer"
    /// ```
    /// 
    ///  IAM policy imports use the identifier of the resource in question, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy editor projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
    /// ```
    /// 
    ///  -&gt; **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    /// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
    /// </summary>
    [GcpResourceType("gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy")]
    public partial class MetastoreFederationIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("federationId")]
        public Output<string> FederationId { get; private set; } = null!;

        /// <summary>
        /// The location where the metastore federation should reside.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a MetastoreFederationIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetastoreFederationIamPolicy(string name, MetastoreFederationIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy", name, args ?? new MetastoreFederationIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetastoreFederationIamPolicy(string name, Input<string> id, MetastoreFederationIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MetastoreFederationIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetastoreFederationIamPolicy Get(string name, Input<string> id, MetastoreFederationIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new MetastoreFederationIamPolicy(name, id, state, options);
        }
    }

    public sealed class MetastoreFederationIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("federationId", required: true)]
        public Input<string> FederationId { get; set; } = null!;

        /// <summary>
        /// The location where the metastore federation should reside.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public MetastoreFederationIamPolicyArgs()
        {
        }
        public static new MetastoreFederationIamPolicyArgs Empty => new MetastoreFederationIamPolicyArgs();
    }

    public sealed class MetastoreFederationIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("federationId")]
        public Input<string>? FederationId { get; set; }

        /// <summary>
        /// The location where the metastore federation should reside.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public MetastoreFederationIamPolicyState()
        {
        }
        public static new MetastoreFederationIamPolicyState Empty => new MetastoreFederationIamPolicyState();
    }
}