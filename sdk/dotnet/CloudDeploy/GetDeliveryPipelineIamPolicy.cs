// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy
{
    public static class GetDeliveryPipelineIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for deliverypipeline
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
        ///     var policy = Gcp.CloudDeploy.GetDeliveryPipelineIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Location = @default.Location,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDeliveryPipelineIamPolicyResult> InvokeAsync(GetDeliveryPipelineIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeliveryPipelineIamPolicyResult>("gcp:clouddeploy/getDeliveryPipelineIamPolicy:getDeliveryPipelineIamPolicy", args ?? new GetDeliveryPipelineIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for deliverypipeline
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
        ///     var policy = Gcp.CloudDeploy.GetDeliveryPipelineIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Location = @default.Location,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeliveryPipelineIamPolicyResult> Invoke(GetDeliveryPipelineIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeliveryPipelineIamPolicyResult>("gcp:clouddeploy/getDeliveryPipelineIamPolicy:getDeliveryPipelineIamPolicy", args ?? new GetDeliveryPipelineIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for deliverypipeline
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
        ///     var policy = Gcp.CloudDeploy.GetDeliveryPipelineIamPolicy.Invoke(new()
        ///     {
        ///         Project = @default.Project,
        ///         Location = @default.Location,
        ///         Name = @default.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDeliveryPipelineIamPolicyResult> Invoke(GetDeliveryPipelineIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeliveryPipelineIamPolicyResult>("gcp:clouddeploy/getDeliveryPipelineIamPolicy:getDeliveryPipelineIamPolicy", args ?? new GetDeliveryPipelineIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeliveryPipelineIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
        /// location is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

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

        public GetDeliveryPipelineIamPolicyArgs()
        {
        }
        public static new GetDeliveryPipelineIamPolicyArgs Empty => new GetDeliveryPipelineIamPolicyArgs();
    }

    public sealed class GetDeliveryPipelineIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
        /// location is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

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

        public GetDeliveryPipelineIamPolicyInvokeArgs()
        {
        }
        public static new GetDeliveryPipelineIamPolicyInvokeArgs Empty => new GetDeliveryPipelineIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeliveryPipelineIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        /// <summary>
        /// (Required only by `gcp.clouddeploy.DeliveryPipelineIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;

        [OutputConstructor]
        private GetDeliveryPipelineIamPolicyResult(
            string etag,

            string id,

            string location,

            string name,

            string policyData,

            string project)
        {
            Etag = etag;
            Id = id;
            Location = location;
            Name = name;
            PolicyData = policyData;
            Project = project;
        }
    }
}
