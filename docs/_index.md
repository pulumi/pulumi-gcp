---
title: Google Cloud (GCP) Classic
meta_desc: Learn how to use Pulumi's GCP Provider to reduce the complexity of managing and provisioning GCP resources.
layout: package
---

The Google Cloud Platform (GCP) provider for Pulumi can provision many of the cloud resources available in [Google Cloud](https://cloud.google.com/).

The GCP provider must be configured with credentials to deploy and update resources in Google Cloud; see [Installation & Configuration](./installation-configuration) for instructions.

**New to Pulumi and Google Cloud?** [Get started with Google Cloud using our tutorial](/docs/get-started/gcp)


## Example

<!---
javascript removed
--->
{{< chooser language "typescript,python,go,csharp,java,yaml" >}}

{{% choosable language javascript %}}

```javascript
const gcp = require("@pulumi/gcp")

const bucket = new gcp.storage.Bucket("my-bucket");
```

{{% /choosable %}}
{{% choosable language typescript %}}

```typescript
import * as gcp from "@pulumi/gcp";

const bucket = new gcp.storage.Bucket("my-bucket");
```

{{% /choosable %}}
{{% choosable language python %}}

```python
from pulumi_gcp import storage

bucket = storage.Bucket('my-bucket')
```

{{% /choosable %}}
{{% choosable language go %}}

```go
import (
    "github.com/pulumi/pulumi/sdk/v3/go/pulumi"
    "github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/storage"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bucket, err := storage.NewBucket(ctx, "my-bucket", nil)
		if err != nil {
			return err
		}

		return nil
	})
}
```

{{% /choosable %}}
{{% choosable language csharp %}}

```csharp
using Pulumi;
using Gcp = Pulumi.Gcp;

await Deployment.RunAsync(() =>
{
    var bucket = new Gcp.Storage.Bucket("my-bucket");
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.gcp.storage.Bucket;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    private static void stack(Context ctx) {
        final var bucket = new Bucket("my-bucket");
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
```

{{% /choosable %}}

{{< /chooser >}}

Visit the [How-to Guides](./how-to-guides) to find step-by-step guides for specific scenarios like creating a serverless application using Google Cloud Functions or setting up a Google Kubernetes Engine (GKE) cluster.
