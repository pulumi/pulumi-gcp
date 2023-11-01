package gcp

import (
	"context"
	gcp "github.com/pulumi/pulumi-gcp/provider/v7"
	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	testutils "github.com/pulumi/pulumi-terraform-bridge/testing/x"
	"github.com/stretchr/testify/require"
	"testing"
)

func init() {
	// This is necessary for gRPC testing. It doesn't effect integration tests, since
	// they use their own binary.
	version.Version = "7.0.0"
}

func replay(t *testing.T, sequence string) {
	info := gcp.Provider()
	ctx := context.Background()
	p, err := pfbridge.MakeMuxedServer(ctx, info.Name, info,
		/*
		 * We leave the schema blank. This will result in incorrect calls to
		 * GetSchema, but otherwise does not effect the provider. It reduces the
		 * time to test start by minutes.
		 */
		[]byte("{}"),
	)(nil)
	require.NoError(t, err)
	testutils.ReplaySequence(t, p, sequence)
}

func TestUpdateDefaultLabels(t *testing.T) {
	replay(t, `[
{"method":"/pulumirpc.ResourceProvider/Configure","request":{"variables":{"gcp:config:defaultLabels":"{\"hello\":\"goodbye\",\"new\":\"defaultLabel\"}","gcp:config:project":"pulumi-development"},"args":{"defaultLabels":"{\"hello\":\"goodbye\",\"new\":\"defaultLabel\"}","project":"pulumi-development"},"acceptSecrets":true,"acceptResources":true,"sendsOldInputs":true},"response":{"supportsPreview":true},"metadata":{"kind":"resource","mode":"client","name":"gcp"}},
{
  "method": "/pulumirpc.ResourceProvider/Diff",
  "request": {
    "id": "my-bucket-eca8e95",
    "urn": "urn:pulumi:dev::dev::gcp:storage/bucket:Bucket::my-bucket",
    "olds": {
      "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":600000000000,\"read\":240000000000,\"update\":240000000000},\"schema_version\":\"1\"}",
      "autoclass": null,
      "cors": [],
      "customPlacementConfig": null,
      "defaultEventBasedHold": false,
      "effectiveLabels": {
        "bad": "things",
        "good": "morning",
        "hello": "goodbye"
      },
      "encryption": null,
      "forceDestroy": false,
      "id": "my-bucket-eca8e95",
      "labels": {
        "bad": "things",
        "good": "morning"
      },
      "lifecycleRules": [],
      "location": "EU",
      "logging": null,
      "name": "my-bucket-eca8e95",
      "project": "pulumi-development",
      "publicAccessPrevention": "inherited",
      "requesterPays": false,
      "retentionPolicy": null,
      "selfLink": "https://www.googleapis.com/storage/v1/b/my-bucket-eca8e95",
      "storageClass": "STANDARD",
      "terraformLabels": {
        "bad": "things",
        "good": "morning",
        "hello": "goodbye"
      },
      "uniformBucketLevelAccess": false,
      "url": "gs://my-bucket-eca8e95",
      "versioning": null,
      "website": null
    },
    "news": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "labels": {
        "__defaults": [],
        "bad": "things",
        "good": "morning"
      },
      "location": "EU",
      "name": "my-bucket-eca8e95",
      "storageClass": "STANDARD"
    },
    "oldInputs": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "labels": {
        "__defaults": [],
        "bad": "things",
        "good": "morning"
      },
      "location": "EU",
      "name": "my-bucket-eca8e95",
      "storageClass": "STANDARD"
    }
  },
  "response": {
    "stables": [
      "name",
      "project",
      "location"
    ],
    "changes": "DIFF_SOME",
    "diffs": [
      "terraformLabels",
      "effectiveLabels"
    ],
    "detailedDiff": {
      "effectiveLabels.hello": {
        "kind": "DELETE"
      },
      "terraformLabels.hello": {
        "kind": "DELETE"
      }
    },
    "hasDetailedDiff": true
  },
  "metadata": {
    "kind": "resource",
    "mode": "client",
    "name": "gcp"
  }
}
	]`)
}

