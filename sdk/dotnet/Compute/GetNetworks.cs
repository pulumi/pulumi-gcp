// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetNetworks
    {
        /// <summary>
        /// List all networks in a specified Google Cloud project.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_networks = Gcp.Compute.GetNetworks.Invoke(new()
        ///     {
        ///         Project = "my-cloud-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworksResult> InvokeAsync(GetNetworksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworksResult>("gcp:compute/getNetworks:getNetworks", args ?? new GetNetworksArgs(), options.WithDefaults());

        /// <summary>
        /// List all networks in a specified Google Cloud project.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_networks = Gcp.Compute.GetNetworks.Invoke(new()
        ///     {
        ///         Project = "my-cloud-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworksResult> Invoke(GetNetworksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworksResult>("gcp:compute/getNetworks:getNetworks", args ?? new GetNetworksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetNetworksArgs()
        {
        }
        public static new GetNetworksArgs Empty => new GetNetworksArgs();
    }

    public sealed class GetNetworksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetNetworksInvokeArgs()
        {
        }
        public static new GetNetworksInvokeArgs Empty => new GetNetworksInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of networks in the specified project.
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// The project name being queried.
        /// </summary>
        public readonly string? Project;
        /// <summary>
        /// The URI of the resource.
        /// </summary>
        public readonly string SelfLink;

        [OutputConstructor]
        private GetNetworksResult(
            string id,

            ImmutableArray<string> networks,

            string? project,

            string selfLink)
        {
            Id = id;
            Networks = networks;
            Project = project;
            SelfLink = selfLink;
        }
    }
}