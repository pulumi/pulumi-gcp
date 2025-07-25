// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms
{
    public static class GetKeyHandles
    {
        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
        /// 
        /// For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles/list).
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
        ///     var myKeyHandles = Gcp.Kms.GetKeyHandles.Invoke(new()
        ///     {
        ///         Project = "resource-project-id",
        ///         Location = "us-central1",
        ///         ResourceTypeSelector = "storage.googleapis.com/Bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetKeyHandlesResult> InvokeAsync(GetKeyHandlesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKeyHandlesResult>("gcp:kms/getKeyHandles:getKeyHandles", args ?? new GetKeyHandlesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
        /// 
        /// For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles/list).
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
        ///     var myKeyHandles = Gcp.Kms.GetKeyHandles.Invoke(new()
        ///     {
        ///         Project = "resource-project-id",
        ///         Location = "us-central1",
        ///         ResourceTypeSelector = "storage.googleapis.com/Bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKeyHandlesResult> Invoke(GetKeyHandlesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeyHandlesResult>("gcp:kms/getKeyHandles:getKeyHandles", args ?? new GetKeyHandlesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
        /// 
        /// For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles/list).
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
        ///     var myKeyHandles = Gcp.Kms.GetKeyHandles.Invoke(new()
        ///     {
        ///         Project = "resource-project-id",
        ///         Location = "us-central1",
        ///         ResourceTypeSelector = "storage.googleapis.com/Bucket",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKeyHandlesResult> Invoke(GetKeyHandlesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeyHandlesResult>("gcp:kms/getKeyHandles:getKeyHandles", args ?? new GetKeyHandlesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKeyHandlesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Google Cloud Platform location for the KeyHandle.
        /// A full list of valid locations can be found by running `gcloud kms locations list`.
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types. 
        /// 
        /// - - -
        /// </summary>
        [Input("resourceTypeSelector", required: true)]
        public string ResourceTypeSelector { get; set; } = null!;

        public GetKeyHandlesArgs()
        {
        }
        public static new GetKeyHandlesArgs Empty => new GetKeyHandlesArgs();
    }

    public sealed class GetKeyHandlesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Google Cloud Platform location for the KeyHandle.
        /// A full list of valid locations can be found by running `gcloud kms locations list`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types. 
        /// 
        /// - - -
        /// </summary>
        [Input("resourceTypeSelector", required: true)]
        public Input<string> ResourceTypeSelector { get; set; } = null!;

        public GetKeyHandlesInvokeArgs()
        {
        }
        public static new GetKeyHandlesInvokeArgs Empty => new GetKeyHandlesInvokeArgs();
    }


    [OutputType]
    public sealed class GetKeyHandlesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetKeyHandlesKeyHandleResult> KeyHandles;
        /// <summary>
        /// The location of the KMS Key and KeyHandle.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The identifier of the project where KMS KeyHandle is created.
        /// </summary>
        public readonly string? Project;
        /// <summary>
        /// Indicates the resource type that the resulting CryptoKey is meant to protect, e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types.
        /// </summary>
        public readonly string ResourceTypeSelector;

        [OutputConstructor]
        private GetKeyHandlesResult(
            string id,

            ImmutableArray<Outputs.GetKeyHandlesKeyHandleResult> keyHandles,

            string location,

            string? project,

            string resourceTypeSelector)
        {
            Id = id;
            KeyHandles = keyHandles;
            Location = location;
            Project = project;
            ResourceTypeSelector = resourceTypeSelector;
        }
    }
}
