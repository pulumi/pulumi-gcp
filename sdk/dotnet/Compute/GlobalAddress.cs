// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// Represents a Global Address resource. Global addresses are used for
    /// HTTP(S) load balancing.
    /// 
    /// To get more information about GlobalAddress, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/v1/globalAddresses)
    /// * How-to Guides
    ///     * [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-external-ip-address)
    /// 
    /// ## Example Usage
    /// 
    /// ### Global Address Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Compute.GlobalAddress("default", new()
    ///     {
    ///         Name = "global-appserver-ip",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Global Address Private Services Connect
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "my-network-name",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var @default = new Gcp.Compute.GlobalAddress("default", new()
    ///     {
    ///         Name = "global-psconnect-ip",
    ///         AddressType = "INTERNAL",
    ///         Purpose = "PRIVATE_SERVICE_CONNECT",
    ///         Network = network.Id,
    ///         Address = "100.100.100.105",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GlobalAddress can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/global/addresses/{{name}}`
    /// 
    /// * `{{project}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, GlobalAddress can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/globalAddress:GlobalAddress default projects/{{project}}/global/addresses/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/globalAddress:GlobalAddress")]
    public partial class GlobalAddress : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IP address or beginning of the address range represented by this
        /// resource. This can be supplied as an input to reserve a specific
        /// address or omitted to allow GCP to choose a valid one for you.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The type of the address to reserve.
        /// * EXTERNAL indicates public/external single IP address.
        /// * INTERNAL indicates internal IP ranges belonging to some network.
        /// Default value is `EXTERNAL`.
        /// Possible values are: `EXTERNAL`, `INTERNAL`.
        /// </summary>
        [Output("addressType")]
        public Output<string?> AddressType { get; private set; } = null!;

        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Output("creationTimestamp")]
        public Output<string> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// The IP Version that will be used by this address. The default value is `IPV4`.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Output("ipVersion")]
        public Output<string?> IpVersion { get; private set; } = null!;

        /// <summary>
        /// The fingerprint used for optimistic locking of this resource.  Used
        /// internally during updates.
        /// </summary>
        [Output("labelFingerprint")]
        public Output<string> LabelFingerprint { get; private set; } = null!;

        /// <summary>
        /// Labels to apply to this address.  A list of key-&gt;value pairs.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035.  Specifically, the name must be 1-63 characters long and
        /// match the regular expression `a-z?` which means
        /// the first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The URL of the network in which to reserve the IP range. The IP range
        /// must be in RFC1918 space. The network cannot be deleted if there are
        /// any reserved IP ranges referring to it.
        /// This should only be set when using an Internal address.
        /// </summary>
        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        /// <summary>
        /// The prefix length of the IP range. If not present, it means the
        /// address field is a single IP address.
        /// This field is not applicable to addresses with addressType=INTERNAL
        /// when purpose=PRIVATE_SERVICE_CONNECT
        /// </summary>
        [Output("prefixLength")]
        public Output<int> PrefixLength { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The purpose of the resource. Possible values include:
        /// * VPC_PEERING - for peer networks
        /// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
        /// </summary>
        [Output("purpose")]
        public Output<string?> Purpose { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalAddress(string name, GlobalAddressArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:compute/globalAddress:GlobalAddress", name, args ?? new GlobalAddressArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalAddress(string name, Input<string> id, GlobalAddressState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/globalAddress:GlobalAddress", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GlobalAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalAddress Get(string name, Input<string> id, GlobalAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalAddress(name, id, state, options);
        }
    }

    public sealed class GlobalAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address or beginning of the address range represented by this
        /// resource. This can be supplied as an input to reserve a specific
        /// address or omitted to allow GCP to choose a valid one for you.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The type of the address to reserve.
        /// * EXTERNAL indicates public/external single IP address.
        /// * INTERNAL indicates internal IP ranges belonging to some network.
        /// Default value is `EXTERNAL`.
        /// Possible values are: `EXTERNAL`, `INTERNAL`.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The IP Version that will be used by this address. The default value is `IPV4`.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels to apply to this address.  A list of key-&gt;value pairs.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035.  Specifically, the name must be 1-63 characters long and
        /// match the regular expression `a-z?` which means
        /// the first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL of the network in which to reserve the IP range. The IP range
        /// must be in RFC1918 space. The network cannot be deleted if there are
        /// any reserved IP ranges referring to it.
        /// This should only be set when using an Internal address.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The prefix length of the IP range. If not present, it means the
        /// address field is a single IP address.
        /// This field is not applicable to addresses with addressType=INTERNAL
        /// when purpose=PRIVATE_SERVICE_CONNECT
        /// </summary>
        [Input("prefixLength")]
        public Input<int>? PrefixLength { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The purpose of the resource. Possible values include:
        /// * VPC_PEERING - for peer networks
        /// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
        /// </summary>
        [Input("purpose")]
        public Input<string>? Purpose { get; set; }

        public GlobalAddressArgs()
        {
        }
        public static new GlobalAddressArgs Empty => new GlobalAddressArgs();
    }

    public sealed class GlobalAddressState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address or beginning of the address range represented by this
        /// resource. This can be supplied as an input to reserve a specific
        /// address or omitted to allow GCP to choose a valid one for you.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The type of the address to reserve.
        /// * EXTERNAL indicates public/external single IP address.
        /// * INTERNAL indicates internal IP ranges belonging to some network.
        /// Default value is `EXTERNAL`.
        /// Possible values are: `EXTERNAL`, `INTERNAL`.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Input("creationTimestamp")]
        public Input<string>? CreationTimestamp { get; set; }

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The IP Version that will be used by this address. The default value is `IPV4`.
        /// Possible values are: `IPV4`, `IPV6`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The fingerprint used for optimistic locking of this resource.  Used
        /// internally during updates.
        /// </summary>
        [Input("labelFingerprint")]
        public Input<string>? LabelFingerprint { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels to apply to this address.  A list of key-&gt;value pairs.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035.  Specifically, the name must be 1-63 characters long and
        /// match the regular expression `a-z?` which means
        /// the first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL of the network in which to reserve the IP range. The IP range
        /// must be in RFC1918 space. The network cannot be deleted if there are
        /// any reserved IP ranges referring to it.
        /// This should only be set when using an Internal address.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The prefix length of the IP range. If not present, it means the
        /// address field is a single IP address.
        /// This field is not applicable to addresses with addressType=INTERNAL
        /// when purpose=PRIVATE_SERVICE_CONNECT
        /// </summary>
        [Input("prefixLength")]
        public Input<int>? PrefixLength { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The purpose of the resource. Possible values include:
        /// * VPC_PEERING - for peer networks
        /// * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
        /// </summary>
        [Input("purpose")]
        public Input<string>? Purpose { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        public GlobalAddressState()
        {
        }
        public static new GlobalAddressState Empty => new GlobalAddressState();
    }
}
