---
title: Google Cloud (GCP)
meta_desc: Learn how to use Pulumi's GCP Provider to reduce the complexity of managing and provisioning GCP resources.
layout: package
---

The Google Cloud Platform (GCP) provider for Pulumi can provision many of the cloud resources available in [Google Cloud](https://cloud.google.com/).

The GCP provider must be configured with credentials to deploy and update resources in Google Cloud; see [Installation & Configuration](./installation-configuration) for instructions.

**New to Pulumi and Google Cloud?** [Get started with Google Cloud using our tutorial](/up/?cloud=gcp)


## Example

<!---
javascript removed
--->
{{< chooser language "typescript,python,go,csharp,java,yaml,hcl" >}}

{{% choosable language typescript %}}

```typescript
import * as gcp from "@pulumi/gcp";

const bucket = new gcp.storage.Bucket("my-bucket", {
    location: "US",
});

export const bucketName = bucket.name;
```

{{% /choosable %}}
{{% choosable language python %}}

```python
import pulumi
from pulumi_gcp import storage

bucket = storage.Bucket("my-bucket", location="US")

pulumi.export("bucket_name", bucket.name)
```

{{% /choosable %}}
{{% choosable language go %}}

```go
package main

import (
	"github.com/pulumi/pulumi-gcp/sdk/v10/go/gcp/storage"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bucket, err := storage.NewBucket(ctx, "my-bucket", &storage.BucketArgs{
			Location: pulumi.String("US"),
		})
		if err != nil {
			return err
		}

		ctx.Export("bucketName", bucket.Name)
		return nil
	})
}
```

{{% /choosable %}}
{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using Pulumi;
using Gcp = Pulumi.Gcp;

return await Deployment.RunAsync(() =>
{
    var bucket = new Gcp.Storage.Bucket("my-bucket", new()
    {
        Location = "US",
    });

    return new Dictionary<string, object?>
    {
        ["bucketName"] = bucket.Name,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.gcp.storage.Bucket;
import com.pulumi.gcp.storage.BucketArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    private static void stack(Context ctx) {
        final var bucket = new Bucket("my-bucket", BucketArgs.builder()
            .location("US")
            .build());

        ctx.export("bucketName", bucket.name());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  my-bucket:
    type: gcp:storage:Bucket
    properties:
      location: US

outputs:
  bucketName: ${my-bucket.name}
```

{{% /choosable %}}

{{% choosable language hcl %}}

```hcl
terraform {
  required_providers {
    gcp = {
      source = "pulumi/gcp"
    }
  }
}

resource "gcp_storage_bucket" "my-bucket" {
  location = "US"
}

output "bucketName" {
  value = gcp_storage_bucket.my-bucket.name
}
```

{{% /choosable %}}

{{< /chooser >}}

Visit the [Guides](./guides/) for major-version migration guides, and the [examples](https://www.pulumi.com/dev/examples/) for scenarios like Cloud Functions and GKE.
