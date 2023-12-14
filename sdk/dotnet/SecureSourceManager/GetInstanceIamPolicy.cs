// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecureSourceManager
{
    public static class GetInstanceIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for instance
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
        ///     var policy = Gcp.SecureSourceManager.GetInstanceIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_secure_source_manager_instance.Default.Project,
        ///         Location = google_secure_source_manager_instance.Default.Location,
        ///         InstanceId = google_secure_source_manager_instance.Default.Instance_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceIamPolicyResult> InvokeAsync(GetInstanceIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceIamPolicyResult>("gcp:securesourcemanager/getInstanceIamPolicy:getInstanceIamPolicy", args ?? new GetInstanceIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for instance
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
        ///     var policy = Gcp.SecureSourceManager.GetInstanceIamPolicy.Invoke(new()
        ///     {
        ///         Project = google_secure_source_manager_instance.Default.Project,
        ///         Location = google_secure_source_manager_instance.Default.Location,
        ///         InstanceId = google_secure_source_manager_instance.Default.Instance_id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceIamPolicyResult> Invoke(GetInstanceIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceIamPolicyResult>("gcp:securesourcemanager/getInstanceIamPolicy:getInstanceIamPolicy", args ?? new GetInstanceIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name for the Instance.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// The location for the Instance.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetInstanceIamPolicyArgs()
        {
        }
        public static new GetInstanceIamPolicyArgs Empty => new GetInstanceIamPolicyArgs();
    }

    public sealed class GetInstanceIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name for the Instance.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The location for the Instance.
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetInstanceIamPolicyInvokeArgs()
        {
        }
        public static new GetInstanceIamPolicyInvokeArgs Empty => new GetInstanceIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        public readonly string Location;
        /// <summary>
        /// (Required only by `gcp.securesourcemanager.InstanceIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;

        [OutputConstructor]
        private GetInstanceIamPolicyResult(
            string etag,

            string id,

            string instanceId,

            string location,

            string policyData,

            string project)
        {
            Etag = etag;
            Id = id;
            InstanceId = instanceId;
            Location = location;
            PolicyData = policyData;
            Project = project;
        }
    }
}