// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle.Inputs
{

    public sealed class WatchlistWatchlistUserPreferencesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Whether the watchlist is pinned on the dashboard.
        /// </summary>
        [Input("pinned")]
        public Input<bool>? Pinned { get; set; }

        public WatchlistWatchlistUserPreferencesGetArgs()
        {
        }
        public static new WatchlistWatchlistUserPreferencesGetArgs Empty => new WatchlistWatchlistUserPreferencesGetArgs();
    }
}
