// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter.Inputs
{

    public sealed class OrganizationCustomModuleCustomConfigCustomOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("properties")]
        private InputList<Inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyGetArgs>? _properties;

        /// <summary>
        /// A list of custom output properties to add to the finding.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyGetArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyGetArgs>());
            set => _properties = value;
        }

        public OrganizationCustomModuleCustomConfigCustomOutputGetArgs()
        {
        }
        public static new OrganizationCustomModuleCustomConfigCustomOutputGetArgs Empty => new OrganizationCustomModuleCustomConfigCustomOutputGetArgs();
    }
}