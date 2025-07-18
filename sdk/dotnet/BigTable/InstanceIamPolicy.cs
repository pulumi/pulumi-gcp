// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable
{
    /// <summary>
    /// Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
    /// 
    /// * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
    /// * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
    /// * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
    /// 
    /// &gt; **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
    /// 
    /// &gt; **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## gcp.bigtable.InstanceIamPolicy
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
    ///                 Role = "roles/bigtable.user",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var editor = new Gcp.BigTable.InstanceIamPolicy("editor", new()
    ///     {
    ///         Project = "your-project",
    ///         Instance = "your-bigtable-instance",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.bigtable.InstanceIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var editor = new Gcp.BigTable.InstanceIamBinding("editor", new()
    ///     {
    ///         Instance = "your-bigtable-instance",
    ///         Role = "roles/bigtable.user",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.bigtable.InstanceIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var editor = new Gcp.BigTable.InstanceIamMember("editor", new()
    ///     {
    ///         Instance = "your-bigtable-instance",
    ///         Role = "roles/bigtable.user",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.bigtable.InstanceIamPolicy
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
    ///                 Role = "roles/bigtable.user",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var editor = new Gcp.BigTable.InstanceIamPolicy("editor", new()
    ///     {
    ///         Project = "your-project",
    ///         Instance = "your-bigtable-instance",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.bigtable.InstanceIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var editor = new Gcp.BigTable.InstanceIamBinding("editor", new()
    ///     {
    ///         Instance = "your-bigtable-instance",
    ///         Role = "roles/bigtable.user",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.bigtable.InstanceIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var editor = new Gcp.BigTable.InstanceIamMember("editor", new()
    ///     {
    ///         Instance = "your-bigtable-instance",
    ///         Role = "roles/bigtable.user",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ### Importing IAM policies
    /// 
    /// IAM policy imports use the `instance` identifier of the Bigtable Instance resource only. For example:
    /// 
    /// * `"projects/{project}/instances/{instance}"`
    /// 
    /// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   id = "projects/{project}/instances/{instance}"
    /// 
    ///   to = google_bigtable_instance_iam_policy.default
    /// 
    /// }
    /// 
    /// The `pulumi import` command can also be used:
    /// 
    /// ```sh
    /// $ pulumi import gcp:bigtable/instanceIamPolicy:InstanceIamPolicy default projects/{project}/instances/{instance}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:bigtable/instanceIamPolicy:InstanceIamPolicy")]
    public partial class InstanceIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Computed) The etag of the instances's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The name or relative resource id of the instance to manage IAM policies for.
        /// 
        /// For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
        /// </summary>
        [Output("instance")]
        public Output<string> Instance { get; private set; } = null!;

        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;

        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceIamPolicy(string name, InstanceIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:bigtable/instanceIamPolicy:InstanceIamPolicy", name, args ?? new InstanceIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceIamPolicy(string name, Input<string> id, InstanceIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:bigtable/instanceIamPolicy:InstanceIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceIamPolicy Get(string name, Input<string> id, InstanceIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceIamPolicy(name, id, state, options);
        }
    }

    public sealed class InstanceIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name or relative resource id of the instance to manage IAM policies for.
        /// 
        /// For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        public InstanceIamPolicyArgs()
        {
        }
        public static new InstanceIamPolicyArgs Empty => new InstanceIamPolicyArgs();
    }

    public sealed class InstanceIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) The etag of the instances's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The name or relative resource id of the instance to manage IAM policies for.
        /// 
        /// For `gcp.bigtable.InstanceIamMember` or `gcp.bigtable.InstanceIamBinding`:
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        public InstanceIamPolicyState()
        {
        }
        public static new InstanceIamPolicyState Empty => new InstanceIamPolicyState();
    }
}
