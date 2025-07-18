// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring
{
    /// <summary>
    /// A Google Stackdriver dashboard. Dashboards define the content and layout of pages in the Stackdriver web application.
    /// 
    /// To get more information about Dashboards, see:
    /// 
    /// * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/monitoring/dashboards)
    /// 
    /// ## Example Usage
    /// 
    /// ### Monitoring Dashboard Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dashboard = new Gcp.Monitoring.Dashboard("dashboard", new()
    ///     {
    ///         DashboardJson = @"{
    ///   ""displayName"": ""Demo Dashboard"",
    ///   ""gridLayout"": {
    ///     ""widgets"": [
    ///       {
    ///         ""blank"": {}
    ///       }
    ///     ]
    ///   }
    /// }
    /// 
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Monitoring Dashboard GridLayout
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dashboard = new Gcp.Monitoring.Dashboard("dashboard", new()
    ///     {
    ///         DashboardJson = @"{
    ///   ""displayName"": ""Grid Layout Example"",
    ///   ""gridLayout"": {
    ///     ""columns"": ""2"",
    ///     ""widgets"": [
    ///       {
    ///         ""title"": ""Widget 1"",
    ///         ""xyChart"": {
    ///           ""dataSets"": [{
    ///             ""timeSeriesQuery"": {
    ///               ""timeSeriesFilter"": {
    ///                 ""filter"": ""metric.type=\""agent.googleapis.com/nginx/connections/accepted_count\"""",
    ///                 ""aggregation"": {
    ///                   ""perSeriesAligner"": ""ALIGN_RATE""
    ///                 }
    ///               },
    ///               ""unitOverride"": ""1""
    ///             },
    ///             ""plotType"": ""LINE""
    ///           }],
    ///           ""timeshiftDuration"": ""0s"",
    ///           ""yAxis"": {
    ///             ""label"": ""y1Axis"",
    ///             ""scale"": ""LINEAR""
    ///           }
    ///         }
    ///       },
    ///       {
    ///         ""text"": {
    ///           ""content"": ""Widget 2"",
    ///           ""format"": ""MARKDOWN""
    ///         }
    ///       },
    ///       {
    ///         ""title"": ""Widget 3"",
    ///         ""xyChart"": {
    ///           ""dataSets"": [{
    ///             ""timeSeriesQuery"": {
    ///               ""timeSeriesFilter"": {
    ///                 ""filter"": ""metric.type=\""agent.googleapis.com/nginx/connections/accepted_count\"""",
    ///                 ""aggregation"": {
    ///                   ""perSeriesAligner"": ""ALIGN_RATE""
    ///                 }
    ///               },
    ///               ""unitOverride"": ""1""
    ///             },
    ///             ""plotType"": ""STACKED_BAR""
    ///           }],
    ///           ""timeshiftDuration"": ""0s"",
    ///           ""yAxis"": {
    ///             ""label"": ""y1Axis"",
    ///             ""scale"": ""LINEAR""
    ///           }
    ///         }
    ///       }
    ///     ]
    ///   }
    /// }
    /// 
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Dashboard can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/dashboards/{{dashboard_id}}`
    /// 
    /// * `{{dashboard_id}}`
    /// 
    /// When using the `pulumi import` command, Dashboard can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:monitoring/dashboard:Dashboard default projects/{{project}}/dashboards/{{dashboard_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:monitoring/dashboard:Dashboard default {{dashboard_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:monitoring/dashboard:Dashboard")]
    public partial class Dashboard : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The JSON representation of a dashboard, following the format at
        /// https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
        /// </summary>
        [Output("dashboardJson")]
        public Output<string> DashboardJson { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a Dashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dashboard(string name, DashboardArgs args, CustomResourceOptions? options = null)
            : base("gcp:monitoring/dashboard:Dashboard", name, args ?? new DashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dashboard(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
            : base("gcp:monitoring/dashboard:Dashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dashboard Get(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new Dashboard(name, id, state, options);
        }
    }

    public sealed class DashboardArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON representation of a dashboard, following the format at
        /// https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
        /// </summary>
        [Input("dashboardJson", required: true)]
        public Input<string> DashboardJson { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public DashboardArgs()
        {
        }
        public static new DashboardArgs Empty => new DashboardArgs();
    }

    public sealed class DashboardState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON representation of a dashboard, following the format at
        /// https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
        /// </summary>
        [Input("dashboardJson")]
        public Input<string>? DashboardJson { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public DashboardState()
        {
        }
        public static new DashboardState Empty => new DashboardState();
    }
}
