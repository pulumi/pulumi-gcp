# Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import pulumi
from pulumi_gcp import container

engine_version = pulumi.Output.from_input(container.get_engine_versions()).latest_master_version


pulumi.export('engine_version', engine_version)
