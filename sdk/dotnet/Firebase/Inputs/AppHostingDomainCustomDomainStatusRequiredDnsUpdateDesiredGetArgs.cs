// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("checkErrors")]
        private InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorGetArgs>? _checkErrors;

        /// <summary>
        /// (Output)
        /// The `Status` type defines a logical error model that is suitable for
        /// different programming environments, including REST APIs and RPC APIs. It is
        /// used by [gRPC](https://github.com/grpc). Each `Status` message contains
        /// three pieces of data: error code, error message, and error details.
        /// You can find out more about this error model and how to work with it in the
        /// [API Design Guide](https://cloud.google.com/apis/design/errors).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorGetArgs> CheckErrors
        {
            get => _checkErrors ?? (_checkErrors = new InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredCheckErrorGetArgs>());
            set => _checkErrors = value;
        }

        /// <summary>
        /// (Output)
        /// The domain the record pertains to, e.g. `foo.bar.com.`.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("records")]
        private InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordGetArgs>? _records;

        /// <summary>
        /// (Output)
        /// Records on the domain.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordGetArgs> Records
        {
            get => _records ?? (_records = new InputList<Inputs.AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredRecordGetArgs>());
            set => _records = value;
        }

        public AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredGetArgs()
        {
        }
        public static new AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredGetArgs Empty => new AppHostingDomainCustomDomainStatusRequiredDnsUpdateDesiredGetArgs();
    }
}
