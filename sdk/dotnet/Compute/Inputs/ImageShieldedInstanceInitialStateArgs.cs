// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ImageShieldedInstanceInitialStateArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbs")]
        private InputList<Inputs.ImageShieldedInstanceInitialStateDbArgs>? _dbs;

        /// <summary>
        /// The Key Database (db).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ImageShieldedInstanceInitialStateDbArgs> Dbs
        {
            get => _dbs ?? (_dbs = new InputList<Inputs.ImageShieldedInstanceInitialStateDbArgs>());
            set => _dbs = value;
        }

        [Input("dbxs")]
        private InputList<Inputs.ImageShieldedInstanceInitialStateDbxArgs>? _dbxs;

        /// <summary>
        /// The forbidden key database (dbx).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ImageShieldedInstanceInitialStateDbxArgs> Dbxs
        {
            get => _dbxs ?? (_dbxs = new InputList<Inputs.ImageShieldedInstanceInitialStateDbxArgs>());
            set => _dbxs = value;
        }

        [Input("keks")]
        private InputList<Inputs.ImageShieldedInstanceInitialStateKekArgs>? _keks;

        /// <summary>
        /// The Key Exchange Key (KEK).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ImageShieldedInstanceInitialStateKekArgs> Keks
        {
            get => _keks ?? (_keks = new InputList<Inputs.ImageShieldedInstanceInitialStateKekArgs>());
            set => _keks = value;
        }

        /// <summary>
        /// The Platform Key (PK).
        /// Structure is documented below.
        /// </summary>
        [Input("pk")]
        public Input<Inputs.ImageShieldedInstanceInitialStatePkArgs>? Pk { get; set; }

        public ImageShieldedInstanceInitialStateArgs()
        {
        }
        public static new ImageShieldedInstanceInitialStateArgs Empty => new ImageShieldedInstanceInitialStateArgs();
    }
}
