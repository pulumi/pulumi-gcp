// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Folder
{
    /// <summary>
    /// Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
    /// 
    /// * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
    /// * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
    /// * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
    /// * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
    /// 
    /// &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
    ///    IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
    /// 
    /// ## gcp.folder.IAMPolicy
    /// 
    /// !&gt; **Be careful!** You can accidentally lock yourself out of your folder
    ///    using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
    ///    from anyone without permissions on its parent folder/organization. Proceed with caution.
    ///    It's not recommended to use `gcp.folder.IAMPolicy` with your provider folder
    ///    to avoid locking yourself out, and it should generally only be used with folders
    ///    fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
    ///    applying the change.
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
    ///                 Role = "roles/editor",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var folder = new Gcp.Folder.IAMPolicy("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
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
    ///                 Role = "roles/compute.admin",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///                 Condition = new Gcp.Organizations.Inputs.GetIAMPolicyBindingConditionInputArgs
    ///                 {
    ///                     Title = "expires_after_2019_12_31",
    ///                     Description = "Expiring at midnight of 2019-12-31",
    ///                     Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var folder = new Gcp.Folder.IAMPolicy("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMBinding("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/editor",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMBinding("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/container.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Folder.Inputs.IAMBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMMember("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/editor",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMMember("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/firebase.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Folder.Inputs.IAMMemberConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IamAuditConfig
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IamAuditConfig("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Service = "allServices",
    ///         AuditLogConfigs = new[]
    ///         {
    ///             new Gcp.Folder.Inputs.IamAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "ADMIN_READ",
    ///             },
    ///             new Gcp.Folder.Inputs.IamAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "DATA_READ",
    ///                 ExemptedMembers = new[]
    ///                 {
    ///                     "user:joebloggs@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMBinding("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/editor",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMBinding("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/container.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Folder.Inputs.IAMBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMMember("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/editor",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IAMMember("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Role = "roles/firebase.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Folder.Inputs.IAMMemberConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.folder.IamAuditConfig
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var folder = new Gcp.Folder.IamAuditConfig("folder", new()
    ///     {
    ///         Folder = "folders/1234567",
    ///         Service = "allServices",
    ///         AuditLogConfigs = new[]
    ///         {
    ///             new Gcp.Folder.Inputs.IamAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "ADMIN_READ",
    ///             },
    ///             new Gcp.Folder.Inputs.IamAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "DATA_READ",
    ///                 ExemptedMembers = new[]
    ///                 {
    ///                     "user:joebloggs@example.com",
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
    /// ### Importing Audit Configs
    /// 
    /// An audit config can be imported into a `google_folder_iam_audit_config` resource using the resource's `folder_id` and the `service`, e.g:
    /// 
    /// * `"folder/{{folder_id}} foo.googleapis.com"`
    /// 
    /// An `import` block (Terraform v1.5.0 and later) can be used to import audit configs:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   id = "folder/{{folder_id}} foo.googleapis.com"
    /// 
    ///   to = google_folder_iam_audit_config.default
    /// 
    /// }
    /// 
    /// The `pulumi import` command can also be used:
    /// 
    /// ```sh
    /// $ pulumi import gcp:folder/iAMMember:IAMMember default "folder/{{folder_id}} foo.googleapis.com"
    /// ```
    /// </summary>
    [GcpResourceType("gcp:folder/iAMMember:IAMMember")]
    public partial class IAMMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Output("condition")]
        public Output<Outputs.IAMMemberCondition?> Condition { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the folder's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
        /// </summary>
        [Output("folder")]
        public Output<string> Folder { get; private set; } = null!;

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Output("member")]
        public Output<string> Member { get; private set; } = null!;

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a IAMMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IAMMember(string name, IAMMemberArgs args, CustomResourceOptions? options = null)
            : base("gcp:folder/iAMMember:IAMMember", name, args ?? new IAMMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IAMMember(string name, Input<string> id, IAMMemberState? state = null, CustomResourceOptions? options = null)
            : base("gcp:folder/iAMMember:IAMMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IAMMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IAMMember Get(string name, Input<string> id, IAMMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new IAMMember(name, id, state, options);
        }
    }

    public sealed class IAMMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.IAMMemberConditionArgs>? Condition { get; set; }

        /// <summary>
        /// The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
        /// </summary>
        [Input("folder", required: true)]
        public Input<string> Folder { get; set; } = null!;

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Input("member", required: true)]
        public Input<string> Member { get; set; } = null!;

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public IAMMemberArgs()
        {
        }
        public static new IAMMemberArgs Empty => new IAMMemberArgs();
    }

    public sealed class IAMMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.IAMMemberConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// (Computed) The etag of the folder's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Input("member")]
        public Input<string>? Member { get; set; }

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public IAMMemberState()
        {
        }
        public static new IAMMemberState Empty => new IAMMemberState();
    }
}
