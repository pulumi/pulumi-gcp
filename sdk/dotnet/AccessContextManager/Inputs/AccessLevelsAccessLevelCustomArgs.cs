// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class AccessLevelsAccessLevelCustomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
        /// This page details the objects and attributes that are used to the build the CEL expressions for
        /// custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
        /// Structure is documented below.
        /// </summary>
        [Input("expr", required: true)]
        public Input<Inputs.AccessLevelsAccessLevelCustomExprArgs> Expr { get; set; } = null!;

        public AccessLevelsAccessLevelCustomArgs()
        {
        }
        public static new AccessLevelsAccessLevelCustomArgs Empty => new AccessLevelsAccessLevelCustomArgs();
    }
}
