// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc
{
    public static class GetJobIamPolicy
    {
        /// <summary>
        /// Retrieves the current IAM policy data for a Dataproc job.
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.Dataproc.GetJobIamPolicy.Invoke(new()
        ///     {
        ///         JobId = google_dataproc_job.Pyspark.Reference[0].Job_id,
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetJobIamPolicyResult> InvokeAsync(GetJobIamPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetJobIamPolicyResult>("gcp:dataproc/getJobIamPolicy:getJobIamPolicy", args ?? new GetJobIamPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the current IAM policy data for a Dataproc job.
        /// 
        /// ## example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var policy = Gcp.Dataproc.GetJobIamPolicy.Invoke(new()
        ///     {
        ///         JobId = google_dataproc_job.Pyspark.Reference[0].Job_id,
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetJobIamPolicyResult> Invoke(GetJobIamPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetJobIamPolicyResult>("gcp:dataproc/getJobIamPolicy:getJobIamPolicy", args ?? new GetJobIamPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJobIamPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name or relative resource id of the job to manage IAM policies for.
        /// </summary>
        [Input("jobId", required: true)]
        public string JobId { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        [Input("region")]
        public string? Region { get; set; }

        public GetJobIamPolicyArgs()
        {
        }
        public static new GetJobIamPolicyArgs Empty => new GetJobIamPolicyArgs();
    }

    public sealed class GetJobIamPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name or relative resource id of the job to manage IAM policies for.
        /// </summary>
        [Input("jobId", required: true)]
        public Input<string> JobId { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetJobIamPolicyInvokeArgs()
        {
        }
        public static new GetJobIamPolicyInvokeArgs Empty => new GetJobIamPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetJobIamPolicyResult
    {
        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string JobId;
        /// <summary>
        /// (Computed) The policy data
        /// </summary>
        public readonly string PolicyData;
        public readonly string Project;
        public readonly string Region;

        [OutputConstructor]
        private GetJobIamPolicyResult(
            string etag,

            string id,

            string jobId,

            string policyData,

            string project,

            string region)
        {
            Etag = etag;
            Id = id;
            JobId = jobId;
            PolicyData = policyData;
            Project = project;
            Region = region;
        }
    }
}