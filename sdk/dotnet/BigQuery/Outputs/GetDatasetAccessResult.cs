// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class GetDatasetAccessResult
    {
        public readonly ImmutableArray<Outputs.GetDatasetAccessDatasetResult> Datasets;
        public readonly string Domain;
        public readonly string GroupByEmail;
        public readonly string IamMember;
        public readonly string Role;
        public readonly ImmutableArray<Outputs.GetDatasetAccessRoutineResult> Routines;
        public readonly string SpecialGroup;
        public readonly string UserByEmail;
        public readonly ImmutableArray<Outputs.GetDatasetAccessViewResult> Views;

        [OutputConstructor]
        private GetDatasetAccessResult(
            ImmutableArray<Outputs.GetDatasetAccessDatasetResult> datasets,

            string domain,

            string groupByEmail,

            string iamMember,

            string role,

            ImmutableArray<Outputs.GetDatasetAccessRoutineResult> routines,

            string specialGroup,

            string userByEmail,

            ImmutableArray<Outputs.GetDatasetAccessViewResult> views)
        {
            Datasets = datasets;
            Domain = domain;
            GroupByEmail = groupByEmail;
            IamMember = iamMember;
            Role = role;
            Routines = routines;
            SpecialGroup = specialGroup;
            UserByEmail = userByEmail;
            Views = views;
        }
    }
}