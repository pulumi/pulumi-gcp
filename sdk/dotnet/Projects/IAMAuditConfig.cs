// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Projects
{
    /// <summary>
    /// Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
    /// 
    /// * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
    /// * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
    /// * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
    /// * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
    /// 
    /// &gt; **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
    ///    IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
    /// 
    /// ## gcp.projects.IAMPolicy
    /// 
    /// !&gt; **Be careful!** You can accidentally lock yourself out of your project
    ///    using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
    ///    from anyone without organization-level access to the project. Proceed with caution.
    ///    It's not recommended to use `gcp.projects.IAMPolicy` with your provider project
    ///    to avoid locking yourself out, and it should generally only be used with projects
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
    ///     var project = new Gcp.Projects.IAMPolicy("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMPolicy("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.projects.IAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMBinding("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMBinding("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Role = "roles/container.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Projects.Inputs.IAMBindingConditionArgs
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
    /// ## gcp.projects.IAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMMember("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMMember("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Role = "roles/firebase.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Projects.Inputs.IAMMemberConditionArgs
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
    /// ## gcp.projects.IAMAuditConfig
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMAuditConfig("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Service = "allServices",
    ///         AuditLogConfigs = new[]
    ///         {
    ///             new Gcp.Projects.Inputs.IAMAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "ADMIN_READ",
    ///             },
    ///             new Gcp.Projects.Inputs.IAMAuditConfigAuditLogConfigArgs
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
    /// ## gcp.projects.IAMPolicy
    /// 
    /// !&gt; **Be careful!** You can accidentally lock yourself out of your project
    ///    using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
    ///    from anyone without organization-level access to the project. Proceed with caution.
    ///    It's not recommended to use `gcp.projects.IAMPolicy` with your provider project
    ///    to avoid locking yourself out, and it should generally only be used with projects
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
    ///     var project = new Gcp.Projects.IAMPolicy("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMPolicy("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.projects.IAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMBinding("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMBinding("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Role = "roles/container.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Projects.Inputs.IAMBindingConditionArgs
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
    /// ## gcp.projects.IAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMMember("project", new()
    ///     {
    ///         Project = "your-project-id",
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
    ///     var project = new Gcp.Projects.IAMMember("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Role = "roles/firebase.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Projects.Inputs.IAMMemberConditionArgs
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
    /// ## gcp.projects.IAMAuditConfig
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Projects.IAMAuditConfig("project", new()
    ///     {
    ///         Project = "your-project-id",
    ///         Service = "allServices",
    ///         AuditLogConfigs = new[]
    ///         {
    ///             new Gcp.Projects.Inputs.IAMAuditConfigAuditLogConfigArgs
    ///             {
    ///                 LogType = "ADMIN_READ",
    ///             },
    ///             new Gcp.Projects.Inputs.IAMAuditConfigAuditLogConfigArgs
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
    /// An audit config can be imported into a `google_project_iam_audit_config` resource using the resource's `project_id` and the `service`, e.g:
    /// 
    /// * `"{{project_id}} foo.googleapis.com"`
    /// 
    /// An `import` block (Terraform v1.5.0 and later) can be used to import audit configs:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   id = "{{project_id}} foo.googleapis.com"
    /// 
    ///   to = google_project_iam_audit_config.default
    /// 
    /// }
    /// 
    /// The `pulumi import` command can also be used:
    /// 
    /// ```sh
    /// $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig default "{{project_id}} foo.googleapis.com"
    /// ```
    /// </summary>
    [GcpResourceType("gcp:projects/iAMAuditConfig:IAMAuditConfig")]
    public partial class IAMAuditConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        [Output("auditLogConfigs")]
        public Output<ImmutableArray<Outputs.IAMAuditConfigAuditLogConfig>> AuditLogConfigs { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the project's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are gcp.projects.IAMAuditConfig resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a IAMAuditConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IAMAuditConfig(string name, IAMAuditConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, args ?? new IAMAuditConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IAMAuditConfig(string name, Input<string> id, IAMAuditConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IAMAuditConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IAMAuditConfig Get(string name, Input<string> id, IAMAuditConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new IAMAuditConfig(name, id, state, options);
        }
    }

    public sealed class IAMAuditConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("auditLogConfigs", required: true)]
        private InputList<Inputs.IAMAuditConfigAuditLogConfigArgs>? _auditLogConfigs;

        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        public InputList<Inputs.IAMAuditConfigAuditLogConfigArgs> AuditLogConfigs
        {
            get => _auditLogConfigs ?? (_auditLogConfigs = new InputList<Inputs.IAMAuditConfigAuditLogConfigArgs>());
            set => _auditLogConfigs = value;
        }

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are gcp.projects.IAMAuditConfig resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public IAMAuditConfigArgs()
        {
        }
        public static new IAMAuditConfigArgs Empty => new IAMAuditConfigArgs();
    }

    public sealed class IAMAuditConfigState : global::Pulumi.ResourceArgs
    {
        [Input("auditLogConfigs")]
        private InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs>? _auditLogConfigs;

        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        public InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs> AuditLogConfigs
        {
            get => _auditLogConfigs ?? (_auditLogConfigs = new InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs>());
            set => _auditLogConfigs = value;
        }

        /// <summary>
        /// (Computed) The etag of the project's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are gcp.projects.IAMAuditConfig resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public IAMAuditConfigState()
        {
        }
        public static new IAMAuditConfigState Empty => new IAMAuditConfigState();
    }
}
