// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.folder.inputs.GetOrganizationPolicyArgs;
import com.pulumi.gcp.folder.inputs.GetOrganizationPolicyPlainArgs;
import com.pulumi.gcp.folder.outputs.GetOrganizationPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class FolderFunctions {
    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     * [the official
     * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var policy = Output.of(FolderFunctions.getOrganizationPolicy(GetOrganizationPolicyArgs.builder()
     *             .folder(&#34;folders/folderid&#34;)
     *             .constraint(&#34;constraints/compute.trustedImageProjects&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;version&#34;, policy.apply(getOrganizationPolicyResult -&gt; getOrganizationPolicyResult.version()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args) {
        return getOrganizationPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     * [the official
     * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var policy = Output.of(FolderFunctions.getOrganizationPolicy(GetOrganizationPolicyArgs.builder()
     *             .folder(&#34;folders/folderid&#34;)
     *             .constraint(&#34;constraints/compute.trustedImageProjects&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;version&#34;, policy.apply(getOrganizationPolicyResult -&gt; getOrganizationPolicyResult.version()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicyPlain(GetOrganizationPolicyPlainArgs args) {
        return getOrganizationPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     * [the official
     * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var policy = Output.of(FolderFunctions.getOrganizationPolicy(GetOrganizationPolicyArgs.builder()
     *             .folder(&#34;folders/folderid&#34;)
     *             .constraint(&#34;constraints/compute.trustedImageProjects&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;version&#34;, policy.apply(getOrganizationPolicyResult -&gt; getOrganizationPolicyResult.version()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:folder/getOrganizationPolicy:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     * [the official
     * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var policy = Output.of(FolderFunctions.getOrganizationPolicy(GetOrganizationPolicyArgs.builder()
     *             .folder(&#34;folders/folderid&#34;)
     *             .constraint(&#34;constraints/compute.trustedImageProjects&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;version&#34;, policy.apply(getOrganizationPolicyResult -&gt; getOrganizationPolicyResult.version()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicyPlain(GetOrganizationPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:folder/getOrganizationPolicy:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args, Utilities.withVersion(options));
    }
}