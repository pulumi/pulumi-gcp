// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Looker
{
    /// <summary>
    /// A Google Cloud Looker instance.
    /// 
    /// To get more information about Instance, see:
    /// 
    /// * [API documentation](https://cloud.google.com/looker/docs/reference/rest/v1/projects.locations.instances)
    /// * How-to Guides
    ///     * [Configure a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-setup)
    ///     * [Create a Looker (Google Cloud core) instance](https://cloud.google.com/looker/docs/looker-core-instance-create)
    /// 
    /// ## Example Usage
    /// 
    /// ### Looker Instance Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_STANDARD_ANNUAL",
    ///         Region = "us-central1",
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///         DeletionPolicy = "DEFAULT",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_STANDARD_ANNUAL",
    ///         Region = "us-central1",
    ///         PublicIpEnabled = true,
    ///         AdminSettings = new Gcp.Looker.Inputs.InstanceAdminSettingsArgs
    ///         {
    ///             AllowedEmailDomains = new[]
    ///             {
    ///                 "google.com",
    ///             },
    ///         },
    ///         MaintenanceWindow = new Gcp.Looker.Inputs.InstanceMaintenanceWindowArgs
    ///         {
    ///             DayOfWeek = "THURSDAY",
    ///             StartTime = new Gcp.Looker.Inputs.InstanceMaintenanceWindowStartTimeArgs
    ///             {
    ///                 Hours = 22,
    ///                 Minutes = 0,
    ///                 Seconds = 0,
    ///                 Nanos = 0,
    ///             },
    ///         },
    ///         DenyMaintenancePeriod = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodArgs
    ///         {
    ///             StartDate = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodStartDateArgs
    ///             {
    ///                 Year = 2050,
    ///                 Month = 1,
    ///                 Day = 1,
    ///             },
    ///             EndDate = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodEndDateArgs
    ///             {
    ///                 Year = 2050,
    ///                 Month = 2,
    ///                 Day = 1,
    ///             },
    ///             Time = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodTimeArgs
    ///             {
    ///                 Hours = 10,
    ///                 Minutes = 0,
    ///                 Seconds = 0,
    ///                 Nanos = 0,
    ///             },
    ///         },
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Fips
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance-fips",
    ///         PlatformEdition = "LOOKER_CORE_ENTERPRISE_ANNUAL",
    ///         Region = "us-central1",
    ///         PublicIpEnabled = true,
    ///         FipsEnabled = true,
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Enterprise Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var lookerNetwork = new Gcp.Compute.Network("looker_network", new()
    ///     {
    ///         Name = "looker-network",
    ///     });
    /// 
    ///     var lookerRange = new Gcp.Compute.GlobalAddress("looker_range", new()
    ///     {
    ///         Name = "looker-range",
    ///         Purpose = "VPC_PEERING",
    ///         AddressType = "INTERNAL",
    ///         PrefixLength = 20,
    ///         Network = lookerNetwork.Id,
    ///     });
    /// 
    ///     var lookerVpcConnection = new Gcp.ServiceNetworking.Connection("looker_vpc_connection", new()
    ///     {
    ///         Network = lookerNetwork.Id,
    ///         Service = "servicenetworking.googleapis.com",
    ///         ReservedPeeringRanges = new[]
    ///         {
    ///             lookerRange.Name,
    ///         },
    ///     });
    /// 
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_ENTERPRISE_ANNUAL",
    ///         Region = "us-central1",
    ///         PrivateIpEnabled = true,
    ///         PublicIpEnabled = false,
    ///         ReservedRange = lookerRange.Name,
    ///         ConsumerNetwork = lookerNetwork.Id,
    ///         AdminSettings = new Gcp.Looker.Inputs.InstanceAdminSettingsArgs
    ///         {
    ///             AllowedEmailDomains = new[]
    ///             {
    ///                 "google.com",
    ///             },
    ///         },
    ///         EncryptionConfig = new Gcp.Looker.Inputs.InstanceEncryptionConfigArgs
    ///         {
    ///             KmsKeyName = "looker-kms-key",
    ///         },
    ///         MaintenanceWindow = new Gcp.Looker.Inputs.InstanceMaintenanceWindowArgs
    ///         {
    ///             DayOfWeek = "THURSDAY",
    ///             StartTime = new Gcp.Looker.Inputs.InstanceMaintenanceWindowStartTimeArgs
    ///             {
    ///                 Hours = 22,
    ///                 Minutes = 0,
    ///                 Seconds = 0,
    ///                 Nanos = 0,
    ///             },
    ///         },
    ///         DenyMaintenancePeriod = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodArgs
    ///         {
    ///             StartDate = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodStartDateArgs
    ///             {
    ///                 Year = 2050,
    ///                 Month = 1,
    ///                 Day = 1,
    ///             },
    ///             EndDate = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodEndDateArgs
    ///             {
    ///                 Year = 2050,
    ///                 Month = 2,
    ///                 Day = 1,
    ///             },
    ///             Time = new Gcp.Looker.Inputs.InstanceDenyMaintenancePeriodTimeArgs
    ///             {
    ///                 Hours = 10,
    ///                 Minutes = 0,
    ///                 Seconds = 0,
    ///                 Nanos = 0,
    ///             },
    ///         },
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             lookerVpcConnection,
    ///         },
    ///     });
    /// 
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var cryptoKey = new Gcp.Kms.CryptoKeyIAMMember("crypto_key", new()
    ///     {
    ///         CryptoKeyId = "looker-kms-key",
    ///         Role = "roles/cloudkms.cryptoKeyEncrypterDecrypter",
    ///         Member = $"serviceAccount:service-{project.Apply(getProjectResult =&gt; getProjectResult.Number)}@gcp-sa-looker.iam.gserviceaccount.com",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Custom Domain
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_STANDARD_ANNUAL",
    ///         Region = "us-central1",
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///         CustomDomain = new Gcp.Looker.Inputs.InstanceCustomDomainArgs
    ///         {
    ///             Domain = "my-custom-domain.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Psc
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_ENTERPRISE_ANNUAL",
    ///         Region = "us-central1",
    ///         PrivateIpEnabled = false,
    ///         PublicIpEnabled = false,
    ///         PscEnabled = true,
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///         PscConfig = new Gcp.Looker.Inputs.InstancePscConfigArgs
    ///         {
    ///             AllowedVpcs = new[]
    ///             {
    ///                 "projects/test-project/global/networks/test",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Looker Instance Force Delete
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var looker_instance = new Gcp.Looker.Instance("looker-instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         PlatformEdition = "LOOKER_CORE_STANDARD_ANNUAL",
    ///         Region = "us-central1",
    ///         OauthConfig = new Gcp.Looker.Inputs.InstanceOauthConfigArgs
    ///         {
    ///             ClientId = "my-client-id",
    ///             ClientSecret = "my-client-secret",
    ///         },
    ///         DeletionPolicy = "FORCE",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Instance can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{region}}/instances/{{name}}`
    /// 
    /// * `{{project}}/{{region}}/{{name}}`
    /// 
    /// * `{{region}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:looker/instance:Instance default projects/{{project}}/locations/{{region}}/instances/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:looker/instance:Instance default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:looker/instance:Instance default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:looker/instance:Instance default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:looker/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Looker instance Admin settings.
        /// Structure is documented below.
        /// </summary>
        [Output("adminSettings")]
        public Output<Outputs.InstanceAdminSettings?> AdminSettings { get; private set; } = null!;

        /// <summary>
        /// Network name in the consumer project in the format of: projects/{project}/global/networks/{network}
        /// Note that the consumer network may be in a different GCP project than the consumer
        /// project that is hosting the Looker Instance.
        /// </summary>
        [Output("consumerNetwork")]
        public Output<string?> ConsumerNetwork { get; private set; } = null!;

        /// <summary>
        /// The time the instance was created in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Custom domain settings for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Output("customDomain")]
        public Output<Outputs.InstanceCustomDomain?> CustomDomain { get; private set; } = null!;

        /// <summary>
        /// Policy to determine if the cluster should be deleted forcefully.
        /// If setting deletion_policy = "FORCE", the Looker instance will be deleted regardless
        /// of its nested resources. If set to "DEFAULT", Looker instances that still have
        /// nested resources will return an error. Possible values: DEFAULT, FORCE
        /// </summary>
        [Output("deletionPolicy")]
        public Output<string?> DeletionPolicy { get; private set; } = null!;

        /// <summary>
        /// Maintenance denial period for this instance.
        /// You must allow at least 14 days of maintenance availability
        /// between any two deny maintenance periods.
        /// Structure is documented below.
        /// </summary>
        [Output("denyMaintenancePeriod")]
        public Output<Outputs.InstanceDenyMaintenancePeriod?> DenyMaintenancePeriod { get; private set; } = null!;

        /// <summary>
        /// Public Egress IP (IPv4).
        /// </summary>
        [Output("egressPublicIp")]
        public Output<string> EgressPublicIp { get; private set; } = null!;

        /// <summary>
        /// Looker instance encryption settings.
        /// Structure is documented below.
        /// </summary>
        [Output("encryptionConfig")]
        public Output<Outputs.InstanceEncryptionConfig> EncryptionConfig { get; private set; } = null!;

        /// <summary>
        /// FIPS 140-2 Encryption enablement for Looker (Google Cloud Core).
        /// </summary>
        [Output("fipsEnabled")]
        public Output<bool?> FipsEnabled { get; private set; } = null!;

        /// <summary>
        /// Private Ingress IP (IPv4).
        /// </summary>
        [Output("ingressPrivateIp")]
        public Output<string> IngressPrivateIp { get; private set; } = null!;

        /// <summary>
        /// Public Ingress IP (IPv4).
        /// </summary>
        [Output("ingressPublicIp")]
        public Output<string> IngressPublicIp { get; private set; } = null!;

        /// <summary>
        /// Looker instance URI which can be used to access the Looker Instance UI.
        /// </summary>
        [Output("lookerUri")]
        public Output<string> LookerUri { get; private set; } = null!;

        /// <summary>
        /// The Looker version that the instance is using.
        /// </summary>
        [Output("lookerVersion")]
        public Output<string> LookerVersion { get; private set; } = null!;

        /// <summary>
        /// Maintenance window for an instance.
        /// Maintenance of your instance takes place once a month, and will require
        /// your instance to be restarted during updates, which will temporarily
        /// disrupt service.
        /// Structure is documented below.
        /// </summary>
        [Output("maintenanceWindow")]
        public Output<Outputs.InstanceMaintenanceWindow?> MaintenanceWindow { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Looker Instance OAuth login settings.
        /// Structure is documented below.
        /// </summary>
        [Output("oauthConfig")]
        public Output<Outputs.InstanceOauthConfig> OauthConfig { get; private set; } = null!;

        /// <summary>
        /// Platform editions for a Looker instance. Each edition maps to a set of instance features, like its size. Must be one of these values:
        /// - LOOKER_CORE_TRIAL: trial instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD: pay as you go standard instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD_ANNUAL: subscription standard instance
        /// - LOOKER_CORE_ENTERPRISE_ANNUAL: subscription enterprise instance
        /// - LOOKER_CORE_EMBED_ANNUAL: subscription embed instance
        /// - LOOKER_CORE_NONPROD_STANDARD_ANNUAL: nonprod subscription standard instance
        /// - LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL: nonprod subscription enterprise instance
        /// - LOOKER_CORE_NONPROD_EMBED_ANNUAL: nonprod subscription embed instance
        /// Default value is `LOOKER_CORE_TRIAL`.
        /// Possible values are: `LOOKER_CORE_TRIAL`, `LOOKER_CORE_STANDARD`, `LOOKER_CORE_STANDARD_ANNUAL`, `LOOKER_CORE_ENTERPRISE_ANNUAL`, `LOOKER_CORE_EMBED_ANNUAL`, `LOOKER_CORE_NONPROD_STANDARD_ANNUAL`, `LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL`, `LOOKER_CORE_NONPROD_EMBED_ANNUAL`.
        /// </summary>
        [Output("platformEdition")]
        public Output<string?> PlatformEdition { get; private set; } = null!;

        /// <summary>
        /// Whether private IP is enabled on the Looker instance.
        /// </summary>
        [Output("privateIpEnabled")]
        public Output<bool?> PrivateIpEnabled { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Information for Private Service Connect (PSC) setup for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Output("pscConfig")]
        public Output<Outputs.InstancePscConfig?> PscConfig { get; private set; } = null!;

        /// <summary>
        /// Whether Public Service Connect (PSC) is enabled on the Looker instance
        /// </summary>
        [Output("pscEnabled")]
        public Output<bool?> PscEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether public IP is enabled on the Looker instance.
        /// </summary>
        [Output("publicIpEnabled")]
        public Output<bool?> PublicIpEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the Looker region of the instance.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Name of a reserved IP address range within the consumer network, to be used for
        /// private service access connection. User may or may not specify this in a request.
        /// </summary>
        [Output("reservedRange")]
        public Output<string?> ReservedRange { get; private set; } = null!;

        /// <summary>
        /// The time the instance was updated in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// Metadata about users for a Looker instance.
        /// These settings are only available when platform edition LOOKER_CORE_STANDARD is set.
        /// There are ten Standard and two Developer users included in the cost of the product.
        /// You can allocate additional Standard, Viewer, and Developer users for this instance.
        /// It is an optional step and can be modified later.
        /// With the Standard edition of Looker (Google Cloud core), you can provision up to 50
        /// total users, distributed across Viewer, Standard, and Developer.
        /// Structure is documented below.
        /// </summary>
        [Output("userMetadata")]
        public Output<Outputs.InstanceUserMetadata?> UserMetadata { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("gcp:looker/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("gcp:looker/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Looker instance Admin settings.
        /// Structure is documented below.
        /// </summary>
        [Input("adminSettings")]
        public Input<Inputs.InstanceAdminSettingsArgs>? AdminSettings { get; set; }

        /// <summary>
        /// Network name in the consumer project in the format of: projects/{project}/global/networks/{network}
        /// Note that the consumer network may be in a different GCP project than the consumer
        /// project that is hosting the Looker Instance.
        /// </summary>
        [Input("consumerNetwork")]
        public Input<string>? ConsumerNetwork { get; set; }

        /// <summary>
        /// Custom domain settings for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Input("customDomain")]
        public Input<Inputs.InstanceCustomDomainArgs>? CustomDomain { get; set; }

        /// <summary>
        /// Policy to determine if the cluster should be deleted forcefully.
        /// If setting deletion_policy = "FORCE", the Looker instance will be deleted regardless
        /// of its nested resources. If set to "DEFAULT", Looker instances that still have
        /// nested resources will return an error. Possible values: DEFAULT, FORCE
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// Maintenance denial period for this instance.
        /// You must allow at least 14 days of maintenance availability
        /// between any two deny maintenance periods.
        /// Structure is documented below.
        /// </summary>
        [Input("denyMaintenancePeriod")]
        public Input<Inputs.InstanceDenyMaintenancePeriodArgs>? DenyMaintenancePeriod { get; set; }

        /// <summary>
        /// Looker instance encryption settings.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.InstanceEncryptionConfigArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// FIPS 140-2 Encryption enablement for Looker (Google Cloud Core).
        /// </summary>
        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        /// <summary>
        /// Maintenance window for an instance.
        /// Maintenance of your instance takes place once a month, and will require
        /// your instance to be restarted during updates, which will temporarily
        /// disrupt service.
        /// Structure is documented below.
        /// </summary>
        [Input("maintenanceWindow")]
        public Input<Inputs.InstanceMaintenanceWindowArgs>? MaintenanceWindow { get; set; }

        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Looker Instance OAuth login settings.
        /// Structure is documented below.
        /// </summary>
        [Input("oauthConfig", required: true)]
        public Input<Inputs.InstanceOauthConfigArgs> OauthConfig { get; set; } = null!;

        /// <summary>
        /// Platform editions for a Looker instance. Each edition maps to a set of instance features, like its size. Must be one of these values:
        /// - LOOKER_CORE_TRIAL: trial instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD: pay as you go standard instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD_ANNUAL: subscription standard instance
        /// - LOOKER_CORE_ENTERPRISE_ANNUAL: subscription enterprise instance
        /// - LOOKER_CORE_EMBED_ANNUAL: subscription embed instance
        /// - LOOKER_CORE_NONPROD_STANDARD_ANNUAL: nonprod subscription standard instance
        /// - LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL: nonprod subscription enterprise instance
        /// - LOOKER_CORE_NONPROD_EMBED_ANNUAL: nonprod subscription embed instance
        /// Default value is `LOOKER_CORE_TRIAL`.
        /// Possible values are: `LOOKER_CORE_TRIAL`, `LOOKER_CORE_STANDARD`, `LOOKER_CORE_STANDARD_ANNUAL`, `LOOKER_CORE_ENTERPRISE_ANNUAL`, `LOOKER_CORE_EMBED_ANNUAL`, `LOOKER_CORE_NONPROD_STANDARD_ANNUAL`, `LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL`, `LOOKER_CORE_NONPROD_EMBED_ANNUAL`.
        /// </summary>
        [Input("platformEdition")]
        public Input<string>? PlatformEdition { get; set; }

        /// <summary>
        /// Whether private IP is enabled on the Looker instance.
        /// </summary>
        [Input("privateIpEnabled")]
        public Input<bool>? PrivateIpEnabled { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Information for Private Service Connect (PSC) setup for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Input("pscConfig")]
        public Input<Inputs.InstancePscConfigArgs>? PscConfig { get; set; }

        /// <summary>
        /// Whether Public Service Connect (PSC) is enabled on the Looker instance
        /// </summary>
        [Input("pscEnabled")]
        public Input<bool>? PscEnabled { get; set; }

        /// <summary>
        /// Whether public IP is enabled on the Looker instance.
        /// </summary>
        [Input("publicIpEnabled")]
        public Input<bool>? PublicIpEnabled { get; set; }

        /// <summary>
        /// The name of the Looker region of the instance.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Name of a reserved IP address range within the consumer network, to be used for
        /// private service access connection. User may or may not specify this in a request.
        /// </summary>
        [Input("reservedRange")]
        public Input<string>? ReservedRange { get; set; }

        /// <summary>
        /// Metadata about users for a Looker instance.
        /// These settings are only available when platform edition LOOKER_CORE_STANDARD is set.
        /// There are ten Standard and two Developer users included in the cost of the product.
        /// You can allocate additional Standard, Viewer, and Developer users for this instance.
        /// It is an optional step and can be modified later.
        /// With the Standard edition of Looker (Google Cloud core), you can provision up to 50
        /// total users, distributed across Viewer, Standard, and Developer.
        /// Structure is documented below.
        /// </summary>
        [Input("userMetadata")]
        public Input<Inputs.InstanceUserMetadataArgs>? UserMetadata { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Looker instance Admin settings.
        /// Structure is documented below.
        /// </summary>
        [Input("adminSettings")]
        public Input<Inputs.InstanceAdminSettingsGetArgs>? AdminSettings { get; set; }

        /// <summary>
        /// Network name in the consumer project in the format of: projects/{project}/global/networks/{network}
        /// Note that the consumer network may be in a different GCP project than the consumer
        /// project that is hosting the Looker Instance.
        /// </summary>
        [Input("consumerNetwork")]
        public Input<string>? ConsumerNetwork { get; set; }

        /// <summary>
        /// The time the instance was created in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Custom domain settings for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Input("customDomain")]
        public Input<Inputs.InstanceCustomDomainGetArgs>? CustomDomain { get; set; }

        /// <summary>
        /// Policy to determine if the cluster should be deleted forcefully.
        /// If setting deletion_policy = "FORCE", the Looker instance will be deleted regardless
        /// of its nested resources. If set to "DEFAULT", Looker instances that still have
        /// nested resources will return an error. Possible values: DEFAULT, FORCE
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// Maintenance denial period for this instance.
        /// You must allow at least 14 days of maintenance availability
        /// between any two deny maintenance periods.
        /// Structure is documented below.
        /// </summary>
        [Input("denyMaintenancePeriod")]
        public Input<Inputs.InstanceDenyMaintenancePeriodGetArgs>? DenyMaintenancePeriod { get; set; }

        /// <summary>
        /// Public Egress IP (IPv4).
        /// </summary>
        [Input("egressPublicIp")]
        public Input<string>? EgressPublicIp { get; set; }

        /// <summary>
        /// Looker instance encryption settings.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.InstanceEncryptionConfigGetArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// FIPS 140-2 Encryption enablement for Looker (Google Cloud Core).
        /// </summary>
        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        /// <summary>
        /// Private Ingress IP (IPv4).
        /// </summary>
        [Input("ingressPrivateIp")]
        public Input<string>? IngressPrivateIp { get; set; }

        /// <summary>
        /// Public Ingress IP (IPv4).
        /// </summary>
        [Input("ingressPublicIp")]
        public Input<string>? IngressPublicIp { get; set; }

        /// <summary>
        /// Looker instance URI which can be used to access the Looker Instance UI.
        /// </summary>
        [Input("lookerUri")]
        public Input<string>? LookerUri { get; set; }

        /// <summary>
        /// The Looker version that the instance is using.
        /// </summary>
        [Input("lookerVersion")]
        public Input<string>? LookerVersion { get; set; }

        /// <summary>
        /// Maintenance window for an instance.
        /// Maintenance of your instance takes place once a month, and will require
        /// your instance to be restarted during updates, which will temporarily
        /// disrupt service.
        /// Structure is documented below.
        /// </summary>
        [Input("maintenanceWindow")]
        public Input<Inputs.InstanceMaintenanceWindowGetArgs>? MaintenanceWindow { get; set; }

        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Looker Instance OAuth login settings.
        /// Structure is documented below.
        /// </summary>
        [Input("oauthConfig")]
        public Input<Inputs.InstanceOauthConfigGetArgs>? OauthConfig { get; set; }

        /// <summary>
        /// Platform editions for a Looker instance. Each edition maps to a set of instance features, like its size. Must be one of these values:
        /// - LOOKER_CORE_TRIAL: trial instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD: pay as you go standard instance (Currently Unavailable)
        /// - LOOKER_CORE_STANDARD_ANNUAL: subscription standard instance
        /// - LOOKER_CORE_ENTERPRISE_ANNUAL: subscription enterprise instance
        /// - LOOKER_CORE_EMBED_ANNUAL: subscription embed instance
        /// - LOOKER_CORE_NONPROD_STANDARD_ANNUAL: nonprod subscription standard instance
        /// - LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL: nonprod subscription enterprise instance
        /// - LOOKER_CORE_NONPROD_EMBED_ANNUAL: nonprod subscription embed instance
        /// Default value is `LOOKER_CORE_TRIAL`.
        /// Possible values are: `LOOKER_CORE_TRIAL`, `LOOKER_CORE_STANDARD`, `LOOKER_CORE_STANDARD_ANNUAL`, `LOOKER_CORE_ENTERPRISE_ANNUAL`, `LOOKER_CORE_EMBED_ANNUAL`, `LOOKER_CORE_NONPROD_STANDARD_ANNUAL`, `LOOKER_CORE_NONPROD_ENTERPRISE_ANNUAL`, `LOOKER_CORE_NONPROD_EMBED_ANNUAL`.
        /// </summary>
        [Input("platformEdition")]
        public Input<string>? PlatformEdition { get; set; }

        /// <summary>
        /// Whether private IP is enabled on the Looker instance.
        /// </summary>
        [Input("privateIpEnabled")]
        public Input<bool>? PrivateIpEnabled { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Information for Private Service Connect (PSC) setup for a Looker instance.
        /// Structure is documented below.
        /// </summary>
        [Input("pscConfig")]
        public Input<Inputs.InstancePscConfigGetArgs>? PscConfig { get; set; }

        /// <summary>
        /// Whether Public Service Connect (PSC) is enabled on the Looker instance
        /// </summary>
        [Input("pscEnabled")]
        public Input<bool>? PscEnabled { get; set; }

        /// <summary>
        /// Whether public IP is enabled on the Looker instance.
        /// </summary>
        [Input("publicIpEnabled")]
        public Input<bool>? PublicIpEnabled { get; set; }

        /// <summary>
        /// The name of the Looker region of the instance.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Name of a reserved IP address range within the consumer network, to be used for
        /// private service access connection. User may or may not specify this in a request.
        /// </summary>
        [Input("reservedRange")]
        public Input<string>? ReservedRange { get; set; }

        /// <summary>
        /// The time the instance was updated in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// Metadata about users for a Looker instance.
        /// These settings are only available when platform edition LOOKER_CORE_STANDARD is set.
        /// There are ten Standard and two Developer users included in the cost of the product.
        /// You can allocate additional Standard, Viewer, and Developer users for this instance.
        /// It is an optional step and can be modified later.
        /// With the Standard edition of Looker (Google Cloud core), you can provision up to 50
        /// total users, distributed across Viewer, Standard, and Developer.
        /// Structure is documented below.
        /// </summary>
        [Input("userMetadata")]
        public Input<Inputs.InstanceUserMetadataGetArgs>? UserMetadata { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
