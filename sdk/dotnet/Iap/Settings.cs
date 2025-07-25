// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iap
{
    /// <summary>
    /// IAP settings - manage IAP settings
    /// 
    /// To get more information about Settings, see:
    /// 
    /// * [API documentation](https://cloud.google.com/iap/docs/reference/rest/v1/IapSettings)
    /// * How-to Guides
    ///     * [Customizing IAP](https://cloud.google.com/iap/docs/customizing)
    /// 
    /// ## Example Usage
    /// 
    /// ### Iap Settings Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var defaultHealthCheck = new Gcp.Compute.HealthCheck("default", new()
    ///     {
    ///         Name = "iap-bs-health-check",
    ///         CheckIntervalSec = 1,
    ///         TimeoutSec = 1,
    ///         TcpHealthCheck = new Gcp.Compute.Inputs.HealthCheckTcpHealthCheckArgs
    ///         {
    ///             Port = 80,
    ///         },
    ///     });
    /// 
    ///     var @default = new Gcp.Compute.RegionBackendService("default", new()
    ///     {
    ///         Name = "iap-settings-tf",
    ///         Region = "us-central1",
    ///         HealthChecks = defaultHealthCheck.Id,
    ///         ConnectionDrainingTimeoutSec = 10,
    ///         SessionAffinity = "CLIENT_IP",
    ///     });
    /// 
    ///     var iapSettings = new Gcp.Iap.Settings("iap_settings", new()
    ///     {
    ///         Name = Output.Tuple(project, @default.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/iap_web/compute-us-central1/services/{name}";
    ///         }),
    ///         AccessSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsArgs
    ///         {
    ///             IdentitySources = new[]
    ///             {
    ///                 "WORKFORCE_IDENTITY_FEDERATION",
    ///             },
    ///             AllowedDomainsSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsAllowedDomainsSettingsArgs
    ///             {
    ///                 Domains = new[]
    ///                 {
    ///                     "test.abc.com",
    ///                 },
    ///                 Enable = true,
    ///             },
    ///             CorsSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsCorsSettingsArgs
    ///             {
    ///                 AllowHttpOptions = true,
    ///             },
    ///             ReauthSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsReauthSettingsArgs
    ///             {
    ///                 Method = "SECURE_KEY",
    ///                 MaxAge = "305s",
    ///                 PolicyType = "MINIMUM",
    ///             },
    ///             GcipSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsGcipSettingsArgs
    ///             {
    ///                 LoginPageUri = "https://test.com/?apiKey=abc",
    ///             },
    ///             OauthSettings = new Gcp.Iap.Inputs.SettingsAccessSettingsOauthSettingsArgs
    ///             {
    ///                 LoginHint = "test",
    ///             },
    ///             WorkforceIdentitySettings = new Gcp.Iap.Inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs
    ///             {
    ///                 WorkforcePools = "wif-pool",
    ///                 Oauth2 = new Gcp.Iap.Inputs.SettingsAccessSettingsWorkforceIdentitySettingsOauth2Args
    ///                 {
    ///                     ClientId = "test-client-id",
    ///                     ClientSecret = "test-client-secret",
    ///                 },
    ///             },
    ///         },
    ///         ApplicationSettings = new Gcp.Iap.Inputs.SettingsApplicationSettingsArgs
    ///         {
    ///             CookieDomain = "test.abc.com",
    ///             CsmSettings = new Gcp.Iap.Inputs.SettingsApplicationSettingsCsmSettingsArgs
    ///             {
    ///                 RctokenAud = "test-aud-set",
    ///             },
    ///             AccessDeniedPageSettings = new Gcp.Iap.Inputs.SettingsApplicationSettingsAccessDeniedPageSettingsArgs
    ///             {
    ///                 AccessDeniedPageUri = "test-uri",
    ///                 GenerateTroubleshootingUri = true,
    ///                 RemediationTokenGenerationEnabled = false,
    ///             },
    ///             AttributePropagationSettings = new Gcp.Iap.Inputs.SettingsApplicationSettingsAttributePropagationSettingsArgs
    ///             {
    ///                 OutputCredentials = new[]
    ///                 {
    ///                     "HEADER",
    ///                 },
    ///                 Expression = "attributes.saml_attributes.filter(attribute, attribute.name in [\"test1\", \"test2\"])",
    ///                 Enable = false,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Settings can be imported using any of these accepted formats:
    /// 
    /// * `{{name}}/iapSettings`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Settings can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:iap/settings:Settings default {{name}}/iapSettings
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:iap/settings:Settings default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:iap/settings:Settings")]
    public partial class Settings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Top level wrapper for all access related setting in IAP.
        /// Structure is documented below.
        /// </summary>
        [Output("accessSettings")]
        public Output<Outputs.SettingsAccessSettings?> AccessSettings { get; private set; } = null!;

        /// <summary>
        /// Top level wrapper for all application related settings in IAP.
        /// Structure is documented below.
        /// </summary>
        [Output("applicationSettings")]
        public Output<Outputs.SettingsApplicationSettings?> ApplicationSettings { get; private set; } = null!;

        /// <summary>
        /// The resource name of the IAP protected resource. Name can have below resources:
        /// * organizations/{organization_id}
        /// * folders/{folder_id}
        /// * projects/{project_id}
        /// * projects/{project_id}/iap_web
        /// * projects/{project_id}/iap_web/compute
        /// * projects/{project_id}/iap_web/compute-{region}
        /// * projects/{project_id}/iap_web/compute/services/{service_id}
        /// * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Settings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Settings(string name, SettingsArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:iap/settings:Settings", name, args ?? new SettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Settings(string name, Input<string> id, SettingsState? state = null, CustomResourceOptions? options = null)
            : base("gcp:iap/settings:Settings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Settings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Settings Get(string name, Input<string> id, SettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new Settings(name, id, state, options);
        }
    }

    public sealed class SettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Top level wrapper for all access related setting in IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("accessSettings")]
        public Input<Inputs.SettingsAccessSettingsArgs>? AccessSettings { get; set; }

        /// <summary>
        /// Top level wrapper for all application related settings in IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("applicationSettings")]
        public Input<Inputs.SettingsApplicationSettingsArgs>? ApplicationSettings { get; set; }

        /// <summary>
        /// The resource name of the IAP protected resource. Name can have below resources:
        /// * organizations/{organization_id}
        /// * folders/{folder_id}
        /// * projects/{project_id}
        /// * projects/{project_id}/iap_web
        /// * projects/{project_id}/iap_web/compute
        /// * projects/{project_id}/iap_web/compute-{region}
        /// * projects/{project_id}/iap_web/compute/services/{service_id}
        /// * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SettingsArgs()
        {
        }
        public static new SettingsArgs Empty => new SettingsArgs();
    }

    public sealed class SettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Top level wrapper for all access related setting in IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("accessSettings")]
        public Input<Inputs.SettingsAccessSettingsGetArgs>? AccessSettings { get; set; }

        /// <summary>
        /// Top level wrapper for all application related settings in IAP.
        /// Structure is documented below.
        /// </summary>
        [Input("applicationSettings")]
        public Input<Inputs.SettingsApplicationSettingsGetArgs>? ApplicationSettings { get; set; }

        /// <summary>
        /// The resource name of the IAP protected resource. Name can have below resources:
        /// * organizations/{organization_id}
        /// * folders/{folder_id}
        /// * projects/{project_id}
        /// * projects/{project_id}/iap_web
        /// * projects/{project_id}/iap_web/compute
        /// * projects/{project_id}/iap_web/compute-{region}
        /// * projects/{project_id}/iap_web/compute/services/{service_id}
        /// * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
        /// * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SettingsState()
        {
        }
        public static new SettingsState Empty => new SettingsState();
    }
}
