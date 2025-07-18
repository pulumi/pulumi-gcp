// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class JobTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
        /// Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
        /// All system annotations in v1 now have a corresponding field in v2 ExecutionTemplate.
        /// This field follows Kubernetes annotations' namespacing, limits, and rules.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google's billing system, so they can be used to filter,
        /// or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
        /// https://cloud.google.com/run/docs/configuring/labels.
        /// Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
        /// All system labels in v1 now have a corresponding field in v2 ExecutionTemplate.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= taskCount. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
        /// </summary>
        [Input("parallelism")]
        public Input<int>? Parallelism { get; set; }

        /// <summary>
        /// Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        /// </summary>
        [Input("taskCount")]
        public Input<int>? TaskCount { get; set; }

        /// <summary>
        /// Describes the task(s) that will be created when executing an execution
        /// Structure is documented below.
        /// </summary>
        [Input("template", required: true)]
        public Input<Inputs.JobTemplateTemplateGetArgs> Template { get; set; } = null!;

        public JobTemplateGetArgs()
        {
        }
        public static new JobTemplateGetArgs Empty => new JobTemplateGetArgs();
    }
}
