// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging
{
    /// <summary>
    /// Manages a folder-level logging exclusion. For more information see:
    /// 
    /// * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.exclusions)
    /// * How-to Guides
    ///     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
    /// 
    /// &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.FolderSink`
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_folder = new Gcp.Organizations.Folder("my-folder", new()
    ///     {
    ///         DisplayName = "My folder",
    ///         Parent = "organizations/123456",
    ///     });
    /// 
    ///     var my_exclusion = new Gcp.Logging.FolderExclusion("my-exclusion", new()
    ///     {
    ///         Name = "my-instance-debug-exclusion",
    ///         Folder = my_folder.Name,
    ///         Description = "Exclude GCE instance debug logs",
    ///         Filter = "resource.type = gce_instance AND severity &lt;= DEBUG",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Folder-level logging exclusions can be imported using their URI, e.g.
    /// 
    /// * `folders/{{folder}}/exclusions/{{name}}`
    /// 
    /// When using the `pulumi import` command, folder-level logging exclusions can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:logging/folderExclusion:FolderExclusion default folders/{{folder}}/exclusions/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:logging/folderExclusion:FolderExclusion")]
    public partial class FolderExclusion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A human-readable description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether this exclusion rule should be disabled or not. This defaults to
        /// false.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
        /// write a filter.
        /// </summary>
        [Output("filter")]
        public Output<string> Filter { get; private set; } = null!;

        /// <summary>
        /// The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
        /// accepted.
        /// </summary>
        [Output("folder")]
        public Output<string> Folder { get; private set; } = null!;

        /// <summary>
        /// The name of the logging exclusion.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a FolderExclusion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FolderExclusion(string name, FolderExclusionArgs args, CustomResourceOptions? options = null)
            : base("gcp:logging/folderExclusion:FolderExclusion", name, args ?? new FolderExclusionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FolderExclusion(string name, Input<string> id, FolderExclusionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:logging/folderExclusion:FolderExclusion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FolderExclusion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FolderExclusion Get(string name, Input<string> id, FolderExclusionState? state = null, CustomResourceOptions? options = null)
        {
            return new FolderExclusion(name, id, state, options);
        }
    }

    public sealed class FolderExclusionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A human-readable description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether this exclusion rule should be disabled or not. This defaults to
        /// false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
        /// write a filter.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        /// <summary>
        /// The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
        /// accepted.
        /// </summary>
        [Input("folder", required: true)]
        public Input<string> Folder { get; set; } = null!;

        /// <summary>
        /// The name of the logging exclusion.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FolderExclusionArgs()
        {
        }
        public static new FolderExclusionArgs Empty => new FolderExclusionArgs();
    }

    public sealed class FolderExclusionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A human-readable description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether this exclusion rule should be disabled or not. This defaults to
        /// false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The filter to apply when excluding logs. Only log entries that match the filter are excluded.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
        /// write a filter.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The folder to be exported to the sink. Note that either [FOLDER_ID] or "folders/[FOLDER_ID]" is
        /// accepted.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The name of the logging exclusion.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FolderExclusionState()
        {
        }
        public static new FolderExclusionState Empty => new FolderExclusionState();
    }
}
