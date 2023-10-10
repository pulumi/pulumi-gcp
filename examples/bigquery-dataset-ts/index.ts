import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

// Get a dataset

const dataset = gcp.bigquery.Dataset.get(
    'test',
    'test',
    {
        project: 'fake-proj',
    },
    {},
);

dataset.id.apply((id) => {
    console.log(`got dataset ${id}`);
});
