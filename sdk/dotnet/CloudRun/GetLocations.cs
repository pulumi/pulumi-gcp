// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun
{
    public static class GetLocations
    {
        /// <summary>
        /// Get Cloud Run locations available for a project. 
        /// 
        /// To get more information about Cloud Run, see:
        /// 
        /// * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
        /// * How-to Guides
        ///     * [Official Documentation](https://cloud.google.com/run/docs/)
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
        ///     var available = Gcp.CloudRun.GetLocations.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLocationsResult> InvokeAsync(GetLocationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocationsResult>("gcp:cloudrun/getLocations:getLocations", args ?? new GetLocationsArgs(), options.WithDefaults());

        /// <summary>
        /// Get Cloud Run locations available for a project. 
        /// 
        /// To get more information about Cloud Run, see:
        /// 
        /// * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
        /// * How-to Guides
        ///     * [Official Documentation](https://cloud.google.com/run/docs/)
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
        ///     var available = Gcp.CloudRun.GetLocations.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocationsResult> Invoke(GetLocationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocationsResult>("gcp:cloudrun/getLocations:getLocations", args ?? new GetLocationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get Cloud Run locations available for a project. 
        /// 
        /// To get more information about Cloud Run, see:
        /// 
        /// * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
        /// * How-to Guides
        ///     * [Official Documentation](https://cloud.google.com/run/docs/)
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
        ///     var available = Gcp.CloudRun.GetLocations.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocationsResult> Invoke(GetLocationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocationsResult>("gcp:cloudrun/getLocations:getLocations", args ?? new GetLocationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project to list versions for. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetLocationsArgs()
        {
        }
        public static new GetLocationsArgs Empty => new GetLocationsArgs();
    }

    public sealed class GetLocationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project to list versions for. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetLocationsInvokeArgs()
        {
        }
        public static new GetLocationsInvokeArgs Empty => new GetLocationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of Cloud Run locations available for the given project.
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        public readonly string Project;

        [OutputConstructor]
        private GetLocationsResult(
            string id,

            ImmutableArray<string> locations,

            string project)
        {
            Id = id;
            Locations = locations;
            Project = project;
        }
    }
}
