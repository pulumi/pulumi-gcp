// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    public static class GetVcenterCredentials
    {
        /// <summary>
        /// Use this data source to get Vcenter credentials for a Private Cloud.
        /// 
        /// To get more information about private cloud Vcenter credentials, see:
        /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
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
        ///     var ds = Gcp.VMwareEngine.GetVcenterCredentials.Invoke(new()
        ///     {
        ///         Parent = "projects/my-project/locations/us-west1-a/privateClouds/my-cloud",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVcenterCredentialsResult> InvokeAsync(GetVcenterCredentialsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVcenterCredentialsResult>("gcp:vmwareengine/getVcenterCredentials:getVcenterCredentials", args ?? new GetVcenterCredentialsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get Vcenter credentials for a Private Cloud.
        /// 
        /// To get more information about private cloud Vcenter credentials, see:
        /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
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
        ///     var ds = Gcp.VMwareEngine.GetVcenterCredentials.Invoke(new()
        ///     {
        ///         Parent = "projects/my-project/locations/us-west1-a/privateClouds/my-cloud",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVcenterCredentialsResult> Invoke(GetVcenterCredentialsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVcenterCredentialsResult>("gcp:vmwareengine/getVcenterCredentials:getVcenterCredentials", args ?? new GetVcenterCredentialsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVcenterCredentialsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource name of the private cloud which contains the Vcenter.
        /// </summary>
        [Input("parent", required: true)]
        public string Parent { get; set; } = null!;

        public GetVcenterCredentialsArgs()
        {
        }
        public static new GetVcenterCredentialsArgs Empty => new GetVcenterCredentialsArgs();
    }

    public sealed class GetVcenterCredentialsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The resource name of the private cloud which contains the Vcenter.
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        public GetVcenterCredentialsInvokeArgs()
        {
        }
        public static new GetVcenterCredentialsInvokeArgs Empty => new GetVcenterCredentialsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVcenterCredentialsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Parent;
        /// <summary>
        /// The password of the Vcenter Credential.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The username of the Vcenter Credential.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetVcenterCredentialsResult(
            string id,

            string parent,

            string password,

            string username)
        {
            Id = id;
            Parent = parent;
            Password = password;
            Username = username;
        }
    }
}