// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class DomainMappingMetadata
    {
        /// <summary>
        /// Annotations is a key value map stored with a resource that
        /// may be set by external tools to store and retrieve arbitrary metadata.
        /// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations
        /// **Note**: The Cloud Run API may add additional annotations that were not provided in your config.
        /// If the provider plan shows a diff where a server-side annotation is added, you can add it to your config
        /// or apply the lifecycle.ignore_changes rule to the metadata.0.annotations field.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Annotations;
        public readonly ImmutableDictionary<string, string>? EffectiveAnnotations;
        /// <summary>
        /// (Output)
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? EffectiveLabels;
        /// <summary>
        /// (Output)
        /// A sequence number representing a specific generation of the desired state.
        /// </summary>
        public readonly int? Generation;
        /// <summary>
        /// Map of string keys and values that can be used to organize and categorize
        /// (scope and select) objects. May match selectors of replication controllers
        /// and routes.
        /// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// In Cloud Run the namespace must be equal to either the
        /// project ID or project number.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// (Output)
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? PulumiLabels;
        /// <summary>
        /// (Output)
        /// An opaque value that represents the internal version of this object that
        /// can be used by clients to determine when objects have changed. May be used
        /// for optimistic concurrency, change detection, and the watch operation on a
        /// resource or set of resources. They may only be valid for a
        /// particular resource or set of resources.
        /// More info:
        /// https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
        /// </summary>
        public readonly string? ResourceVersion;
        /// <summary>
        /// (Output)
        /// SelfLink is a URL representing this object.
        /// </summary>
        public readonly string? SelfLink;
        /// <summary>
        /// (Output)
        /// UID is a unique id generated by the server on successful creation of a resource and is not
        /// allowed to change on PUT operations.
        /// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
        /// </summary>
        public readonly string? Uid;

        [OutputConstructor]
        private DomainMappingMetadata(
            ImmutableDictionary<string, string>? annotations,

            ImmutableDictionary<string, string>? effectiveAnnotations,

            ImmutableDictionary<string, string>? effectiveLabels,

            int? generation,

            ImmutableDictionary<string, string>? labels,

            string @namespace,

            ImmutableDictionary<string, string>? pulumiLabels,

            string? resourceVersion,

            string? selfLink,

            string? uid)
        {
            Annotations = annotations;
            EffectiveAnnotations = effectiveAnnotations;
            EffectiveLabels = effectiveLabels;
            Generation = generation;
            Labels = labels;
            Namespace = @namespace;
            PulumiLabels = pulumiLabels;
            ResourceVersion = resourceVersion;
            SelfLink = selfLink;
            Uid = uid;
        }
    }
}
