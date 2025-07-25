// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ### Firebase Android App Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basic = new Gcp.Firebase.AndroidApp("basic", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Display Name Basic",
    ///         PackageName = "android.package.app",
    ///         Sha1Hashes = new[]
    ///         {
    ///             "2145bdf698b8715039bd0e83f2069bed435ac21c",
    ///         },
    ///         Sha256Hashes = new[]
    ///         {
    ///             "2145bdf698b8715039bd0e83f2069bed435ac21ca1b2c3d4e5f6123456789abc",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Firebase Android App Custom Api Key
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var android = new Gcp.Projects.ApiKey("android", new()
    ///     {
    ///         Name = "api-key",
    ///         DisplayName = "Display Name",
    ///         Project = "my-project-name",
    ///         Restrictions = new Gcp.Projects.Inputs.ApiKeyRestrictionsArgs
    ///         {
    ///             AndroidKeyRestrictions = new Gcp.Projects.Inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs
    ///             {
    ///                 AllowedApplications = new[]
    ///                 {
    ///                     new Gcp.Projects.Inputs.ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs
    ///                     {
    ///                         PackageName = "android.package.app",
    ///                         Sha1Fingerprint = "2145bdf698b8715039bd0e83f2069bed435ac21c",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var @default = new Gcp.Firebase.AndroidApp("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Display Name",
    ///         PackageName = "android.package.app",
    ///         Sha1Hashes = new[]
    ///         {
    ///             "2145bdf698b8715039bd0e83f2069bed435ac21c",
    ///         },
    ///         Sha256Hashes = new[]
    ///         {
    ///             "2145bdf698b8715039bd0e83f2069bed435ac21ca1b2c3d4e5f6123456789abc",
    ///         },
    ///         ApiKeyId = android.Uid,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AndroidApp can be imported using any of these accepted formats:
    /// 
    /// * `{{project}} projects/{{project}}/androidApps/{{app_id}}`
    /// 
    /// * `projects/{{project}}/androidApps/{{app_id}}`
    /// 
    /// * `{{project}}/{{project}}/{{app_id}}`
    /// 
    /// * `androidApps/{{app_id}}`
    /// 
    /// * `{{app_id}}`
    /// 
    /// When using the `pulumi import` command, AndroidApp can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/androidApp:AndroidApp default "{{project}} projects/{{project}}/androidApps/{{app_id}}"
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/androidApp:AndroidApp default projects/{{project}}/androidApps/{{app_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/androidApp:AndroidApp default {{project}}/{{project}}/{{app_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/androidApp:AndroidApp default androidApps/{{app_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/androidApp:AndroidApp default {{app_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebase/androidApp:AndroidApp")]
    public partial class AndroidApp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the AndroidApp.
        /// If apiKeyId is not set during creation, then Firebase automatically associates an apiKeyId with the AndroidApp.
        /// This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
        /// </summary>
        [Output("apiKeyId")]
        public Output<string> ApiKeyId { get; private set; } = null!;

        /// <summary>
        /// The globally unique, Firebase-assigned identifier of the AndroidApp.
        /// This identifier should be treated as an opaque token, as the data format is not specified.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        [Output("deletionPolicy")]
        public Output<string?> DeletionPolicy { get; private set; } = null!;

        /// <summary>
        /// The user-assigned display name of the AndroidApp.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and it may be sent
        /// with update requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The fully qualified resource name of the AndroidApp, for example:
        /// projects/projectId/androidApps/appId
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The canonical package name of the Android app as would appear in the Google Play
        /// Developer Console.
        /// </summary>
        [Output("packageName")]
        public Output<string> PackageName { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The SHA1 certificate hashes for the AndroidApp.
        /// </summary>
        [Output("sha1Hashes")]
        public Output<ImmutableArray<string>> Sha1Hashes { get; private set; } = null!;

        /// <summary>
        /// The SHA256 certificate hashes for the AndroidApp.
        /// </summary>
        [Output("sha256Hashes")]
        public Output<ImmutableArray<string>> Sha256Hashes { get; private set; } = null!;


        /// <summary>
        /// Create a AndroidApp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AndroidApp(string name, AndroidAppArgs args, CustomResourceOptions? options = null)
            : base("gcp:firebase/androidApp:AndroidApp", name, args ?? new AndroidAppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AndroidApp(string name, Input<string> id, AndroidAppState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/androidApp:AndroidApp", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AndroidApp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AndroidApp Get(string name, Input<string> id, AndroidAppState? state = null, CustomResourceOptions? options = null)
        {
            return new AndroidApp(name, id, state, options);
        }
    }

    public sealed class AndroidAppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the AndroidApp.
        /// If apiKeyId is not set during creation, then Firebase automatically associates an apiKeyId with the AndroidApp.
        /// This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
        /// </summary>
        [Input("apiKeyId")]
        public Input<string>? ApiKeyId { get; set; }

        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The user-assigned display name of the AndroidApp.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The canonical package name of the Android app as would appear in the Google Play
        /// Developer Console.
        /// </summary>
        [Input("packageName", required: true)]
        public Input<string> PackageName { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("sha1Hashes")]
        private InputList<string>? _sha1Hashes;

        /// <summary>
        /// The SHA1 certificate hashes for the AndroidApp.
        /// </summary>
        public InputList<string> Sha1Hashes
        {
            get => _sha1Hashes ?? (_sha1Hashes = new InputList<string>());
            set => _sha1Hashes = value;
        }

        [Input("sha256Hashes")]
        private InputList<string>? _sha256Hashes;

        /// <summary>
        /// The SHA256 certificate hashes for the AndroidApp.
        /// </summary>
        public InputList<string> Sha256Hashes
        {
            get => _sha256Hashes ?? (_sha256Hashes = new InputList<string>());
            set => _sha256Hashes = value;
        }

        public AndroidAppArgs()
        {
        }
        public static new AndroidAppArgs Empty => new AndroidAppArgs();
    }

    public sealed class AndroidAppState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the AndroidApp.
        /// If apiKeyId is not set during creation, then Firebase automatically associates an apiKeyId with the AndroidApp.
        /// This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
        /// </summary>
        [Input("apiKeyId")]
        public Input<string>? ApiKeyId { get; set; }

        /// <summary>
        /// The globally unique, Firebase-assigned identifier of the AndroidApp.
        /// This identifier should be treated as an opaque token, as the data format is not specified.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The user-assigned display name of the AndroidApp.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and it may be sent
        /// with update requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The fully qualified resource name of the AndroidApp, for example:
        /// projects/projectId/androidApps/appId
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The canonical package name of the Android app as would appear in the Google Play
        /// Developer Console.
        /// </summary>
        [Input("packageName")]
        public Input<string>? PackageName { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("sha1Hashes")]
        private InputList<string>? _sha1Hashes;

        /// <summary>
        /// The SHA1 certificate hashes for the AndroidApp.
        /// </summary>
        public InputList<string> Sha1Hashes
        {
            get => _sha1Hashes ?? (_sha1Hashes = new InputList<string>());
            set => _sha1Hashes = value;
        }

        [Input("sha256Hashes")]
        private InputList<string>? _sha256Hashes;

        /// <summary>
        /// The SHA256 certificate hashes for the AndroidApp.
        /// </summary>
        public InputList<string> Sha256Hashes
        {
            get => _sha256Hashes ?? (_sha256Hashes = new InputList<string>());
            set => _sha256Hashes = value;
        }

        public AndroidAppState()
        {
        }
        public static new AndroidAppState Empty => new AndroidAppState();
    }
}
