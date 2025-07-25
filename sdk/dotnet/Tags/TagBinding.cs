// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tags
{
    /// <summary>
    /// A TagBinding represents a connection between a TagValue and a cloud resource (currently project, folder, or organization). Once a TagBinding is created, the TagValue is applied to all the descendants of the cloud resource.
    /// 
    /// To get more information about TagBinding, see:
    /// 
    /// * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagBindings)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
    /// 
    /// ## Example Usage
    /// 
    /// ### Tag Binding Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = new Gcp.Organizations.Project("project", new()
    ///     {
    ///         ProjectId = "project_id",
    ///         Name = "project_id",
    ///         OrgId = "123456789",
    ///         DeletionPolicy = "DELETE",
    ///     });
    /// 
    ///     var key = new Gcp.Tags.TagKey("key", new()
    ///     {
    ///         Parent = "organizations/123456789",
    ///         ShortName = "keyname",
    ///         Description = "For keyname resources.",
    ///     });
    /// 
    ///     var @value = new Gcp.Tags.TagValue("value", new()
    ///     {
    ///         Parent = key.Id,
    ///         ShortName = "valuename",
    ///         Description = "For valuename resources.",
    ///     });
    /// 
    ///     var binding = new Gcp.Tags.TagBinding("binding", new()
    ///     {
    ///         Parent = project.Number.Apply(number =&gt; $"//cloudresourcemanager.googleapis.com/projects/{number}"),
    ///         TagValue = @value.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// TagBinding can be imported using any of these accepted formats:
    /// 
    /// * `tagBindings/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, TagBinding can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:tags/tagBinding:TagBinding default tagBindings/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:tags/tagBinding:TagBinding default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:tags/tagBinding:TagBinding")]
    public partial class TagBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// The TagValue of the TagBinding. Must be of the form tagValues/456.
        /// </summary>
        [Output("tagValue")]
        public Output<string> TagValue { get; private set; } = null!;


        /// <summary>
        /// Create a TagBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagBinding(string name, TagBindingArgs args, CustomResourceOptions? options = null)
            : base("gcp:tags/tagBinding:TagBinding", name, args ?? new TagBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagBinding(string name, Input<string> id, TagBindingState? state = null, CustomResourceOptions? options = null)
            : base("gcp:tags/tagBinding:TagBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagBinding Get(string name, Input<string> id, TagBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new TagBinding(name, id, state, options);
        }
    }

    public sealed class TagBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        /// <summary>
        /// The TagValue of the TagBinding. Must be of the form tagValues/456.
        /// </summary>
        [Input("tagValue", required: true)]
        public Input<string> TagValue { get; set; } = null!;

        public TagBindingArgs()
        {
        }
        public static new TagBindingArgs Empty => new TagBindingArgs();
    }

    public sealed class TagBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The generated id for the TagBinding. This is a string of the form: `tagBindings/{full-resource-name}/{tag-value-name}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// The TagValue of the TagBinding. Must be of the form tagValues/456.
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public TagBindingState()
        {
        }
        public static new TagBindingState Empty => new TagBindingState();
    }
}
