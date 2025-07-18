// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetInstantSnapshotIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for instantsnapshot
        /// 
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
        ///     var policy = Gcp.Compute.GetInstantSnapshotIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Zone = @default.Zone,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstantSnapshotIamPolicyResult> InvokeAsync(GetInstantSnapshotIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstantSnapshotIamPolicyResult>("gcp:compute/getInstantSnapshotIamPolicy:getInstantSnapshotIamPolicy", args ?? new GetInstantSnapshotIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for instantsnapshot
        /// 
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
        ///     var policy = Gcp.Compute.GetInstantSnapshotIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Zone = @default.Zone,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstantSnapshotIamPolicyResult> Invoke(GetInstantSnapshotIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstantSnapshotIamPolicyResult>("gcp:compute/getInstantSnapshotIamPolicy:getInstantSnapshotIamPolicy", args ?? new GetInstantSnapshotIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for instantsnapshot
        /// 
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
        ///     var policy = Gcp.Compute.GetInstantSnapshotIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Zone = @default.Zone,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstantSnapshotIamPolicyResult> Invoke(GetInstantSnapshotIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstantSnapshotIamPolicyResult>("gcp:compute/getInstantSnapshotIamPolicy:getInstantSnapshotIamPolicy", args ?? new GetInstantSnapshotIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstantSnapshotIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// A reference to the zone where the disk is located. Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
        /// zone is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetInstantSnapshotIamPolicyArgs()
        {
        }
        public static new GetInstantSnapshotIamPolicyArgs Empty => new GetInstantSnapshotIamPolicyArgs();
    }

    public sealed class GetInstantSnapshotIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// A reference to the zone where the disk is located. Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
        /// zone is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetInstantSnapshotIamPolicyInvokeArgs()
        {
        }
        public static new GetInstantSnapshotIamPolicyInvokeArgs Empty => new GetInstantSnapshotIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstantSnapshotIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// (Required only by `gcp.compute.InstantSnapshotIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;
        public readonly string Zone;

        [OutputConstructor]
        private GetInstantSnapshotIamPolicyResult(
            string etag,

            string id,

            string name,

            string policyData,

            string project,

            string zone)
        {
            Etag = etag;
            Id = id;
            Name = name;
            PolicyData = policyData;
            Project = project;
            Zone = zone;
        }
    }
}
