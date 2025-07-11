// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// A representation of an ExternalAccountKey used for external account binding within ACME.
    /// 
    /// To get more information about ExternalAccountKey, see:
    /// 
    /// * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/public-ca/rest/v1/projects.locations.externalAccountKeys/create)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/certificate-manager/docs/public-ca)
    ///     * [Request Certificate Using Public CA](https://cloud.google.com/certificate-manager/docs/public-ca-tutorial)
    ///     * [Request EAB key ID and HMAC](https://cloud.google.com/certificate-manager/docs/public-ca-tutorial#request-key-hmac)
    /// 
    /// &gt; **Warning:** This resource is create-only and could not be read from the API.
    /// On delete, the resource would be removed from the state.
    /// You must use an EAB secret within 7 days of obtaining it.
    /// The EAB secret is invalidated if you don't use it within 7 days.
    /// The ACME account registered by using an EAB secret has no expiration.
    /// 
    /// ## Example Usage
    /// 
    /// ### Public Ca External Account Key
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var prod = new Gcp.Compute.CaExternalAccountKey("prod", new()
    ///     {
    ///         Project = "my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource does not support import.
    /// </summary>
    [GcpResourceType("gcp:compute/caExternalAccountKey:CaExternalAccountKey")]
    public partial class CaExternalAccountKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Deprecated)
        /// Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
        /// when the ExternalAccountKey is created.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("b64MacKey")]
        public Output<string> B64MacKey { get; private set; } = null!;

        /// <summary>
        /// Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
        /// when the ExternalAccountKey is created.'
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("b64urlMacKey")]
        public Output<string> B64urlMacKey { get; private set; } = null!;

        /// <summary>
        /// It is generated by the PublicCertificateAuthorityService when the ExternalAccountKey is created.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// Location for the externalAccountKey. Currently only `global` is supported.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Resource name. projects/{project}/locations/{location}/externalAccountKeys/{keyId}.
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
        /// Create a CaExternalAccountKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CaExternalAccountKey(string name, CaExternalAccountKeyArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:compute/caExternalAccountKey:CaExternalAccountKey", name, args ?? new CaExternalAccountKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CaExternalAccountKey(string name, Input<string> id, CaExternalAccountKeyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/caExternalAccountKey:CaExternalAccountKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "b64MacKey",
                    "b64urlMacKey",
                    "keyId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CaExternalAccountKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CaExternalAccountKey Get(string name, Input<string> id, CaExternalAccountKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new CaExternalAccountKey(name, id, state, options);
        }
    }

    public sealed class CaExternalAccountKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Location for the externalAccountKey. Currently only `global` is supported.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public CaExternalAccountKeyArgs()
        {
        }
        public static new CaExternalAccountKeyArgs Empty => new CaExternalAccountKeyArgs();
    }

    public sealed class CaExternalAccountKeyState : global::Pulumi.ResourceArgs
    {
        [Input("b64MacKey")]
        private Input<string>? _b64MacKey;

        /// <summary>
        /// (Deprecated)
        /// Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
        /// when the ExternalAccountKey is created.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Obsolete(@"`b64_mac_key` is deprecated and will be removed in a future major release. Use `b64url_mac_key` instead.")]
        public Input<string>? B64MacKey
        {
            get => _b64MacKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _b64MacKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("b64urlMacKey")]
        private Input<string>? _b64urlMacKey;

        /// <summary>
        /// Base64-URL-encoded HS256 key. It is generated by the PublicCertificateAuthorityService
        /// when the ExternalAccountKey is created.'
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? B64urlMacKey
        {
            get => _b64urlMacKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _b64urlMacKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("keyId")]
        private Input<string>? _keyId;

        /// <summary>
        /// It is generated by the PublicCertificateAuthorityService when the ExternalAccountKey is created.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? KeyId
        {
            get => _keyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Location for the externalAccountKey. Currently only `global` is supported.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Resource name. projects/{project}/locations/{location}/externalAccountKeys/{keyId}.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public CaExternalAccountKeyState()
        {
        }
        public static new CaExternalAccountKeyState Empty => new CaExternalAccountKeyState();
    }
}
