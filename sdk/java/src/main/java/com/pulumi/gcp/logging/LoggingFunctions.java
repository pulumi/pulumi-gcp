// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs;
import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsPlainArgs;
import com.pulumi.gcp.logging.outputs.GetProjectCmekSettingsResult;
import java.util.concurrent.CompletableFuture;

public final class LoggingFunctions {
    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     * 
     * ## Example Usage
     * ### Logging Project Cmek Settings Basic
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.logging.LoggingFunctions;
     * import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs;
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
     *         final var cmekSettings = LoggingFunctions.getProjectCmekSettings(GetProjectCmekSettingsArgs.builder()
     *             .project(&#34;my-project-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetProjectCmekSettingsResult> getProjectCmekSettings(GetProjectCmekSettingsArgs args) {
        return getProjectCmekSettings(args, InvokeOptions.Empty);
    }
    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     * 
     * ## Example Usage
     * ### Logging Project Cmek Settings Basic
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.logging.LoggingFunctions;
     * import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs;
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
     *         final var cmekSettings = LoggingFunctions.getProjectCmekSettings(GetProjectCmekSettingsArgs.builder()
     *             .project(&#34;my-project-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProjectCmekSettingsResult> getProjectCmekSettingsPlain(GetProjectCmekSettingsPlainArgs args) {
        return getProjectCmekSettingsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     * 
     * ## Example Usage
     * ### Logging Project Cmek Settings Basic
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.logging.LoggingFunctions;
     * import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs;
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
     *         final var cmekSettings = LoggingFunctions.getProjectCmekSettings(GetProjectCmekSettingsArgs.builder()
     *             .project(&#34;my-project-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetProjectCmekSettingsResult> getProjectCmekSettings(GetProjectCmekSettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:logging/getProjectCmekSettings:getProjectCmekSettings", TypeShape.of(GetProjectCmekSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     * 
     * ## Example Usage
     * ### Logging Project Cmek Settings Basic
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.logging.LoggingFunctions;
     * import com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs;
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
     *         final var cmekSettings = LoggingFunctions.getProjectCmekSettings(GetProjectCmekSettingsArgs.builder()
     *             .project(&#34;my-project-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProjectCmekSettingsResult> getProjectCmekSettingsPlain(GetProjectCmekSettingsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:logging/getProjectCmekSettings:getProjectCmekSettings", TypeShape.of(GetProjectCmekSettingsResult.class), args, Utilities.withVersion(options));
    }
}