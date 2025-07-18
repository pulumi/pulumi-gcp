// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp
{
    /// <summary>
    /// NetApp Volumes always encrypts your data at rest using volume-specific keys.
    /// 
    /// A CMEK policy (customer-managed encryption key) warps such volume-specific keys in a key stored in Cloud Key Management Service (KMS).
    /// 
    /// To get more information about kmsconfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.kmsConfigs)
    /// * How-to Guides
    ///     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/cmek/cmek-overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Kms Config Create
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var kmsConfig = new Gcp.Netapp.Kmsconfig("kmsConfig", new()
    ///     {
    ///         Name = "kms-test",
    ///         Description = "this is a test description",
    ///         CryptoKeyName = "crypto-name",
    ///         Location = "us-central1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// kmsconfig can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/kmsConfigs/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, kmsconfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/kmsconfig:Kmsconfig default projects/{{project}}/locations/{{location}}/kmsConfigs/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/kmsconfig:Kmsconfig default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/kmsconfig:Kmsconfig default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:netapp/kmsconfig:Kmsconfig")]
    public partial class Kmsconfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Resource name of the KMS key to use. Only regional keys are supported. Format: `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{key}}`.
        /// </summary>
        [Output("cryptoKeyName")]
        public Output<string> CryptoKeyName { get; private set; } = null!;

        /// <summary>
        /// Description for the CMEK policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Access to the key needs to be granted. The instructions contain gcloud commands to run to grant access.
        /// To make the policy work, a CMEK policy check is required, which verifies key access.
        /// </summary>
        [Output("instructions")]
        public Output<string> Instructions { get; private set; } = null!;

        /// <summary>
        /// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the policy location. CMEK policies apply to the whole region.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the CMEK policy.
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
        /// The Service account which needs to have access to the  provided KMS key.
        /// </summary>
        [Output("serviceAccount")]
        public Output<string> ServiceAccount { get; private set; } = null!;


        /// <summary>
        /// Create a Kmsconfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Kmsconfig(string name, KmsconfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:netapp/kmsconfig:Kmsconfig", name, args ?? new KmsconfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Kmsconfig(string name, Input<string> id, KmsconfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:netapp/kmsconfig:Kmsconfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Kmsconfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Kmsconfig Get(string name, Input<string> id, KmsconfigState? state = null, CustomResourceOptions? options = null)
        {
            return new Kmsconfig(name, id, state, options);
        }
    }

    public sealed class KmsconfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource name of the KMS key to use. Only regional keys are supported. Format: `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{key}}`.
        /// </summary>
        [Input("cryptoKeyName", required: true)]
        public Input<string> CryptoKeyName { get; set; } = null!;

        /// <summary>
        /// Description for the CMEK policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the policy location. CMEK policies apply to the whole region.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of the CMEK policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public KmsconfigArgs()
        {
        }
        public static new KmsconfigArgs Empty => new KmsconfigArgs();
    }

    public sealed class KmsconfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource name of the KMS key to use. Only regional keys are supported. Format: `projects/{{project}}/locations/{{location}}/keyRings/{{key_ring}}/cryptoKeys/{{key}}`.
        /// </summary>
        [Input("cryptoKeyName")]
        public Input<string>? CryptoKeyName { get; set; }

        /// <summary>
        /// Description for the CMEK policy.
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
        /// Access to the key needs to be granted. The instructions contain gcloud commands to run to grant access.
        /// To make the policy work, a CMEK policy check is required, which verifies key access.
        /// </summary>
        [Input("instructions")]
        public Input<string>? Instructions { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the policy location. CMEK policies apply to the whole region.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the CMEK policy.
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
        /// The Service account which needs to have access to the  provided KMS key.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        public KmsconfigState()
        {
        }
        public static new KmsconfigState Empty => new KmsconfigState();
    }
}