func TestUpdateFromNoLabels(t *testing.T) {
	replay(t, `[
{"method":"/pulumirpc.ResourceProvider/Configure","request":{"variables":{"gcp:config:defaultLabels":"{\"hello\":\"goodbye\"}","gcp:config:project":"pulumi-development"},"args":{"defaultLabels":"{\"hello\":\"goodbye\"}","project":"pulumi-development"},"acceptSecrets":true,"acceptResources":true,"sendsOldInputs":true},"response":{"supportsPreview":true},"metadata":{"kind":"resource","mode":"client","name":"gcp"}},
{
  "method": "/pulumirpc.ResourceProvider/Diff",
  "request": {
    "id": "my-bucket-76f52b6",
    "urn": "urn:pulumi:dev::dev::gcp:storage/bucket:Bucket::my-bucket",
    "olds": {
      "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":600000000000,\"read\":240000000000,\"update\":240000000000},\"schema_version\":\"1\"}",
      "autoclass": null,
      "cors": [],
      "customPlacementConfig": null,
      "defaultEventBasedHold": false,
      "effectiveLabels": {},
      "encryption": null,
      "forceDestroy": false,
      "id": "my-bucket-76f52b6",
      "labels": {},
      "lifecycleRules": [],
      "location": "EU",
      "logging": null,
      "name": "my-bucket-76f52b6",
      "project": "pulumi-development",
      "publicAccessPrevention": "inherited",
      "requesterPays": false,
      "retentionPolicy": null,
      "selfLink": "https://www.googleapis.com/storage/v1/b/my-bucket-76f52b6",
      "storageClass": "STANDARD",
      "terraformLabels": {},
      "uniformBucketLevelAccess": false,
      "url": "gs://my-bucket-76f52b6",
      "versioning": null,
      "website": null
    },
    "news": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "location": "EU",
      "name": "my-bucket-76f52b6",
      "storageClass": "STANDARD"
    },
    "oldInputs": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "location": "EU",
      "name": "my-bucket-76f52b6",
      "storageClass": "STANDARD"
    }
  },
  "response": {
    "stables": [
      "name",
      "project",
      "location"
    ],
    "changes": "DIFF_SOME",
    "diffs": [
      "effectiveLabels",
      "effectiveLabels",
      "terraformLabels",
      "terraformLabels"
    ],
    "detailedDiff": {
      "effectiveLabels": {
        "kind": "UPDATE"
      },
      "effectiveLabels.hello": {},
      "terraformLabels": {
        "kind": "UPDATE"
      },
      "terraformLabels.hello": {}
    },
    "hasDetailedDiff": true
  },
  "metadata": {
    "kind": "resource",
    "mode": "client",
    "name": "gcp"
  }
}


]`)
}
func TestUpdateDottedDefaultLabels(t *testing.T) {
	replay(t, `[
{"method":"/pulumirpc.ResourceProvider/Configure","request":{"variables":{"gcp:config:defaultLabels":"{\"hello\":\"goodbye\",\"nominal.dot\":\"thedotispartofthename\"}","gcp:config:project":"pulumi-development"},"args":{"defaultLabels":"{\"hello\":\"goodbye\",\"nominal.dot\":\"thedotispartofthename\"}","project":"pulumi-development"},"acceptSecrets":true,"acceptResources":true,"sendsOldInputs":true},"response":{"supportsPreview":true},"metadata":{"kind":"resource","mode":"client","name":"gcp"}},
{
  "method": "/pulumirpc.ResourceProvider/Diff",
  "request": {
    "id": "my-bucket-93ea11b",
    "urn": "urn:pulumi:dev::dev::gcp:storage/bucket:Bucket::my-bucket",
    "olds": {
      "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":600000000000,\"read\":240000000000,\"update\":240000000000},\"schema_version\":\"1\"}",
      "autoclass": null,
      "cors": [],
      "customPlacementConfig": null,
      "defaultEventBasedHold": false,
      "effectiveLabels": {
        "bad": "things",
        "good": "morning",
        "hello": "goodbye"
      },
      "encryption": null,
      "forceDestroy": false,
      "id": "my-bucket-93ea11b",
      "labels": {
        "bad": "things",
        "good": "morning"
      },
      "lifecycleRules": [],
      "location": "EU",
      "logging": null,
      "name": "my-bucket-93ea11b",
      "project": "pulumi-development",
      "publicAccessPrevention": "inherited",
      "requesterPays": false,
      "retentionPolicy": null,
      "selfLink": "https://www.googleapis.com/storage/v1/b/my-bucket-93ea11b",
      "storageClass": "STANDARD",
      "terraformLabels": {
        "bad": "things",
        "good": "morning",
        "hello": "goodbye"
      },
      "uniformBucketLevelAccess": false,
      "url": "gs://my-bucket-93ea11b",
      "versioning": null,
      "website": null
    },
    "news": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "labels": {
        "__defaults": [],
        "bad": "things",
        "good": "morning"
      },
      "location": "EU",
      "name": "my-bucket-93ea11b",
      "storageClass": "STANDARD"
    },
    "oldInputs": {
      "__defaults": [
        "forceDestroy",
        "name",
        "storageClass"
      ],
      "forceDestroy": false,
      "labels": {
        "__defaults": [],
        "bad": "things",
        "good": "morning"
      },
      "location": "EU",
      "name": "my-bucket-93ea11b",
      "storageClass": "STANDARD"
    }
  },
  "response": {
    "stables": [
      "project",
      "name",
      "location"
    ],
    "changes": "DIFF_SOME",
    "diffs": [
      "terraformLabels"
    ],
    "detailedDiff": {
      "terraformLabels": {
        "kind": "UPDATE"
      }
    },
    "hasDetailedDiff": true
  },
  "metadata": {
    "kind": "resource",
    "mode": "client",
    "name": "gcp"
  }
}
]`)
}

