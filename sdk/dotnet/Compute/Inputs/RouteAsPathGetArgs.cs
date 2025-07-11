// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RouteAsPathGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("asLists")]
        private InputList<int>? _asLists;

        /// <summary>
        /// (Output)
        /// The AS numbers of the AS Path.
        /// </summary>
        public InputList<int> AsLists
        {
            get => _asLists ?? (_asLists = new InputList<int>());
            set => _asLists = value;
        }

        /// <summary>
        /// (Output)
        /// The type of the AS Path, which can be one of the following values:
        /// - 'AS_SET': unordered set of autonomous systems that the route in has traversed
        /// - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed
        /// - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed
        /// - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
        /// </summary>
        [Input("pathSegmentType")]
        public Input<string>? PathSegmentType { get; set; }

        public RouteAsPathGetArgs()
        {
        }
        public static new RouteAsPathGetArgs Empty => new RouteAsPathGetArgs();
    }
}
