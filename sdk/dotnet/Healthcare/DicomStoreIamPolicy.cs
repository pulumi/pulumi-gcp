// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
    /// 
    /// * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
    /// * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
    /// * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
    /// 
    /// &gt; **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## gcp.healthcare.DicomStoreIamPolicy
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
    ///     var dicomStore = new Gcp.Healthcare.DicomStoreIamPolicy("dicom_store", new()
    ///     {
    ///         DicomStoreId = "your-dicom-store-id",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.healthcare.DicomStoreIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dicomStore = new Gcp.Healthcare.DicomStoreIamBinding("dicom_store", new()
    ///     {
    ///         DicomStoreId = "your-dicom-store-id",
    ///         Role = "roles/editor",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.healthcare.DicomStoreIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dicomStore = new Gcp.Healthcare.DicomStoreIamMember("dicom_store", new()
    ///     {
    ///         DicomStoreId = "your-dicom-store-id",
    ///         Role = "roles/editor",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.healthcare.DicomStoreIamBinding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dicomStore = new Gcp.Healthcare.DicomStoreIamBinding("dicom_store", new()
    ///     {
    ///         DicomStoreId = "your-dicom-store-id",
    ///         Role = "roles/editor",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## gcp.healthcare.DicomStoreIamMember
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dicomStore = new Gcp.Healthcare.DicomStoreIamMember("dicom_store", new()
    ///     {
    ///         DicomStoreId = "your-dicom-store-id",
    ///         Role = "roles/editor",
    ///         Member = "user:jane@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ### Importing IAM policies
    /// 
    /// IAM policy imports use the identifier of the Healthcare DICOM store resource. For example:
    /// 
    /// * `"{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"`
    /// 
    /// An `import` block (Terraform v1.5.0 and later) can be used to import IAM policies:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   id = "{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}"
    /// 
    ///   to = google_healthcare_dicom_store_iam_policy.default
    /// 
    /// }
    /// 
    /// The `pulumi import` command can also be used:
    /// 
    /// ```sh
    /// $ pulumi import gcp:healthcare/dicomStoreIamPolicy:DicomStoreIamPolicy default {{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:healthcare/dicomStoreIamPolicy:DicomStoreIamPolicy")]
    public partial class DicomStoreIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The DICOM store ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
        /// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// </summary>
        [Output("dicomStoreId")]
        public Output<string> DicomStoreId { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the DICOM store's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;


        /// <summary>
        /// Create a DicomStoreIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DicomStoreIamPolicy(string name, DicomStoreIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:healthcare/dicomStoreIamPolicy:DicomStoreIamPolicy", name, args ?? new DicomStoreIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DicomStoreIamPolicy(string name, Input<string> id, DicomStoreIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:healthcare/dicomStoreIamPolicy:DicomStoreIamPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DicomStoreIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DicomStoreIamPolicy Get(string name, Input<string> id, DicomStoreIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new DicomStoreIamPolicy(name, id, state, options);
        }
    }

    public sealed class DicomStoreIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DICOM store ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
        /// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// </summary>
        [Input("dicomStoreId", required: true)]
        public Input<string> DicomStoreId { get; set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        public DicomStoreIamPolicyArgs()
        {
        }
        public static new DicomStoreIamPolicyArgs Empty => new DicomStoreIamPolicyArgs();
    }

    public sealed class DicomStoreIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DICOM store ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
        /// `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// </summary>
        [Input("dicomStoreId")]
        public Input<string>? DicomStoreId { get; set; }

        /// <summary>
        /// (Computed) The etag of the DICOM store's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        public DicomStoreIamPolicyState()
        {
        }
        public static new DicomStoreIamPolicyState Empty => new DicomStoreIamPolicyState();
    }
}
