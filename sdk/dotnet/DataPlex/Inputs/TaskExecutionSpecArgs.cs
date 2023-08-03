// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class TaskExecutionSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("args")]
        private InputMap<string>? _args;

        /// <summary>
        /// The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${taskId} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument. An object containing a list of 'key': value pairs. Example: { 'name': 'wrench', 'mass': '1.3kg', 'count': '3' }.
        /// </summary>
        public InputMap<string> Args
        {
            get => _args ?? (_args = new InputMap<string>());
            set => _args = value;
        }

        /// <summary>
        /// The Cloud KMS key to use for encryption, of the form: projects/{project_number}/locations/{locationId}/keyRings/{key-ring-name}/cryptoKeys/{key-name}.
        /// 
        /// - - -
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// The maximum duration after which the job execution is expired. A duration in seconds with up to nine fractional digits, ending with 's'. Example: '3.5s'.
        /// </summary>
        [Input("maxJobExecutionLifetime")]
        public Input<string>? MaxJobExecutionLifetime { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
        /// </summary>
        [Input("serviceAccount", required: true)]
        public Input<string> ServiceAccount { get; set; } = null!;

        public TaskExecutionSpecArgs()
        {
        }
        public static new TaskExecutionSpecArgs Empty => new TaskExecutionSpecArgs();
    }
}