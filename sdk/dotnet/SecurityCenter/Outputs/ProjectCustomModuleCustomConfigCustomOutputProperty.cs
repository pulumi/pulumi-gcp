// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter.Outputs
{

    [OutputType]
    public sealed class ProjectCustomModuleCustomConfigCustomOutputProperty
    {
        /// <summary>
        /// Name of the property for the custom output.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The CEL expression for the custom output. A resource property can be specified
        /// to return the value of the property or a text string enclosed in quotation marks.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpression? ValueExpression;

        [OutputConstructor]
        private ProjectCustomModuleCustomConfigCustomOutputProperty(
            string? name,

            Outputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpression? valueExpression)
        {
            Name = name;
            ValueExpression = valueExpression;
        }
    }
}