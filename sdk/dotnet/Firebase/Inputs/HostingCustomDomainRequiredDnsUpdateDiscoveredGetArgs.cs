// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class HostingCustomDomainRequiredDnsUpdateDiscoveredGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain name the record pertains to, e.g. `foo.bar.com.`.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("records")]
        private InputList<Inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordGetArgs>? _records;

        /// <summary>
        /// Records on the domain
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordGetArgs> Records
        {
            get => _records ?? (_records = new InputList<Inputs.HostingCustomDomainRequiredDnsUpdateDiscoveredRecordGetArgs>());
            set => _records = value;
        }

        public HostingCustomDomainRequiredDnsUpdateDiscoveredGetArgs()
        {
        }
        public static new HostingCustomDomainRequiredDnsUpdateDiscoveredGetArgs Empty => new HostingCustomDomainRequiredDnsUpdateDiscoveredGetArgs();
    }
}