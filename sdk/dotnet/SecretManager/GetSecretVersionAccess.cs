// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager
{
    public static class GetSecretVersionAccess
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var basic = Gcp.SecretManager.GetSecretVersionAccess.Invoke(new()
        ///     {
        ///         Secret = "my-secret",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSecretVersionAccessResult> InvokeAsync(GetSecretVersionAccessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecretVersionAccessResult>("gcp:secretmanager/getSecretVersionAccess:getSecretVersionAccess", args ?? new GetSecretVersionAccessArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var basic = Gcp.SecretManager.GetSecretVersionAccess.Invoke(new()
        ///     {
        ///         Secret = "my-secret",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSecretVersionAccessResult> Invoke(GetSecretVersionAccessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecretVersionAccessResult>("gcp:secretmanager/getSecretVersionAccess:getSecretVersionAccess", args ?? new GetSecretVersionAccessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecretVersionAccessArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project to get the secret version for. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The secret to get the secret version for.
        /// </summary>
        [Input("secret", required: true)]
        public string Secret { get; set; } = null!;

        /// <summary>
        /// The version of the secret to get. If it
        /// is not provided, the latest version is retrieved.
        /// </summary>
        [Input("version")]
        public string? Version { get; set; }

        public GetSecretVersionAccessArgs()
        {
        }
        public static new GetSecretVersionAccessArgs Empty => new GetSecretVersionAccessArgs();
    }

    public sealed class GetSecretVersionAccessInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project to get the secret version for. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The secret to get the secret version for.
        /// </summary>
        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        /// <summary>
        /// The version of the secret to get. If it
        /// is not provided, the latest version is retrieved.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetSecretVersionAccessInvokeArgs()
        {
        }
        public static new GetSecretVersionAccessInvokeArgs Empty => new GetSecretVersionAccessInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecretVersionAccessResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The resource name of the SecretVersion. Format:
        /// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
        /// </summary>
        public readonly string Name;
        public readonly string Project;
        public readonly string Secret;
        /// <summary>
        /// The secret data. No larger than 64KiB.
        /// </summary>
        public readonly string SecretData;
        public readonly string Version;

        [OutputConstructor]
        private GetSecretVersionAccessResult(
            string id,

            string name,

            string project,

            string secret,

            string secretData,

            string version)
        {
            Id = id;
            Name = name;
            Project = project;
            Secret = secret;
            SecretData = secretData;
            Version = version;
        }
    }
}