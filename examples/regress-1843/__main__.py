"""A Google Cloud Python Pulumi program"""

import pulumi_gcp as gcp

gcp.cloudrun.Service(
    resource_name="test-gcr",
    args=gcp.cloudrun.ServiceArgs(
        location="us-west1",
        template=gcp.cloudrun.ServiceTemplateArgs(
            spec=gcp.cloudrun.ServiceTemplateSpecArgs(
                containers=[
                    gcp.cloudrun.ServiceTemplateSpecContainerArgs(
                        image="us-docker.pkg.dev/cloudrun/container/hello",
                        resources=gcp.cloudrun.ServiceTemplateSpecContainerResourcesArgs(
                            limits={
                                "memory": "512Mi",
                                "cpu": "1",
                            }
                        ),
                    )
                ],
                timeout_seconds=60,
                container_concurrency=30,
            ),
            metadata=gcp.cloudrun.ServiceTemplateMetadataArgs(
                annotations={
                    "autoscaling.knative.dev/maxScale": "100",
                },
            ),
        ),
        autogenerate_revision_name=True,
        metadata=gcp.cloudrun.ServiceMetadataArgs(
            labels={"env": "dev"},
            annotations={
                "run.googleapis.com/ingress": "all",
            },
        ),
        traffics=[
            gcp.cloudrun.ServiceTrafficArgs(
                percent=100,
                latest_revision=True,
            )
        ],
    ),
)
