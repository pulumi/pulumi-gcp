// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex
{
    public static class GetAiFeatureOnlineStoreIamPolicy
    {
        /// <summary>
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
        ///     var policy = Gcp.Vertex.GetAiFeatureOnlineStoreIamPolicy.Invoke(new()
        ///     {
        ///         Region = featureOnlineStore.Region,
        ///         FeatureOnlineStore = featureOnlineStore.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAiFeatureOnlineStoreIamPolicyResult> InvokeAsync(GetAiFeatureOnlineStoreIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAiFeatureOnlineStoreIamPolicyResult>("gcp:vertex/getAiFeatureOnlineStoreIamPolicy:getAiFeatureOnlineStoreIamPolicy", args ?? new GetAiFeatureOnlineStoreIamPolicyArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var policy = Gcp.Vertex.GetAiFeatureOnlineStoreIamPolicy.Invoke(new()
        ///     {
        ///         Region = featureOnlineStore.Region,
        ///         FeatureOnlineStore = featureOnlineStore.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAiFeatureOnlineStoreIamPolicyResult> Invoke(GetAiFeatureOnlineStoreIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAiFeatureOnlineStoreIamPolicyResult>("gcp:vertex/getAiFeatureOnlineStoreIamPolicy:getAiFeatureOnlineStoreIamPolicy", args ?? new GetAiFeatureOnlineStoreIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var policy = Gcp.Vertex.GetAiFeatureOnlineStoreIamPolicy.Invoke(new()
        ///     {
        ///         Region = featureOnlineStore.Region,
        ///         FeatureOnlineStore = featureOnlineStore.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAiFeatureOnlineStoreIamPolicyResult> Invoke(GetAiFeatureOnlineStoreIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAiFeatureOnlineStoreIamPolicyResult>("gcp:vertex/getAiFeatureOnlineStoreIamPolicy:getAiFeatureOnlineStoreIamPolicy", args ?? new GetAiFeatureOnlineStoreIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAiFeatureOnlineStoreIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("featureOnlineStore", required: true)]
        public string FeatureOnlineStore { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The region of feature online store. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        /// region is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetAiFeatureOnlineStoreIamPolicyArgs()
        {
        }
        public static new GetAiFeatureOnlineStoreIamPolicyArgs Empty => new GetAiFeatureOnlineStoreIamPolicyArgs();
    }

    public sealed class GetAiFeatureOnlineStoreIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("featureOnlineStore", required: true)]
        public Input<string> FeatureOnlineStore { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of feature online store. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        /// region is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetAiFeatureOnlineStoreIamPolicyInvokeArgs()
        {
        }
        public static new GetAiFeatureOnlineStoreIamPolicyInvokeArgs Empty => new GetAiFeatureOnlineStoreIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAiFeatureOnlineStoreIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        public readonly string FeatureOnlineStore;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required only by `gcp.vertex.AiFeatureOnlineStoreIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;
        public readonly string Region;

        [OutputConstructor]
        private GetAiFeatureOnlineStoreIamPolicyResult(
            string etag,

            string featureOnlineStore,

            string id,

            string policyData,

            string project,

            string region)
        {
            Etag = etag;
            FeatureOnlineStore = featureOnlineStore;
            Id = id;
            PolicyData = policyData;
            Project = project;
            Region = region;
        }
    }
}
