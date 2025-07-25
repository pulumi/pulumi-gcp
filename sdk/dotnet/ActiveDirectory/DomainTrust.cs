// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ActiveDirectory
{
    /// <summary>
    /// Adds a trust between Active Directory domains
    /// 
    /// To get more information about DomainTrust, see:
    /// 
    /// * [API documentation](https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains/attachTrust)
    /// * How-to Guides
    ///     * [Active Directory Trust](https://cloud.google.com/managed-microsoft-ad/docs/create-one-way-trust)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// DomainTrust can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/global/domains/{{domain}}/{{target_domain_name}}`
    /// 
    /// * `{{project}}/{{domain}}/{{target_domain_name}}`
    /// 
    /// * `{{domain}}/{{target_domain_name}}`
    /// 
    /// When using the `pulumi import` command, DomainTrust can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default projects/{{project}}/locations/global/domains/{{domain}}/{{target_domain_name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default {{project}}/{{domain}}/{{target_domain_name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default {{domain}}/{{target_domain_name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:activedirectory/domainTrust:DomainTrust")]
    public partial class DomainTrust : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions
        /// of https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
        /// </summary>
        [Output("selectiveAuthentication")]
        public Output<bool?> SelectiveAuthentication { get; private set; } = null!;

        /// <summary>
        /// The target DNS server IP addresses which can resolve the remote domain involved in the trust.
        /// </summary>
        [Output("targetDnsIpAddresses")]
        public Output<ImmutableArray<string>> TargetDnsIpAddresses { get; private set; } = null!;

        /// <summary>
        /// The fully qualified target domain name which will be in trust with the current domain.
        /// </summary>
        [Output("targetDomainName")]
        public Output<string> TargetDomainName { get; private set; } = null!;

        /// <summary>
        /// The trust direction, which decides if the current domain is trusted, trusting, or both.
        /// Possible values are: `INBOUND`, `OUTBOUND`, `BIDIRECTIONAL`.
        /// </summary>
        [Output("trustDirection")]
        public Output<string> TrustDirection { get; private set; } = null!;

        /// <summary>
        /// The trust secret used for the handshake with the target domain. This will not be stored.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("trustHandshakeSecret")]
        public Output<string> TrustHandshakeSecret { get; private set; } = null!;

        /// <summary>
        /// The type of trust represented by the trust resource.
        /// Possible values are: `FOREST`, `EXTERNAL`.
        /// </summary>
        [Output("trustType")]
        public Output<string> TrustType { get; private set; } = null!;


        /// <summary>
        /// Create a DomainTrust resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainTrust(string name, DomainTrustArgs args, CustomResourceOptions? options = null)
            : base("gcp:activedirectory/domainTrust:DomainTrust", name, args ?? new DomainTrustArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainTrust(string name, Input<string> id, DomainTrustState? state = null, CustomResourceOptions? options = null)
            : base("gcp:activedirectory/domainTrust:DomainTrust", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "trustHandshakeSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DomainTrust resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainTrust Get(string name, Input<string> id, DomainTrustState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainTrust(name, id, state, options);
        }
    }

    public sealed class DomainTrustArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions
        /// of https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
        /// </summary>
        [Input("selectiveAuthentication")]
        public Input<bool>? SelectiveAuthentication { get; set; }

        [Input("targetDnsIpAddresses", required: true)]
        private InputList<string>? _targetDnsIpAddresses;

        /// <summary>
        /// The target DNS server IP addresses which can resolve the remote domain involved in the trust.
        /// </summary>
        public InputList<string> TargetDnsIpAddresses
        {
            get => _targetDnsIpAddresses ?? (_targetDnsIpAddresses = new InputList<string>());
            set => _targetDnsIpAddresses = value;
        }

        /// <summary>
        /// The fully qualified target domain name which will be in trust with the current domain.
        /// </summary>
        [Input("targetDomainName", required: true)]
        public Input<string> TargetDomainName { get; set; } = null!;

        /// <summary>
        /// The trust direction, which decides if the current domain is trusted, trusting, or both.
        /// Possible values are: `INBOUND`, `OUTBOUND`, `BIDIRECTIONAL`.
        /// </summary>
        [Input("trustDirection", required: true)]
        public Input<string> TrustDirection { get; set; } = null!;

        [Input("trustHandshakeSecret", required: true)]
        private Input<string>? _trustHandshakeSecret;

        /// <summary>
        /// The trust secret used for the handshake with the target domain. This will not be stored.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? TrustHandshakeSecret
        {
            get => _trustHandshakeSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _trustHandshakeSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The type of trust represented by the trust resource.
        /// Possible values are: `FOREST`, `EXTERNAL`.
        /// </summary>
        [Input("trustType", required: true)]
        public Input<string> TrustType { get; set; } = null!;

        public DomainTrustArgs()
        {
        }
        public static new DomainTrustArgs Empty => new DomainTrustArgs();
    }

    public sealed class DomainTrustState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions
        /// of https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
        /// </summary>
        [Input("selectiveAuthentication")]
        public Input<bool>? SelectiveAuthentication { get; set; }

        [Input("targetDnsIpAddresses")]
        private InputList<string>? _targetDnsIpAddresses;

        /// <summary>
        /// The target DNS server IP addresses which can resolve the remote domain involved in the trust.
        /// </summary>
        public InputList<string> TargetDnsIpAddresses
        {
            get => _targetDnsIpAddresses ?? (_targetDnsIpAddresses = new InputList<string>());
            set => _targetDnsIpAddresses = value;
        }

        /// <summary>
        /// The fully qualified target domain name which will be in trust with the current domain.
        /// </summary>
        [Input("targetDomainName")]
        public Input<string>? TargetDomainName { get; set; }

        /// <summary>
        /// The trust direction, which decides if the current domain is trusted, trusting, or both.
        /// Possible values are: `INBOUND`, `OUTBOUND`, `BIDIRECTIONAL`.
        /// </summary>
        [Input("trustDirection")]
        public Input<string>? TrustDirection { get; set; }

        [Input("trustHandshakeSecret")]
        private Input<string>? _trustHandshakeSecret;

        /// <summary>
        /// The trust secret used for the handshake with the target domain. This will not be stored.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? TrustHandshakeSecret
        {
            get => _trustHandshakeSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _trustHandshakeSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The type of trust represented by the trust resource.
        /// Possible values are: `FOREST`, `EXTERNAL`.
        /// </summary>
        [Input("trustType")]
        public Input<string>? TrustType { get; set; }

        public DomainTrustState()
        {
        }
        public static new DomainTrustState Empty => new DomainTrustState();
    }
}
