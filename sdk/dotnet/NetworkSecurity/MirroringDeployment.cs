// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity
{
    /// <summary>
    /// A deployment represents a zonal mirroring backend ready to accept
    /// GENEVE-encapsulated replica traffic, e.g. a zonal instance group fronted by
    /// an internal passthrough load balancer. Deployments are always part of a
    /// global deployment group which represents a global mirroring service.
    /// 
    /// To get more information about MirroringDeployment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringDeployments)
    /// * How-to Guides
    ///     * [Mirroring deployment overview](https://cloud.google.com/network-security-integration/docs/out-of-band/deployments-overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Network Security Mirroring Deployment Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "example-network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var subnetwork = new Gcp.Compute.Subnetwork("subnetwork", new()
    ///     {
    ///         Name = "example-subnet",
    ///         Region = "us-central1",
    ///         IpCidrRange = "10.1.0.0/16",
    ///         Network = network.Name,
    ///     });
    /// 
    ///     var healthCheck = new Gcp.Compute.RegionHealthCheck("health_check", new()
    ///     {
    ///         Name = "example-hc",
    ///         Region = "us-central1",
    ///         HttpHealthCheck = new Gcp.Compute.Inputs.RegionHealthCheckHttpHealthCheckArgs
    ///         {
    ///             Port = 80,
    ///         },
    ///     });
    /// 
    ///     var backendService = new Gcp.Compute.RegionBackendService("backend_service", new()
    ///     {
    ///         Name = "example-bs",
    ///         Region = "us-central1",
    ///         HealthChecks = healthCheck.Id,
    ///         Protocol = "UDP",
    ///         LoadBalancingScheme = "INTERNAL",
    ///     });
    /// 
    ///     var forwardingRule = new Gcp.Compute.ForwardingRule("forwarding_rule", new()
    ///     {
    ///         Name = "example-fwr",
    ///         Region = "us-central1",
    ///         Network = network.Name,
    ///         Subnetwork = subnetwork.Name,
    ///         BackendService = backendService.Id,
    ///         LoadBalancingScheme = "INTERNAL",
    ///         Ports = new[]
    ///         {
    ///             "6081",
    ///         },
    ///         IpProtocol = "UDP",
    ///         IsMirroringCollector = true,
    ///     });
    /// 
    ///     var deploymentGroup = new Gcp.NetworkSecurity.MirroringDeploymentGroup("deployment_group", new()
    ///     {
    ///         MirroringDeploymentGroupId = "example-dg",
    ///         Location = "global",
    ///         Network = network.Id,
    ///     });
    /// 
    ///     var @default = new Gcp.NetworkSecurity.MirroringDeployment("default", new()
    ///     {
    ///         MirroringDeploymentId = "example-deployment",
    ///         Location = "us-central1-a",
    ///         ForwardingRule = forwardingRule.Id,
    ///         MirroringDeploymentGroup = deploymentGroup.Id,
    ///         Description = "some description",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MirroringDeployment can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/mirroringDeployments/{{mirroring_deployment_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{mirroring_deployment_id}}`
    /// 
    /// * `{{location}}/{{mirroring_deployment_id}}`
    /// 
    /// When using the `pulumi import` command, MirroringDeployment can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default projects/{{project}}/locations/{{location}}/mirroringDeployments/{{mirroring_deployment_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default {{project}}/{{location}}/{{mirroring_deployment_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default {{location}}/{{mirroring_deployment_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networksecurity/mirroringDeployment:MirroringDeployment")]
    public partial class MirroringDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp when the resource was created.
        /// See https://google.aip.dev/148#timestamps.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// User-provided description of the deployment.
        /// Used as additional context for the deployment.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// The regional forwarding rule that fronts the mirroring collectors, for
        /// example: `projects/123456789/regions/us-central1/forwardingRules/my-rule`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Output("forwardingRule")]
        public Output<string> ForwardingRule { get; private set; } = null!;

        /// <summary>
        /// Labels are key/value pairs that help to organize and filter resources.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The cloud location of the deployment, e.g. `us-central1-a` or `asia-south1-b`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The deployment group that this deployment is a part of, for example:
        /// `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Output("mirroringDeploymentGroup")]
        public Output<string> MirroringDeploymentGroup { get; private set; } = null!;

        /// <summary>
        /// The ID to use for the new deployment, which will become the final
        /// component of the deployment's resource name.
        /// </summary>
        [Output("mirroringDeploymentId")]
        public Output<string> MirroringDeploymentId { get; private set; } = null!;

        /// <summary>
        /// The resource name of this deployment, for example:
        /// `projects/123456789/locations/us-central1-a/mirroringDeployments/my-dep`.
        /// See https://google.aip.dev/122 for more details.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The current state of the resource does not match the user's intended state,
        /// and the system is working to reconcile them. This part of the normal
        /// operation (e.g. linking a new association to the parent group).
        /// See https://google.aip.dev/128.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// The current state of the deployment.
        /// See https://google.aip.dev/216.
        /// Possible values:
        /// STATE_UNSPECIFIED
        /// ACTIVE
        /// CREATING
        /// DELETING
        /// OUT_OF_SYNC
        /// DELETE_FAILED
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the resource was most recently updated.
        /// See https://google.aip.dev/148#timestamps.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a MirroringDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MirroringDeployment(string name, MirroringDeploymentArgs args, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/mirroringDeployment:MirroringDeployment", name, args ?? new MirroringDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MirroringDeployment(string name, Input<string> id, MirroringDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networksecurity/mirroringDeployment:MirroringDeployment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MirroringDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MirroringDeployment Get(string name, Input<string> id, MirroringDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new MirroringDeployment(name, id, state, options);
        }
    }

    public sealed class MirroringDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided description of the deployment.
        /// Used as additional context for the deployment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The regional forwarding rule that fronts the mirroring collectors, for
        /// example: `projects/123456789/regions/us-central1/forwardingRules/my-rule`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("forwardingRule", required: true)]
        public Input<string> ForwardingRule { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels are key/value pairs that help to organize and filter resources.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The cloud location of the deployment, e.g. `us-central1-a` or `asia-south1-b`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The deployment group that this deployment is a part of, for example:
        /// `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("mirroringDeploymentGroup", required: true)]
        public Input<string> MirroringDeploymentGroup { get; set; } = null!;

        /// <summary>
        /// The ID to use for the new deployment, which will become the final
        /// component of the deployment's resource name.
        /// </summary>
        [Input("mirroringDeploymentId", required: true)]
        public Input<string> MirroringDeploymentId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public MirroringDeploymentArgs()
        {
        }
        public static new MirroringDeploymentArgs Empty => new MirroringDeploymentArgs();
    }

    public sealed class MirroringDeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp when the resource was created.
        /// See https://google.aip.dev/148#timestamps.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// User-provided description of the deployment.
        /// Used as additional context for the deployment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The regional forwarding rule that fronts the mirroring collectors, for
        /// example: `projects/123456789/regions/us-central1/forwardingRules/my-rule`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("forwardingRule")]
        public Input<string>? ForwardingRule { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels are key/value pairs that help to organize and filter resources.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The cloud location of the deployment, e.g. `us-central1-a` or `asia-south1-b`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The deployment group that this deployment is a part of, for example:
        /// `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("mirroringDeploymentGroup")]
        public Input<string>? MirroringDeploymentGroup { get; set; }

        /// <summary>
        /// The ID to use for the new deployment, which will become the final
        /// component of the deployment's resource name.
        /// </summary>
        [Input("mirroringDeploymentId")]
        public Input<string>? MirroringDeploymentId { get; set; }

        /// <summary>
        /// The resource name of this deployment, for example:
        /// `projects/123456789/locations/us-central1-a/mirroringDeployments/my-dep`.
        /// See https://google.aip.dev/122 for more details.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The current state of the resource does not match the user's intended state,
        /// and the system is working to reconcile them. This part of the normal
        /// operation (e.g. linking a new association to the parent group).
        /// See https://google.aip.dev/128.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// The current state of the deployment.
        /// See https://google.aip.dev/216.
        /// Possible values:
        /// STATE_UNSPECIFIED
        /// ACTIVE
        /// CREATING
        /// DELETING
        /// OUT_OF_SYNC
        /// DELETE_FAILED
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The timestamp when the resource was most recently updated.
        /// See https://google.aip.dev/148#timestamps.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public MirroringDeploymentState()
        {
        }
        public static new MirroringDeploymentState Empty => new MirroringDeploymentState();
    }
}
