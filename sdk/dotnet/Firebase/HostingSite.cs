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
    /// ### Firebasehosting Site Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Firebase.HostingSite("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         SiteId = "site-no-app",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Firebasehosting Site Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Firebase.WebApp("default", new()
    ///     {
    ///         Project = "my-project-name",
    ///         DisplayName = "Test web app for Firebase Hosting",
    ///         DeletionPolicy = "DELETE",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var full = new Gcp.Firebase.HostingSite("full", new()
    ///     {
    ///         Project = "my-project-name",
    ///         SiteId = "site-with-app",
    ///         AppId = @default.AppId,
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
    /// Site can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/hostingSite:HostingSite default projects/{{project}}/sites/{{site_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/hostingSite:HostingSite default {{project}}/{{site_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/hostingSite:HostingSite default sites/{{site_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:firebase/hostingSite:HostingSite default {{site_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:firebase/hostingSite:HostingSite")]
    public partial class HostingSite : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
        /// associated with the Hosting site.
        /// </summary>
        [Output("appId")]
        public Output<string?> AppId { get; private set; } = null!;

        /// <summary>
        /// The default URL for the site in the form of https://{name}.web.app
        /// </summary>
        [Output("defaultUrl")]
        public Output<string> DefaultUrl { get; private set; } = null!;

        /// <summary>
        /// Output only. The fully-qualified resource name of the Hosting site, in the format:
        /// projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project's
        /// ['ProjectNumber'](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number)
        /// ***(recommended)*** or its
        /// ['ProjectId'](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
        /// Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
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
        /// Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
        /// used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
        /// domain name label.
        /// </summary>
        [Output("siteId")]
        public Output<string?> SiteId { get; private set; } = null!;


        /// <summary>
        /// Create a HostingSite resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostingSite(string name, HostingSiteArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/hostingSite:HostingSite", name, args ?? new HostingSiteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostingSite(string name, Input<string> id, HostingSiteState? state = null, CustomResourceOptions? options = null)
            : base("gcp:firebase/hostingSite:HostingSite", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostingSite resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostingSite Get(string name, Input<string> id, HostingSiteState? state = null, CustomResourceOptions? options = null)
        {
            return new HostingSite(name, id, state, options);
        }
    }

    public sealed class HostingSiteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
        /// associated with the Hosting site.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
        /// used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
        /// domain name label.
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        public HostingSiteArgs()
        {
        }
        public static new HostingSiteArgs Empty => new HostingSiteArgs();
    }

    public sealed class HostingSiteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
        /// associated with the Hosting site.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The default URL for the site in the form of https://{name}.web.app
        /// </summary>
        [Input("defaultUrl")]
        public Input<string>? DefaultUrl { get; set; }

        /// <summary>
        /// Output only. The fully-qualified resource name of the Hosting site, in the format:
        /// projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project's
        /// ['ProjectNumber'](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number)
        /// ***(recommended)*** or its
        /// ['ProjectId'](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
        /// Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510).
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
        /// Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
        /// used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
        /// domain name label.
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        public HostingSiteState()
        {
        }
        public static new HostingSiteState Empty => new HostingSiteState();
    }
}