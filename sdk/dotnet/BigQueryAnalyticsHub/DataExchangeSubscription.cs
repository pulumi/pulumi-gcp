// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ### Bigquery Analyticshub Dataexchange Subscription Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var subscription = new Gcp.BigQueryAnalyticsHub.DataExchange("subscription", new()
    ///     {
    ///         Location = "us",
    ///         DataExchangeId = "my_test_dataexchange",
    ///         DisplayName = "my_test_dataexchange",
    ///         Description = "Test Data Exchange",
    ///         SharingEnvironmentConfig = new Gcp.BigQueryAnalyticsHub.Inputs.DataExchangeSharingEnvironmentConfigArgs
    ///         {
    ///             DcrExchangeConfig = null,
    ///         },
    ///     });
    /// 
    ///     var subscriptionDataset = new Gcp.BigQuery.Dataset("subscription", new()
    ///     {
    ///         DatasetId = "listing_src_dataset",
    ///         FriendlyName = "listing_src_dataset",
    ///         Description = "Dataset for Listing",
    ///         Location = "us",
    ///     });
    /// 
    ///     var subscriptionTable = new Gcp.BigQuery.Table("subscription", new()
    ///     {
    ///         DeletionProtection = false,
    ///         TableId = "listing_src_table",
    ///         DatasetId = subscriptionDataset.DatasetId,
    ///         Schema = @"[
    ///   {
    ///     ""name"": ""name"",
    ///     ""type"": ""STRING"",
    ///     ""mode"": ""NULLABLE""
    ///   },
    ///   {
    ///     ""name"": ""post_abbr"",
    ///     ""type"": ""STRING"",
    ///     ""mode"": ""NULLABLE""
    ///   },
    ///   {
    ///     ""name"": ""date"",
    ///     ""type"": ""DATE"",
    ///     ""mode"": ""NULLABLE""
    ///   }
    /// ]
    /// ",
    ///     });
    /// 
    ///     var subscriptionListing = new Gcp.BigQueryAnalyticsHub.Listing("subscription", new()
    ///     {
    ///         Location = "us",
    ///         DataExchangeId = subscription.DataExchangeId,
    ///         ListingId = "my_test_listing",
    ///         DisplayName = "my_test_listing",
    ///         Description = "Test Listing",
    ///         RestrictedExportConfig = new Gcp.BigQueryAnalyticsHub.Inputs.ListingRestrictedExportConfigArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///         BigqueryDataset = new Gcp.BigQueryAnalyticsHub.Inputs.ListingBigqueryDatasetArgs
    ///         {
    ///             Dataset = subscriptionDataset.Id,
    ///             SelectedResources = new[]
    ///             {
    ///                 new Gcp.BigQueryAnalyticsHub.Inputs.ListingBigqueryDatasetSelectedResourceArgs
    ///                 {
    ///                     Table = subscriptionTable.Id,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var subscriptionDataExchangeSubscription = new Gcp.BigQueryAnalyticsHub.DataExchangeSubscription("subscription", new()
    ///     {
    ///         Project = subscriptionDataset.Project,
    ///         Location = "us",
    ///         DataExchangeProject = subscription.Project,
    ///         DataExchangeLocation = subscription.Location,
    ///         DataExchangeId = subscription.DataExchangeId,
    ///         SubscriptionId = "my_subscription_id",
    ///         SubscriberContact = "testuser@example.com",
    ///         DestinationDataset = new Gcp.BigQueryAnalyticsHub.Inputs.DataExchangeSubscriptionDestinationDatasetArgs
    ///         {
    ///             Location = "us",
    ///             DatasetReference = new Gcp.BigQueryAnalyticsHub.Inputs.DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs
    ///             {
    ///                 ProjectId = subscriptionDataset.Project,
    ///                 DatasetId = "subscribed_dest_dataset",
    ///             },
    ///             FriendlyName = "Subscribed Destination Dataset",
    ///             Description = "Destination dataset for subscription",
    ///             Labels = 
    ///             {
    ///                 { "environment", "development" },
    ///                 { "owner", "team-a" },
    ///             },
    ///         },
    ///         RefreshPolicy = "ON_READ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DataExchangeSubscription can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/subscriptions/{{subscription_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{subscription_id}}`
    /// 
    /// * `{{location}}/{{subscription_id}}`
    /// 
    /// When using the `pulumi import` command, DataExchangeSubscription can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription default projects/{{project}}/locations/{{location}}/subscriptions/{{subscription_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription default {{project}}/{{location}}/{{subscription_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription default {{location}}/{{subscription_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription")]
    public partial class DataExchangeSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp when the subscription was created.
        /// </summary>
        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// Output only. Resource name of the source Data Exchange. e.g. projects/123/locations/us/dataExchanges/456
        /// </summary>
        [Output("dataExchange")]
        public Output<string> DataExchange { get; private set; } = null!;

        /// <summary>
        /// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
        /// </summary>
        [Output("dataExchangeId")]
        public Output<string> DataExchangeId { get; private set; } = null!;

        /// <summary>
        /// The name of the location of the Data Exchange.
        /// </summary>
        [Output("dataExchangeLocation")]
        public Output<string> DataExchangeLocation { get; private set; } = null!;

        /// <summary>
        /// The ID of the Google Cloud project where the Data Exchange is located.
        /// </summary>
        [Output("dataExchangeProject")]
        public Output<string> DataExchangeProject { get; private set; } = null!;

        /// <summary>
        /// BigQuery destination dataset to create for the subscriber.
        /// Structure is documented below.
        /// </summary>
        [Output("destinationDataset")]
        public Output<Outputs.DataExchangeSubscriptionDestinationDataset?> DestinationDataset { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the subscription was last modified.
        /// </summary>
        [Output("lastModifyTime")]
        public Output<string> LastModifyTime { get; private set; } = null!;

        /// <summary>
        /// Output only. Map of listing resource names to associated linked resource,
        /// e.g. projects/123/locations/us/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
        /// For Data Exchange subscriptions, this map may contain multiple entries if the Data Exchange has multiple listings.
        /// Structure is documented below.
        /// </summary>
        [Output("linkedDatasetMaps")]
        public Output<ImmutableArray<Outputs.DataExchangeSubscriptionLinkedDatasetMap>> LinkedDatasetMaps { get; private set; } = null!;

        /// <summary>
        /// Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
        /// Structure is documented below.
        /// </summary>
        [Output("linkedResources")]
        public Output<ImmutableArray<Outputs.DataExchangeSubscriptionLinkedResource>> LinkedResources { get; private set; } = null!;

        /// <summary>
        /// The geographic location where the Subscription (and its linked dataset) should reside.
        /// This is the subscriber's desired location for the created resources.
        /// See https://cloud.google.com/bigquery/docs/locations for supported locations.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Output only. By default, false. If true, the Subscriber agreed to the email sharing mandate that is enabled for DataExchange/Listing.
        /// </summary>
        [Output("logLinkedDatasetQueryUserEmail")]
        public Output<bool> LogLinkedDatasetQueryUserEmail { get; private set; } = null!;

        /// <summary>
        /// The resource name of the subscription. e.g. "projects/myproject/locations/us/subscriptions/123"
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Display name of the project of this subscription.
        /// </summary>
        [Output("organizationDisplayName")]
        public Output<string> OrganizationDisplayName { get; private set; } = null!;

        /// <summary>
        /// Organization of the project this subscription belongs to.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        [Output("refreshPolicy")]
        public Output<string?> RefreshPolicy { get; private set; } = null!;

        /// <summary>
        /// Listing shared asset type.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;

        /// <summary>
        /// Current state of the subscription.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Email of the subscriber.
        /// </summary>
        [Output("subscriberContact")]
        public Output<string?> SubscriberContact { get; private set; } = null!;

        /// <summary>
        /// Name of the subscription to create.
        /// </summary>
        [Output("subscriptionId")]
        public Output<string> SubscriptionId { get; private set; } = null!;


        /// <summary>
        /// Create a DataExchangeSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataExchangeSubscription(string name, DataExchangeSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription", name, args ?? new DataExchangeSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataExchangeSubscription(string name, Input<string> id, DataExchangeSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:bigqueryanalyticshub/dataExchangeSubscription:DataExchangeSubscription", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataExchangeSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataExchangeSubscription Get(string name, Input<string> id, DataExchangeSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new DataExchangeSubscription(name, id, state, options);
        }
    }

    public sealed class DataExchangeSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
        /// </summary>
        [Input("dataExchangeId", required: true)]
        public Input<string> DataExchangeId { get; set; } = null!;

        /// <summary>
        /// The name of the location of the Data Exchange.
        /// </summary>
        [Input("dataExchangeLocation", required: true)]
        public Input<string> DataExchangeLocation { get; set; } = null!;

        /// <summary>
        /// The ID of the Google Cloud project where the Data Exchange is located.
        /// </summary>
        [Input("dataExchangeProject", required: true)]
        public Input<string> DataExchangeProject { get; set; } = null!;

        /// <summary>
        /// BigQuery destination dataset to create for the subscriber.
        /// Structure is documented below.
        /// </summary>
        [Input("destinationDataset")]
        public Input<Inputs.DataExchangeSubscriptionDestinationDatasetArgs>? DestinationDataset { get; set; }

        /// <summary>
        /// The geographic location where the Subscription (and its linked dataset) should reside.
        /// This is the subscriber's desired location for the created resources.
        /// See https://cloud.google.com/bigquery/docs/locations for supported locations.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("refreshPolicy")]
        public Input<string>? RefreshPolicy { get; set; }

        /// <summary>
        /// Email of the subscriber.
        /// </summary>
        [Input("subscriberContact")]
        public Input<string>? SubscriberContact { get; set; }

        /// <summary>
        /// Name of the subscription to create.
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        public DataExchangeSubscriptionArgs()
        {
        }
        public static new DataExchangeSubscriptionArgs Empty => new DataExchangeSubscriptionArgs();
    }

    public sealed class DataExchangeSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp when the subscription was created.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// Output only. Resource name of the source Data Exchange. e.g. projects/123/locations/us/dataExchanges/456
        /// </summary>
        [Input("dataExchange")]
        public Input<string>? DataExchange { get; set; }

        /// <summary>
        /// The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
        /// </summary>
        [Input("dataExchangeId")]
        public Input<string>? DataExchangeId { get; set; }

        /// <summary>
        /// The name of the location of the Data Exchange.
        /// </summary>
        [Input("dataExchangeLocation")]
        public Input<string>? DataExchangeLocation { get; set; }

        /// <summary>
        /// The ID of the Google Cloud project where the Data Exchange is located.
        /// </summary>
        [Input("dataExchangeProject")]
        public Input<string>? DataExchangeProject { get; set; }

        /// <summary>
        /// BigQuery destination dataset to create for the subscriber.
        /// Structure is documented below.
        /// </summary>
        [Input("destinationDataset")]
        public Input<Inputs.DataExchangeSubscriptionDestinationDatasetGetArgs>? DestinationDataset { get; set; }

        /// <summary>
        /// Timestamp when the subscription was last modified.
        /// </summary>
        [Input("lastModifyTime")]
        public Input<string>? LastModifyTime { get; set; }

        [Input("linkedDatasetMaps")]
        private InputList<Inputs.DataExchangeSubscriptionLinkedDatasetMapGetArgs>? _linkedDatasetMaps;

        /// <summary>
        /// Output only. Map of listing resource names to associated linked resource,
        /// e.g. projects/123/locations/us/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
        /// For Data Exchange subscriptions, this map may contain multiple entries if the Data Exchange has multiple listings.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataExchangeSubscriptionLinkedDatasetMapGetArgs> LinkedDatasetMaps
        {
            get => _linkedDatasetMaps ?? (_linkedDatasetMaps = new InputList<Inputs.DataExchangeSubscriptionLinkedDatasetMapGetArgs>());
            set => _linkedDatasetMaps = value;
        }

        [Input("linkedResources")]
        private InputList<Inputs.DataExchangeSubscriptionLinkedResourceGetArgs>? _linkedResources;

        /// <summary>
        /// Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataExchangeSubscriptionLinkedResourceGetArgs> LinkedResources
        {
            get => _linkedResources ?? (_linkedResources = new InputList<Inputs.DataExchangeSubscriptionLinkedResourceGetArgs>());
            set => _linkedResources = value;
        }

        /// <summary>
        /// The geographic location where the Subscription (and its linked dataset) should reside.
        /// This is the subscriber's desired location for the created resources.
        /// See https://cloud.google.com/bigquery/docs/locations for supported locations.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Output only. By default, false. If true, the Subscriber agreed to the email sharing mandate that is enabled for DataExchange/Listing.
        /// </summary>
        [Input("logLinkedDatasetQueryUserEmail")]
        public Input<bool>? LogLinkedDatasetQueryUserEmail { get; set; }

        /// <summary>
        /// The resource name of the subscription. e.g. "projects/myproject/locations/us/subscriptions/123"
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Display name of the project of this subscription.
        /// </summary>
        [Input("organizationDisplayName")]
        public Input<string>? OrganizationDisplayName { get; set; }

        /// <summary>
        /// Organization of the project this subscription belongs to.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("refreshPolicy")]
        public Input<string>? RefreshPolicy { get; set; }

        /// <summary>
        /// Listing shared asset type.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Current state of the subscription.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Email of the subscriber.
        /// </summary>
        [Input("subscriberContact")]
        public Input<string>? SubscriberContact { get; set; }

        /// <summary>
        /// Name of the subscription to create.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public DataExchangeSubscriptionState()
        {
        }
        public static new DataExchangeSubscriptionState Empty => new DataExchangeSubscriptionState();
    }
}