func TestUpdateWithoutLabels(t *testing.T) {
	replay(t, `[
{"method":"/pulumirpc.ResourceProvider/Configure","request":{"variables":{"gcp:config:defaultLabels":"{\"hello\":\"goodbye\"}","gcp:config:project":"pulumi-development"},"args":{"defaultLabels":"{\"hello\":\"goodbye\"}","project":"pulumi-development"},"acceptSecrets":true,"acceptResources":true,"sendsOldInputs":true},"response":{"supportsPreview":true},"metadata":{"kind":"resource","mode":"client","name":"gcp"}},
{"method":"/pulumirpc.ResourceProvider/Diff","request":{"id":"my-bucket-5921ec3","urn":"urn:pulumi:dev::dev::gcp:storage/bucket:Bucket::my-bucket","olds":{"__meta":"{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":600000000000,\"read\":240000000000,\"update\":240000000000},\"schema_version\":\"1\"}","autoclass":null,"cors":[],"customPlacementConfig":null,"defaultEventBasedHold":false,"effectiveLabels":{"bad":"things","good":"morning","hello":"goodbye"},"encryption":null,"forceDestroy":false,"id":"my-bucket-5921ec3","labels":{"bad":"things","good":"morning"},"lifecycleRules":[],"location":"EU","logging":null,"name":"my-bucket-5921ec3","project":"pulumi-development","publicAccessPrevention":"inherited","requesterPays":false,"retentionPolicy":null,"selfLink":"https://www.googleapis.com/storage/v1/b/my-bucket-5921ec3","storageClass":"STANDARD","terraformLabels":{"bad":"things","good":"morning","hello":"goodbye"},"uniformBucketLevelAccess":false,"url":"gs://my-bucket-5921ec3","versioning":null,"website":null},"news":{"__defaults":["forceDestroy","name","storageClass"],"cors":[{"__defaults":[],"maxAgeSeconds":3600,"methods":["PUT","OPTIONS"],"origins":["*"],"responseHeaders":["Content-Type"]}],"forceDestroy":false,"labels":{"__defaults":[],"bad":"things","good":"morning"},"location":"EU","name":"my-bucket-5921ec3","storageClass":"STANDARD"},"oldInputs":{"__defaults":["forceDestroy","name","storageClass"],"forceDestroy":false,"labels":{"__defaults":[],"bad":"things","good":"morning"},"location":"EU","name":"my-bucket-5921ec3","storageClass":"STANDARD"}},"response":{"stables":["location","project","name"],"changes":"DIFF_SOME","diffs":["cors","cors","cors","cors","cors","cors","cors","cors","cors","cors","cors","cors","cors","cors"],"detailedDiff":{"cors":{"kind":"UPDATE"},"cors[0].maxAgeSeconds":{},"cors[0].max_age_seconds":{},"cors[0].method":{},"cors[0].method[0]":{},"cors[0].method[1]":{},"cors[0].methods[0]":{},"cors[0].methods[1]":{},"cors[0].origin":{},"cors[0].origin[0]":{},"cors[0].origins[0]":{},"cors[0].responseHeaders[0]":{},"cors[0].response_header":{},"cors[0].response_header[0]":{}},"hasDetailedDiff":true},"metadata":{"kind":"resource","mode":"client","name":"gcp"}}
]`)
}
