// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityPosture
{
    /// <summary>
    /// Represents a deployment of a security posture on a resource. A posture contains user curated policy sets. A posture can
    /// be deployed on a project or on a folder or on an organization. To deploy a posture we need to populate the posture's name
    /// and its revision_id in the posture deployment configuration. Every update to a deployed posture generates a new revision_id.
    /// Thus, the updated revision_id should be used in the respective posture deployment's configuration to deploy that posture
    /// on a resource.
    /// 
    /// To get more information about PostureDeployment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/securityposture/rest/v1/organizations.locations.postureDeployments)
    /// * How-to Guides
    ///     * [Create and deploy a posture](https://cloud.google.com/security-command-center/docs/how-to-use-security-posture)
    /// 
    /// ## Import
    /// 
    /// PostureDeployment can be imported using any of these accepted formats:
    /// 
    /// * `{{parent}}/locations/{{location}}/postureDeployments/{{posture_deployment_id}}`
    /// 
    /// When using the `pulumi import` command, PostureDeployment can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:securityposture/postureDeployment:PostureDeployment default {{parent}}/locations/{{location}}/postureDeployments/{{posture_deployment_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securityposture/postureDeployment:PostureDeployment")]
    public partial class PostureDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time the posture deployment was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description of the posture deployment.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// This is an output only optional field which will be filled in case when
        /// PostureDeployment state is UPDATE_FAILED or CREATE_FAILED or DELETE_FAILED.
        /// It denotes the desired posture to be deployed.
        /// </summary>
        [Output("desiredPostureId")]
        public Output<string> DesiredPostureId { get; private set; } = null!;

        /// <summary>
        /// This is an output only optional field which will be filled in case when
        /// PostureDeployment state is UPDATE_FAILED or CREATE_FAILED or DELETE_FAILED.
        /// It denotes the desired posture revision_id to be deployed.
        /// </summary>
        [Output("desiredPostureRevisionId")]
        public Output<string> DesiredPostureRevisionId { get; private set; } = null!;

        /// <summary>
        /// For Resource freshness validation (https://google.aip.dev/154)
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// This is a output only optional field which will be filled in case where
        /// PostureDeployment enters a failure state like UPDATE_FAILED or
        /// CREATE_FAILED or DELETE_FAILED. It will have the failure message for posture deployment's
        /// CREATE/UPDATE/DELETE methods.
        /// </summary>
        [Output("failureMessage")]
        public Output<string> FailureMessage { get; private set; } = null!;

        /// <summary>
        /// The location of the resource, eg. global`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the posture deployment instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// ID of the posture deployment.
        /// </summary>
        [Output("postureDeploymentId")]
        public Output<string> PostureDeploymentId { get; private set; } = null!;

        /// <summary>
        /// Relative name of the posture which needs to be deployed. It should be in the format:
        /// organizations/{organization_id}/locations/{location}/postures/{posture_id}
        /// </summary>
        [Output("postureId")]
        public Output<string> PostureId { get; private set; } = null!;

        /// <summary>
        /// Revision_id the posture which needs to be deployed.
        /// </summary>
        [Output("postureRevisionId")]
        public Output<string> PostureRevisionId { get; private set; } = null!;

        /// <summary>
        /// If set, there are currently changes in flight to the posture deployment.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// State of the posture deployment. A posture deployment can be in the following terminal states:
        /// ACTIVE, CREATE_FAILED, UPDATE_FAILED, DELETE_FAILED.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The resource on which the posture should be deployed. This can be in one of the following formats:
        /// projects/{project_number},
        /// folders/{folder_number},
        /// organizations/{organization_id}
        /// </summary>
        [Output("targetResource")]
        public Output<string> TargetResource { get; private set; } = null!;

        /// <summary>
        /// Time the posture deployment was updated in UTC.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a PostureDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PostureDeployment(string name, PostureDeploymentArgs args, CustomResourceOptions? options = null)
            : base("gcp:securityposture/postureDeployment:PostureDeployment", name, args ?? new PostureDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PostureDeployment(string name, Input<string> id, PostureDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securityposture/postureDeployment:PostureDeployment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PostureDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PostureDeployment Get(string name, Input<string> id, PostureDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new PostureDeployment(name, id, state, options);
        }
    }

    public sealed class PostureDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the posture deployment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The location of the resource, eg. global`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        /// <summary>
        /// ID of the posture deployment.
        /// </summary>
        [Input("postureDeploymentId", required: true)]
        public Input<string> PostureDeploymentId { get; set; } = null!;

        /// <summary>
        /// Relative name of the posture which needs to be deployed. It should be in the format:
        /// organizations/{organization_id}/locations/{location}/postures/{posture_id}
        /// </summary>
        [Input("postureId", required: true)]
        public Input<string> PostureId { get; set; } = null!;

        /// <summary>
        /// Revision_id the posture which needs to be deployed.
        /// </summary>
        [Input("postureRevisionId", required: true)]
        public Input<string> PostureRevisionId { get; set; } = null!;

        /// <summary>
        /// The resource on which the posture should be deployed. This can be in one of the following formats:
        /// projects/{project_number},
        /// folders/{folder_number},
        /// organizations/{organization_id}
        /// </summary>
        [Input("targetResource", required: true)]
        public Input<string> TargetResource { get; set; } = null!;

        public PostureDeploymentArgs()
        {
        }
        public static new PostureDeploymentArgs Empty => new PostureDeploymentArgs();
    }

    public sealed class PostureDeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time the posture deployment was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description of the posture deployment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// This is an output only optional field which will be filled in case when
        /// PostureDeployment state is UPDATE_FAILED or CREATE_FAILED or DELETE_FAILED.
        /// It denotes the desired posture to be deployed.
        /// </summary>
        [Input("desiredPostureId")]
        public Input<string>? DesiredPostureId { get; set; }

        /// <summary>
        /// This is an output only optional field which will be filled in case when
        /// PostureDeployment state is UPDATE_FAILED or CREATE_FAILED or DELETE_FAILED.
        /// It denotes the desired posture revision_id to be deployed.
        /// </summary>
        [Input("desiredPostureRevisionId")]
        public Input<string>? DesiredPostureRevisionId { get; set; }

        /// <summary>
        /// For Resource freshness validation (https://google.aip.dev/154)
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// This is a output only optional field which will be filled in case where
        /// PostureDeployment enters a failure state like UPDATE_FAILED or
        /// CREATE_FAILED or DELETE_FAILED. It will have the failure message for posture deployment's
        /// CREATE/UPDATE/DELETE methods.
        /// </summary>
        [Input("failureMessage")]
        public Input<string>? FailureMessage { get; set; }

        /// <summary>
        /// The location of the resource, eg. global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the posture deployment instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parent of the resource, an organization. Format should be `organizations/{organization_id}`.
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// ID of the posture deployment.
        /// </summary>
        [Input("postureDeploymentId")]
        public Input<string>? PostureDeploymentId { get; set; }

        /// <summary>
        /// Relative name of the posture which needs to be deployed. It should be in the format:
        /// organizations/{organization_id}/locations/{location}/postures/{posture_id}
        /// </summary>
        [Input("postureId")]
        public Input<string>? PostureId { get; set; }

        /// <summary>
        /// Revision_id the posture which needs to be deployed.
        /// </summary>
        [Input("postureRevisionId")]
        public Input<string>? PostureRevisionId { get; set; }

        /// <summary>
        /// If set, there are currently changes in flight to the posture deployment.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// State of the posture deployment. A posture deployment can be in the following terminal states:
        /// ACTIVE, CREATE_FAILED, UPDATE_FAILED, DELETE_FAILED.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The resource on which the posture should be deployed. This can be in one of the following formats:
        /// projects/{project_number},
        /// folders/{folder_number},
        /// organizations/{organization_id}
        /// </summary>
        [Input("targetResource")]
        public Input<string>? TargetResource { get; set; }

        /// <summary>
        /// Time the posture deployment was updated in UTC.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public PostureDeploymentState()
        {
        }
        public static new PostureDeploymentState Empty => new PostureDeploymentState();
    }
}
