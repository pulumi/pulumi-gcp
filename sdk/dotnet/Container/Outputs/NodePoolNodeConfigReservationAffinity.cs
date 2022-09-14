// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class NodePoolNodeConfigReservationAffinity
    {
        public readonly string ConsumeReservationType;
        public readonly string? Key;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private NodePoolNodeConfigReservationAffinity(
            string consumeReservationType,

            string? key,

            ImmutableArray<string> values)
        {
            ConsumeReservationType = consumeReservationType;
            Key = key;
            Values = values;
        }
    }
}