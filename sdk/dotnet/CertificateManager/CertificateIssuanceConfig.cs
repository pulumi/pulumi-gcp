// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateManager
{
    /// <summary>
    /// Certificate represents a HTTP-reachable backend for a Certificate.
    /// 
    /// To get more information about CertificateIssuanceConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.certificateIssuanceConfigs)
    /// * How-to Guides
    ///     * [Manage certificate issuance configs](https://cloud.google.com/certificate-manager/docs/issuance-configs)
    /// 
    /// ## Example Usage
    /// ### Certificate Manager Certificate Issuance Config
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pool = new Gcp.CertificateAuthority.CaPool("pool", new()
    ///     {
    ///         Location = "us-central1",
    ///         Tier = "ENTERPRISE",
    ///     });
    /// 
    ///     var caAuthority = new Gcp.CertificateAuthority.Authority("caAuthority", new()
    ///     {
    ///         Location = "us-central1",
    ///         Pool = pool.Name,
    ///         CertificateAuthorityId = "my-ca",
    ///         Config = new Gcp.CertificateAuthority.Inputs.AuthorityConfigArgs
    ///         {
    ///             SubjectConfig = new Gcp.CertificateAuthority.Inputs.AuthorityConfigSubjectConfigArgs
    ///             {
    ///                 Subject = new Gcp.CertificateAuthority.Inputs.AuthorityConfigSubjectConfigSubjectArgs
    ///                 {
    ///                     Organization = "HashiCorp",
    ///                     CommonName = "my-certificate-authority",
    ///                 },
    ///                 SubjectAltName = new Gcp.CertificateAuthority.Inputs.AuthorityConfigSubjectConfigSubjectAltNameArgs
    ///                 {
    ///                     DnsNames = new[]
    ///                     {
    ///                         "hashicorp.com",
    ///                     },
    ///                 },
    ///             },
    ///             X509Config = new Gcp.CertificateAuthority.Inputs.AuthorityConfigX509ConfigArgs
    ///             {
    ///                 CaOptions = new Gcp.CertificateAuthority.Inputs.AuthorityConfigX509ConfigCaOptionsArgs
    ///                 {
    ///                     IsCa = true,
    ///                 },
    ///                 KeyUsage = new Gcp.CertificateAuthority.Inputs.AuthorityConfigX509ConfigKeyUsageArgs
    ///                 {
    ///                     BaseKeyUsage = new Gcp.CertificateAuthority.Inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs
    ///                     {
    ///                         CertSign = true,
    ///                         CrlSign = true,
    ///                     },
    ///                     ExtendedKeyUsage = new Gcp.CertificateAuthority.Inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs
    ///                     {
    ///                         ServerAuth = true,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         KeySpec = new Gcp.CertificateAuthority.Inputs.AuthorityKeySpecArgs
    ///         {
    ///             Algorithm = "RSA_PKCS1_4096_SHA256",
    ///         },
    ///         DeletionProtection = false,
    ///         SkipGracePeriod = true,
    ///         IgnoreActiveCertificatesOnDeletion = true,
    ///     });
    /// 
    ///     var @default = new Gcp.CertificateManager.CertificateIssuanceConfig("default", new()
    ///     {
    ///         Description = "sample description for the certificate issuanceConfigs",
    ///         CertificateAuthorityConfig = new Gcp.CertificateManager.Inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs
    ///         {
    ///             CertificateAuthorityServiceConfig = new Gcp.CertificateManager.Inputs.CertificateIssuanceConfigCertificateAuthorityConfigCertificateAuthorityServiceConfigArgs
    ///             {
    ///                 CaPool = pool.Id,
    ///             },
    ///         },
    ///         Lifetime = "1814400s",
    ///         RotationWindowPercentage = 34,
    ///         KeyAlgorithm = "ECDSA_P256",
    ///         Labels = 
    ///         {
    ///             { "name", "wrench" },
    ///             { "count", "3" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             caAuthority,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CertificateIssuanceConfig can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig default projects/{{project}}/locations/{{location}}/certificateIssuanceConfigs/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig")]
    public partial class CertificateIssuanceConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
        /// Structure is documented below.
        /// </summary>
        [Output("certificateAuthorityConfig")]
        public Output<Outputs.CertificateIssuanceConfigCertificateAuthorityConfig> CertificateAuthorityConfig { get; private set; } = null!;

        /// <summary>
        /// The creation timestamp of a CertificateIssuanceConfig. Timestamp is in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds with up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// One or more paragraphs of text description of a CertificateIssuanceConfig.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Key algorithm to use when generating the private key.
        /// Possible values are: `RSA_2048`, `ECDSA_P256`.
        /// </summary>
        [Output("keyAlgorithm")]
        public Output<string> KeyAlgorithm { get; private set; } = null!;

        /// <summary>
        /// 'Set of label tags associated with the CertificateIssuanceConfig resource.
        /// An object containing a list of "key": value pairs. Example: { "name": "wrench", "count": "3" }.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Lifetime of issued certificates. A duration in seconds with up to nine fractional digits, ending with 's'.
        /// Example: "1814400s". Valid values are from 21 days (1814400s) to 30 days (2592000s)
        /// </summary>
        [Output("lifetime")]
        public Output<string> Lifetime { get; private set; } = null!;

        /// <summary>
        /// The Certificate Manager location. If not specified, "global" is used.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// A user-defined name of the certificate issuance config.
        /// CertificateIssuanceConfig names must be unique globally.
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
        /// It specifies the percentage of elapsed time of the certificate lifetime to wait before renewing the certificate.
        /// Must be a number between 1-99, inclusive.
        /// You must set the rotation window percentage in relation to the certificate lifetime so that certificate renewal occurs at least 7 days after
        /// the certificate has been issued and at least 7 days before it expires.
        /// </summary>
        [Output("rotationWindowPercentage")]
        public Output<int> RotationWindowPercentage { get; private set; } = null!;

        /// <summary>
        /// The last update timestamp of a CertificateIssuanceConfig. Timestamp is in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds with up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a CertificateIssuanceConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertificateIssuanceConfig(string name, CertificateIssuanceConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig", name, args ?? new CertificateIssuanceConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertificateIssuanceConfig(string name, Input<string> id, CertificateIssuanceConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:certificatemanager/certificateIssuanceConfig:CertificateIssuanceConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CertificateIssuanceConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertificateIssuanceConfig Get(string name, Input<string> id, CertificateIssuanceConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new CertificateIssuanceConfig(name, id, state, options);
        }
    }

    public sealed class CertificateIssuanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
        /// Structure is documented below.
        /// </summary>
        [Input("certificateAuthorityConfig", required: true)]
        public Input<Inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs> CertificateAuthorityConfig { get; set; } = null!;

        /// <summary>
        /// One or more paragraphs of text description of a CertificateIssuanceConfig.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Key algorithm to use when generating the private key.
        /// Possible values are: `RSA_2048`, `ECDSA_P256`.
        /// </summary>
        [Input("keyAlgorithm", required: true)]
        public Input<string> KeyAlgorithm { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// 'Set of label tags associated with the CertificateIssuanceConfig resource.
        /// An object containing a list of "key": value pairs. Example: { "name": "wrench", "count": "3" }.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Lifetime of issued certificates. A duration in seconds with up to nine fractional digits, ending with 's'.
        /// Example: "1814400s". Valid values are from 21 days (1814400s) to 30 days (2592000s)
        /// </summary>
        [Input("lifetime", required: true)]
        public Input<string> Lifetime { get; set; } = null!;

        /// <summary>
        /// The Certificate Manager location. If not specified, "global" is used.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A user-defined name of the certificate issuance config.
        /// CertificateIssuanceConfig names must be unique globally.
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
        /// It specifies the percentage of elapsed time of the certificate lifetime to wait before renewing the certificate.
        /// Must be a number between 1-99, inclusive.
        /// You must set the rotation window percentage in relation to the certificate lifetime so that certificate renewal occurs at least 7 days after
        /// the certificate has been issued and at least 7 days before it expires.
        /// </summary>
        [Input("rotationWindowPercentage", required: true)]
        public Input<int> RotationWindowPercentage { get; set; } = null!;

        public CertificateIssuanceConfigArgs()
        {
        }
        public static new CertificateIssuanceConfigArgs Empty => new CertificateIssuanceConfigArgs();
    }

    public sealed class CertificateIssuanceConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
        /// Structure is documented below.
        /// </summary>
        [Input("certificateAuthorityConfig")]
        public Input<Inputs.CertificateIssuanceConfigCertificateAuthorityConfigGetArgs>? CertificateAuthorityConfig { get; set; }

        /// <summary>
        /// The creation timestamp of a CertificateIssuanceConfig. Timestamp is in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds with up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// One or more paragraphs of text description of a CertificateIssuanceConfig.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Key algorithm to use when generating the private key.
        /// Possible values are: `RSA_2048`, `ECDSA_P256`.
        /// </summary>
        [Input("keyAlgorithm")]
        public Input<string>? KeyAlgorithm { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// 'Set of label tags associated with the CertificateIssuanceConfig resource.
        /// An object containing a list of "key": value pairs. Example: { "name": "wrench", "count": "3" }.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Lifetime of issued certificates. A duration in seconds with up to nine fractional digits, ending with 's'.
        /// Example: "1814400s". Valid values are from 21 days (1814400s) to 30 days (2592000s)
        /// </summary>
        [Input("lifetime")]
        public Input<string>? Lifetime { get; set; }

        /// <summary>
        /// The Certificate Manager location. If not specified, "global" is used.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A user-defined name of the certificate issuance config.
        /// CertificateIssuanceConfig names must be unique globally.
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
        /// It specifies the percentage of elapsed time of the certificate lifetime to wait before renewing the certificate.
        /// Must be a number between 1-99, inclusive.
        /// You must set the rotation window percentage in relation to the certificate lifetime so that certificate renewal occurs at least 7 days after
        /// the certificate has been issued and at least 7 days before it expires.
        /// </summary>
        [Input("rotationWindowPercentage")]
        public Input<int>? RotationWindowPercentage { get; set; }

        /// <summary>
        /// The last update timestamp of a CertificateIssuanceConfig. Timestamp is in RFC3339 UTC "Zulu" format,
        /// accurate to nanoseconds with up to nine fractional digits.
        /// Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public CertificateIssuanceConfigState()
        {
        }
        public static new CertificateIssuanceConfigState Empty => new CertificateIssuanceConfigState();
    }
}