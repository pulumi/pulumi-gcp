// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// RegionTargetTcpProxy can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy default projects/{{project}}/regions/{{region}}/targetTcpProxies/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy")]
    public partial class RegionTargetTcpProxy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A reference to the BackendService resource.
        /// </summary>
        [Output("backendService")]
        public Output<string> BackendService { get; private set; } = null!;

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
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Output("proxyBind")]
        public Output<bool> ProxyBind { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of proxy header to append before sending data to
        /// the backend.
        /// Default value is `NONE`.
        /// Possible values are `NONE` and `PROXY_V1`.
        /// </summary>
        [Output("proxyHeader")]
        public Output<string?> ProxyHeader { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Output("proxyId")]
        public Output<int> ProxyId { get; private set; } = null!;

        /// <summary>
        /// The Region in which the created target TCP proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;


        /// <summary>
        /// Create a RegionTargetTcpProxy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionTargetTcpProxy(string name, RegionTargetTcpProxyArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy", name, args ?? new RegionTargetTcpProxyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionTargetTcpProxy(string name, Input<string> id, RegionTargetTcpProxyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionTargetTcpProxy:RegionTargetTcpProxy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegionTargetTcpProxy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionTargetTcpProxy Get(string name, Input<string> id, RegionTargetTcpProxyState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionTargetTcpProxy(name, id, state, options);
        }
    }

    public sealed class RegionTargetTcpProxyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A reference to the BackendService resource.
        /// </summary>
        [Input("backendService", required: true)]
        public Input<string> BackendService { get; set; } = null!;

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Input("proxyBind")]
        public Input<bool>? ProxyBind { get; set; }

        /// <summary>
        /// Specifies the type of proxy header to append before sending data to
        /// the backend.
        /// Default value is `NONE`.
        /// Possible values are `NONE` and `PROXY_V1`.
        /// </summary>
        [Input("proxyHeader")]
        public Input<string>? ProxyHeader { get; set; }

        /// <summary>
        /// The Region in which the created target TCP proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RegionTargetTcpProxyArgs()
        {
        }
        public static new RegionTargetTcpProxyArgs Empty => new RegionTargetTcpProxyArgs();
    }

    public sealed class RegionTargetTcpProxyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A reference to the BackendService resource.
        /// </summary>
        [Input("backendService")]
        public Input<string>? BackendService { get; set; }

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
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Input("proxyBind")]
        public Input<bool>? ProxyBind { get; set; }

        /// <summary>
        /// Specifies the type of proxy header to append before sending data to
        /// the backend.
        /// Default value is `NONE`.
        /// Possible values are `NONE` and `PROXY_V1`.
        /// </summary>
        [Input("proxyHeader")]
        public Input<string>? ProxyHeader { get; set; }

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Input("proxyId")]
        public Input<int>? ProxyId { get; set; }

        /// <summary>
        /// The Region in which the created target TCP proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        public RegionTargetTcpProxyState()
        {
        }
        public static new RegionTargetTcpProxyState Empty => new RegionTargetTcpProxyState();
    }
}