// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee
{
    /// <summary>
    /// Deploys a revision of a sharedflow.
    /// 
    /// To get more information about SharedflowDeployment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.sharedflows.revisions.deployments)
    /// * How-to Guides
    ///     * [sharedflows.revisions.deployments](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.sharedflows.revisions.deployments)
    /// 
    /// ## Import
    /// 
    /// SharedflowDeployment can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:apigee/sharedflowDeployment:SharedflowDeployment default organizations/{{org_id}}/environments/{{environment}}/sharedflows/{{sharedflow_id}}/revisions/{{revision}}/deployments/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:apigee/sharedflowDeployment:SharedflowDeployment default {{org_id}}/{{environment}}/{{sharedflow_id}}/{{revision}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:apigee/sharedflowDeployment:SharedflowDeployment")]
    public partial class SharedflowDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Output("environment")]
        public Output<string> Environment { get; private set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the Sharedflow
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Revision of the Sharedflow to be deployed.
        /// </summary>
        [Output("revision")]
        public Output<string> Revision { get; private set; } = null!;

        /// <summary>
        /// The service account represents the identity of the deployed proxy, and determines what permissions it has. The format must be {ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com.
        /// </summary>
        [Output("serviceAccount")]
        public Output<string?> ServiceAccount { get; private set; } = null!;

        /// <summary>
        /// Id of the Sharedflow to be deployed.
        /// </summary>
        [Output("sharedflowId")]
        public Output<string> SharedflowId { get; private set; } = null!;


        /// <summary>
        /// Create a SharedflowDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SharedflowDeployment(string name, SharedflowDeploymentArgs args, CustomResourceOptions? options = null)
            : base("gcp:apigee/sharedflowDeployment:SharedflowDeployment", name, args ?? new SharedflowDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SharedflowDeployment(string name, Input<string> id, SharedflowDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:apigee/sharedflowDeployment:SharedflowDeployment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SharedflowDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SharedflowDeployment Get(string name, Input<string> id, SharedflowDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new SharedflowDeployment(name, id, state, options);
        }
    }

    public sealed class SharedflowDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment", required: true)]
        public Input<string> Environment { get; set; } = null!;

        /// <summary>
        /// The Apigee Organization associated with the Sharedflow
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Revision of the Sharedflow to be deployed.
        /// </summary>
        [Input("revision", required: true)]
        public Input<string> Revision { get; set; } = null!;

        /// <summary>
        /// The service account represents the identity of the deployed proxy, and determines what permissions it has. The format must be {ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// Id of the Sharedflow to be deployed.
        /// </summary>
        [Input("sharedflowId", required: true)]
        public Input<string> SharedflowId { get; set; } = null!;

        public SharedflowDeploymentArgs()
        {
        }
        public static new SharedflowDeploymentArgs Empty => new SharedflowDeploymentArgs();
    }

    public sealed class SharedflowDeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the environment.
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// The Apigee Organization associated with the Sharedflow
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Revision of the Sharedflow to be deployed.
        /// </summary>
        [Input("revision")]
        public Input<string>? Revision { get; set; }

        /// <summary>
        /// The service account represents the identity of the deployed proxy, and determines what permissions it has. The format must be {ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// Id of the Sharedflow to be deployed.
        /// </summary>
        [Input("sharedflowId")]
        public Input<string>? SharedflowId { get; set; }

        public SharedflowDeploymentState()
        {
        }
        public static new SharedflowDeploymentState Empty => new SharedflowDeploymentState();
    }
}