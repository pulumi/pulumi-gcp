// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    /// ### Firebase Apple App Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Firebase.AppleApp("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Display Name Basic",
    ///         BundleId = "apple.app.12345",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Firebase Apple App Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var full = new Gcp.Firebase.AppleApp("full", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Display Name Full",
    ///         BundleId = "apple.app.12345",
    ///         AppStoreId = "12345",
    ///         TeamId = "9987654321",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// AppleApp can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/appleApp:AppleApp default projects/{{project}}/iosApps/{{appId}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/appleApp:AppleApp default {{project}}/{{appId}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/appleApp:AppleApp default iosApps/{{appId}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/appleApp:AppleApp default {{appId}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebase/appleApp:AppleApp")]
    public partial class AppleApp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque token, as
        /// the data format is not specified.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
        /// </summary>
        [Output("appStoreId")]
        public Output<string?> AppStoreId { get; private set; } = null!;

        /// <summary>
        /// The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
        /// </summary>
        [Output("bundleId")]
        public Output<string?> BundleId { get; private set; } = null!;

        /// <summary>
        /// (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
        /// 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
        /// Default to 'DELETE'.
        /// </summary>
        [Output("deletionPolicy")]
        public Output<string?> DeletionPolicy { get; private set; } = null!;

        /// <summary>
        /// The user-assigned display name of the App.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified resource name of the App, for example: projects/projectId/iosApps/appId
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The Apple Developer Team ID associated with the App in the App Store.
        /// </summary>
        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a AppleApp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppleApp(string name, AppleAppArgs args, CustomResourceOptions? options = null)
            : base("gcp:firebase/appleApp:AppleApp", name, args ?? new AppleAppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppleApp(string name, Input<string> id, AppleAppState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/appleApp:AppleApp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppleApp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppleApp Get(string name, Input<string> id, AppleAppState? state = null, CustomResourceOptions? options = null)
        {
            return new AppleApp(name, id, state, options);
        }
    }

    public sealed class AppleAppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
        /// </summary>
        [Input("appStoreId")]
        public Input<string>? AppStoreId { get; set; }

        /// <summary>
        /// The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
        /// </summary>
        [Input("bundleId")]
        public Input<string>? BundleId { get; set; }

        /// <summary>
        /// (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
        /// 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
        /// Default to 'DELETE'.
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The user-assigned display name of the App.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Apple Developer Team ID associated with the App in the App Store.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public AppleAppArgs()
        {
        }
        public static new AppleAppArgs Empty => new AppleAppArgs();
    }

    public sealed class AppleAppState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque token, as
        /// the data format is not specified.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
        /// </summary>
        [Input("appStoreId")]
        public Input<string>? AppStoreId { get; set; }

        /// <summary>
        /// The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
        /// </summary>
        [Input("bundleId")]
        public Input<string>? BundleId { get; set; }

        /// <summary>
        /// (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
        /// 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
        /// Default to 'DELETE'.
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The user-assigned display name of the App.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The fully qualified resource name of the App, for example: projects/projectId/iosApps/appId
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Apple Developer Team ID associated with the App in the App Store.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public AppleAppState()
        {
        }
        public static new AppleAppState Empty => new AppleAppState();
    }
}