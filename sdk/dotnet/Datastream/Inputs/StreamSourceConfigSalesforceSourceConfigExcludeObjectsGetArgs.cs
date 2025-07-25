// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamSourceConfigSalesforceSourceConfigExcludeObjectsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("objects", required: true)]
        private InputList<Inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectGetArgs>? _objects;

        /// <summary>
        /// Salesforce objects in data source.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectGetArgs> Objects
        {
            get => _objects ?? (_objects = new InputList<Inputs.StreamSourceConfigSalesforceSourceConfigExcludeObjectsObjectGetArgs>());
            set => _objects = value;
        }

        public StreamSourceConfigSalesforceSourceConfigExcludeObjectsGetArgs()
        {
        }
        public static new StreamSourceConfigSalesforceSourceConfigExcludeObjectsGetArgs Empty => new StreamSourceConfigSalesforceSourceConfigExcludeObjectsGetArgs();
    }
}
