// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub
{
    public static class GetMembership
    {
        /// <summary>
        /// Retrieves the details of a specific GKE Hub Membership. Use this data source to retrieve the membership's configuration and state.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.GkeHub.GetMembership.Invoke(new()
        ///     {
        ///         Project = "my-project-id",
        ///         Location = "global",
        ///         MembershipId = "my-membership-id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMembershipResult> InvokeAsync(GetMembershipArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMembershipResult>("gcp:gkehub/getMembership:getMembership", args ?? new GetMembershipArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the details of a specific GKE Hub Membership. Use this data source to retrieve the membership's configuration and state.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.GkeHub.GetMembership.Invoke(new()
        ///     {
        ///         Project = "my-project-id",
        ///         Location = "global",
        ///         MembershipId = "my-membership-id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMembershipResult> Invoke(GetMembershipInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMembershipResult>("gcp:gkehub/getMembership:getMembership", args ?? new GetMembershipInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the details of a specific GKE Hub Membership. Use this data source to retrieve the membership's configuration and state.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Gcp.GkeHub.GetMembership.Invoke(new()
        ///     {
        ///         Project = "my-project-id",
        ///         Location = "global",
        ///         MembershipId = "my-membership-id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMembershipResult> Invoke(GetMembershipInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMembershipResult>("gcp:gkehub/getMembership:getMembership", args ?? new GetMembershipInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMembershipArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location for the GKE Hub Membership.
        /// Currently only `global` is supported.
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// The GKE Hub Membership id or GKE Cluster's name.
        /// </summary>
        [Input("membershipId", required: true)]
        public string MembershipId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetMembershipArgs()
        {
        }
        public static new GetMembershipArgs Empty => new GetMembershipArgs();
    }

    public sealed class GetMembershipInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location for the GKE Hub Membership.
        /// Currently only `global` is supported.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The GKE Hub Membership id or GKE Cluster's name.
        /// </summary>
        [Input("membershipId", required: true)]
        public Input<string> MembershipId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetMembershipInvokeArgs()
        {
        }
        public static new GetMembershipInvokeArgs Empty => new GetMembershipInvokeArgs();
    }


    [OutputType]
    public sealed class GetMembershipResult
    {
        public readonly ImmutableArray<Outputs.GetMembershipAuthorityResult> Authorities;
        public readonly string Description;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        public readonly ImmutableArray<Outputs.GetMembershipEndpointResult> Endpoints;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Location;
        public readonly string MembershipId;
        public readonly string Name;
        public readonly string? Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;

        [OutputConstructor]
        private GetMembershipResult(
            ImmutableArray<Outputs.GetMembershipAuthorityResult> authorities,

            string description,

            ImmutableDictionary<string, string> effectiveLabels,

            ImmutableArray<Outputs.GetMembershipEndpointResult> endpoints,

            string id,

            ImmutableDictionary<string, string> labels,

            string location,

            string membershipId,

            string name,

            string? project,

            ImmutableDictionary<string, string> pulumiLabels)
        {
            Authorities = authorities;
            Description = description;
            EffectiveLabels = effectiveLabels;
            Endpoints = endpoints;
            Id = id;
            Labels = labels;
            Location = location;
            MembershipId = membershipId;
            Name = name;
            Project = project;
            PulumiLabels = pulumiLabels;
        }
    }
}
