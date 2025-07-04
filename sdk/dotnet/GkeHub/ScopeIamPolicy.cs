// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
    /// 
    /// * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
    /// * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
    /// * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
    /// 
    /// &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## gcp.gkehub.ScopeIamPolicy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admin = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/viewer",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.GkeHub.ScopeIamPolicy("policy", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.gkehub.ScopeIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.GkeHub.ScopeIamBinding("binding", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         Role = "roles/viewer",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.gkehub.ScopeIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.GkeHub.ScopeIamMember("member", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         Role = "roles/viewer",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## This resource supports User Project Overrides.
    /// 
    /// - 
    /// 
    /// # IAM policy for GKEHub Scope
    /// Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
    /// 
    /// * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
    /// * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
    /// * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
    /// 
    /// &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## gcp.gkehub.ScopeIamPolicy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admin = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/viewer",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.GkeHub.ScopeIamPolicy("policy", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.gkehub.ScopeIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.GkeHub.ScopeIamBinding("binding", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         Role = "roles/viewer",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.gkehub.ScopeIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.GkeHub.ScopeIamMember("member", new()
    ///     {
    ///         Project = scope.Project,
    ///         ScopeId = scope.ScopeId,
    ///         Role = "roles/viewer",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// For all import syntaxes, the "resource in question" can take any of the following forms:
    /// 
    /// * projects/{{project}}/locations/global/scopes/{{scope_id}}
    /// 
    /// * {{project}}/{{scope_id}}
    /// 
    /// * {{scope_id}}
    /// 
    /// Any variables not passed in the import command will be taken from the provider configuration.
    /// 
    /// GKEHub scope IAM resources can be imported using the resource identifiers, role, and member.
    /// 
    /// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/scopeIamPolicy:ScopeIamPolicy editor "projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer user:jane@example.com"
    /// ```
    /// 
    /// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/scopeIamPolicy:ScopeIamPolicy editor "projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer"
    /// ```
    /// 
    /// IAM policy imports use the identifier of the resource in question, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/scopeIamPolicy:ScopeIamPolicy editor projects/{{project}}/locations/global/scopes/{{scope_id}}
    /// ```
    /// 
    /// -&gt; **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    ///  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
    /// </summary>
    [GcpResourceType("gcp:gkehub/scopeIamPolicy:ScopeIamPolicy")]
    public partial class ScopeIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

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
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("scopeId")]
        public Output<string> ScopeId { get; private set; } = null!;


        /// <summary>
        /// Create a ScopeIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScopeIamPolicy(string name, ScopeIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:gkehub/scopeIamPolicy:ScopeIamPolicy", name, args ?? new ScopeIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScopeIamPolicy(string name, Input<string> id, ScopeIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gkehub/scopeIamPolicy:ScopeIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScopeIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScopeIamPolicy Get(string name, Input<string> id, ScopeIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ScopeIamPolicy(name, id, state, options);
        }
    }

    public sealed class ScopeIamPolicyArgs : global::Pulumi.ResourceArgs
    {
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

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("scopeId", required: true)]
        public Input<string> ScopeId { get; set; } = null!;

        public ScopeIamPolicyArgs()
        {
        }
        public static new ScopeIamPolicyArgs Empty => new ScopeIamPolicyArgs();
    }

    public sealed class ScopeIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

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

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("scopeId")]
        public Input<string>? ScopeId { get; set; }

        public ScopeIamPolicyState()
        {
        }
        public static new ScopeIamPolicyState Empty => new ScopeIamPolicyState();
    }
}
