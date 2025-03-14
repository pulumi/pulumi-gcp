// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.privilegedaccessmanager;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs;
import com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult;
import java.util.concurrent.CompletableFuture;

public final class PrivilegedaccessmanagerFunctions {
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEntitlementResult> getEntitlement() {
        return getEntitlement(GetEntitlementArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEntitlementResult> getEntitlementPlain() {
        return getEntitlementPlain(GetEntitlementPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEntitlementResult> getEntitlement(GetEntitlementArgs args) {
        return getEntitlement(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEntitlementResult> getEntitlementPlain(GetEntitlementPlainArgs args) {
        return getEntitlementPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEntitlementResult> getEntitlement(GetEntitlementArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:privilegedaccessmanager/getEntitlement:getEntitlement", TypeShape.of(GetEntitlementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEntitlementResult> getEntitlement(GetEntitlementArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:privilegedaccessmanager/getEntitlement:getEntitlement", TypeShape.of(GetEntitlementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     * To get more information about Privileged Access Manager, see:
     * 
     * * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     * * How-to guides
     *   * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions;
     * import com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var my-entitlement = PrivilegedaccessmanagerFunctions.getEntitlement(GetEntitlementArgs.builder()
     *             .parent("projects/my-project")
     *             .location("global")
     *             .entitlementId("my-entitlement")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEntitlementResult> getEntitlementPlain(GetEntitlementPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:privilegedaccessmanager/getEntitlement:getEntitlement", TypeShape.of(GetEntitlementResult.class), args, Utilities.withVersion(options));
    }
}
