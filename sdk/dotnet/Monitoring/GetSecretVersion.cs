// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring
{
    [Obsolete(@"gcp.monitoring.getSecretVersion has been deprecated in favor of gcp.secretmanager.getSecretVersion")]
    public static class GetSecretVersion
    {
        /// <summary>
        /// Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don't need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource.
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
        ///     var basic = Gcp.SecretManager.GetSecretVersion.Invoke(new()
        ///     {
        ///         Secret = "my-secret",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSecretVersionResult> InvokeAsync(GetSecretVersionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecretVersionResult>("gcp:monitoring/getSecretVersion:getSecretVersion", args ?? new GetSecretVersionArgs(), options.WithDefaults());

        /// <summary>
        /// Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don't need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource.
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
        ///     var basic = Gcp.SecretManager.GetSecretVersion.Invoke(new()
        ///     {
        ///         Secret = "my-secret",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSecretVersionResult> Invoke(GetSecretVersionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecretVersionResult>("gcp:monitoring/getSecretVersion:getSecretVersion", args ?? new GetSecretVersionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don't need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource.
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
        ///     var basic = Gcp.SecretManager.GetSecretVersion.Invoke(new()
        ///     {
        ///         Secret = "my-secret",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSecretVersionResult> Invoke(GetSecretVersionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecretVersionResult>("gcp:monitoring/getSecretVersion:getSecretVersion", args ?? new GetSecretVersionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecretVersionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If set to `false`, the `secret_data` 
        /// will not be fetched. Default is `true`.
        /// </summary>
        [Input("fetchSecretData")]
        public bool? FetchSecretData { get; set; }

        /// <summary>
        /// If set to `true`, the secret data is
        /// expected to be base64-encoded string.
        /// </summary>
        [Input("isSecretDataBase64")]
        public bool? IsSecretDataBase64 { get; set; }

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

        public GetSecretVersionArgs()
        {
        }
        public static new GetSecretVersionArgs Empty => new GetSecretVersionArgs();
    }

    public sealed class GetSecretVersionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If set to `false`, the `secret_data` 
        /// will not be fetched. Default is `true`.
        /// </summary>
        [Input("fetchSecretData")]
        public Input<bool>? FetchSecretData { get; set; }

        /// <summary>
        /// If set to `true`, the secret data is
        /// expected to be base64-encoded string.
        /// </summary>
        [Input("isSecretDataBase64")]
        public Input<bool>? IsSecretDataBase64 { get; set; }

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

        public GetSecretVersionInvokeArgs()
        {
        }
        public static new GetSecretVersionInvokeArgs Empty => new GetSecretVersionInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecretVersionResult
    {
        /// <summary>
        /// The time at which the Secret was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The time at which the Secret was destroyed. Only present if state is DESTROYED.
        /// </summary>
        public readonly string DestroyTime;
        /// <summary>
        /// True if the current state of the SecretVersion is enabled.
        /// </summary>
        public readonly bool Enabled;
        public readonly bool? FetchSecretData;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IsSecretDataBase64;
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
        private GetSecretVersionResult(
            string createTime,

            string destroyTime,

            bool enabled,

            bool? fetchSecretData,

            string id,

            bool? isSecretDataBase64,

            string name,

            string project,

            string secret,

            string secretData,

            string version)
        {
            CreateTime = createTime;
            DestroyTime = destroyTime;
            Enabled = enabled;
            FetchSecretData = fetchSecretData;
            Id = id;
            IsSecretDataBase64 = isSecretDataBase64;
            Name = name;
            Project = project;
            Secret = secret;
            SecretData = secretData;
            Version = version;
        }
    }
}
