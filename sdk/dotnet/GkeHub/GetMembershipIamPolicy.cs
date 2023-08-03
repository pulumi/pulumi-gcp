// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub
{
    public static class GetMembershipIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for membership
        /// 
        /// 
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.GkeHub.GetMembershipIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_gke_hub_membership.Membership.Project,
        ///         MembershipId = google_gke_hub_membership.Membership.Membership_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMembershipIamPolicyResult> InvokeAsync(GetMembershipIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMembershipIamPolicyResult>("gcp:gkehub/getMembershipIamPolicy:getMembershipIamPolicy", args ?? new GetMembershipIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for membership
        /// 
        /// 
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.GkeHub.GetMembershipIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_gke_hub_membership.Membership.Project,
        ///         MembershipId = google_gke_hub_membership.Membership.Membership_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMembershipIamPolicyResult> Invoke(GetMembershipIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMembershipIamPolicyResult>("gcp:gkehub/getMembershipIamPolicy:getMembershipIamPolicy", args ?? new GetMembershipIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMembershipIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("membershipId", required: true)]
        public string MembershipId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetMembershipIamPolicyArgs()
        {
        }
        public static new GetMembershipIamPolicyArgs Empty => new GetMembershipIamPolicyArgs();
    }

    public sealed class GetMembershipIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("membershipId", required: true)]
        public Input<string> MembershipId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetMembershipIamPolicyInvokeArgs()
        {
        }
        public static new GetMembershipIamPolicyInvokeArgs Empty => new GetMembershipIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetMembershipIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string MembershipId;
        /// <summary>
        /// (Required only by `gcp.gkehub.MembershipIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;

        [OutputConstructor]
        private GetMembershipIamPolicyResult(
            string etag,

            string id,

            string membershipId,

            string policyData,

            string project)
        {
            Etag = etag;
            Id = id;
            MembershipId = membershipId;
            PolicyData = policyData;
            Project = project;
        }
    }
}