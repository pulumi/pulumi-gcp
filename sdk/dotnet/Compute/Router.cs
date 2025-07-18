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
    /// Represents a Router resource.
    /// 
    /// To get more information about Router, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
    /// * How-to Guides
    ///     * [Google Cloud Router](https://cloud.google.com/router/docs/)
    /// 
    /// ## Example Usage
    /// 
    /// ### Router Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobarNetwork = new Gcp.Compute.Network("foobar", new()
    ///     {
    ///         Name = "my-network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var foobar = new Gcp.Compute.Router("foobar", new()
    ///     {
    ///         Name = "my-router",
    ///         Network = foobarNetwork.Name,
    ///         Bgp = new Gcp.Compute.Inputs.RouterBgpArgs
    ///         {
    ///             Asn = 64514,
    ///             AdvertiseMode = "CUSTOM",
    ///             AdvertisedGroups = new[]
    ///             {
    ///                 "ALL_SUBNETS",
    ///             },
    ///             AdvertisedIpRanges = new[]
    ///             {
    ///                 new Gcp.Compute.Inputs.RouterBgpAdvertisedIpRangeArgs
    ///                 {
    ///                     Range = "1.2.3.4",
    ///                 },
    ///                 new Gcp.Compute.Inputs.RouterBgpAdvertisedIpRangeArgs
    ///                 {
    ///                     Range = "6.7.0.0/16",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Compute Router Encrypted Interconnect
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
    ///         Name = "test-network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var encrypted_interconnect_router = new Gcp.Compute.Router("encrypted-interconnect-router", new()
    ///     {
    ///         Name = "test-router",
    ///         Network = network.Name,
    ///         EncryptedInterconnectRouter = true,
    ///         Bgp = new Gcp.Compute.Inputs.RouterBgpArgs
    ///         {
    ///             Asn = 64514,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Router can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/regions/{{region}}/routers/{{name}}`
    /// 
    /// * `{{project}}/{{region}}/{{name}}`
    /// 
    /// * `{{region}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Router can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/router:Router default projects/{{project}}/regions/{{region}}/routers/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/router:Router default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/router:Router default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/router:Router default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/router:Router")]
    public partial class Router : global::Pulumi.CustomResource
    {
        /// <summary>
        /// BGP information specific to this router.
        /// Structure is documented below.
        /// </summary>
        [Output("bgp")]
        public Output<Outputs.RouterBgp?> Bgp { get; private set; } = null!;

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
        /// Indicates if a router is dedicated for use with encrypted VLAN
        /// attachments (interconnectAttachments).
        /// </summary>
        [Output("encryptedInterconnectRouter")]
        public Output<bool?> EncryptedInterconnectRouter { get; private set; } = null!;

        /// <summary>
        /// Keys used for MD5 authentication.
        /// Structure is documented below.
        /// </summary>
        [Output("md5AuthenticationKeys")]
        public Output<Outputs.RouterMd5AuthenticationKeys?> Md5AuthenticationKeys { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. The name must be 1-63 characters long, and
        /// comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?`
        /// which means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A reference to the network to which this router belongs.
        /// </summary>
        [Output("network")]
        public Output<string> Network { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Region where the router resides.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;


        /// <summary>
        /// Create a Router resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Router(string name, RouterArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/router:Router", name, args ?? new RouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Router(string name, Input<string> id, RouterState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/router:Router", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Router resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Router Get(string name, Input<string> id, RouterState? state = null, CustomResourceOptions? options = null)
        {
            return new Router(name, id, state, options);
        }
    }

    public sealed class RouterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// BGP information specific to this router.
        /// Structure is documented below.
        /// </summary>
        [Input("bgp")]
        public Input<Inputs.RouterBgpArgs>? Bgp { get; set; }

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates if a router is dedicated for use with encrypted VLAN
        /// attachments (interconnectAttachments).
        /// </summary>
        [Input("encryptedInterconnectRouter")]
        public Input<bool>? EncryptedInterconnectRouter { get; set; }

        /// <summary>
        /// Keys used for MD5 authentication.
        /// Structure is documented below.
        /// </summary>
        [Input("md5AuthenticationKeys")]
        public Input<Inputs.RouterMd5AuthenticationKeysArgs>? Md5AuthenticationKeys { get; set; }

        /// <summary>
        /// Name of the resource. The name must be 1-63 characters long, and
        /// comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?`
        /// which means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A reference to the network to which this router belongs.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the router resides.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RouterArgs()
        {
        }
        public static new RouterArgs Empty => new RouterArgs();
    }

    public sealed class RouterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// BGP information specific to this router.
        /// Structure is documented below.
        /// </summary>
        [Input("bgp")]
        public Input<Inputs.RouterBgpGetArgs>? Bgp { get; set; }

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

        /// <summary>
        /// Indicates if a router is dedicated for use with encrypted VLAN
        /// attachments (interconnectAttachments).
        /// </summary>
        [Input("encryptedInterconnectRouter")]
        public Input<bool>? EncryptedInterconnectRouter { get; set; }

        /// <summary>
        /// Keys used for MD5 authentication.
        /// Structure is documented below.
        /// </summary>
        [Input("md5AuthenticationKeys")]
        public Input<Inputs.RouterMd5AuthenticationKeysGetArgs>? Md5AuthenticationKeys { get; set; }

        /// <summary>
        /// Name of the resource. The name must be 1-63 characters long, and
        /// comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?`
        /// which means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A reference to the network to which this router belongs.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the router resides.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        public RouterState()
        {
        }
        public static new RouterState Empty => new RouterState();
    }
}
