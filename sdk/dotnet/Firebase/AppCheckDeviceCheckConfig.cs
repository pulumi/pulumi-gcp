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
    /// An app's DeviceCheck configuration object. Note that the Team ID registered with your
    /// app is used as part of the validation process. Make sure your `gcp.firebase.AppleApp` has a team_id present.
    /// 
    /// To get more information about DeviceCheckConfig, see:
    /// 
    /// * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.deviceCheckConfig)
    /// * How-to Guides
    ///     * [Official Documentation](https://firebase.google.com/docs/app-check)
    /// 
    /// ## Example Usage
    /// 
    /// ### Firebase App Check Device Check Config Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// using Time = Pulumi.Time;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Firebase.AppleApp("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Apple app",
    ///         BundleId = "bundle.id.devicecheck",
    ///         TeamId = "9987654321",
    ///     });
    /// 
    ///     // It takes a while for App Check to recognize the new app
    ///     // If your app already exists, you don't have to wait 30 seconds.
    ///     var wait30s = new Time.Index.Sleep("wait_30s", new()
    ///     {
    ///         CreateDuration = "30s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             @default,
    ///         },
    ///     });
    /// 
    ///     var defaultAppCheckDeviceCheckConfig = new Gcp.Firebase.AppCheckDeviceCheckConfig("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         AppId = @default.AppId,
    ///         TokenTtl = "7200s",
    ///         KeyId = "Key ID",
    ///         PrivateKey = Std.File.Invoke(new()
    ///         {
    ///             Input = "path/to/private-key.p8",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             wait30s,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DeviceCheckConfig can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/apps/{{app_id}}/deviceCheckConfig`
    /// 
    /// * `{{project}}/{{app_id}}`
    /// 
    /// * `{{app_id}}`
    /// 
    /// When using the `pulumi import` command, DeviceCheckConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig default projects/{{project}}/apps/{{app_id}}/deviceCheckConfig
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig default {{project}}/{{app_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig default {{app_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig")]
    public partial class AppCheckDeviceCheckConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of an
        /// [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id).
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The key identifier of a private key enabled with DeviceCheck, created in your Apple Developer account.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// The relative resource name of the DeviceCheck configuration object
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The contents of the private key (.p8) file associated with the key specified by keyId.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// Whether the privateKey field was previously set. Since App Check will never return the
        /// privateKey field, this field is the only way to find out whether it was previously set.
        /// </summary>
        [Output("privateKeySet")]
        public Output<bool> PrivateKeySet { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Specifies the duration for which App Check tokens exchanged from DeviceCheck artifacts will be valid.
        /// If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        [Output("tokenTtl")]
        public Output<string> TokenTtl { get; private set; } = null!;


        /// <summary>
        /// Create a AppCheckDeviceCheckConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppCheckDeviceCheckConfig(string name, AppCheckDeviceCheckConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig", name, args ?? new AppCheckDeviceCheckConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppCheckDeviceCheckConfig(string name, Input<string> id, AppCheckDeviceCheckConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/appCheckDeviceCheckConfig:AppCheckDeviceCheckConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppCheckDeviceCheckConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppCheckDeviceCheckConfig Get(string name, Input<string> id, AppCheckDeviceCheckConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new AppCheckDeviceCheckConfig(name, id, state, options);
        }
    }

    public sealed class AppCheckDeviceCheckConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an
        /// [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id).
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The key identifier of a private key enabled with DeviceCheck, created in your Apple Developer account.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;

        /// <summary>
        /// The contents of the private key (.p8) file associated with the key specified by keyId.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Specifies the duration for which App Check tokens exchanged from DeviceCheck artifacts will be valid.
        /// If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        [Input("tokenTtl")]
        public Input<string>? TokenTtl { get; set; }

        public AppCheckDeviceCheckConfigArgs()
        {
        }
        public static new AppCheckDeviceCheckConfigArgs Empty => new AppCheckDeviceCheckConfigArgs();
    }

    public sealed class AppCheckDeviceCheckConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an
        /// [Apple App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.iosApps#IosApp.FIELDS.app_id).
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The key identifier of a private key enabled with DeviceCheck, created in your Apple Developer account.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// The relative resource name of the DeviceCheck configuration object
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The contents of the private key (.p8) file associated with the key specified by keyId.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether the privateKey field was previously set. Since App Check will never return the
        /// privateKey field, this field is the only way to find out whether it was previously set.
        /// </summary>
        [Input("privateKeySet")]
        public Input<bool>? PrivateKeySet { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Specifies the duration for which App Check tokens exchanged from DeviceCheck artifacts will be valid.
        /// If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        [Input("tokenTtl")]
        public Input<string>? TokenTtl { get; set; }

        public AppCheckDeviceCheckConfigState()
        {
        }
        public static new AppCheckDeviceCheckConfigState Empty => new AppCheckDeviceCheckConfigState();
    }
}
