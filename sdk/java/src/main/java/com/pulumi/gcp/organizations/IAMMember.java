// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.IAMMemberArgs;
import com.pulumi.gcp.organizations.inputs.IAMMemberState;
import com.pulumi.gcp.organizations.outputs.IAMMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
 * 
 * * `gcp.organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
 * * `gcp.organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
 * * `gcp.organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
 * * `gcp.organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
 * 
 * &gt; **Note:** `gcp.organizations.IAMPolicy` **cannot** be used in conjunction with `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.organizations.IAMBinding` resources **can be** used in conjunction with `gcp.organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## gcp.organizations.IAMPolicy
 * 
 * !&gt; **Warning:** New organizations have several default policies which will,
 *    without extreme caution, be **overwritten** by use of this resource.
 *    The safest alternative is to use multiple `gcp.organizations.IAMBinding`
 *    resources. This resource makes it easy to remove your own access to
 *    an organization, which will require a call to Google Support to have
 *    fixed, and can take multiple days to resolve.
 * 
 *    In general, this resource should only be used with organizations
 *    fully managed by this provider.I f you do use this resource,
 *    the best way to be sure that you are not making dangerous changes is to start
 *    by **importing** your existing policy, and examining the diff very closely.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.organizations.IAMPolicy;
 * import com.pulumi.gcp.organizations.IAMPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role("roles/editor")
 *                 .members("user:jane}{@literal @}{@code example.com")
 *                 .build())
 *             .build());
 * 
 *         var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
 *             .orgId("1234567890")
 *             .policyData(admin.policyData())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * With IAM Conditions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.organizations.IAMPolicy;
 * import com.pulumi.gcp.organizations.IAMPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role("roles/editor")
 *                 .members("user:jane}{@literal @}{@code example.com")
 *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
 *                     .title("expires_after_2019_12_31")
 *                     .description("Expiring at midnight of 2019-12-31")
 *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
 *             .orgId("1234567890")
 *             .policyData(admin.policyData())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IAMBinding
 * 
 * &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMBinding;
 * import com.pulumi.gcp.organizations.IAMBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMBinding("organization", IAMBindingArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .members("user:jane}{@literal @}{@code example.com")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * With IAM Conditions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMBinding;
 * import com.pulumi.gcp.organizations.IAMBindingArgs;
 * import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMBinding("organization", IAMBindingArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .members("user:jane}{@literal @}{@code example.com")
 *             .condition(IAMBindingConditionArgs.builder()
 *                 .title("expires_after_2019_12_31")
 *                 .description("Expiring at midnight of 2019-12-31")
 *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IAMMember
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMMember;
 * import com.pulumi.gcp.organizations.IAMMemberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMMember("organization", IAMMemberArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .member("user:jane}{@literal @}{@code example.com")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * With IAM Conditions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMMember;
 * import com.pulumi.gcp.organizations.IAMMemberArgs;
 * import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMMember("organization", IAMMemberArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .member("user:jane}{@literal @}{@code example.com")
 *             .condition(IAMMemberConditionArgs.builder()
 *                 .title("expires_after_2019_12_31")
 *                 .description("Expiring at midnight of 2019-12-31")
 *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IamAuditConfig
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IamAuditConfig;
 * import com.pulumi.gcp.organizations.IamAuditConfigArgs;
 * import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
 *             .orgId("1234567890")
 *             .service("allServices")
 *             .auditLogConfigs(            
 *                 IamAuditConfigAuditLogConfigArgs.builder()
 *                     .logType("ADMIN_READ")
 *                     .build(),
 *                 IamAuditConfigAuditLogConfigArgs.builder()
 *                     .logType("DATA_READ")
 *                     .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
 *                     .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IAMBinding
 * 
 * &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMBinding;
 * import com.pulumi.gcp.organizations.IAMBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMBinding("organization", IAMBindingArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .members("user:jane}{@literal @}{@code example.com")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * With IAM Conditions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMBinding;
 * import com.pulumi.gcp.organizations.IAMBindingArgs;
 * import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMBinding("organization", IAMBindingArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .members("user:jane}{@literal @}{@code example.com")
 *             .condition(IAMBindingConditionArgs.builder()
 *                 .title("expires_after_2019_12_31")
 *                 .description("Expiring at midnight of 2019-12-31")
 *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IAMMember
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMMember;
 * import com.pulumi.gcp.organizations.IAMMemberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMMember("organization", IAMMemberArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .member("user:jane}{@literal @}{@code example.com")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * With IAM Conditions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IAMMember;
 * import com.pulumi.gcp.organizations.IAMMemberArgs;
 * import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IAMMember("organization", IAMMemberArgs.builder()
 *             .orgId("1234567890")
 *             .role("roles/editor")
 *             .member("user:jane}{@literal @}{@code example.com")
 *             .condition(IAMMemberConditionArgs.builder()
 *                 .title("expires_after_2019_12_31")
 *                 .description("Expiring at midnight of 2019-12-31")
 *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## gcp.organizations.IamAuditConfig
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.IamAuditConfig;
 * import com.pulumi.gcp.organizations.IamAuditConfigArgs;
 * import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
 *             .orgId("1234567890")
 *             .service("allServices")
 *             .auditLogConfigs(            
 *                 IamAuditConfigAuditLogConfigArgs.builder()
 *                     .logType("ADMIN_READ")
 *                     .build(),
 *                 IamAuditConfigAuditLogConfigArgs.builder()
 *                     .logType("DATA_READ")
 *                     .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
 *                     .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ### Importing Audit Configs
 * 
 * An audit config can be imported into a `google_organization_iam_audit_config` resource using the resource&#39;s `org_id` and the `service`, e.g:
 * 
 * * `&#34;{{org_id}} foo.googleapis.com&#34;`
 * 
 * An `import` block (Terraform v1.5.0 and later) can be used to import audit configs:
 * 
 * tf
 * 
 * import {
 * 
 *   id = &#34;{{org_id}} foo.googleapis.com&#34;
 * 
 *   to = google_organization_iam_audit_config.default
 * 
 * }
 * 
 * The `pulumi import` command can also be used:
 * 
 * ```sh
 * $ pulumi import gcp:organizations/iAMMember:IAMMember default &#34;{{org_id}} foo.googleapis.com&#34;
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/iAMMember:IAMMember")
public class IAMMember extends com.pulumi.resources.CustomResource {
    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", refs={IAMMemberCondition.class}, tree="[0]")
    private Output</* @Nullable */ IAMMemberCondition> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output<Optional<IAMMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the organization&#39;s IAM policy.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the organization&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @Export(name="member", refs={String.class}, tree="[0]")
    private Output<String> member;

    /**
     * @return Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice{@literal @}gmail.com or joe{@literal @}example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app{@literal @}appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins{@literal @}example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public Output<String> member() {
        return this.member;
    }
    /**
     * The organization id of the target organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return The organization id of the target organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMMember(java.lang.String name) {
        this(name, IAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMMember(java.lang.String name, IAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMMember(java.lang.String name, IAMMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMMember:IAMMember", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IAMMember(java.lang.String name, Output<java.lang.String> id, @Nullable IAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMMember:IAMMember", name, state, makeResourceOptions(options, id), false);
    }

    private static IAMMemberArgs makeArgs(IAMMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IAMMemberArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IAMMember get(java.lang.String name, Output<java.lang.String> id, @Nullable IAMMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IAMMember(name, id, state, options);
    }
}
