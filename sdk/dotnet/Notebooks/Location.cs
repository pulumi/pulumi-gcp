// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Notebooks
{
    /// <summary>
    /// &gt; **Warning:** `gcp.notebooks.Location` is deprecated and will be removed in a future major release. This resource is not functional.
    /// 
    /// Represents a Location resource.
    /// 
    /// ## Import
    /// 
    /// Location can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{name}}`
    /// 
    /// * `{{project}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Location can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:notebooks/location:Location default projects/{{project}}/locations/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:notebooks/location:Location default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:notebooks/location:Location default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:notebooks/location:Location")]
    public partial class Location : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the Location resource.
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
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;


        /// <summary>
        /// Create a Location resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Location(string name, LocationArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:notebooks/location:Location", name, args ?? new LocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Location(string name, Input<string> id, LocationState? state = null, CustomResourceOptions? options = null)
            : base("gcp:notebooks/location:Location", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Location resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Location Get(string name, Input<string> id, LocationState? state = null, CustomResourceOptions? options = null)
        {
            return new Location(name, id, state, options);
        }
    }

    public sealed class LocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Location resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public LocationArgs()
        {
        }
        public static new LocationArgs Empty => new LocationArgs();
    }

    public sealed class LocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Location resource.
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
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        public LocationState()
        {
        }
        public static new LocationState Empty => new LocationState();
    }
}
