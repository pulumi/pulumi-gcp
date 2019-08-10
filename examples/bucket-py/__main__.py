# Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import pulumi
from pulumi_gcp import storage

bucket = storage.Bucket('bucket-py')

pulumi.export('bucket_name', bucket.name)
