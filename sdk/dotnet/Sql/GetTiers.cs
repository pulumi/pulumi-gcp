// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql
{
    public static class GetTiers
    {
        /// <summary>
        /// Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
        /// [official documentation](https://cloud.google.com/sql/)
        /// and
        /// [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
        /// 
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
        ///     var tiers = Gcp.Sql.GetTiers.Invoke(new()
        ///     {
        ///         Project = "sample-project",
        ///     });
        /// 
        ///     var allAvailableTiers = .Select(v =&gt; 
        ///     {
        ///         return v.Tier;
        ///     }).ToList();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["avaialbleTiers"] = allAvailableTiers,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetTiersResult> InvokeAsync(GetTiersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTiersResult>("gcp:sql/getTiers:getTiers", args ?? new GetTiersArgs(), options.WithDefaults());

        /// <summary>
        /// Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
        /// [official documentation](https://cloud.google.com/sql/)
        /// and
        /// [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
        /// 
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
        ///     var tiers = Gcp.Sql.GetTiers.Invoke(new()
        ///     {
        ///         Project = "sample-project",
        ///     });
        /// 
        ///     var allAvailableTiers = .Select(v =&gt; 
        ///     {
        ///         return v.Tier;
        ///     }).ToList();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["avaialbleTiers"] = allAvailableTiers,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTiersResult> Invoke(GetTiersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTiersResult>("gcp:sql/getTiers:getTiers", args ?? new GetTiersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get all available machine types (tiers) for a project, for example, db-custom-1-3840. For more information see the
        /// [official documentation](https://cloud.google.com/sql/)
        /// and
        /// [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/tiers/list).
        /// 
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
        ///     var tiers = Gcp.Sql.GetTiers.Invoke(new()
        ///     {
        ///         Project = "sample-project",
        ///     });
        /// 
        ///     var allAvailableTiers = .Select(v =&gt; 
        ///     {
        ///         return v.Tier;
        ///     }).ToList();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["avaialbleTiers"] = allAvailableTiers,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetTiersResult> Invoke(GetTiersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTiersResult>("gcp:sql/getTiers:getTiers", args ?? new GetTiersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTiersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Project ID for which to list tiers. If `project` is not provided, the project defined within the default provider configuration is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetTiersArgs()
        {
        }
        public static new GetTiersArgs Empty => new GetTiersArgs();
    }

    public sealed class GetTiersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Project ID for which to list tiers. If `project` is not provided, the project defined within the default provider configuration is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetTiersInvokeArgs()
        {
        }
        public static new GetTiersInvokeArgs Empty => new GetTiersInvokeArgs();
    }


    [OutputType]
    public sealed class GetTiersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Project;
        /// <summary>
        /// A list of all available machine types (tiers) for project. Each contains:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTiersTierResult> Tiers;

        [OutputConstructor]
        private GetTiersResult(
            string id,

            string project,

            ImmutableArray<Outputs.GetTiersTierResult> tiers)
        {
            Id = id;
            Project = project;
            Tiers = tiers;
        }
    }
}
