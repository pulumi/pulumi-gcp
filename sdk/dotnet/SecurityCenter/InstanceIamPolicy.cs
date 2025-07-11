// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter
{
    /// <summary>
    /// Represents a Data Fusion instance.
    /// 
    /// To get more information about Instance, see:
    /// 
    /// * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
    /// 
    /// ## Example Usage
    /// 
    /// ### Data Fusion Instance Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basicInstance = new Gcp.DataFusion.Instance("basic_instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         Region = "us-central1",
    ///         Type = "BASIC",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = Gcp.AppEngine.GetDefaultServiceAccount.Invoke();
    /// 
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         Name = "datafusion-full-network",
    ///     });
    /// 
    ///     var privateIpAlloc = new Gcp.Compute.GlobalAddress("private_ip_alloc", new()
    ///     {
    ///         Name = "datafusion-ip-alloc",
    ///         AddressType = "INTERNAL",
    ///         Purpose = "VPC_PEERING",
    ///         PrefixLength = 22,
    ///         Network = network.Id,
    ///     });
    /// 
    ///     var extendedInstance = new Gcp.DataFusion.Instance("extended_instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         Description = "My Data Fusion instance",
    ///         DisplayName = "My Data Fusion instance",
    ///         Region = "us-central1",
    ///         Type = "BASIC",
    ///         EnableStackdriverLogging = true,
    ///         EnableStackdriverMonitoring = true,
    ///         PrivateInstance = true,
    ///         DataprocServiceAccount = @default.Apply(@default =&gt; @default.Apply(getDefaultServiceAccountResult =&gt; getDefaultServiceAccountResult.Email)),
    ///         Labels = 
    ///         {
    ///             { "example_key", "example_value" },
    ///         },
    ///         NetworkConfig = new Gcp.DataFusion.Inputs.InstanceNetworkConfigArgs
    ///         {
    ///             Network = "default",
    ///             IpAllocation = Output.Tuple(privateIpAlloc.Address, privateIpAlloc.PrefixLength).Apply(values =&gt;
    ///             {
    ///                 var address = values.Item1;
    ///                 var prefixLength = values.Item2;
    ///                 return $"{address}/{prefixLength}";
    ///             }),
    ///         },
    ///         Accelerators = new[]
    ///         {
    ///             new Gcp.DataFusion.Inputs.InstanceAcceleratorArgs
    ///             {
    ///                 AcceleratorType = "CDC",
    ///                 State = "ENABLED",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Psc
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var psc = new Gcp.Compute.Network("psc", new()
    ///     {
    ///         Name = "datafusion-psc-network",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var pscSubnetwork = new Gcp.Compute.Subnetwork("psc", new()
    ///     {
    ///         Name = "datafusion-psc-subnet",
    ///         Region = "us-central1",
    ///         Network = psc.Id,
    ///         IpCidrRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var pscNetworkAttachment = new Gcp.Compute.NetworkAttachment("psc", new()
    ///     {
    ///         Name = "datafusion-psc-attachment",
    ///         Region = "us-central1",
    ///         ConnectionPreference = "ACCEPT_AUTOMATIC",
    ///         Subnetworks = new[]
    ///         {
    ///             pscSubnetwork.SelfLink,
    ///         },
    ///     });
    /// 
    ///     var pscInstance = new Gcp.DataFusion.Instance("psc_instance", new()
    ///     {
    ///         Name = "psc-instance",
    ///         Region = "us-central1",
    ///         Type = "BASIC",
    ///         PrivateInstance = true,
    ///         NetworkConfig = new Gcp.DataFusion.Inputs.InstanceNetworkConfigArgs
    ///         {
    ///             ConnectionType = "PRIVATE_SERVICE_CONNECT_INTERFACES",
    ///             PrivateServiceConnectConfig = new Gcp.DataFusion.Inputs.InstanceNetworkConfigPrivateServiceConnectConfigArgs
    ///             {
    ///                 NetworkAttachment = pscNetworkAttachment.Id,
    ///                 UnreachableCidrBlock = "192.168.0.0/25",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Cmek
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var keyRing = new Gcp.Kms.KeyRing("key_ring", new()
    ///     {
    ///         Name = "my-instance",
    ///         Location = "us-central1",
    ///     });
    /// 
    ///     var cryptoKey = new Gcp.Kms.CryptoKey("crypto_key", new()
    ///     {
    ///         Name = "my-instance",
    ///         KeyRing = keyRing.Id,
    ///     });
    /// 
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var cryptoKeyMember = new Gcp.Kms.CryptoKeyIAMMember("crypto_key_member", new()
    ///     {
    ///         CryptoKeyId = cryptoKey.Id,
    ///         Role = "roles/cloudkms.cryptoKeyEncrypterDecrypter",
    ///         Member = $"serviceAccount:service-{project.Apply(getProjectResult =&gt; getProjectResult.Number)}@gcp-sa-datafusion.iam.gserviceaccount.com",
    ///     });
    /// 
    ///     var cmek = new Gcp.DataFusion.Instance("cmek", new()
    ///     {
    ///         Name = "my-instance",
    ///         Region = "us-central1",
    ///         Type = "BASIC",
    ///         CryptoKeyConfig = new Gcp.DataFusion.Inputs.InstanceCryptoKeyConfigArgs
    ///         {
    ///             KeyReference = cryptoKey.Id,
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             cryptoKeyMember,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Enterprise
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var enterpriseInstance = new Gcp.DataFusion.Instance("enterprise_instance", new()
    ///     {
    ///         Name = "my-instance",
    ///         Region = "us-central1",
    ///         Type = "ENTERPRISE",
    ///         EnableRbac = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Event
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var eventTopic = new Gcp.PubSub.Topic("event", new()
    ///     {
    ///         Name = "my-instance",
    ///     });
    /// 
    ///     var @event = new Gcp.DataFusion.Instance("event", new()
    ///     {
    ///         Name = "my-instance",
    ///         Region = "us-central1",
    ///         Type = "BASIC",
    ///         EventPublishConfig = new Gcp.DataFusion.Inputs.InstanceEventPublishConfigArgs
    ///         {
    ///             Enabled = true,
    ///             Topic = eventTopic.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Data Fusion Instance Zone
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var zone = new Gcp.DataFusion.Instance("zone", new()
    ///     {
    ///         Name = "my-instance",
    ///         Region = "us-central1",
    ///         Zone = "us-central1-a",
    ///         Type = "DEVELOPER",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Instance can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{region}}/instances/{{name}}`
    /// 
    /// * `{{project}}/{{region}}/{{name}}`
    /// 
    /// * `{{region}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default projects/{{project}}/locations/{{region}}/instances/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy")]
    public partial class InstanceIamPolicy : global::Pulumi.CustomResource
    {
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The region of the Data Fusion instance.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceIamPolicy(string name, InstanceIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy", name, args ?? new InstanceIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceIamPolicy(string name, Input<string> id, InstanceIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/instanceIamPolicy:InstanceIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceIamPolicy Get(string name, Input<string> id, InstanceIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceIamPolicy(name, id, state, options);
        }
    }

    public sealed class InstanceIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of the Data Fusion instance.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public InstanceIamPolicyArgs()
        {
        }
        public static new InstanceIamPolicyArgs Empty => new InstanceIamPolicyArgs();
    }

    public sealed class InstanceIamPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The ID of the instance or a fully qualified identifier for the instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of the Data Fusion instance.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public InstanceIamPolicyState()
        {
        }
        public static new InstanceIamPolicyState Empty => new InstanceIamPolicyState();
    }
}
