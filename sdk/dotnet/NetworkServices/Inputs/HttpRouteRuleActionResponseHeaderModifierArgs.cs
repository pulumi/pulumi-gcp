// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class HttpRouteRuleActionResponseHeaderModifierArgs : global::Pulumi.ResourceArgs
    {
        [Input("add")]
        private InputMap<string>? _add;

        /// <summary>
        /// Add the headers with given map where key is the name of the header, value is the value of the header.
        /// </summary>
        public InputMap<string> Add
        {
            get => _add ?? (_add = new InputMap<string>());
            set => _add = value;
        }

        [Input("removes")]
        private InputList<string>? _removes;

        /// <summary>
        /// Remove headers (matching by header names) specified in the list.
        /// </summary>
        public InputList<string> Removes
        {
            get => _removes ?? (_removes = new InputList<string>());
            set => _removes = value;
        }

        [Input("set")]
        private InputMap<string>? _set;

        /// <summary>
        /// Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
        /// </summary>
        public InputMap<string> Set
        {
            get => _set ?? (_set = new InputMap<string>());
            set => _set = value;
        }

        public HttpRouteRuleActionResponseHeaderModifierArgs()
        {
        }
        public static new HttpRouteRuleActionResponseHeaderModifierArgs Empty => new HttpRouteRuleActionResponseHeaderModifierArgs();
    }
}