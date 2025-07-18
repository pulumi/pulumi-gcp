// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage
{
    /// <summary>
    /// A Google Cloud Storage Folder.
    /// 
    /// The Folder resource represents a folder in a Cloud Storage bucket with hierarchical namespace enabled
    /// 
    /// To get more information about Folder, see:
    /// 
    /// * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/folders)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/storage/docs/folders-overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Storage Folder Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bucket = new Gcp.Storage.Bucket("bucket", new()
    ///     {
    ///         Name = "my-bucket",
    ///         Location = "EU",
    ///         UniformBucketLevelAccess = true,
    ///         HierarchicalNamespace = new Gcp.Storage.Inputs.BucketHierarchicalNamespaceArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///     });
    /// 
    ///     var folder = new Gcp.Storage.Folder("folder", new()
    ///     {
    ///         Bucket = bucket.Name,
    ///         Name = "parent-folder/",
    ///     });
    /// 
    ///     var subfolder = new Gcp.Storage.Folder("subfolder", new()
    ///     {
    ///         Bucket = bucket.Name,
    ///         Name = folder.Name.Apply(name =&gt; $"{name}subfolder/"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Folder can be imported using any of these accepted formats:
    /// 
    /// * `{{bucket}}/folders/{{name}}`
    /// 
    /// * `{{bucket}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, Folder can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:storage/folder:Folder default {{bucket}}/folders/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:storage/folder:Folder default {{bucket}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:storage/folder:Folder")]
    public partial class Folder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket that contains the folder.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The timestamp at which this folder was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// If set to true, items within folder if any will be force destroyed.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// The metadata generation of the folder.
        /// </summary>
        [Output("metageneration")]
        public Output<string> Metageneration { get; private set; } = null!;

        /// <summary>
        /// The name of the folder expressed as a path. Must include
        /// trailing '/'. For example, `example_dir/example_dir2/`, `example@#/`, `a-b/d-f/`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// The timestamp at which this folder was most recently updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Folder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Folder(string name, FolderArgs args, CustomResourceOptions? options = null)
            : base("gcp:storage/folder:Folder", name, args ?? new FolderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Folder(string name, Input<string> id, FolderState? state = null, CustomResourceOptions? options = null)
            : base("gcp:storage/folder:Folder", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Folder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Folder Get(string name, Input<string> id, FolderState? state = null, CustomResourceOptions? options = null)
        {
            return new Folder(name, id, state, options);
        }
    }

    public sealed class FolderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket that contains the folder.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// If set to true, items within folder if any will be force destroyed.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The name of the folder expressed as a path. Must include
        /// trailing '/'. For example, `example_dir/example_dir2/`, `example@#/`, `a-b/d-f/`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FolderArgs()
        {
        }
        public static new FolderArgs Empty => new FolderArgs();
    }

    public sealed class FolderState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket that contains the folder.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The timestamp at which this folder was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// If set to true, items within folder if any will be force destroyed.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The metadata generation of the folder.
        /// </summary>
        [Input("metageneration")]
        public Input<string>? Metageneration { get; set; }

        /// <summary>
        /// The name of the folder expressed as a path. Must include
        /// trailing '/'. For example, `example_dir/example_dir2/`, `example@#/`, `a-b/d-f/`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// The timestamp at which this folder was most recently updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public FolderState()
        {
        }
        public static new FolderState Empty => new FolderState();
    }
}
