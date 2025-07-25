// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter.Inputs
{

    public sealed class ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the property for the custom output.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The CEL expression for the custom output. A resource property can be specified
        /// to return the value of the property or a text string enclosed in quotation marks.
        /// Structure is documented below.
        /// </summary>
        [Input("valueExpression")]
        public Input<Inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionGetArgs>? ValueExpression { get; set; }

        public ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyGetArgs()
        {
        }
        public static new ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyGetArgs Empty => new ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyGetArgs();
    }
}
