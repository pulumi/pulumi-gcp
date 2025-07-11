// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for Compute Engine MachineImage. Each of these resources serves a different use case:
    /// 
    /// * `gcp.compute.MachineImageIamPolicy`: Authoritative. Sets the IAM policy for the machineimage and replaces any existing policy already attached.
    /// * `gcp.compute.MachineImageIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the machineimage are preserved.
    /// * `gcp.compute.MachineImageIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the machineimage are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.compute.MachineImageIamPolicy`: Retrieves the IAM policy for the machineimage
    /// 
    /// &gt; **Note:** `gcp.compute.MachineImageIamPolicy` **cannot** be used in conjunction with `gcp.compute.MachineImageIamBinding` and `gcp.compute.MachineImageIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.compute.MachineImageIamBinding` resources **can be** used in conjunction with `gcp.compute.MachineImageIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
    /// ## google\_compute\_machine\_image\_iam\_policy
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
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.Compute.MachineImageIamPolicy("policy", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
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
    ///     var policy = new Gcp.Compute.MachineImageIamPolicy("policy", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.compute.MachineImageIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.Compute.MachineImageIamBinding("binding", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
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
    ///     var binding = new Gcp.Compute.MachineImageIamBinding("binding", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Compute.Inputs.MachineImageIamBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.compute.MachineImageIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.Compute.MachineImageIamMember("member", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
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
    ///     var member = new Gcp.Compute.MachineImageIamMember("member", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Compute.Inputs.MachineImageIamMemberConditionArgs
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
    /// ## This resource supports User Project Overrides.
    /// 
    /// - 
    /// 
    /// # IAM policy for Compute Engine MachineImage
    /// Three different resources help you manage your IAM policy for Compute Engine MachineImage. Each of these resources serves a different use case:
    /// 
    /// * `gcp.compute.MachineImageIamPolicy`: Authoritative. Sets the IAM policy for the machineimage and replaces any existing policy already attached.
    /// * `gcp.compute.MachineImageIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the machineimage are preserved.
    /// * `gcp.compute.MachineImageIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the machineimage are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.compute.MachineImageIamPolicy`: Retrieves the IAM policy for the machineimage
    /// 
    /// &gt; **Note:** `gcp.compute.MachineImageIamPolicy` **cannot** be used in conjunction with `gcp.compute.MachineImageIamBinding` and `gcp.compute.MachineImageIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.compute.MachineImageIamBinding` resources **can be** used in conjunction with `gcp.compute.MachineImageIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
    /// ## google\_compute\_machine\_image\_iam\_policy
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
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.Compute.MachineImageIamPolicy("policy", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
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
    ///     var policy = new Gcp.Compute.MachineImageIamPolicy("policy", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.compute.MachineImageIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.Compute.MachineImageIamBinding("binding", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
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
    ///     var binding = new Gcp.Compute.MachineImageIamBinding("binding", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Compute.Inputs.MachineImageIamBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.compute.MachineImageIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.Compute.MachineImageIamMember("member", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
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
    ///     var member = new Gcp.Compute.MachineImageIamMember("member", new()
    ///     {
    ///         Project = image.Project,
    ///         MachineImage = image.Name,
    ///         Role = "roles/compute.admin",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Compute.Inputs.MachineImageIamMemberConditionArgs
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
    /// ## Import
    /// 
    /// For all import syntaxes, the "resource in question" can take any of the following forms:
    /// 
    /// * projects/{{project}}/global/machineImages/{{name}}
    /// 
    /// * {{project}}/{{name}}
    /// 
    /// * {{name}}
    /// 
    /// Any variables not passed in the import command will be taken from the provider configuration.
    /// 
    /// Compute Engine machineimage IAM resources can be imported using the resource identifiers, role, and member.
    /// 
    /// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/machineImageIamPolicy:MachineImageIamPolicy editor "projects/{{project}}/global/machineImages/{{machine_image}} roles/compute.admin user:jane@example.com"
    /// ```
    /// 
    /// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/machineImageIamPolicy:MachineImageIamPolicy editor "projects/{{project}}/global/machineImages/{{machine_image}} roles/compute.admin"
    /// ```
    /// 
    /// IAM policy imports use the identifier of the resource in question, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/machineImageIamPolicy:MachineImageIamPolicy editor projects/{{project}}/global/machineImages/{{machine_image}}
    /// ```
    /// 
    /// -&gt; **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    ///  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
    /// </summary>
    [GcpResourceType("gcp:compute/machineImageIamPolicy:MachineImageIamPolicy")]
    public partial class MachineImageIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("machineImage")]
        public Output<string> MachineImage { get; private set; } = null!;

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
        /// Create a MachineImageIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MachineImageIamPolicy(string name, MachineImageIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/machineImageIamPolicy:MachineImageIamPolicy", name, args ?? new MachineImageIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MachineImageIamPolicy(string name, Input<string> id, MachineImageIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/machineImageIamPolicy:MachineImageIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MachineImageIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MachineImageIamPolicy Get(string name, Input<string> id, MachineImageIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new MachineImageIamPolicy(name, id, state, options);
        }
    }

    public sealed class MachineImageIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("machineImage", required: true)]
        public Input<string> MachineImage { get; set; } = null!;

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

        public MachineImageIamPolicyArgs()
        {
        }
        public static new MachineImageIamPolicyArgs Empty => new MachineImageIamPolicyArgs();
    }

    public sealed class MachineImageIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("machineImage")]
        public Input<string>? MachineImage { get; set; }

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

        public MachineImageIamPolicyState()
        {
        }
        public static new MachineImageIamPolicyState Empty => new MachineImageIamPolicyState();
    }
}
