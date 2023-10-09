import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

// Get a dataset

const dataset = gcp.bigquery.Dataset.get(
    'test',
    'test',
    {
        project: 'fake-project-that-is-wild-and-annoytin',
    },
    {},
);

dataset.id.apply((id) => {
    console.log(`got dataset ${id}`);
});
