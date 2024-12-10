import pulumi
import pulumi_gcp as gcp

from description import description

private_zone = gcp.dns.ManagedZone("private",
    description=description,
    dns_name="example.net.",
    visibility="private",
)
