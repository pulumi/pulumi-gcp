module github.com/pulumi/pulumi-gcp

go 1.12

require (
	git.apache.org/thrift.git v0.12.0 // indirect
	github.com/gopherjs/gopherjs v0.0.0-20181103185306-d547d1d9531e // indirect
	github.com/hashicorp/terraform v0.12.2
	github.com/pkg/errors v0.8.0
	github.com/pulumi/pulumi v0.17.6-0.20190410045519-ef5e148a73c0
	github.com/pulumi/pulumi-terraform v0.18.3
	github.com/stretchr/testify v1.3.1-0.20190311161405-34c6fa2dc709
	github.com/terraform-providers/terraform-provider-google-beta v0.0.0-20190621161736-0f807634d55c
	labix.org/v2/mgo v0.0.0-20140701140051-000000000287 // indirect
	launchpad.net/gocheck v0.0.0-20140225173054-000000000087 // indirect
)

replace (
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
)
