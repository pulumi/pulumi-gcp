// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging
{
    public static class GetProjectSettings
    {
        /// <summary>
        /// Describes the settings associated with a project.
        /// 
        /// To get more information about LoggingProjectSettings, see:
        /// 
        /// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
        /// * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
        /// 
        /// ## Example Usage
        /// 
        /// ### Logging Project Settings Basic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var settings = Gcp.Logging.GetProjectSettings.Invoke(new()
        ///     {
        ///         Project = "my-project-name",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectSettingsResult> InvokeAsync(GetProjectSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectSettingsResult>("gcp:logging/getProjectSettings:getProjectSettings", args ?? new GetProjectSettingsArgs(), options.WithDefaults());

        /// <summary>
        /// Describes the settings associated with a project.
        /// 
        /// To get more information about LoggingProjectSettings, see:
        /// 
        /// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
        /// * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
        /// 
        /// ## Example Usage
        /// 
        /// ### Logging Project Settings Basic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var settings = Gcp.Logging.GetProjectSettings.Invoke(new()
        ///     {
        ///         Project = "my-project-name",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectSettingsResult> Invoke(GetProjectSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectSettingsResult>("gcp:logging/getProjectSettings:getProjectSettings", args ?? new GetProjectSettingsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Describes the settings associated with a project.
        /// 
        /// To get more information about LoggingProjectSettings, see:
        /// 
        /// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
        /// * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
        /// 
        /// ## Example Usage
        /// 
        /// ### Logging Project Settings Basic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var settings = Gcp.Logging.GetProjectSettings.Invoke(new()
        ///     {
        ///         Project = "my-project-name",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectSettingsResult> Invoke(GetProjectSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectSettingsResult>("gcp:logging/getProjectSettings:getProjectSettings", args ?? new GetProjectSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the project for which to retrieve settings.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        public GetProjectSettingsArgs()
        {
        }
        public static new GetProjectSettingsArgs Empty => new GetProjectSettingsArgs();
    }

    public sealed class GetProjectSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the project for which to retrieve settings.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public GetProjectSettingsInvokeArgs()
        {
        }
        public static new GetProjectSettingsInvokeArgs Empty => new GetProjectSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectSettingsResult
    {
        /// <summary>
        /// If set to true, the _Default sink in newly created projects and folders will created in a disabled state. This can be used to automatically disable log storage if there is already an aggregated sink configured in the hierarchy. The _Default sink can be re-enabled manually if needed.
        /// </summary>
        public readonly bool DisableDefaultSink;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The resource name for the configured Cloud KMS key.
        /// KMS key name format:
        /// `'projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]'`
        /// To enable CMEK for the bucket, set this field to a valid kmsKeyName for which the associated service account has the required cloudkms.cryptoKeyEncrypterDecrypter roles assigned for the key.
        /// The Cloud KMS key used by the bucket can be updated by changing the kmsKeyName to a new valid key name. Encryption operations that are in progress will be completed with the key that was in use when they started. Decryption operations will be completed using the key that was used at the time of encryption unless access to that key has been revoked.
        /// See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
        /// </summary>
        public readonly string KmsKeyName;
        /// <summary>
        /// The service account associated with a project for which CMEK will apply.
        /// Before enabling CMEK for a logging bucket, you must first assign the cloudkms.cryptoKeyEncrypterDecrypter role to the service account associated with the project for which CMEK will apply. See [Enabling CMEK for Logging Buckets](https://cloud.google.com/logging/docs/routing/managed-encryption-storage) for more information.
        /// </summary>
        public readonly string KmsServiceAccountId;
        /// <summary>
        /// The service account for the given container. Sinks use this service account as their writerIdentity if no custom service account is provided.
        /// </summary>
        public readonly string LoggingServiceAccountId;
        /// <summary>
        /// The resource name of the settings.
        /// </summary>
        public readonly string Name;
        public readonly string Project;
        /// <summary>
        /// The storage location that Cloud Logging will use to create new resources when a location is needed but not explicitly provided.
        /// </summary>
        public readonly string StorageLocation;

        [OutputConstructor]
        private GetProjectSettingsResult(
            bool disableDefaultSink,

            string id,

            string kmsKeyName,

            string kmsServiceAccountId,

            string loggingServiceAccountId,

            string name,

            string project,

            string storageLocation)
        {
            DisableDefaultSink = disableDefaultSink;
            Id = id;
            KmsKeyName = kmsKeyName;
            KmsServiceAccountId = kmsServiceAccountId;
            LoggingServiceAccountId = loggingServiceAccountId;
            Name = name;
            Project = project;
            StorageLocation = storageLocation;
        }
    }
}
