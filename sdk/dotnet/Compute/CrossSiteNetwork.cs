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
    /// ## Example Usage
    /// 
    /// ### Compute Cross Site Network Basic
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
    ///     var example_cross_site_network = new Gcp.Compute.CrossSiteNetwork("example-cross-site-network", new()
    ///     {
    ///         Name = "test-cross-site-network",
    ///         Description = "Example cross site network",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CrossSiteNetwork can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/global/crossSiteNetworks/{{name}}`
    /// 
    /// * `{{project}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, CrossSiteNetwork can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/crossSiteNetwork:CrossSiteNetwork default projects/{{project}}/global/crossSiteNetworks/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/crossSiteNetwork:CrossSiteNetwork default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/crossSiteNetwork:CrossSiteNetwork default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/crossSiteNetwork:CrossSiteNetwork")]
    public partial class CrossSiteNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be
        /// 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which means the first
        /// character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
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
        /// Create a CrossSiteNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CrossSiteNetwork(string name, CrossSiteNetworkArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:compute/crossSiteNetwork:CrossSiteNetwork", name, args ?? new CrossSiteNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CrossSiteNetwork(string name, Input<string> id, CrossSiteNetworkState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/crossSiteNetwork:CrossSiteNetwork", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CrossSiteNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CrossSiteNetwork Get(string name, Input<string> id, CrossSiteNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new CrossSiteNetwork(name, id, state, options);
        }
    }

    public sealed class CrossSiteNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be
        /// 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which means the first
        /// character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public CrossSiteNetworkArgs()
        {
        }
        public static new CrossSiteNetworkArgs Empty => new CrossSiteNetworkArgs();
    }

    public sealed class CrossSiteNetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be
        /// 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which means the first
        /// character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public CrossSiteNetworkState()
        {
        }
        public static new CrossSiteNetworkState Empty => new CrossSiteNetworkState();
    }
}
