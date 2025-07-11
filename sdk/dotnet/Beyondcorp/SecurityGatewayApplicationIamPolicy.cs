// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Beyondcorp
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
    /// 
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
    /// 
    /// &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
    /// 
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
    ///                 Role = "roles/beyondcorp.securityGatewayUser",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.Beyondcorp.SecurityGatewayApplicationIamPolicy("policy", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
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
    ///                 Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var policy = new Gcp.Beyondcorp.SecurityGatewayApplicationIamPolicy("policy", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.Beyondcorp.SecurityGatewayApplicationIamBinding("binding", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var binding = new Gcp.Beyondcorp.SecurityGatewayApplicationIamBinding("binding", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Beyondcorp.Inputs.SecurityGatewayApplicationIamBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.Beyondcorp.SecurityGatewayApplicationIamMember("member", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var member = new Gcp.Beyondcorp.SecurityGatewayApplicationIamMember("member", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Beyondcorp.Inputs.SecurityGatewayApplicationIamMemberConditionArgs
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
    /// # IAM policy for BeyondCorp SecurityGatewayApplication
    /// Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
    /// 
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
    /// 
    /// A data source can be used to retrieve policy data in advent you do not need creation
    /// 
    /// * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
    /// 
    /// &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
    /// 
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
    ///                 Role = "roles/beyondcorp.securityGatewayUser",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var policy = new Gcp.Beyondcorp.SecurityGatewayApplicationIamPolicy("policy", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
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
    ///                 Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var policy = new Gcp.Beyondcorp.SecurityGatewayApplicationIamPolicy("policy", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var binding = new Gcp.Beyondcorp.SecurityGatewayApplicationIamBinding("binding", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var binding = new Gcp.Beyondcorp.SecurityGatewayApplicationIamBinding("binding", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Beyondcorp.Inputs.SecurityGatewayApplicationIamBindingConditionArgs
    ///         {
    ///             Title = "expires_after_2019_12_31",
    ///             Description = "Expiring at midnight of 2019-12-31",
    ///             Expression = "request.time &lt; timestamp(\"2020-01-01T00:00:00Z\")",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var member = new Gcp.Beyondcorp.SecurityGatewayApplicationIamMember("member", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
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
    ///     var member = new Gcp.Beyondcorp.SecurityGatewayApplicationIamMember("member", new()
    ///     {
    ///         Project = example.Project,
    ///         SecurityGatewayId = example.SecurityGatewayId,
    ///         ApplicationId = example.ApplicationId,
    ///         Role = "roles/beyondcorp.securityGatewayUser",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Beyondcorp.Inputs.SecurityGatewayApplicationIamMemberConditionArgs
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
    /// * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
    /// 
    /// * {{project}}/{{security_gateway_id}}/{{application_id}}
    /// 
    /// * {{security_gateway_id}}/{{application_id}}
    /// 
    /// * {{application_id}}
    /// 
    /// Any variables not passed in the import command will be taken from the provider configuration.
    /// 
    /// BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
    /// 
    /// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy editor "projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane@example.com"
    /// ```
    /// 
    /// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy editor "projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser"
    /// ```
    /// 
    /// IAM policy imports use the identifier of the resource in question, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
    /// ```
    /// 
    /// -&gt; **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    ///  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
    /// </summary>
    [GcpResourceType("gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy")]
    public partial class SecurityGatewayApplicationIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

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
        /// ID of the Security Gateway resource this belongs to. Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("securityGatewayId")]
        public Output<string> SecurityGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGatewayApplicationIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGatewayApplicationIamPolicy(string name, SecurityGatewayApplicationIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy", name, args ?? new SecurityGatewayApplicationIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGatewayApplicationIamPolicy(string name, Input<string> id, SecurityGatewayApplicationIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityGatewayApplicationIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGatewayApplicationIamPolicy Get(string name, Input<string> id, SecurityGatewayApplicationIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGatewayApplicationIamPolicy(name, id, state, options);
        }
    }

    public sealed class SecurityGatewayApplicationIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

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
        /// ID of the Security Gateway resource this belongs to. Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("securityGatewayId", required: true)]
        public Input<string> SecurityGatewayId { get; set; } = null!;

        public SecurityGatewayApplicationIamPolicyArgs()
        {
        }
        public static new SecurityGatewayApplicationIamPolicyArgs Empty => new SecurityGatewayApplicationIamPolicyArgs();
    }

    public sealed class SecurityGatewayApplicationIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

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
        /// ID of the Security Gateway resource this belongs to. Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("securityGatewayId")]
        public Input<string>? SecurityGatewayId { get; set; }

        public SecurityGatewayApplicationIamPolicyState()
        {
        }
        public static new SecurityGatewayApplicationIamPolicyState Empty => new SecurityGatewayApplicationIamPolicyState();
    }
}
