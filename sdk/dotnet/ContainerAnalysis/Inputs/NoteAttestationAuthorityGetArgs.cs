// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ContainerAnalysis.Inputs
{

    public sealed class NoteAttestationAuthorityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This submessage provides human-readable hints about the purpose of
        /// the AttestationAuthority. Because the name of a Note acts as its
        /// resource reference, it is important to disambiguate the canonical
        /// name of the Note (which might be a UUID for security purposes)
        /// from "readable" names more suitable for debug output. Note that
        /// these hints should NOT be used to look up AttestationAuthorities
        /// in security sensitive contexts, such as when looking up
        /// Attestations to verify.
        /// Structure is documented below.
        /// </summary>
        [Input("hint", required: true)]
        public Input<Inputs.NoteAttestationAuthorityHintGetArgs> Hint { get; set; } = null!;

        public NoteAttestationAuthorityGetArgs()
        {
        }
        public static new NoteAttestationAuthorityGetArgs Empty => new NoteAttestationAuthorityGetArgs();
    }
}
