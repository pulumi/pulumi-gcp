// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam
{
    /// <summary>
    /// Represents a collection of access boundary policies to apply to a given resource.
    /// **NOTE**: This is a private feature and users should contact GCP support
    /// if they would like to test it.
    /// 
    /// ## Example Usage
    /// 
    /// ### Iam Access Boundary Policy Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Organizations.Project("project", new()
    ///     {
    ///         ProjectId = "my-project",
    ///         Name = "my-project",
    ///         OrgId = "123456789",
    ///         BillingAccount = "000000-0000000-0000000-000000",
    ///         DeletionPolicy = "DELETE",
    ///     });
    /// 
    ///     var access_policy = new Gcp.AccessContextManager.AccessPolicy("access-policy", new()
    ///     {
    ///         Parent = project.OrgId.Apply(orgId =&gt; $"organizations/{orgId}"),
    ///         Title = "my policy",
    ///     });
    /// 
    ///     var test_access = new Gcp.AccessContextManager.AccessLevel("test-access", new()
    ///     {
    ///         Parent = access_policy.Name.Apply(name =&gt; $"accessPolicies/{name}"),
    ///         Name = access_policy.Name.Apply(name =&gt; $"accessPolicies/{name}/accessLevels/chromeos_no_lock"),
    ///         Title = "chromeos_no_lock",
    ///         Basic = new Gcp.AccessContextManager.Inputs.AccessLevelBasicArgs
    ///         {
    ///             Conditions = new[]
    ///             {
    ///                 new Gcp.AccessContextManager.Inputs.AccessLevelBasicConditionArgs
    ///                 {
    ///                     DevicePolicy = new Gcp.AccessContextManager.Inputs.AccessLevelBasicConditionDevicePolicyArgs
    ///                     {
    ///                         RequireScreenLock = true,
    ///                         OsConstraints = new[]
    ///                         {
    ///                             new Gcp.AccessContextManager.Inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs
    ///                             {
    ///                                 OsType = "DESKTOP_CHROME_OS",
    ///                             },
    ///                         },
    ///                     },
    ///                     Regions = new[]
    ///                     {
    ///                         "CH",
    ///                         "IT",
    ///                         "US",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = new Gcp.Iam.AccessBoundaryPolicy("example", new()
    ///     {
    ///         Parent = Std.Urlencode.Invoke(new()
    ///         {
    ///             Input = project.ProjectId.Apply(projectId =&gt; $"cloudresourcemanager.googleapis.com/projects/{projectId}"),
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Name = "my-ab-policy",
    ///         DisplayName = "My AB policy",
    ///         Rules = new[]
    ///         {
    ///             new Gcp.Iam.Inputs.AccessBoundaryPolicyRuleArgs
    ///             {
    ///                 Description = "AB rule",
    ///                 AccessBoundaryRule = new Gcp.Iam.Inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs
    ///                 {
    ///                     AvailableResource = "*",
    ///                     AvailablePermissions = new[]
    ///                     {
    ///                         "*",
    ///                     },
    ///                     AvailabilityCondition = new Gcp.Iam.Inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs
    ///                     {
    ///                         Title = "Access level expr",
    ///                         Expression = Output.Tuple(project.OrgId, test_access.Name).Apply(values =&gt;
    ///                         {
    ///                             var orgId = values.Item1;
    ///                             var name = values.Item2;
    ///                             return $"request.matchAccessLevels('{orgId}', ['{name}'])";
    ///                         }),
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AccessBoundaryPolicy can be imported using any of these accepted formats:
    /// 
    /// * `{{parent}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, AccessBoundaryPolicy can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy default {{parent}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy")]
    public partial class AccessBoundaryPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The display name of the rule.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The hash of the resource. Used internally during updates.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The attachment point is identified by its URL-encoded full resource name.
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// Rules to be applied.
        /// Structure is documented below.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.AccessBoundaryPolicyRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a AccessBoundaryPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessBoundaryPolicy(string name, AccessBoundaryPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy", name, args ?? new AccessBoundaryPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessBoundaryPolicy(string name, Input<string> id, AccessBoundaryPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessBoundaryPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessBoundaryPolicy Get(string name, Input<string> id, AccessBoundaryPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessBoundaryPolicy(name, id, state, options);
        }
    }

    public sealed class AccessBoundaryPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name of the rule.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The attachment point is identified by its URL-encoded full resource name.
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        [Input("rules", required: true)]
        private InputList<Inputs.AccessBoundaryPolicyRuleArgs>? _rules;

        /// <summary>
        /// Rules to be applied.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AccessBoundaryPolicyRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AccessBoundaryPolicyRuleArgs>());
            set => _rules = value;
        }

        public AccessBoundaryPolicyArgs()
        {
        }
        public static new AccessBoundaryPolicyArgs Empty => new AccessBoundaryPolicyArgs();
    }

    public sealed class AccessBoundaryPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name of the rule.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The hash of the resource. Used internally during updates.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The attachment point is identified by its URL-encoded full resource name.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        [Input("rules")]
        private InputList<Inputs.AccessBoundaryPolicyRuleGetArgs>? _rules;

        /// <summary>
        /// Rules to be applied.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AccessBoundaryPolicyRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AccessBoundaryPolicyRuleGetArgs>());
            set => _rules = value;
        }

        public AccessBoundaryPolicyState()
        {
        }
        public static new AccessBoundaryPolicyState Empty => new AccessBoundaryPolicyState();
    }
}
