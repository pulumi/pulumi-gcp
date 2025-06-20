// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Projects
{
    /// <summary>
    /// Sets up a usage export bucket for a particular project.  A usage export bucket
    /// is a pre-configured GCS bucket which is set up to receive daily and monthly
    /// reports of the GCE resources used.
    /// 
    /// For more information see the [Docs](https://cloud.google.com/compute/docs/usage-export)
    /// and for further details, the
    /// [API Documentation](https://cloud.google.com/compute/docs/reference/rest/beta/projects/setUsageExportBucket).
    /// 
    /// &gt; **Note:** You should specify only one of these per project.  If there are two or more
    /// they will fight over which bucket the reports should be stored in.  It is
    /// safe to have multiple resources with the same backing bucket.
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
    ///     var usageExport = new Gcp.Projects.UsageExportBucket("usage_export", new()
    ///     {
    ///         Project = "development-project",
    ///         BucketName = "usage-tracking-bucket",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A project's Usage Export Bucket can be imported using this format:
    /// 
    /// * `{{project_id}}`
    /// 
    /// When using the `pulumi import` command, NAME_HERE can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:projects/usageExportBucket:UsageExportBucket default {{project_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:projects/usageExportBucket:UsageExportBucket")]
    public partial class UsageExportBucket : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The bucket to store reports in.
        /// 
        /// - - -
        /// </summary>
        [Output("bucketName")]
        public Output<string> BucketName { get; private set; } = null!;

        /// <summary>
        /// A prefix for the reports, for instance, the project name.
        /// </summary>
        [Output("prefix")]
        public Output<string?> Prefix { get; private set; } = null!;

        /// <summary>
        /// The project to set the export bucket on. If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a UsageExportBucket resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UsageExportBucket(string name, UsageExportBucketArgs args, CustomResourceOptions? options = null)
            : base("gcp:projects/usageExportBucket:UsageExportBucket", name, args ?? new UsageExportBucketArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UsageExportBucket(string name, Input<string> id, UsageExportBucketState? state = null, CustomResourceOptions? options = null)
            : base("gcp:projects/usageExportBucket:UsageExportBucket", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UsageExportBucket resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UsageExportBucket Get(string name, Input<string> id, UsageExportBucketState? state = null, CustomResourceOptions? options = null)
        {
            return new UsageExportBucket(name, id, state, options);
        }
    }

    public sealed class UsageExportBucketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bucket to store reports in.
        /// 
        /// - - -
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// A prefix for the reports, for instance, the project name.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The project to set the export bucket on. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public UsageExportBucketArgs()
        {
        }
        public static new UsageExportBucketArgs Empty => new UsageExportBucketArgs();
    }

    public sealed class UsageExportBucketState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bucket to store reports in.
        /// 
        /// - - -
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        /// <summary>
        /// A prefix for the reports, for instance, the project name.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The project to set the export bucket on. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public UsageExportBucketState()
        {
        }
        public static new UsageExportBucketState Empty => new UsageExportBucketState();
    }
}
