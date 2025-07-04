// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class MigrationJobDumpFlagsArgs : global::Pulumi.ResourceArgs
    {
        [Input("dumpFlags")]
        private InputList<Inputs.MigrationJobDumpFlagsDumpFlagArgs>? _dumpFlags;

        /// <summary>
        /// A list of dump flags
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.MigrationJobDumpFlagsDumpFlagArgs> DumpFlags
        {
            get => _dumpFlags ?? (_dumpFlags = new InputList<Inputs.MigrationJobDumpFlagsDumpFlagArgs>());
            set => _dumpFlags = value;
        }

        public MigrationJobDumpFlagsArgs()
        {
        }
        public static new MigrationJobDumpFlagsArgs Empty => new MigrationJobDumpFlagsArgs();
    }
}
