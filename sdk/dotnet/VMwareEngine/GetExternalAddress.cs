// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    public static class GetExternalAddress
    {
        /// <summary>
        /// Use this data source to get details about a external address resource.
        /// 
        /// To get more information about external address, see:
        /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
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
        ///     var myExternalAddress = Gcp.VMwareEngine.GetExternalAddress.Invoke(new()
        ///     {
        ///         Name = "my-external-address",
        ///         Parent = "project/my-project/locations/us-west1-a/privateClouds/my-cloud",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetExternalAddressResult> InvokeAsync(GetExternalAddressArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExternalAddressResult>("gcp:vmwareengine/getExternalAddress:getExternalAddress", args ?? new GetExternalAddressArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get details about a external address resource.
        /// 
        /// To get more information about external address, see:
        /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
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
        ///     var myExternalAddress = Gcp.VMwareEngine.GetExternalAddress.Invoke(new()
        ///     {
        ///         Name = "my-external-address",
        ///         Parent = "project/my-project/locations/us-west1-a/privateClouds/my-cloud",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetExternalAddressResult> Invoke(GetExternalAddressInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExternalAddressResult>("gcp:vmwareengine/getExternalAddress:getExternalAddress", args ?? new GetExternalAddressInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get details about a external address resource.
        /// 
        /// To get more information about external address, see:
        /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
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
        ///     var myExternalAddress = Gcp.VMwareEngine.GetExternalAddress.Invoke(new()
        ///     {
        ///         Name = "my-external-address",
        ///         Parent = "project/my-project/locations/us-west1-a/privateClouds/my-cloud",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetExternalAddressResult> Invoke(GetExternalAddressInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetExternalAddressResult>("gcp:vmwareengine/getExternalAddress:getExternalAddress", args ?? new GetExternalAddressInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExternalAddressArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The resource name of the private cloud that this cluster belongs.
        /// </summary>
        [Input("parent", required: true)]
        public string Parent { get; set; } = null!;

        public GetExternalAddressArgs()
        {
        }
        public static new GetExternalAddressArgs Empty => new GetExternalAddressArgs();
    }

    public sealed class GetExternalAddressInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The resource name of the private cloud that this cluster belongs.
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        public GetExternalAddressInvokeArgs()
        {
        }
        public static new GetExternalAddressInvokeArgs Empty => new GetExternalAddressInvokeArgs();
    }


    [OutputType]
    public sealed class GetExternalAddressResult
    {
        public readonly string CreateTime;
        public readonly string Description;
        public readonly string ExternalIp;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InternalIp;
        public readonly string Name;
        public readonly string Parent;
        public readonly string State;
        public readonly string Uid;
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetExternalAddressResult(
            string createTime,

            string description,

            string externalIp,

            string id,

            string internalIp,

            string name,

            string parent,

            string state,

            string uid,

            string updateTime)
        {
            CreateTime = createTime;
            Description = description;
            ExternalIp = externalIp;
            Id = id;
            InternalIp = internalIp;
            Name = name;
            Parent = parent;
            State = state;
            Uid = uid;
            UpdateTime = updateTime;
        }
    }
}
