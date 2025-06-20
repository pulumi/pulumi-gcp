// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetStoragePoolIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for storagepool
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
        ///     var policy = Gcp.Compute.GetStoragePoolIamPolicy.Invoke(new()
        ///     {
        ///         Project = test_storage_pool_basic.Project,
        ///         Zone = test_storage_pool_basic.Zone,
        ///         Name = test_storage_pool_basic.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStoragePoolIamPolicyResult> InvokeAsync(GetStoragePoolIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStoragePoolIamPolicyResult>("gcp:compute/getStoragePoolIamPolicy:getStoragePoolIamPolicy", args ?? new GetStoragePoolIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for storagepool
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
        ///     var policy = Gcp.Compute.GetStoragePoolIamPolicy.Invoke(new()
        ///     {
        ///         Project = test_storage_pool_basic.Project,
        ///         Zone = test_storage_pool_basic.Zone,
        ///         Name = test_storage_pool_basic.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStoragePoolIamPolicyResult> Invoke(GetStoragePoolIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStoragePoolIamPolicyResult>("gcp:compute/getStoragePoolIamPolicy:getStoragePoolIamPolicy", args ?? new GetStoragePoolIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for storagepool
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
        ///     var policy = Gcp.Compute.GetStoragePoolIamPolicy.Invoke(new()
        ///     {
        ///         Project = test_storage_pool_basic.Project,
        ///         Zone = test_storage_pool_basic.Zone,
        ///         Name = test_storage_pool_basic.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStoragePoolIamPolicyResult> Invoke(GetStoragePoolIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetStoragePoolIamPolicyResult>("gcp:compute/getStoragePoolIamPolicy:getStoragePoolIamPolicy", args ?? new GetStoragePoolIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStoragePoolIamPolicyArgs : global::Pulumi.InvokeArgs
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
        /// A reference to the zone where the storage pool resides. Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
        /// zone is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetStoragePoolIamPolicyArgs()
        {
        }
        public static new GetStoragePoolIamPolicyArgs Empty => new GetStoragePoolIamPolicyArgs();
    }

    public sealed class GetStoragePoolIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
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
        /// A reference to the zone where the storage pool resides. Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
        /// zone is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetStoragePoolIamPolicyInvokeArgs()
        {
        }
        public static new GetStoragePoolIamPolicyInvokeArgs Empty => new GetStoragePoolIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetStoragePoolIamPolicyResult
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
        /// (Required only by `gcp.compute.StoragePoolIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;
        public readonly string Zone;

        [OutputConstructor]
        private GetStoragePoolIamPolicyResult(
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
