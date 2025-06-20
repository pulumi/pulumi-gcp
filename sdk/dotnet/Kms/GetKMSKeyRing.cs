// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Kms
{
    public static class GetKMSKeyRing
    {
        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyRing. For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
        /// 
        /// A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
        /// and resides in a specific location.
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
        ///     var myKeyRing = Gcp.Kms.GetKMSKeyRing.Invoke(new()
        ///     {
        ///         Name = "my-key-ring",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetKMSKeyRingResult> InvokeAsync(GetKMSKeyRingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKMSKeyRingResult>("gcp:kms/getKMSKeyRing:getKMSKeyRing", args ?? new GetKMSKeyRingArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyRing. For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
        /// 
        /// A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
        /// and resides in a specific location.
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
        ///     var myKeyRing = Gcp.Kms.GetKMSKeyRing.Invoke(new()
        ///     {
        ///         Name = "my-key-ring",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKMSKeyRingResult> Invoke(GetKMSKeyRingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKMSKeyRingResult>("gcp:kms/getKMSKeyRing:getKMSKeyRing", args ?? new GetKMSKeyRingInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to Google Cloud Platform KMS KeyRing. For more information see
        /// [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
        /// and
        /// [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
        /// 
        /// A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
        /// and resides in a specific location.
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
        ///     var myKeyRing = Gcp.Kms.GetKMSKeyRing.Invoke(new()
        ///     {
        ///         Name = "my-key-ring",
        ///         Location = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKMSKeyRingResult> Invoke(GetKMSKeyRingInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetKMSKeyRingResult>("gcp:kms/getKMSKeyRing:getKMSKeyRing", args ?? new GetKMSKeyRingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKMSKeyRingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Google Cloud Platform location for the KeyRing.
        /// A full list of valid locations can be found by running `gcloud kms locations list`.
        /// 
        /// - - -
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// The KeyRing's name.
        /// A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetKMSKeyRingArgs()
        {
        }
        public static new GetKMSKeyRingArgs Empty => new GetKMSKeyRingArgs();
    }

    public sealed class GetKMSKeyRingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Google Cloud Platform location for the KeyRing.
        /// A full list of valid locations can be found by running `gcloud kms locations list`.
        /// 
        /// - - -
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The KeyRing's name.
        /// A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetKMSKeyRingInvokeArgs()
        {
        }
        public static new GetKMSKeyRingInvokeArgs Empty => new GetKMSKeyRingInvokeArgs();
    }


    [OutputType]
    public sealed class GetKMSKeyRingResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        public readonly string? Project;

        [OutputConstructor]
        private GetKMSKeyRingResult(
            string id,

            string location,

            string name,

            string? project)
        {
            Id = id;
            Location = location;
            Name = name;
            Project = project;
        }
    }
}
