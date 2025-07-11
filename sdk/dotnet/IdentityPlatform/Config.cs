// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform
{
    /// <summary>
    /// Identity Platform configuration for a Cloud project. Identity Platform is an
    /// end-to-end authentication system for third-party users to access apps
    /// and services.
    /// 
    /// This entity is created only once during intialization and cannot be deleted,
    /// individual Identity Providers may be disabled instead.  This resource may only
    /// be created in billing-enabled projects.
    /// 
    /// To get more information about Config, see:
    /// 
    /// * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/identity-platform/docs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Identity Platform Config Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Organizations.Project("default", new()
    ///     {
    ///         ProjectId = "my-project",
    ///         Name = "my-project",
    ///         OrgId = "123456789",
    ///         BillingAccount = "000000-0000000-0000000-000000",
    ///         DeletionPolicy = "DELETE",
    ///         Labels = 
    ///         {
    ///             { "firebase", "enabled" },
    ///         },
    ///     });
    /// 
    ///     var identitytoolkit = new Gcp.Projects.Service("identitytoolkit", new()
    ///     {
    ///         Project = @default.ProjectId,
    ///         ServiceName = "identitytoolkit.googleapis.com",
    ///     });
    /// 
    ///     var defaultConfig = new Gcp.IdentityPlatform.Config("default", new()
    ///     {
    ///         Project = @default.ProjectId,
    ///         AutodeleteAnonymousUsers = true,
    ///         SignIn = new Gcp.IdentityPlatform.Inputs.ConfigSignInArgs
    ///         {
    ///             AllowDuplicateEmails = true,
    ///             Anonymous = new Gcp.IdentityPlatform.Inputs.ConfigSignInAnonymousArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             Email = new Gcp.IdentityPlatform.Inputs.ConfigSignInEmailArgs
    ///             {
    ///                 Enabled = true,
    ///                 PasswordRequired = false,
    ///             },
    ///             PhoneNumber = new Gcp.IdentityPlatform.Inputs.ConfigSignInPhoneNumberArgs
    ///             {
    ///                 Enabled = true,
    ///                 TestPhoneNumbers = 
    ///                 {
    ///                     { "+11231231234", "000000" },
    ///                 },
    ///             },
    ///         },
    ///         SmsRegionConfig = new Gcp.IdentityPlatform.Inputs.ConfigSmsRegionConfigArgs
    ///         {
    ///             AllowlistOnly = new Gcp.IdentityPlatform.Inputs.ConfigSmsRegionConfigAllowlistOnlyArgs
    ///             {
    ///                 AllowedRegions = new[]
    ///                 {
    ///                     "US",
    ///                     "CA",
    ///                 },
    ///             },
    ///         },
    ///         BlockingFunctions = new Gcp.IdentityPlatform.Inputs.ConfigBlockingFunctionsArgs
    ///         {
    ///             Triggers = new[]
    ///             {
    ///                 new Gcp.IdentityPlatform.Inputs.ConfigBlockingFunctionsTriggerArgs
    ///                 {
    ///                     EventType = "beforeSignIn",
    ///                     FunctionUri = "https://us-east1-my-project.cloudfunctions.net/before-sign-in",
    ///                 },
    ///             },
    ///             ForwardInboundCredentials = new Gcp.IdentityPlatform.Inputs.ConfigBlockingFunctionsForwardInboundCredentialsArgs
    ///             {
    ///                 RefreshToken = true,
    ///                 AccessToken = true,
    ///                 IdToken = true,
    ///             },
    ///         },
    ///         Quota = new Gcp.IdentityPlatform.Inputs.ConfigQuotaArgs
    ///         {
    ///             SignUpQuotaConfig = new Gcp.IdentityPlatform.Inputs.ConfigQuotaSignUpQuotaConfigArgs
    ///             {
    ///                 Quota = 1000,
    ///                 StartTime = "2014-10-02T15:01:23Z",
    ///                 QuotaDuration = "7200s",
    ///             },
    ///         },
    ///         AuthorizedDomains = new[]
    ///         {
    ///             "localhost",
    ///             "my-project.firebaseapp.com",
    ///             "my-project.web.app",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Config can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/config`
    /// 
    /// * `projects/{{project}}`
    /// 
    /// * `{{project}}`
    /// 
    /// When using the `pulumi import` command, Config can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}/config
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:identityplatform/config:Config default {{project}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:identityplatform/config:Config")]
    public partial class Config : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of domains authorized for OAuth redirects.
        /// </summary>
        [Output("authorizedDomains")]
        public Output<ImmutableArray<string>> AuthorizedDomains { get; private set; } = null!;

        /// <summary>
        /// Whether anonymous users will be auto-deleted after a period of 30 days
        /// </summary>
        [Output("autodeleteAnonymousUsers")]
        public Output<bool?> AutodeleteAnonymousUsers { get; private set; } = null!;

        /// <summary>
        /// Configuration related to blocking functions.
        /// Structure is documented below.
        /// </summary>
        [Output("blockingFunctions")]
        public Output<Outputs.ConfigBlockingFunctions?> BlockingFunctions { get; private set; } = null!;

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Output("client")]
        public Output<Outputs.ConfigClient> Client { get; private set; } = null!;

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Output("mfa")]
        public Output<Outputs.ConfigMfa> Mfa { get; private set; } = null!;

        /// <summary>
        /// Configuration related to monitoring project activity.
        /// Structure is documented below.
        /// </summary>
        [Output("monitoring")]
        public Output<Outputs.ConfigMonitoring> Monitoring { get; private set; } = null!;

        /// <summary>
        /// Configuration related to multi-tenant functionality.
        /// Structure is documented below.
        /// </summary>
        [Output("multiTenant")]
        public Output<Outputs.ConfigMultiTenant?> MultiTenant { get; private set; } = null!;

        /// <summary>
        /// The name of the Config resource
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
        /// Configuration related to quotas.
        /// Structure is documented below.
        /// </summary>
        [Output("quota")]
        public Output<Outputs.ConfigQuota?> Quota { get; private set; } = null!;

        /// <summary>
        /// Configuration related to local sign in methods.
        /// Structure is documented below.
        /// </summary>
        [Output("signIn")]
        public Output<Outputs.ConfigSignIn> SignIn { get; private set; } = null!;

        /// <summary>
        /// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
        /// Structure is documented below.
        /// </summary>
        [Output("smsRegionConfig")]
        public Output<Outputs.ConfigSmsRegionConfig> SmsRegionConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Config resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Config(string name, ConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:identityplatform/config:Config", name, args ?? new ConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Config(string name, Input<string> id, ConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:identityplatform/config:Config", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Config resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Config Get(string name, Input<string> id, ConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new Config(name, id, state, options);
        }
    }

    public sealed class ConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorizedDomains")]
        private InputList<string>? _authorizedDomains;

        /// <summary>
        /// List of domains authorized for OAuth redirects.
        /// </summary>
        public InputList<string> AuthorizedDomains
        {
            get => _authorizedDomains ?? (_authorizedDomains = new InputList<string>());
            set => _authorizedDomains = value;
        }

        /// <summary>
        /// Whether anonymous users will be auto-deleted after a period of 30 days
        /// </summary>
        [Input("autodeleteAnonymousUsers")]
        public Input<bool>? AutodeleteAnonymousUsers { get; set; }

        /// <summary>
        /// Configuration related to blocking functions.
        /// Structure is documented below.
        /// </summary>
        [Input("blockingFunctions")]
        public Input<Inputs.ConfigBlockingFunctionsArgs>? BlockingFunctions { get; set; }

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Input("client")]
        public Input<Inputs.ConfigClientArgs>? Client { get; set; }

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Input("mfa")]
        public Input<Inputs.ConfigMfaArgs>? Mfa { get; set; }

        /// <summary>
        /// Configuration related to monitoring project activity.
        /// Structure is documented below.
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.ConfigMonitoringArgs>? Monitoring { get; set; }

        /// <summary>
        /// Configuration related to multi-tenant functionality.
        /// Structure is documented below.
        /// </summary>
        [Input("multiTenant")]
        public Input<Inputs.ConfigMultiTenantArgs>? MultiTenant { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Configuration related to quotas.
        /// Structure is documented below.
        /// </summary>
        [Input("quota")]
        public Input<Inputs.ConfigQuotaArgs>? Quota { get; set; }

        /// <summary>
        /// Configuration related to local sign in methods.
        /// Structure is documented below.
        /// </summary>
        [Input("signIn")]
        public Input<Inputs.ConfigSignInArgs>? SignIn { get; set; }

        /// <summary>
        /// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
        /// Structure is documented below.
        /// </summary>
        [Input("smsRegionConfig")]
        public Input<Inputs.ConfigSmsRegionConfigArgs>? SmsRegionConfig { get; set; }

        public ConfigArgs()
        {
        }
        public static new ConfigArgs Empty => new ConfigArgs();
    }

    public sealed class ConfigState : global::Pulumi.ResourceArgs
    {
        [Input("authorizedDomains")]
        private InputList<string>? _authorizedDomains;

        /// <summary>
        /// List of domains authorized for OAuth redirects.
        /// </summary>
        public InputList<string> AuthorizedDomains
        {
            get => _authorizedDomains ?? (_authorizedDomains = new InputList<string>());
            set => _authorizedDomains = value;
        }

        /// <summary>
        /// Whether anonymous users will be auto-deleted after a period of 30 days
        /// </summary>
        [Input("autodeleteAnonymousUsers")]
        public Input<bool>? AutodeleteAnonymousUsers { get; set; }

        /// <summary>
        /// Configuration related to blocking functions.
        /// Structure is documented below.
        /// </summary>
        [Input("blockingFunctions")]
        public Input<Inputs.ConfigBlockingFunctionsGetArgs>? BlockingFunctions { get; set; }

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Input("client")]
        public Input<Inputs.ConfigClientGetArgs>? Client { get; set; }

        /// <summary>
        /// Options related to how clients making requests on behalf of a project should be configured.
        /// Structure is documented below.
        /// </summary>
        [Input("mfa")]
        public Input<Inputs.ConfigMfaGetArgs>? Mfa { get; set; }

        /// <summary>
        /// Configuration related to monitoring project activity.
        /// Structure is documented below.
        /// </summary>
        [Input("monitoring")]
        public Input<Inputs.ConfigMonitoringGetArgs>? Monitoring { get; set; }

        /// <summary>
        /// Configuration related to multi-tenant functionality.
        /// Structure is documented below.
        /// </summary>
        [Input("multiTenant")]
        public Input<Inputs.ConfigMultiTenantGetArgs>? MultiTenant { get; set; }

        /// <summary>
        /// The name of the Config resource
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
        /// Configuration related to quotas.
        /// Structure is documented below.
        /// </summary>
        [Input("quota")]
        public Input<Inputs.ConfigQuotaGetArgs>? Quota { get; set; }

        /// <summary>
        /// Configuration related to local sign in methods.
        /// Structure is documented below.
        /// </summary>
        [Input("signIn")]
        public Input<Inputs.ConfigSignInGetArgs>? SignIn { get; set; }

        /// <summary>
        /// Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
        /// Structure is documented below.
        /// </summary>
        [Input("smsRegionConfig")]
        public Input<Inputs.ConfigSmsRegionConfigGetArgs>? SmsRegionConfig { get; set; }

        public ConfigState()
        {
        }
        public static new ConfigState Empty => new ConfigState();
    }
}
