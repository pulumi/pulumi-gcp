// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy
{
    public static class GetCustomTargetTypeIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for customtargettype
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
        ///     var policy = Gcp.CloudDeploy.GetCustomTargetTypeIamPolicy.Invoke(new()
        ///     {
        ///         Project = custom_target_type.Project,
        ///         Location = custom_target_type.Location,
        ///         Name = custom_target_type.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCustomTargetTypeIamPolicyResult> InvokeAsync(GetCustomTargetTypeIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomTargetTypeIamPolicyResult>("gcp:clouddeploy/getCustomTargetTypeIamPolicy:getCustomTargetTypeIamPolicy", args ?? new GetCustomTargetTypeIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for customtargettype
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
        ///     var policy = Gcp.CloudDeploy.GetCustomTargetTypeIamPolicy.Invoke(new()
        ///     {
        ///         Project = custom_target_type.Project,
        ///         Location = custom_target_type.Location,
        ///         Name = custom_target_type.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomTargetTypeIamPolicyResult> Invoke(GetCustomTargetTypeIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomTargetTypeIamPolicyResult>("gcp:clouddeploy/getCustomTargetTypeIamPolicy:getCustomTargetTypeIamPolicy", args ?? new GetCustomTargetTypeIamPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for customtargettype
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
        ///     var policy = Gcp.CloudDeploy.GetCustomTargetTypeIamPolicy.Invoke(new()
        ///     {
        ///         Project = custom_target_type.Project,
        ///         Location = custom_target_type.Location,
        ///         Name = custom_target_type.Name,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomTargetTypeIamPolicyResult> Invoke(GetCustomTargetTypeIamPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomTargetTypeIamPolicyResult>("gcp:clouddeploy/getCustomTargetTypeIamPolicy:getCustomTargetTypeIamPolicy", args ?? new GetCustomTargetTypeIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomTargetTypeIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the source. Used to find the parent resource to bind the IAM policy to. If not specified,
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

        public GetCustomTargetTypeIamPolicyArgs()
        {
        }
        public static new GetCustomTargetTypeIamPolicyArgs Empty => new GetCustomTargetTypeIamPolicyArgs();
    }

    public sealed class GetCustomTargetTypeIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The location of the source. Used to find the parent resource to bind the IAM policy to. If not specified,
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

        public GetCustomTargetTypeIamPolicyInvokeArgs()
        {
        }
        public static new GetCustomTargetTypeIamPolicyInvokeArgs Empty => new GetCustomTargetTypeIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomTargetTypeIamPolicyResult
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
        /// (Required only by `gcp.clouddeploy.CustomTargetTypeIamPolicy`) The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;

        [OutputConstructor]
        private GetCustomTargetTypeIamPolicyResult(
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
