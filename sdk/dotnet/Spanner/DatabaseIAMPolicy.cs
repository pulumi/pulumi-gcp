// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
    /// 
    /// * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
    /// 
    /// &gt; **Warning:** It's entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
    /// 
    /// * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
    /// * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
    /// 
    /// &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## gcp.spanner.DatabaseIAMPolicy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admin = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/editor",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var database = new Gcp.Spanner.DatabaseIAMPolicy("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admin = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/editor",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///                 Condition = new Gcp.Organizations.Inputs.GetIAMPolicyBindingConditionInputArgs
    ///                 {
    ///                     Title = "My Role",
    ///                     Description = "Grant permissions on my_role",
    ///                     Expression = "(resource.type == \"spanner.googleapis.com/DatabaseRole\" &amp;&amp; (resource.name.endsWith(\"/myrole\")))",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var database = new Gcp.Spanner.DatabaseIAMPolicy("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.spanner.DatabaseIAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMBinding("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMBinding("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Spanner.Inputs.DatabaseIAMBindingConditionArgs
    ///         {
    ///             Title = "My Role",
    ///             Description = "Grant permissions on my_role",
    ///             Expression = "(resource.type == \"spanner.googleapis.com/DatabaseRole\" &amp;&amp; (resource.name.endsWith(\"/myrole\")))",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.spanner.DatabaseIAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMMember("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMMember("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Spanner.Inputs.DatabaseIAMMemberConditionArgs
    ///         {
    ///             Title = "My Role",
    ///             Description = "Grant permissions on my_role",
    ///             Expression = "(resource.type == \"spanner.googleapis.com/DatabaseRole\" &amp;&amp; (resource.name.endsWith(\"/myrole\")))",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.spanner.DatabaseIAMBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMBinding("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMBinding("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Condition = new Gcp.Spanner.Inputs.DatabaseIAMBindingConditionArgs
    ///         {
    ///             Title = "My Role",
    ///             Description = "Grant permissions on my_role",
    ///             Expression = "(resource.type == \"spanner.googleapis.com/DatabaseRole\" &amp;&amp; (resource.name.endsWith(\"/myrole\")))",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.spanner.DatabaseIAMMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMMember("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With IAM Conditions:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var database = new Gcp.Spanner.DatabaseIAMMember("database", new()
    ///     {
    ///         Instance = "your-instance-name",
    ///         Database = "your-database-name",
    ///         Role = "roles/compute.networkUser",
    ///         Member = "user:jane@example.com",
    ///         Condition = new Gcp.Spanner.Inputs.DatabaseIAMMemberConditionArgs
    ///         {
    ///             Title = "My Role",
    ///             Description = "Grant permissions on my_role",
    ///             Expression = "(resource.type == \"spanner.googleapis.com/DatabaseRole\" &amp;&amp; (resource.name.endsWith(\"/myrole\")))",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ### Importing IAM policies
    /// 
    /// IAM policy imports use the identifier of the Spanner Database resource in question. For example:
    /// 
    /// * `{{project}}/{{instance}}/{{database}}`
    /// 
    /// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   id = {{project}}/{{instance}}/{{database}}
    /// 
    ///   to = google_spanner_database_iam_policy.default
    /// 
    /// }
    /// 
    /// The `pulumi import` command can also be used:
    /// 
    /// ```sh
    /// $ pulumi import gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy default {{project}}/{{instance}}/{{database}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy")]
    public partial class DatabaseIAMPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Spanner database.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the database's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The name of the Spanner instance the database belongs to.
        /// </summary>
        [Output("instance")]
        public Output<string> Instance { get; private set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseIAMPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseIAMPolicy(string name, DatabaseIAMPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, args ?? new DatabaseIAMPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseIAMPolicy(string name, Input<string> id, DatabaseIAMPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseIAMPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseIAMPolicy Get(string name, Input<string> id, DatabaseIAMPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseIAMPolicy(name, id, state, options);
        }
    }

    public sealed class DatabaseIAMPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Spanner database.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The name of the Spanner instance the database belongs to.
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public DatabaseIAMPolicyArgs()
        {
        }
        public static new DatabaseIAMPolicyArgs Empty => new DatabaseIAMPolicyArgs();
    }

    public sealed class DatabaseIAMPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Spanner database.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// (Computed) The etag of the database's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The name of the Spanner instance the database belongs to.
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public DatabaseIAMPolicyState()
        {
        }
        public static new DatabaseIAMPolicyState Empty => new DatabaseIAMPolicyState();
    }
}
