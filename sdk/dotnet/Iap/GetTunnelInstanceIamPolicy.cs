// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap
{
    public static class GetTunnelInstanceIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for tunnelinstance
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
        ///     var policy = Gcp.Iap.GetTunnelInstanceIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_compute_instance.Tunnelvm.Project,
        ///         Zone = google_compute_instance.Tunnelvm.Zone,
        ///         Instance = google_compute_instance.Tunnelvm.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTunnelInstanceIamPolicyResult> InvokeAsync(GetTunnelInstanceIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTunnelInstanceIamPolicyResult>("gcp:iap/getTunnelInstanceIamPolicy:getTunnelInstanceIamPolicy", args ?? new GetTunnelInstanceIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for tunnelinstance
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
        ///     var policy = Gcp.Iap.GetTunnelInstanceIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_compute_instance.Tunnelvm.Project,
        ///         Zone = google_compute_instance.Tunnelvm.Zone,
        ///         Instance = google_compute_instance.Tunnelvm.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTunnelInstanceIamPolicyResult> Invoke(GetTunnelInstanceIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTunnelInstanceIamPolicyResult>("gcp:iap/getTunnelInstanceIamPolicy:getTunnelInstanceIamPolicy", args ?? new GetTunnelInstanceIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTunnelInstanceIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("instance", required: true)]
        public string Instance { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        [Input("zone")]
        public string? Zone { get; set; }

        public GetTunnelInstanceIamPolicyArgs()
        {
        }
        public static new GetTunnelInstanceIamPolicyArgs Empty => new GetTunnelInstanceIamPolicyArgs();
    }

    public sealed class GetTunnelInstanceIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetTunnelInstanceIamPolicyInvokeArgs()
        {
        }
        public static new GetTunnelInstanceIamPolicyInvokeArgs Empty => new GetTunnelInstanceIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetTunnelInstanceIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Instance;
        /// <summary>
        /// (Required only by `gcp.iap.TunnelInstanceIAMPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;
        public readonly string Zone;

        [OutputConstructor]
        private GetTunnelInstanceIamPolicyResult(
            string etag,

            string id,

            string instance,

            string policyData,

            string project,

            string zone)
        {
            Etag = etag;
            Id = id;
            Instance = instance;
            PolicyData = policyData;
            Project = project;
            Zone = zone;
        }
    }
}