// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyArgs;
import com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyPlainArgs;
import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs;
import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyPlainArgs;
import com.pulumi.gcp.endpoints.outputs.GetServiceConsumersIamPolicyResult;
import com.pulumi.gcp.endpoints.outputs.GetServiceIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class EndpointsFunctions {
    /**
     * Retrieves the current IAM policy data for serviceconsumers
     * 
     */
    public static Output<GetServiceConsumersIamPolicyResult> getServiceConsumersIamPolicy(GetServiceConsumersIamPolicyArgs args) {
        return getServiceConsumersIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for serviceconsumers
     * 
     */
    public static CompletableFuture<GetServiceConsumersIamPolicyResult> getServiceConsumersIamPolicyPlain(GetServiceConsumersIamPolicyPlainArgs args) {
        return getServiceConsumersIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for serviceconsumers
     * 
     */
    public static Output<GetServiceConsumersIamPolicyResult> getServiceConsumersIamPolicy(GetServiceConsumersIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:endpoints/getServiceConsumersIamPolicy:getServiceConsumersIamPolicy", TypeShape.of(GetServiceConsumersIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for serviceconsumers
     * 
     */
    public static CompletableFuture<GetServiceConsumersIamPolicyResult> getServiceConsumersIamPolicyPlain(GetServiceConsumersIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:endpoints/getServiceConsumersIamPolicy:getServiceConsumersIamPolicy", TypeShape.of(GetServiceConsumersIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for service
     * 
     * ## example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.endpoints.EndpointsFunctions;
     * import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs;
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
     *         final var policy = EndpointsFunctions.getServiceIamPolicy(GetServiceIamPolicyArgs.builder()
     *             .serviceName(google_endpoints_service.endpoints_service().service_name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args) {
        return getServiceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for service
     * 
     * ## example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.endpoints.EndpointsFunctions;
     * import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs;
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
     *         final var policy = EndpointsFunctions.getServiceIamPolicy(GetServiceIamPolicyArgs.builder()
     *             .serviceName(google_endpoints_service.endpoints_service().service_name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args) {
        return getServiceIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for service
     * 
     * ## example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.endpoints.EndpointsFunctions;
     * import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs;
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
     *         final var policy = EndpointsFunctions.getServiceIamPolicy(GetServiceIamPolicyArgs.builder()
     *             .serviceName(google_endpoints_service.endpoints_service().service_name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:endpoints/getServiceIamPolicy:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for service
     * 
     * ## example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.endpoints.EndpointsFunctions;
     * import com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs;
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
     *         final var policy = EndpointsFunctions.getServiceIamPolicy(GetServiceIamPolicyArgs.builder()
     *             .serviceName(google_endpoints_service.endpoints_service().service_name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:endpoints/getServiceIamPolicy:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}