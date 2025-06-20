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
    /// Manages a billing account level logging bucket config. For more information see
    /// [the official logging documentation](https://cloud.google.com/logging/docs/) and
    /// [Storing Logs](https://cloud.google.com/logging/docs/storage).
    /// 
    /// &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are "_Default" and "_Required".
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
    ///     var @default = Gcp.Organizations.GetBillingAccount.Invoke(new()
    ///     {
    ///         BillingAccount = "00AA00-000AAA-00AA0A",
    ///     });
    /// 
    ///     var basic = new Gcp.Logging.BillingAccountBucketConfig("basic", new()
    ///     {
    ///         BillingAccount = @default.Apply(@default =&gt; @default.Apply(getBillingAccountResult =&gt; getBillingAccountResult.BillingAccount)),
    ///         Location = "global",
    ///         RetentionDays = 30,
    ///         BucketId = "_Default",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Create logging bucket with index configs
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the following format:
    /// 
    /// * `billingAccounts/{{billingAccount}}/locations/{{location}}/buckets/{{bucket_id}}`
    /// 
    /// When using the `pulumi import` command, this resource can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig default billingAccounts/{{billingAccount}}/locations/{{location}}/buckets/{{bucket_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig")]
    public partial class BillingAccountBucketConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The parent resource that contains the logging bucket.
        /// </summary>
        [Output("billingAccount")]
        public Output<string> BillingAccount { get; private set; } = null!;

        /// <summary>
        /// The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
        /// </summary>
        [Output("bucketId")]
        public Output<string> BucketId { get; private set; } = null!;

        /// <summary>
        /// The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK
        /// key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by
        /// updating the log bucket. Changing the KMS key is allowed.
        /// </summary>
        [Output("cmekSettings")]
        public Output<Outputs.BillingAccountBucketConfigCmekSettings?> CmekSettings { get; private set; } = null!;

        /// <summary>
        /// Describes this bucket.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A list of indexed fields and related configuration data. Structure is documented below.
        /// </summary>
        [Output("indexConfigs")]
        public Output<ImmutableArray<Outputs.BillingAccountBucketConfigIndexConfig>> IndexConfigs { get; private set; } = null!;

        /// <summary>
        /// The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
        /// </summary>
        [Output("lifecycleState")]
        public Output<string> LifecycleState { get; private set; } = null!;

        /// <summary>
        /// The location of the bucket.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id"
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
        /// </summary>
        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;


        /// <summary>
        /// Create a BillingAccountBucketConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BillingAccountBucketConfig(string name, BillingAccountBucketConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig", name, args ?? new BillingAccountBucketConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BillingAccountBucketConfig(string name, Input<string> id, BillingAccountBucketConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BillingAccountBucketConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BillingAccountBucketConfig Get(string name, Input<string> id, BillingAccountBucketConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new BillingAccountBucketConfig(name, id, state, options);
        }
    }

    public sealed class BillingAccountBucketConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parent resource that contains the logging bucket.
        /// </summary>
        [Input("billingAccount", required: true)]
        public Input<string> BillingAccount { get; set; } = null!;

        /// <summary>
        /// The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
        /// </summary>
        [Input("bucketId", required: true)]
        public Input<string> BucketId { get; set; } = null!;

        /// <summary>
        /// The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK
        /// key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by
        /// updating the log bucket. Changing the KMS key is allowed.
        /// </summary>
        [Input("cmekSettings")]
        public Input<Inputs.BillingAccountBucketConfigCmekSettingsArgs>? CmekSettings { get; set; }

        /// <summary>
        /// Describes this bucket.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("indexConfigs")]
        private InputList<Inputs.BillingAccountBucketConfigIndexConfigArgs>? _indexConfigs;

        /// <summary>
        /// A list of indexed fields and related configuration data. Structure is documented below.
        /// </summary>
        public InputList<Inputs.BillingAccountBucketConfigIndexConfigArgs> IndexConfigs
        {
            get => _indexConfigs ?? (_indexConfigs = new InputList<Inputs.BillingAccountBucketConfigIndexConfigArgs>());
            set => _indexConfigs = value;
        }

        /// <summary>
        /// The location of the bucket.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        public BillingAccountBucketConfigArgs()
        {
        }
        public static new BillingAccountBucketConfigArgs Empty => new BillingAccountBucketConfigArgs();
    }

    public sealed class BillingAccountBucketConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parent resource that contains the logging bucket.
        /// </summary>
        [Input("billingAccount")]
        public Input<string>? BillingAccount { get; set; }

        /// <summary>
        /// The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
        /// </summary>
        [Input("bucketId")]
        public Input<string>? BucketId { get; set; }

        /// <summary>
        /// The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK
        /// key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by
        /// updating the log bucket. Changing the KMS key is allowed.
        /// </summary>
        [Input("cmekSettings")]
        public Input<Inputs.BillingAccountBucketConfigCmekSettingsGetArgs>? CmekSettings { get; set; }

        /// <summary>
        /// Describes this bucket.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("indexConfigs")]
        private InputList<Inputs.BillingAccountBucketConfigIndexConfigGetArgs>? _indexConfigs;

        /// <summary>
        /// A list of indexed fields and related configuration data. Structure is documented below.
        /// </summary>
        public InputList<Inputs.BillingAccountBucketConfigIndexConfigGetArgs> IndexConfigs
        {
            get => _indexConfigs ?? (_indexConfigs = new InputList<Inputs.BillingAccountBucketConfigIndexConfigGetArgs>());
            set => _indexConfigs = value;
        }

        /// <summary>
        /// The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
        /// </summary>
        [Input("lifecycleState")]
        public Input<string>? LifecycleState { get; set; }

        /// <summary>
        /// The location of the bucket.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id"
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        public BillingAccountBucketConfigState()
        {
        }
        public static new BillingAccountBucketConfigState Empty => new BillingAccountBucketConfigState();
    }
}
